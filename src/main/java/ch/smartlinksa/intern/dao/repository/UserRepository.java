package ch.smartlinksa.intern.dao.repository;

import ch.smartlinksa.intern.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

    public List<User> findByUserName(String userName);
<<<<<<< HEAD
=======

>>>>>>> 7d48379866bc57e38ff5dc816439828ca14843db
    public User findByUserNameAndPassword(String userName, String password);
}
