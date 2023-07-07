package com.lawzoom.complianceservice.dto.complianceTaskDto;

import lombok.*;
import org.hibernate.annotations.Comment;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ComplianceTaskResponse {

	private Long id;

	private String taskName;

	private String description;

	private int timelineValue;

	private String timelineType;

	private String status;

	private String approvalState;

	private String applicableZone;

	private String criticality;

	private Long reporterUserId;

	private Long assigneeUserId;

	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date startDate;

	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dueDate;

	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date completedDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	@Comment(value = "1 : Active, 0 : Inactive")
	private boolean isEnable;
}
