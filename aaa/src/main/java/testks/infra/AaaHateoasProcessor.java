package testks.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import testks.domain.*;

@Component
public class AaaHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Aaa>> {

    @Override
    public EntityModel<Aaa> process(EntityModel<Aaa> model) {
        return model;
    }
}
