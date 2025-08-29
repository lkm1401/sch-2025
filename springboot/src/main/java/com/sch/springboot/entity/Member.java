package com.sch.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

@Entity
public class Member {
    @Id
    private Long sno;

    private String name;
    private String address;
    private String department;

    @Column(name="mdate", nullable = true)
    private LocalDateTime mdate;

    @PrePersist
    public void prePersist() {
        if (this.mdate == null) {
            this.mdate = LocalDateTime.now();
        }
    }


    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDateTime getMdate() {
        return mdate;
    }

}
