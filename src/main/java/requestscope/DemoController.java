package requestscope;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/demo")
public class DemoController {

    @Inject
    Helper helper;

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "The Answer Is " + helper.getTheAnswer();
    }
}
