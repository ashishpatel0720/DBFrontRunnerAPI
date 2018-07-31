package com.db.dbfrontrunner.Controller;

import com.db.dbfrontrunner.Implementation.SectorsImpl;
import com.db.dbfrontrunner.Repository.SectorRepository;
import com.db.dbfrontrunner.Tables.BrokertradingLimits;
import com.db.dbfrontrunner.Tables.Sectors;
import com.db.dbfrontrunner.Tables.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SectorController {

    @Autowired
    SectorsImpl sectorsimpl;

    @PostMapping("users/sectors")
    public List<Sectors> getSectors(@RequestBody UserId user){

       return  sectorsimpl.findByEmpid(user.brokerid);
    }

}
