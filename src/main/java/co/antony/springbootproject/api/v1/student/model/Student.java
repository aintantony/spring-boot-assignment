package co.antony.springbootproject.api.v1.student.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private Integer id;
    private String uuid;
    private String name;
    private String email;
    private String gender;
    private Double score;
    private String password;
    private String profile;
    private String bio;
    private Boolean isDeleted;
    private Boolean isVerified;
}