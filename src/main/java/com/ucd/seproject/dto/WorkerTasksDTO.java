package com.ucd.seproject.dto;

public class WorkerTasksDTO {

    private String task_id;
    private String worker_id;

    public WorkerTasksDTO(String task_id, String worker_id) {
        this.task_id = task_id;
        this.worker_id = worker_id;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }
}
