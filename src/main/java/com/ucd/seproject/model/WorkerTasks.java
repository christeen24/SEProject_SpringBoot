package com.ucd.seproject.model;

import org.dom4j.tree.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by christeen on 08/07/2020.
 * Customer module for customer table
 */

@Entity
@Table(name = "workerTasks",schema = "werewolves")
public class WorkerTasks extends AbstractEntity  {

    @Column(name = "task_id")
    private String task_id;
    @Column(name = "worker_id")
    private String worker_id;

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
