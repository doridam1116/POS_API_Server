package gaubiz.GG24.service.logic;

import gaubiz.GG24.model.Branch;
import gaubiz.GG24.model.Employee;
import gaubiz.GG24.repository.BranchRepository;
import gaubiz.GG24.service.BranchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("데이터 없음");
        }
    }

    @Override
    public ResponseEntity<?> changeEmployee(int employeeNo) {
        Branch employee = branchRepository.selectEmployee(employeeNo);
        if(employee != null){
            return ResponseEntity.ok().body(employee);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("없음");
        }
    }

    @Override
    public ResponseEntity<?> findEmployee(int employeeNo) {
        Employee employee = branchRepository.selectEmployeeAttendance(employeeNo);
        if(employee != null){
            return ResponseEntity.ok().body(employee);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("없음");
        }
    }
}
