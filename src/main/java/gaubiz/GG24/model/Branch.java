package gaubiz.GG24.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Branch {
    private String branchUuid;
    private String branchName;

    private int employeeNo;
    private String employeeName;
}
