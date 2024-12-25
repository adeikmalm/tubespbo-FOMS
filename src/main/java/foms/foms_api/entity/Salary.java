package foms.foms_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "salary")

public class Salary {
    @Id
    private String id;

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "month_salary")
    private String monthSalary;

    @Column(name = "position_allowance")
    private Double positionAllowance;

    @Column(name = "bpjs_allowance")
    private Double bpjsAllowance;

    @Column(name = "tax_allowance")
    private Double taxAllowance;

    @Column(name = "other_allowance")
    private String otherAllowance;

    @Column(name = "position_deduction")
    private Double positionDeduction;

    @Column(name = "bpjs_deduction")
    private Double bpjsDeduction;

    @Column(name = "tax_deduction")
    private Double taxDeduction;

    @Column(name = "other_deduction")
    private String otherDeduction;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Employee employee;

}


