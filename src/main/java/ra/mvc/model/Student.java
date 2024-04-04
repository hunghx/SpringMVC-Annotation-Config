package ra.mvc.model;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class Student {
    @NotNull
    private Long id;
    @NotBlank
    private String name;
    @NotNull
    @Range(min = 10,max = 20)
    private Integer age;
    @NotBlank
    @Size(min = 10,max = 20)
    private String description;

    public Student() {
    }

    public Student(Long id, String name, Integer age, String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
