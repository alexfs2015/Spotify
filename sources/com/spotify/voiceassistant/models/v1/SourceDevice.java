package com.spotify.voiceassistant.models.v1;

import java.io.Serializable;

public abstract class SourceDevice implements Serializable {
    private static final long serialVersionUID = -1145293024970725176L;

    public static abstract class Builder {
        public abstract Builder brand(String str);

        public abstract SourceDevice build();

        public abstract Builder device_id(String str);

        public abstract Builder device_type(String str);

        public abstract Builder model(String str);
    }

    @fiq(a = "brand")
    public abstract String brand();

    @fiq(a = "device_id")
    public abstract String device_id();

    @fiq(a = "device_type")
    public abstract String device_type();

    @fiq(a = "model")
    public abstract String model();

    public static Builder builder() {
        return new Builder();
    }
}
