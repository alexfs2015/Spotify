package com.spotify.voiceassistant.models.v1;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class ParsedQuery implements Serializable {
    public static final String INTENT_FOLLOW = "FOLLOW";
    public static final String INTENT_PLAY = "PLAY";
    public static final String INTENT_UNFOLLOW = "UNFOLLOW";
    private static final long serialVersionUID = 7705541758140322385L;

    @Retention(RetentionPolicy.SOURCE)
    public @interface QueryIntent {
    }

    public static abstract class Builder {
        public abstract ParsedQuery build();

        public abstract Builder intent(String str);

        public abstract Builder uri(String str);
    }

    @fiq(a = "intent")
    public abstract String intent();

    @fiq(a = "uri")
    public abstract String uri();

    public static Builder builder() {
        return new Builder().intent("PLAY").uri("");
    }
}
