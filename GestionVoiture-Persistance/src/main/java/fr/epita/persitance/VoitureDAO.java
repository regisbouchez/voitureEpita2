package fr.epita.persitance;

import fr.epita.entite.VoitureEntite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureDAO extends JpaRepository<VoitureEntite, Long> {
}
