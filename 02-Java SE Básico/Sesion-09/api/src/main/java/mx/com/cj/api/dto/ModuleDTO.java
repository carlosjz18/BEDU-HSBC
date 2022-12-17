package mx.com.cj.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ModuleDTO {

    private Long id;
    private String name;
    private Date beginDate;
    private Date createdAt;
    private Date updatedAt;
    private CourseDTO course;

}
