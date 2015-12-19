package ca.omny.omny.web.resources;

import ca.omny.request.api.OmnyApi;
import java.util.Map;
import java.util.UUID;

public class ResourceDefinition {
    Map<String,RequestParameter> objectDefinition;
    private final OmnyApi api;
    UUID id;
    String[] versions;
    String saveLocation; 
    
    public ResourceDefinition() {
        api = null;
    }
    
    public ResourceDefinition(OmnyApi api, String saveLocation) {
        this.api = api;
        this.saveLocation = saveLocation;
    }

    public Map<String, RequestParameter> getObjectDefinition() {
        return objectDefinition;
    }

    public void setObjectDefinition(Map<String, RequestParameter> objectDefinition) {
        this.objectDefinition = objectDefinition;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String[] getVersions() {
        return versions;
    }

    public void setVersions(String[] versions) {
        this.versions = versions;
    }

    public String getSaveLocation() {
        return saveLocation;
    }

    public void setSaveLocation(String saveLocation) {
        this.saveLocation = saveLocation;
    }
    
    public OmnyApi getApi() {
        return api;
    }
}
