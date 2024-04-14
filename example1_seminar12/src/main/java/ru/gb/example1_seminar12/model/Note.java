package ru.gb.example1_seminar12.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Note {
    private Long id;
    private String title;
    private String body;
    private LocalDateTime creation;

    public Note(String title, String body) {
        this.title = title;
        this.body = body;
    }
    private NoteState state;

    public void setState(NoteState state) {
        this.state = state;
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }
}
