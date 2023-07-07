package com.lawzoom.complianceservice.dto.complianceTaskDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lawzoom.complianceservice.model.complianceModel.Compliance;
import lombok.*;
import org.hibernate.annotations.Comment;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ComplianceTaskRequest {

	private Long id;
	
	private String taskName;

	private String description;
	
	private int timelineValue;
	
	private String timelineType;
	
	private String status;
	
	private String approvalState;
	
	private String applicableZone;

	private String criticality;

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dueDate;

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date completedDate;
	
	private Long reporterUserId;
	
	private Long assigneeUserId;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date updatedAt;

	@Comment(value = "1 : Active, 0 : Inactive")
	private boolean isEnable;

}
