package gaubiz.GG24.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String branchUuid;
    private int employeeNo;
    private String employeeName;
    private String attendanceIn;
    private String attendanceOut;
}
