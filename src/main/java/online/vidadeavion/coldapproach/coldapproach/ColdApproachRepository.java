package online.vidadeavion.coldapproach.coldapproach;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColdApproachRepository extends JpaRepository<ColdApproach, Long> {

    List<ColdApproach> findByIdAllIgnoreCase(Long id);

}
