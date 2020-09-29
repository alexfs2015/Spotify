package com.spotify.music.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

public enum CustomFeature {
    FIELD_VISIBILITY_ANY {
        public final void a(ObjectMapper objectMapper) {
            objectMapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        }
    };

    public abstract void a(ObjectMapper objectMapper);
}
