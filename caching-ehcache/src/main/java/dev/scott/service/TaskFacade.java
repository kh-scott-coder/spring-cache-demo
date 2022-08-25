package dev.scott.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import dev.scott.model.TaskDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TaskFacade {

	@Cacheable(value = "tasks", condition = "!#noCache")
	public List<TaskDTO> findAll() {
		log.info("Retrieving tasks");
		return List.of(new TaskDTO(1L, "My first task", true), new TaskDTO(2L, "My second task", false));
	}
}
