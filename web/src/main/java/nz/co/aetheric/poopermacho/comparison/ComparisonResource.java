package nz.co.aetheric.poopermacho.comparison;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;

/** Implements the comparison api in jersey. */
@Component
@Path("api/comparison")
public class ComparisonResource implements ComparisonApi {
    private static final Logger log = LoggerFactory.getLogger(ComparisonResource.class);

    @Resource
    ComparisonDao comparisonDao;

    /** {@inheritDoc} */
    @Override
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public CreateComparison.Response createMovement(CreateComparison.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public ListComparison.Response listMovement(ListComparison.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @GET
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public ReadComparison.Response readMovement(@PathParam("id") Long id, ReadComparison.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @PUT
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public UpdateComparison.Response updateMovement(@PathParam("id") Long id, UpdateComparison.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @DELETE
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public DeleteComparison.Response deleteMovement(@PathParam("id") Long id, DeleteComparison.Request request) {
        return null;
    }
}
