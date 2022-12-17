package mx.com.cj.api.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "created_at")
    //@CreatedDate
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    //@LastModifiedDate
    @UpdateTimestamp
    private Date updatedAt;

    @OneToMany
    @JoinColumn(name = "course_id")
    Set<Module> moules;
}
