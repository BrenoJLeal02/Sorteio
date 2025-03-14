package projeto.sorteio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto.sorteio.Model.Sorteio;
import projeto.sorteio.Service.SorteioService;

@RestController
@RequestMapping("/sorteio")
public class SorteioController {

    private final SorteioService sorteioService;

    public SorteioController(SorteioService sorteioService) {
        this.sorteioService = sorteioService;
    }

    @GetMapping("/vencedor")
    public String sortear() {
        Sorteio sorteio = sorteioService.sortear();
        return "Número sorteado: " + sorteio.getNumeroSorteado();
    }
}
