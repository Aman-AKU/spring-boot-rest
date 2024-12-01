package com.example.spring_boot_rest.service;

import com.example.JobApp.JobPost;
import com.example.JobApp.repo.JobRepo;
import com.example.spring_boot_rest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){


    }

    public List<JobPost> getAllJobs(){

    }

    public com.example.spring_boot_rest.model.JobPost getJob(int i) {
       return repo.getJob();
    }

    public void updateJob(com.example.spring_boot_rest.model.JobPost jobPost) {
        repo.updateJob(jobPost);
    }
}
