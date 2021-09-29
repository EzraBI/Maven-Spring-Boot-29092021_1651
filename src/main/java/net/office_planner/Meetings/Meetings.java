package net.office_planner.Meetings;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Meetings")
public class Meetings {
    @Id
    @Column(nullable = false, unique = true, length = 45)
    private int meeting_id;
    @Column(nullable = false, length = 45)
    private String meeting_name;
    @Column(nullable = false, length = 250)
    private String meeting_description;
    @Column(nullable = false, length = 45)
    private Long meeting_start_time;
    @Column(nullable = false, length = 45)
    private Long meeting_end_time;
    @Column(nullable = false, length = 45)
    private int boardroom_id;
    @Column(nullable = false, length = 45)
    private int employee_id;

}
