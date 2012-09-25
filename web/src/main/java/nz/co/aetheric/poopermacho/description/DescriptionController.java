package nz.co.aetheric.poopermacho.description;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/** What is the purpose of this class? */
public class DescriptionController {
    private static final Logger log = LoggerFactory.getLogger(DescriptionController.class);

    @Resource
    DescriptionDao descriptionDao;
}
