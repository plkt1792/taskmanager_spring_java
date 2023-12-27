package com.scaler.taskmanager.dto;

import com.scaler.taskmanager.entities.NoteEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CreateNoteResponseDTO {
    private Integer taskId;
    private NoteEntity note;

}