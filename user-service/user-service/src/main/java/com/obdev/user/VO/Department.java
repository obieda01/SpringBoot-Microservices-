package com.obdev.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}