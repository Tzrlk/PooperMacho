package nz.co.aetheric.poopermacho.movement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** What is the purpose of this class? */
@Controller
public class MovementController {
    private static final Logger log = LoggerFactory.getLogger(MovementController.class);

    @RequestMapping(value = "/movement/logMovement.html")
    public String logMovement() {
        return "/movement/logMovement";
    }
}
