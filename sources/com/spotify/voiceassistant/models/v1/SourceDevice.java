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

    public static Builder builder() {
        return new Builder();
    }

    @fjk(a = "brand")
    public abstract String brand();

    @fjk(a = "device_id")
    public abstract String device_id();

    @fjk(a = "device_type")
    public abstract String device_type();

    @fjk(a = "model")
    public abstract String model();
}
