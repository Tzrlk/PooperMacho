package nz.co.aetheric.poopermacho.comparison;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/** What is the purpose of this class? */
@Controller
public class ComparisonController {
    private static final Logger log = LoggerFactory.getLogger(ComparisonController.class);

    @Resource
    ComparisonDao comparisonDao;
}
