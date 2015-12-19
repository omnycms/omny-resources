package ca.omny.omny.web.resources.mappers;

import ca.omny.documentdb.mappers.SimpleDataMapper;
import ca.omny.omny.web.resources.ResourceDefinition;

public class GlobalResourceRegistrationMapper extends SimpleDataMapper<ResourceDefinition> {
    
    public GlobalResourceRegistrationMapper() {
        super(new String[]{"global_resources"}, ResourceDefinition.class);
    }
}
