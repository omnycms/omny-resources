package ca.omny.omny.web.resources.apis;

import ca.omny.omny.web.resources.RequestParameter;
import ca.omny.omny.web.resources.ResourceDefinition;
import ca.omny.request.api.ApiResponse;
import ca.omny.request.api.OmnyApi;
import ca.omny.request.management.RequestResponseManager;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.IOUtils;

public class Health implements OmnyApi {

    @Override
    public String getBasePath() {
        return ResourceApiConstants.base+"/health";
    }

    @Override
    public String[] getVersions() {
        return ResourceApiConstants.versions;
    }

    @Override
    public ApiResponse getResponse(RequestResponseManager requestResponseManager) {
        return new ApiResponse("OK", 200);
    }

    @Override
    public ApiResponse postResponse(RequestResponseManager requestResponseManager) {
        return null;
    }

    @Override
    public ApiResponse putResponse(RequestResponseManager requestResponseManager) {
        return null;
    }

    @Override
    public ApiResponse deleteResponse(RequestResponseManager requestResponseManager) {
        return null;
    }
    
    public ResourceDefinition getResourceDefintion() {
        try {
            ResourceDefinition definition = new ResourceDefinition(this, null);
            definition.setId(UUID.fromString("eb93904e-0b99-4bbd-b5d1-d01a4da5b1bd"));
            String content = IOUtils.toString(getClass().getClassLoader().getResourceAsStream("api/health.json"));
            Map<String, RequestParameter> parameterDefinition = (Map<String, RequestParameter>)new Gson().fromJson(content, Map.class);
            definition.setObjectDefinition(parameterDefinition);
            definition.setVersions(this.getVersions());
            return definition;
        } catch (IOException ex) {
            Logger.getLogger(Health.class.getName()).log(Level.WARNING, null, ex);
        }
        return null;
    }
}
