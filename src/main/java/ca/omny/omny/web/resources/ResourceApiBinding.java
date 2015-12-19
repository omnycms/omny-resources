package ca.omny.omny.web.resources;

import java.util.UUID;

public class ResourceApiBinding {
    String basePath;
    UUID definitionId;

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public UUID getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(UUID definitionId) {
        this.definitionId = definitionId;
    }
}
