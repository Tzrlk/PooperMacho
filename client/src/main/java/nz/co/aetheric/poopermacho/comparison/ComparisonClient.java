package nz.co.aetheric.poopermacho.comparison;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.json.JSONConfiguration;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import java.net.URI;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

@Component
public class ComparisonClient implements ComparisonApi {
    private static final Logger log = LoggerFactory.getLogger(ComparisonClient.class);

    WebResource resource;

    /**
     *
     * @param uri URL of payment engine
     * @param username username
     * @param password password
     * @param log true to enable adding logging filter to http client
     */
    public ComparisonClient(URI uri, String username, String password, boolean log) {
        ClientConfig config = new DefaultClientConfig();

        ObjectMapper mapper = new ObjectMapper();
        mapper.getDeserializationConfig().set(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
        config.getSingletons().add(new JacksonJsonProvider(mapper));
        Client client = Client.create(config);


        if (isNotBlank(username) && isNotBlank(password)) {
            client.addFilter(new HTTPBasicAuthFilter(username, password));
        }

        if (log) {
            client.addFilter(new LoggingFilter());
        }

        resource = client.resource(uri).path("/api/comparison");
    }

    @Override
    public CreateComparison.Response createMovement(CreateComparison.Request request) {
        return resource
                .type(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(ClientResponse.class, request)
                .getEntity(CreateComparison.Response.class);
    }

    @Override
    public ListComparison.Response listMovement(ListComparison.Request request) {
        return resource
                .type(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(ClientResponse.class, request)
                .getEntity(ListComparison.Response.class);
    }

    @Override
    public ReadComparison.Response readMovement(Long id, ReadComparison.Request request) {
        return resource.path(String.valueOf(id))
                .type(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(ClientResponse.class, request)
                .getEntity(ReadComparison.Response.class);
    }

    @Override
    public UpdateComparison.Response updateMovement(Long id, UpdateComparison.Request request) {
        return resource.path(String.valueOf(id))
                .type(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(ClientResponse.class, request)
                .getEntity(UpdateComparison.Response.class);
    }

    @Override
    public DeleteComparison.Response deleteMovement(Long id, DeleteComparison.Request request) {
        return resource.path(String.valueOf(id))
                .type(MediaType.APPLICATION_JSON_TYPE)
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .post(ClientResponse.class, request)
                .getEntity(DeleteComparison.Response.class);
    }
}