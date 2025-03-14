package projeto.sorteio.Model;

import jakarta.persistence.*;

@Entity
public class Sorteio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroSorteado;

    public Sorteio() {}

    public Sorteio(Long id, String numeroSorteado) {
        this.id = id;
        this.numeroSorteado = numeroSorteado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(String numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }
}