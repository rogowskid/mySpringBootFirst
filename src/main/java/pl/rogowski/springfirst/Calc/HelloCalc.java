package pl.rogowski.springfirst.Calc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component

public class HelloCalc {

    Calc calc;
    public HelloCalc(Calc calc) {
        this.calc = calc;
    }


    @GetMapping("/calcExample")

    public String indexCalc()
    {

        return calc.toString();

    }

}
