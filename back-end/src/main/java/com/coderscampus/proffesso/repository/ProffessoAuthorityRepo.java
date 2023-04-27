package com.coderscampus.proffesso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.proffesso.domain.Authority;

public interface ProffessoAuthorityRepo extends JpaRepository<Authority,Long>{
	

}
