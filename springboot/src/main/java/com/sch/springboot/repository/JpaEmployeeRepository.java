package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class JpaEmployeeRepository implements EmployeeRepositoryInterface {

    private final EntityManager em;

    public JpaEmployeeRepository(EntityManager em) {
        this.em = em;
    }

    /** 사원 등록 */
    @Override
    public Long insert(Employee employee) {
        em.persist(employee);
        return employee.getSno();
    }

    /** 사원 리스트 조회 */
    @Override
    public List<Employee> selectAll() {
        return em.createQuery("select m from Employee m", Employee.class)
                .getResultList();
    }
}
