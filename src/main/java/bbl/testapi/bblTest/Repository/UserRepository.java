package bbl.testapi.bblTest.Repository;

import bbl.testapi.bblTest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
