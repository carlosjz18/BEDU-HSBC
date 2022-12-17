package mx.com.cj.api.mapper;

import mx.com.cj.api.dto.CourseDTO;
import mx.com.cj.api.entity.Course;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CourseMapper {
    CourseDTO toDTO(Course data);

    Course toEntity(CourseDTO data);
}
