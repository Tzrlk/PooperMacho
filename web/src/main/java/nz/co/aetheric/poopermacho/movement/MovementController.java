package nz.co.aetheric.poopermacho.movement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/** What is the purpose of this class? */
@Controller
public class MovementController {
    private static final Logger log = LoggerFactory.getLogger(MovementController.class);

    @Resource
    MovementDao movementDao;

    @RequestMapping(value = "/movement/logMovement.html", method = RequestMethod.GET)
    public String logMovementView() {
        return "/movement/logMovement";
    }

    @RequestMapping(value = "/api/movement/logMovement", method = RequestMethod.POST)
    public void logMovementSave() {
        // save request body to
    }
}
