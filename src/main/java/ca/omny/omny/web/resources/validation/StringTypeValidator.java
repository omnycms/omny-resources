package ca.omny.omny.web.resources.validation;

import ca.omny.omny.web.resources.RequestParameter;

public class StringTypeValidator implements IParameterTypeValidator {

    @Override
    public boolean isValid(RequestParameter parameter, Object value) {
        if(!parameter.isEmptyAllowed() && value.toString().isEmpty()) {
            return false;
        }
        
        return true;
    }
    
}
