package hpp.hpp_enrollment.dto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer course_id;
    private String name;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private LocalDateTime deleted_at;

    private Integer limit;
    private Integer current_enrollment_num;

    @OneToMany(mappedBy = "course_id", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;
}
