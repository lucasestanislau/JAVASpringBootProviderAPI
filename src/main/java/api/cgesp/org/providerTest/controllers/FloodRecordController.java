/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.cgesp.org.providerTest.controllers;

import api.cgesp.org.providerTest.models.FloodRecord;
import api.cgesp.org.providerTest.models.Record;
import api.cgesp.org.providerTest.repository.RecordRepository;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.sun.scenario.effect.Flood;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lucas
 */
@RestController
public class FloodRecordController {
    
    /*@Transational(rollbackFor = Exception.class) em um método diz para se tornar uma transação,
    ou seja, caso aconteça alguma falha ou exeção, será executado um
    rollback e as alterações não serão persistidas no banco.*/

    @Autowired
    private RecordRepository rrDao;

    @GetMapping(path = "/floodrecords")
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(rrDao.findAll(),HttpStatus.OK);
    }
    
    @GetMapping(path = "/floodrecord/{id}")
    public ResponseEntity<?> getRecordById(@PathVariable("id") String id){
        Record r = rrDao.findById(Long.parseLong(id));
        return new ResponseEntity<>(r, HttpStatus.OK);
    }


    /*
    //@RequestMapping(method = RequestMethod.GET, path = "/floodrecords")
    @GetMapping(path = "/floodrecords")
    public ResponseEntity<?> listAll() {
       return new ResponseEntity<>(FloodRecord.list, HttpStatus.OK);
    }

    @GetMapping(value = "/floodrecords/{id}")
    public FloodRecord getFloodRecordById(@PathVariable("id") int id) {
        for(FloodRecord fl : FloodRecord.list){
            if(fl.getId() == (int) id){
                return fl;
            }
        }
        return null;
    }
    // ?id=3
    @RequestMapping(value = "/floodrecord", method = RequestMethod.GET)
    public FloodRecord getFloodRecordById2(@RequestParam("id") long id) {
        return FloodRecord.list.get((int) id);
    }
    
    //1
    @PostMapping(value = "/floodrecords")
    public ResponseEntity addFloodRecord(@RequestBody FloodRecord f){
        FloodRecord.addFlood(f);
        return new ResponseEntity(f, HttpStatus.CREATED);
    }
    
    
    @GetMapping(value = "/floodrecords/{date}/{neighborhood}")
    public List<FloodRecord> getFloodRecords(@PathVariable("date") String date, @PathVariable("neighborhood") String neighborhood){
        List<FloodRecord> list = new ArrayList<>();
        for(FloodRecord a : FloodRecord.list){
            if(a.getStartDT().contains(date) &&  a.getNeighborhood().contains(neighborhood)){
                list.add(a);
            }
        }
        return list;
    }
    
    //method PUT
    @PutMapping(value = "/floodrecords")
    public FloodRecord updateFlood(@RequestBody FloodRecord f){
        FloodRecord.list.remove(f);
        FloodRecord.list.add(f);
        FloodRecord.modificarArquivo();
        return f;
    }
    
    @DeleteMapping(value = "/floodrecords/{id}")
    public boolean deleteFlood(@PathVariable int id){
        FloodRecord x = new FloodRecord();
        x.setId(id);
        FloodRecord.list.remove(x);
        FloodRecord.modificarArquivo();
        return true;
    }*/

}
