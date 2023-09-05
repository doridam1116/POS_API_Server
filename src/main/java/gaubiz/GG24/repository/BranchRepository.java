package gaubiz.GG24.repository;

import gaubiz.GG24.model.Branch;
import gaubiz.GG24.model.Employee;

public interface BranchRepository {
    Branch selectBranch(Branch branch);

    Branch selectEmployee(int employee);

    Employee selectEmployeeAttendance(int employeeNo);
}
