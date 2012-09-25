package nz.co.aetheric.poopermacho.description;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;

/** Implements the description api in jersey. */
@Component
@Path("api/description")
public class DescriptionResource implements DescriptionApi {
    private static final Logger log = LoggerFactory.getLogger(DescriptionResource.class);

    @Resource
    DescriptionDao descriptionDao;

    /** {@inheritDoc} */
    @Override
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public CreateDescription.Response createMovement(CreateDescription.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public ListDescription.Response listMovement(ListDescription.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @GET
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public ReadDescription.Response readMovement(@PathParam("id") Long id, ReadDescription.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @PUT
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public UpdateDescription.Response updateMovement(@PathParam("id") Long id, UpdateDescription.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @DELETE
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public DeleteDescription.Response deleteMovement(@PathParam("id") Long id, DeleteDescription.Request request) {
        return null;
    }
}
