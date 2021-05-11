package kodlamaio.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.entities.concretes.JobPosition;



@RestController
@RequestMapping("/api/job_positions/")
public class JobTitlesController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobTitlesController(JobPositionService JobPositionService) {
		super();
		this.jobPositionService = JobPositionService;
	}

	@GetMapping("getall")
	public List<JobPosition> getAll() {
		return jobPositionService.getAll();
	}
}




