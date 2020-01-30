/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.cgesp.org.providerTest.repository;

import api.cgesp.org.providerTest.models.Record;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Lucas
 */

public interface RecordRepository extends CrudRepository<Record, Long>{
    List<Record> findByZoneIgnoreCaseContaining(String zone);
    Record findById(long id);
}
