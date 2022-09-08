package com.example.Project_no_1.Controller;

import com.example.Project_no_1.Model.Bossy;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BossyController {

    @GetMapping("/bossy")
    public List<Bossy> getAllBossyboots() {
        // hardcoded data {a real world application will return from the database
        List<Bossy> bossyList = new ArrayList<Bossy>();
        //this is getting from a list bossyList
        //enter the data in the <bossylist> list
        bossyList.add(new Bossy(1, "will", 22));
        bossyList.add(new Bossy(12, "bilb", 232));
        bossyList.add(new Bossy(45, "wilma", 5));

        return bossyList;
    }

    @GetMapping("bossy/{bossyID}")
    public Bossy getBossywithID(@PathVariable Integer bossyID) {
        // returns hardcoded data from the list, a real world application will return from the database - that will be deployed to a VM or a server
        // local host will be : LocalHost:8080/boss/(any number(the bossyid))
        return new Bossy(4, "BossBean", 34);
    }

    @PostMapping("/bossy/newBossy")
    public void addPerson(@RequestBody Bossy bossy) {
        // remember to put "POST" on the dropdown in postman, and put {"id":1}
        System.out.println("Saving Bossy info to the database");
    }
}
