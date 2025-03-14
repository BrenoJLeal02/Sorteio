//package projeto.sorteio.Service;
//
//import org.springframework.stereotype.Service;
//import projeto.sorteio.Model.Sorteio;
//import projeto.sorteio.Repository.SorteioRepository;
//
//import java.security.SecureRandom;
//
//@Service
//public class SorteioService {
//
//    private final SorteioRepository sorteioRepository;
//    private final SecureRandom secureRandom = new SecureRandom();
//
//    public SorteioService(SorteioRepository sorteioRepository) {
//        this.sorteioRepository = sorteioRepository;
//    }
//
//    public Sorteio sortear() {
//        char[] numeros = new char[5];
//
//        for (int i = 4; i >= 0; i--) {
//            int numero = secureRandom.nextInt(7) + 1;
//            numeros[i] = (char) ('0' + numero);
//        }
//
//        Sorteio sorteio = new Sorteio();
//        sorteio.setNumeroSorteado(new String(numeros));
//        return sorteioRepository.save(sorteio);
//    }
//}