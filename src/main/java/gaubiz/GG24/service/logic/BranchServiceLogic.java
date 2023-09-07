package gaubiz.GG24.service.logic;

import gaubiz.GG24.model.Branch;
import gaubiz.GG24.model.Employee;
import gaubiz.GG24.repository.BranchRepository;
import gaubiz.GG24.service.BranchService;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BranchServiceLogic implements BranchService {
    private final BranchRepository branchRepository;

    public BranchServiceLogic(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public ResponseEntity<?> branchSetting(Branch branch) {
        Branch data = branchRepository.selectBranch(branch);
        if(data != null){
            return ResponseEntity.ok().body(data);
        }else {
            data = new Branch();
            data.setEmployeeName("-");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(data);
        }
    }

    @Override
    public ResponseEntity<?> changeEmployee(int employeeNo) {
        Branch employee = branchRepository.selectEmployee(employeeNo);
        if(employee != null){
            return ResponseEntity.ok().body(employee);
        }else {
            employee = new Branch();
            employee.setEmployeeName("-");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(employee);
        }
    }

    @Override
    public ResponseEntity<?> findEmployee(int employeeNo) {
        Employee attendanceData = branchRepository.selectEmployeeAttendance(employeeNo);

        if(attendanceData == null){
            branchRepository.insertAttendanceData(employeeNo);
            attendanceData = branchRepository.selectEmployeeAttendance(employeeNo);
        }

        return ResponseEntity.ok().body(attendanceData);
    }

    @Override
    public ResponseEntity<?> attendanceEmployee(Employee employee) {
        Employee attendanceData = branchRepository.selectEmployeeAttendance(employee.getEmployeeNo());

        int result;

        if(attendanceData.getAttendanceIn() == null){
            result = branchRepository.insertAttendanceIn(employee);
        }else {
            result = branchRepository.insertAttendanceOut(employee);
        }
        if(result > 0){
            return ResponseEntity.ok().body("{\"code\": 200, \"msg\": \"성공\"}");
        }else {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("실패");
        }



    }
}
