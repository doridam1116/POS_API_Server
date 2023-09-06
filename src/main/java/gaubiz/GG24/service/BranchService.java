package gaubiz.GG24.service;

import gaubiz.GG24.model.Branch;
import gaubiz.GG24.model.Employee;
import org.springframework.http.ResponseEntity;

public interface BranchService {
    ResponseEntity<?> branchSetting(Branch branch);

    ResponseEntity<?> changeEmployee(int employeeNo);

    ResponseEntity<?> findEmployee(int employeeNo);

    ResponseEntity<?> attendanceEmployee(Employee employee);
}
