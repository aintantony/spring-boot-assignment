package co.antony.springbootproject.api.v1.student.repository;

import co.antony.springbootproject.api.v1.student.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class InMemoryDatabase {
    public List<Student> students = new ArrayList<>(
            List.of(
                    new Student(
                            1,
                            UUID.randomUUID().toString(),
                            "james",
                            "james123@gmail.com",
                            "male",
                            59.0,
                            "fS&@#$!12",
                            "instagram.com",
                            "this is cvd1010",
                            false,
                            true
                    ),
                    new Student(
                            2,
                            UUID.randomUUID().toString(),
                            "antony",
                            "antony123@gmail.com",
                            "male",
                            59.0,
                            "$#@5!&fG$33",
                            "github.com",
                            "this is the lorem",
                            false,
                            true
                    ),
                    new Student(
                            3,
                            UUID.randomUUID().toString(),
                            "lunox",
                            "lunox5432@gmail.com",
                            "male",
                            59.0,
                            "$#@$#@&*%212ff",
                            "profile.com",
                            "this is the lunox",
                            false,
                            true
                    ),
                    new Student(
                            4,
                            UUID.randomUUID().toString(),
                            "jenkins",
                            "jenkins123@gmail.com",
                            "male",
                            59.0,
                            "$#@&*%212f3",
                            "profile1.com",
                            "this is the lorem",
                            false,
                            true
                    ),
                    new Student(
                            5,
                            UUID.randomUUID().toString(),
                            "jacoco",
                            "jacoco123@gmail.com",
                            "male",
                            59.0,
                            "$#@5!&fG$33",
                            "profile.github.com",
                            "this is the lorem",
                            false,
                            true
                    )
            )
    );
}