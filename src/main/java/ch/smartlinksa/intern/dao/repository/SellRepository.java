package ch.smartlinksa.intern.dao.repository;

import ch.smartlinksa.intern.dao.entity.SellTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellRepository extends JpaRepository<SellTransaction, String>{
}
