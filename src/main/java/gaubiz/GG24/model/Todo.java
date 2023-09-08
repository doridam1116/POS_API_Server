package gaubiz.GG24.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private String branchUuid;
    private String todoTime;
    private String todoTitle;
    private int todoYn;
    private int todoNo;


}
