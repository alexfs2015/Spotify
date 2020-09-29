package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class VoiceViewResponse implements JacksonModel {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Body implements JacksonModel {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Images implements JacksonModel {

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static abstract class Image implements JacksonModel {
                @JsonCreator
                public static Image create(@JsonProperty("uri") String str) {
                    return new AutoValue_VoiceViewResponse_Body_Images_Image(str);
                }

                @JsonProperty("uri")
                public abstract String uri();
            }

            @JsonCreator
            public static Images create(@JsonProperty("main") Image image) {
                return new AutoValue_VoiceViewResponse_Body_Images(image);
            }

            @JsonProperty("main")
            public abstract Image main();
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Target implements JacksonModel {
            @JsonCreator
            public static Target create(@JsonProperty("uri") String str) {
                return new AutoValue_VoiceViewResponse_Body_Target(str);
            }

            @JsonProperty("uri")
            public abstract String uri();
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Text implements JacksonModel {
            @JsonCreator
            public static Text create(@JsonProperty("title") String str, @JsonProperty("subtitle") String str2) {
                return new AutoValue_VoiceViewResponse_Body_Text(str, str2);
            }

            @JsonProperty("subtitle")
            public abstract String subtitle();

            @JsonProperty("title")
            public abstract String title();
        }

        @JsonCreator
        public static Body create(@JsonProperty("text") Text text, @JsonProperty("target") Target target, @JsonProperty("images") Images images) {
            return new AutoValue_VoiceViewResponse_Body(text, target, images);
        }

        @JsonProperty("images")
        public abstract Images images();

        @JsonProperty("target")
        public abstract Target target();

        @JsonProperty("text")
        public abstract Text text();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Custom implements JacksonModel {

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static abstract class Restriction implements JacksonModel {
            @JsonCreator
            public static Restriction create(@JsonProperty("heading") String str, @JsonProperty("detail") String str2) {
                return new AutoValue_VoiceViewResponse_Custom_Restriction(str, str2);
            }

            @JsonProperty("detail")
            public abstract String detail();

            @JsonProperty("heading")
            public abstract String heading();
        }

        @JsonCreator
        public static Custom create(@JsonProperty("intent") String str, @JsonProperty("query") String str2, @JsonProperty("context") PlayerContext playerContext, @JsonProperty("restriction") Restriction restriction, @JsonProperty("friendlyError") String str3, @JsonProperty("error") String str4) {
            AutoValue_VoiceViewResponse_Custom autoValue_VoiceViewResponse_Custom = new AutoValue_VoiceViewResponse_Custom(str, str2, playerContext, restriction, str3, str4);
            return autoValue_VoiceViewResponse_Custom;
        }

        @JsonProperty("error")
        public abstract String error();

        @JsonProperty("friendlyError")
        public abstract String friendlyError();

        public Intent intent() {
            try {
                return rawIntent() == null ? Intent.NO_INTENT : Intent.valueOf(rawIntent());
            } catch (Exception unused) {
                return Intent.WTF;
            }
        }

        @JsonProperty("context")
        public abstract PlayerContext playerContext();

        @JsonProperty("query")
        public abstract String query();

        /* access modifiers changed from: 0000 */
        @JsonProperty("intent")
        public abstract String rawIntent();

        @JsonProperty("restriction")
        public abstract Restriction restriction();
    }

    @JsonCreator
    public static VoiceViewResponse create(@JsonProperty("custom") Custom custom, @JsonProperty("body") List<Body> list) {
        return new AutoValue_VoiceViewResponse(custom, list);
    }

    @JsonProperty("body")
    public abstract List<Body> body();

    @JsonProperty("custom")
    public abstract Custom custom();
}