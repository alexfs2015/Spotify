package com.spotify.music.offline;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class OfflineErrorResponse implements JacksonModel {

    public static abstract class InnerError implements JacksonModel {

        public interface a {
            a a(int i);

            InnerError a();
        }

        public static a builder() {
            return new a();
        }

        @JsonCreator
        public static InnerError create(@JsonProperty("code") int i) {
            return builder().a(i).a();
        }

        public abstract int code();

        public abstract a toBuilder();
    }

    public interface a {
        a a(InnerError innerError);

        OfflineErrorResponse a();
    }

    public static a builder() {
        return new a();
    }

    @JsonCreator
    public static OfflineErrorResponse create(@JsonProperty("error") InnerError innerError) {
        return builder().a(innerError).a();
    }

    public abstract InnerError innerError();

    public abstract a toBuilder();

    public OfflineError toOfflineError() {
        return OfflineError.a(innerError().code());
    }
}
