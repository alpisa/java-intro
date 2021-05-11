package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

public class JobPositionManager implements JobPositionService {
	
	@Autowired
	private JobPositionDao jobPositionDao;
	
	public JobPositionManager() {
		
	}
	
	public List<JobPosition> getAll() {
		return jobPositionDao.findAll();
	}
	
}