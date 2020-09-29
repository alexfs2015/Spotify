package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@JsonFormat(shape = Shape.STRING)
public enum PrefetchLevel {
    NONE,
    MEDIA
}
