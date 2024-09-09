package online.vidadeavion.coldapproach.coldapproach;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("coldapproach")
public class ColdApproachController {

    @Autowired
    ColdApproachService coldApproachService;

    public ColdApproachController() {

        System.out.println("## ");
        System.out.println("## init > Cold Approach API");
        System.out.println("## ");

    }

    @GetMapping("")
    public List<ColdApproach> findAll() {

        System.out.println("enter > findAll");

        List<ColdApproach> userStoryList = this.coldApproachService.findAll();

        System.out.println("userStoryList / ");

        System.out.println(userStoryList);

        System.out.println("exit < findAll");

        return userStoryList;

    }

    @PutMapping("")
    ColdApproach createColdApproach(@RequestBody ColdApproach userStory) {

        System.out.println("enter > createColdApproach");

        System.out.println("userStory / " + userStory);

        return this.coldApproachService.save(userStory);

    }

    @GetMapping("{id}")
    ColdApproach findById(@PathVariable Long id) {

        return this.coldApproachService.findById(id);

    }

    @PostMapping("update")
    public ColdApproach updateColdApproach(@RequestBody ColdApproach project) {

        System.out.println("enter > updateColdApproach");

        System.out.println("userStory / " + project);

        ColdApproach responseColdApproach = this.coldApproachService.save(project);

        System.out.println("responseColdApproach / " + responseColdApproach);

        System.out.println("exit < updateColdApproach");

        return responseColdApproach;

    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {

        this.coldApproachService.delete(id);

    }

}
