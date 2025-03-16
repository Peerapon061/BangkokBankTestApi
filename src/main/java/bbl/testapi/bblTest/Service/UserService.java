package bbl.testapi.bblTest.Service;


import bbl.testapi.bblTest.Entity.User;
import bbl.testapi.bblTest.Repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getAllUser(){
        return repository.findAll();
    }
    public User getUser(Integer id){
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Not Found User"));
    }
    public User createUser(User newUser){
        return repository.saveAndFlush(newUser);
    }

    public User updateUser(Integer id,User newUser){
        User oldUser = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Not Found User"));
        oldUser.setAddress(newUser.getAddress());
        oldUser.setName(newUser.getName().trim());
        oldUser.setPhone(newUser.getPhone().trim());
        oldUser.setCompany(newUser.getCompany());
        oldUser.setEmail(newUser.getEmail().trim());
        oldUser.setWebsite(newUser.getWebsite().trim());
        oldUser.setUsername(newUser.getUsername().trim());
        return repository.saveAndFlush(oldUser);
    }

    public void deleteUser(Integer id){
        User user = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Not Found User"));
        repository.delete(user);
    }
}
