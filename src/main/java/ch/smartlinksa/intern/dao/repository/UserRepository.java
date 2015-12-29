package ch.smartlinksa.intern.dao.repository;

import ch.smartlinksa.intern.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

    public List<User> findByUserName(String userName);
    public User findByUserNameAndPassword(String userName, String password);
}
