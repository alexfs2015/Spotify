package com.spotify.music.offline;

import com.spotify.music.offline.OfflineErrorResponse.InnerError;

final class AutoValue_OfflineErrorResponse extends OfflineErrorResponse {
    private final InnerError innerError;

    static final class a implements com.spotify.music.offline.OfflineErrorResponse.a {
        private InnerError a;

        a() {
        }

        private a(OfflineErrorResponse offlineErrorResponse) {
            this.a = offlineErrorResponse.innerError();
        }

        /* synthetic */ a(OfflineErrorResponse offlineErrorResponse, byte b) {
            this(offlineErrorResponse);
        }

        public final com.spotify.music.offline.OfflineErrorResponse.a a(InnerError innerError) {
            if (innerError != null) {
                this.a = innerError;
                return this;
            }
            throw new NullPointerException("Null innerError");
        }

        public final OfflineErrorResponse a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" innerError");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_OfflineErrorResponse(this.a);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private AutoValue_OfflineErrorResponse(InnerError innerError2) {
        this.innerError = innerError2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineErrorResponse)) {
            return false;
        }
        return this.innerError.equals(((OfflineErrorResponse) obj).innerError());
    }

    public final int hashCode() {
        return this.innerError.hashCode() ^ 1000003;
    }

    public final InnerError innerError() {
        return this.innerError;
    }

    public final com.spotify.music.offline.OfflineErrorResponse.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineErrorResponse{innerError=");
        sb.append(this.innerError);
        sb.append("}");
        return sb.toString();
    }
}
