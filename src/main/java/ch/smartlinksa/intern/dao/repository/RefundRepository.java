package ch.smartlinksa.intern.dao.repository;

import ch.smartlinksa.intern.dao.entity.RefundTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundRepository extends JpaRepository<RefundTransaction, String> {}