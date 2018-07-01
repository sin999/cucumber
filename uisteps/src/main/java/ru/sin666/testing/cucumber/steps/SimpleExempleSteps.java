package ru.sin666.testing.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SimpleExempleSteps {
    @Autowired
    private NameH nameH;


    @Дано("^на счете пользователя имеется (\\d+) рублей$")
    public void наСчетеПользователяИмеетсяРублей(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("а счете пользователя имеется (\\d+) рублей >>>>> "+nameH.getName());
    }

    @Когда("^пользователь снимает со счета (\\d+) рублей$")
    public void пользовательСнимаетСоСчетаРублей(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Тогда("^появляется предупреждение \"([^\"]*)\"$")
    public void появляетсяПредупреждение(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}
