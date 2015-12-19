package ca.omny.omny.web.resources;

import java.util.Collection;

public class RequestParameter {
    boolean required;
    String type;
    String name;
    String description;
    String in = "body";
    Collection<String> possibleValues;
    boolean emptyAllowed;
    
    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public Collection<String> getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(Collection<String> possibleValues) {
        this.possibleValues = possibleValues;
    }

    public boolean isEmptyAllowed() {
        return emptyAllowed;
    }

    public void setEmptyAllowed(boolean emptyAllowed) {
        this.emptyAllowed = emptyAllowed;
    }
}
