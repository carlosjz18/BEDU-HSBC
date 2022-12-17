package mx.com.cj.api.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CourseDTO {

    private Long id;
    private String name;
    private Date createdAt;
    private Date updatedAt;

}
