package hpp.hpp_enrollment.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/reservation")
@RestController
public class EnrollmentController {

    @GetMapping("/{courseId}/{userId}")
    public String GetEnrollmentUserState(
            @PathVariable Integer courseId,
            @PathVariable Integer userId
    ){
        return "GetEnrollmentState";
    }

    @PostMapping("/{courseId}/{userId}")
    public String postEnrollment(
            @PathVariable Integer courseId,
            @PathVariable Integer userId
    ){
        return "postEnrollment";
    }
}
