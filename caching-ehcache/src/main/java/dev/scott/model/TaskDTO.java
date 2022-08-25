package dev.scott.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TaskDTO {
    private final long id;
    private final String task;
    private final boolean completed;
}
