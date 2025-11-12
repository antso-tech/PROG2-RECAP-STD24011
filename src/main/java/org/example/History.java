package org.example;

import lombok.Getter;

import java.time.Instant;


@Getter
public class History {
    private final Double note;
    private final Instant time;
    private final String reason;

    public History(Double note, Instant time, String reason) {
        this.note = note;
        this.time = time;
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "History{" +
                "note=" + note +
                ", time=" + time +
                ", reason='" + reason + '\'' +
                '}';
    }
}
