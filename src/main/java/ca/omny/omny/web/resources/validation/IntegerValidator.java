package ca.omny.omny.web.resources.validation;

import ca.omny.omny.web.resources.RequestParameter;

public class IntegerValidator implements IParameterTypeValidator {

    @Override
    public boolean isValid(RequestParameter parameter, Object value) {
        try {
            Integer.parseInt(value.toString());
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    
}
