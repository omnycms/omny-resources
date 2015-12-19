package ca.omny.omny.web.resources.mappers;

import ca.omny.documentdb.mappers.SiteDataMapper;
import ca.omny.omny.web.resources.ResourceDefinition;

public class ResourceRegistrationMapper extends SiteDataMapper<ResourceDefinition> {
    
    public ResourceRegistrationMapper() {
        super(ResourceDefinition.class, "resources");
    }
}
