package Yelp.steps;

import Yelp.pageobject.PaginaPrincipal;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Steps;

public class UsuarioYelp extends ScenarioActor {
    String actor;

    @Steps(shared=true)
    PaginaPrincipal paginaPrincipal;

}
