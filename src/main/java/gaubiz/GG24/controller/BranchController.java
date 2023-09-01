package gaubiz.GG24.controller;

import gaubiz.GG24.model.Branch;
import gaubiz.GG24.service.BranchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branches")
public class BranchController {
    private final BranchService branchService;

    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @PostMapping()
    public ResponseEntity<?> branchSetting(
         @RequestBody Branch branch
    ){
        return branchService.branchSetting(branch);
    }
}
