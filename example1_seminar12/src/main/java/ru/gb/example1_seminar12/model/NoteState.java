package ru.gb.example1_seminar12.model;

public interface NoteState {
    void open(Note note);
    void close(Note note);
}
