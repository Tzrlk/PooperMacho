package nz.co.aetheric.poopermacho.movement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;

/** Implements the movement api in jersey. */
@Component
@Path("api/movement")
public class MovementResource implements MovementApi {
    private static final Logger log = LoggerFactory.getLogger(MovementResource.class);

    @Resource
    MovementDao movementDao;

    /** {@inheritDoc} */
    @Override
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public CreateMovement.Response createMovement(CreateMovement.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @GET
    @Consumes("application/json")
    @Produces("application/json")
    public ListMovement.Response listMovement(ListMovement.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @GET
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public ReadMovement.Response readMovement(@PathParam("id") Long id, ReadMovement.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @PUT
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public UpdateMovement.Response updateMovement(@PathParam("id") Long id, UpdateMovement.Request request) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    @DELETE
    @Path("{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public DeleteMovement.Response deleteMovement(@PathParam("id") Long id, DeleteMovement.Request request) {
        return null;
    }
}
