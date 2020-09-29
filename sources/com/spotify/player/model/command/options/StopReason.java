package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@JsonFormat(shape = Shape.STRING)
public enum StopReason {
    INTERACTIVE("interactive"),
    REMOTE_TRANSFER("remote"),
    SHUTDOWN("shutdown");
    
    private final String stringRep;

    private StopReason(String str) {
        this.stringRep = str;
    }

    public final String toString() {
        return this.stringRep;
    }
}
