package gaubiz.GG24.repository.logic;

import gaubiz.GG24.model.Branch;
import gaubiz.GG24.model.Employee;
import gaubiz.GG24.repository.BranchRepository;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BranchRepositoryLogic implements BranchRepository {
    private final SqlSession session;

    public BranchRepositoryLogic(SqlSession session) {
        this.session = session;
    }

    @Override
    public Branch selectBranch(Branch branch) {
        return session.selectOne("BranchMapper.selectBranch",branch);
    }

    @Override
    public Branch selectEmployee(int employee) {
        return session.selectOne("BranchMapper.selectEmployee",employee);
    }

    @Override
    public Employee selectEmployeeAttendance(int employeeNo) {
        return session.selectOne("AttendanceMapper.selectAttendance",employeeNo);
    }

    @Override
    public Employee selectAttendanceByEmployeeNo(Employee employee) {
        return session.selectOne("AttendanceMapper.selectAttendanceByEmployeeNo",employee);

    }

    @Override
    public int insertAttendanceIn(Employee employee) {
        return session.update("AttendanceMapper.updateAttendanceIn", employee);
    }

    @Override
    public int insertAttendanceOut(Employee employee) {
        return session.update("AttendanceMapper.updateAttendanceOut", employee);
    }

    @Override
    public Employee insertAttendanceData(Employee employee) {
        session.insert("AttendanceMapper.insertAttendanceData",employee);
        return session.selectOne("AttendanceMapper.selectAttendanceByEmployeeNo",employee);
    }
}
