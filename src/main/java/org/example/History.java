package org.example;

import lombok.Getter;

import java.time.Instant;

@Getter
public class History {
    private final Integer note;
    private final Instant time;
    private final String reason;

    public History(Integer note, Instant time, String reason) {
        this.note = note;
        this.time = time;
        this.reason = reason;
    }
}
