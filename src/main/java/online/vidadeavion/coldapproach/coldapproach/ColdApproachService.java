package online.vidadeavion.coldapproach.coldapproach;

import jakarta.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = {SQLException.class})
public class ColdApproachService {

    ColdApproachRepository coldApproachRepository;

    @Autowired
    public ColdApproachService(ColdApproachRepository userStoryRepository) {

        this.coldApproachRepository = userStoryRepository;

    }

    public ColdApproach save(ColdApproach project) {

        return this.coldApproachRepository.save(project);

    }

    public List< ColdApproach> findAll() {

        return this.coldApproachRepository.findAll();

    }

    public ColdApproach findById(Long id) {

        return this.coldApproachRepository.findById(id).orElse(null);

    }

    public void delete(Long id) {

        this.coldApproachRepository.deleteById(id);

    }

}
