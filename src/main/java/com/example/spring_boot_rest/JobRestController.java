package com.example.spring_boot_rest;

import com.example.spring_boot_rest.model.JobPost;
import com.example.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class JobRestController
{
    @Autowired
    private JobService service;

    @GetMapping(path="JobPosts",produces = {"application/json"})
    public List<JobPost> getAllJobs()
    {
        return service.getAllJobs();
    }

    @GetMapping("JobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId)
    {
        return service.getJob(postId);
    }

    @PostMapping(path="jobPost", consumes = {""})
    public void addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Deleted";
    }



}
