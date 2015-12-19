package ca.omny.omny.web.resources.validation;

import ca.omny.omny.web.resources.RequestParameter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Validator {
    
    Map<String,IParameterTypeValidator> validators;
    
    public Validator() {
        validators = new HashMap<>();
        validators.put("string", new StringTypeValidator());
        validators.put("integer", new IntegerValidator());
    }

    public boolean validate(Map<String, RequestParameter> objectDefinition, Map requestObject) {
        for (String key : objectDefinition.keySet()) {
            if (!validate(objectDefinition.get(key), requestObject)) {
                return false;
            }
        }
        return true;
    }

    public boolean validate(RequestParameter requestParameter, Map requestObject) {
        Object value = this.getValue(requestParameter.getName(), requestObject);
        if (requestParameter.isRequired()) {
            if (value == null) {
                return false;
            }
        }
        
        if(requestParameter.getPossibleValues()!=null) {
            if(value == null || !contains(requestParameter.getPossibleValues(), value.toString())) {
                return false;
            }
        }
        
        if(validators.containsKey(requestParameter.getType().toLowerCase())) {
            return validators.get(requestParameter.getType().toLowerCase()).isValid(requestParameter, value);
        }
        
        return true;
    }
    
    private boolean contains(Collection<String> values, String value) {
        for(String possible: values) {
            if(possible.equalsIgnoreCase(value)) {
                return true;
            }
        }
        
        return false;
    } 

    public Object getValue(String name, Map requestObject) {
        if(name.contains(".")) {
            String[] parts = name.split("\\.");
            Map current = requestObject;
            for(int i=0; i<parts.length-1; i++) {
                if(!current.containsKey(parts[i])) {
                    return null;
                }
                current = (Map)current.get(parts[i]);
            }
            if(current.containsKey(parts[parts.length-1])) {
                return current.get(parts[parts.length-1]);
            }
        } else {
            return requestObject.get(name);
        }
        return null;
    }
}
