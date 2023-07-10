package com.api.crud.Repository;

import com.api.crud.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Integer> {

}
