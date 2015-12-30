package ch.smartlinksa.intern.dao.repository;

import ch.smartlinksa.intern.dao.entity.PurchaseTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseTransactionRepository extends JpaRepository<PurchaseTransaction, String>{
}
