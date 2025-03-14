package projeto.sorteio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.sorteio.Model.Sorteio;

@Repository
public interface SorteioRepository extends JpaRepository<Sorteio, Long> {
}