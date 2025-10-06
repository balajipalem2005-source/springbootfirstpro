package com.example.FirstStart.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.FirstStart.Pojo.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	@Query(value = "select * from employee", nativeQuery = true)
	List<Employee> getAllEmployee();

	@Query(value = "select * from employee where id=:id", nativeQuery = true)
	Optional<Employee> findById(Long id);

	@Query(value = "delete from employee where id=:id", nativeQuery = true)
	void deleteById(@Param("id") Long id);

	@Modifying
	@Transactional
	@Query(value = "delete  from employee ", nativeQuery = true)
	void deleteAll();

	@Query(value = "select * from employee where id=:id", nativeQuery = true)
	Employee getById(Long id);

	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query("UPDATE Employee e SET e.name = :name, e.fathername = :fathername,e.mothername = :mothername,e.currentaddress = :currentaddress,e.tempopraryaddress = :tempopraryaddress,"
	 * +
	 * "e.state = :state,e.country = :country,e.email = :email,e.adharnumber = :adharnumber,e.passpoartnumber = :passpoartnumber,  WHERE e.id = :id"
	 * ) Optional<Employee> findById(@Param("id") Long id, @Param("name") String
	 * name, @Param("fathername") String fathername,
	 * 
	 * @Param("mothername") String mothername, @Param("currentaddress") String
	 * currentaddress,
	 * 
	 * @Param("temporaryaddress") String temporaryaddress, @Param("state") String
	 * state,
	 * 
	 * @Param("country") String country, @Param("email") String email,
	 * 
	 * @Param("adharnumber") String adharnumber, @Param("passportnumber") String
	 * passportnumber);
	 * 
	 */
	;

//	@Query(value = "select * from employee where id=:id", nativeQuery = true)
	//Optional<Employee> findById(Employee employee, Long id);

}
