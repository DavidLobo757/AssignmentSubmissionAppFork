package com.coderscampus.AssignmentSubmissionApp.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coderscampus.AssignmentSubmissionApp.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
    Optional<User> findByUsername(String username);

    @Query("select u from User  u " +
            "join u.authorities auth " +
            "where u.cohortStartDate is null or u.bootcampDurationInWeeks is null ")
    List<User> findAllInactiveBootcampStudents();
    
    
//    List<User> findAllUser();
}
