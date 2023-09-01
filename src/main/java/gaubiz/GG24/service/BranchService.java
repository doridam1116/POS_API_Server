package gaubiz.GG24.service;

import gaubiz.GG24.model.Branch;
import org.springframework.http.ResponseEntity;

public interface BranchService {
    ResponseEntity<?> branchSetting(Branch branch);
}
