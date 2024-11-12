package repository;

import model.JobModel;

import java.util.ArrayList;

public interface JobRepository {

    public void save(JobModel job);
    public ArrayList<JobModel> findAll();
    public JobModel findById(long id);
    public void deleteById(long id);


}
