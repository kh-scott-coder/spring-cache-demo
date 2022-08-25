package dev.scott.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.scott.model.TaskDTO;
import dev.scott.service.TaskFacade;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	private final TaskFacade taskFacade;

	@GetMapping
	public List<TaskDTO> findAll() {
		return taskFacade.findAll();
	}
}