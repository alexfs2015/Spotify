package com.spotify.playlist.endpoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import com.spotify.playlist.endpoints.PlaylistEndpointImpl.PlayPayload;
import java.util.Map;

final class AutoValue_PlaylistEndpointImpl_PlayPayload extends PlayPayload {
    private final Map<String, String> contextMetadata;
    private final LoggingParameters loggingParameters;
    private final PlayOptions playOptions;
    private final PlayOrigin playOrigin;

    static final class a implements com.spotify.playlist.endpoints.PlaylistEndpointImpl.PlayPayload.a {
        private PlayOptions a;
        private PlayOrigin b;
        private Map<String, String> c;
        private LoggingParameters d;

        /* synthetic */ a(PlayPayload playPayload, byte b2) {
            this(playPayload);
        }

        a() {
        }

        private a(PlayPayload playPayload) {
            this.a = playPayload.playOptions();
            this.b = playPayload.playOrigin();
            this.c = playPayload.contextMetadata();
            this.d = playPayload.loggingParameters();
        }

        public final com.spotify.playlist.endpoints.PlaylistEndpointImpl.PlayPayload.a a(PlayOptions playOptions) {
            if (playOptions != null) {
                this.a = playOptions;
                return this;
            }
            throw new NullPointerException("Null playOptions");
        }

        public final com.spotify.playlist.endpoints.PlaylistEndpointImpl.PlayPayload.a a(PlayOrigin playOrigin) {
            if (playOrigin != null) {
                this.b = playOrigin;
                return this;
            }
            throw new NullPointerException("Null playOrigin");
        }

        public final com.spotify.playlist.endpoints.PlaylistEndpointImpl.PlayPayload.a a(Map<String, String> map) {
            if (map != null) {
                this.c = map;
                return this;
            }
            throw new NullPointerException("Null contextMetadata");
        }

        public final com.spotify.playlist.endpoints.PlaylistEndpointImpl.PlayPayload.a a(LoggingParameters loggingParameters) {
            this.d = loggingParameters;
            return this;
        }

        public final PlayPayload a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" playOptions");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" playOrigin");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" contextMetadata");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PlaylistEndpointImpl_PlayPayload autoValue_PlaylistEndpointImpl_PlayPayload = new AutoValue_PlaylistEndpointImpl_PlayPayload(this.a, this.b, this.c, this.d);
                return autoValue_PlaylistEndpointImpl_PlayPayload;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_PlaylistEndpointImpl_PlayPayload(PlayOptions playOptions2, PlayOrigin playOrigin2, Map<String, String> map, LoggingParameters loggingParameters2) {
        this.playOptions = playOptions2;
        this.playOrigin = playOrigin2;
        this.contextMetadata = map;
        this.loggingParameters = loggingParameters2;
    }

    @JsonProperty("prepare_play_options")
    public final PlayOptions playOptions() {
        return this.playOptions;
    }

    @JsonProperty("play_origin")
    public final PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @JsonProperty("context_metadata")
    public final Map<String, String> contextMetadata() {
        return this.contextMetadata;
    }

    @JsonProperty("logging_params")
    public final LoggingParameters loggingParameters() {
        return this.loggingParameters;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayPayload{playOptions=");
        sb.append(this.playOptions);
        sb.append(", playOrigin=");
        sb.append(this.playOrigin);
        sb.append(", contextMetadata=");
        sb.append(this.contextMetadata);
        sb.append(", loggingParameters=");
        sb.append(this.loggingParameters);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayPayload) {
            PlayPayload playPayload = (PlayPayload) obj;
            if (this.playOptions.equals(playPayload.playOptions()) && this.playOrigin.equals(playPayload.playOrigin()) && this.contextMetadata.equals(playPayload.contextMetadata())) {
                LoggingParameters loggingParameters2 = this.loggingParameters;
                return loggingParameters2 != null ? loggingParameters2.equals(playPayload.loggingParameters()) : playPayload.loggingParameters() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((this.playOptions.hashCode() ^ 1000003) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.contextMetadata.hashCode()) * 1000003;
        LoggingParameters loggingParameters2 = this.loggingParameters;
        return hashCode ^ (loggingParameters2 == null ? 0 : loggingParameters2.hashCode());
    }

    public final com.spotify.playlist.endpoints.PlaylistEndpointImpl.PlayPayload.a toBuilder() {
        return new a(this, 0);
    }
}
