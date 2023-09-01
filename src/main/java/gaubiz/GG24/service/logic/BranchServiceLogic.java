package gaubiz.GG24.service.logic;

import gaubiz.GG24.model.Branch;
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
            return ResponseEntity.ok("확인/저장 완료");
        }else {
            return ResponseEntity.status(400).body("데이터 없음");
        }
    }
}
