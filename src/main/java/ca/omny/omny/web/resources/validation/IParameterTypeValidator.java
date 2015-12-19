package ca.omny.omny.web.resources.validation;

import ca.omny.omny.web.resources.RequestParameter;

public interface IParameterTypeValidator {
    public boolean isValid(RequestParameter parameter, Object value);
}
