package com.spotify.music.offline;

import com.spotify.music.offline.OfflineErrorResponse.InnerError;

final class AutoValue_OfflineErrorResponse_InnerError extends InnerError {
    private final int code;

    static final class a implements com.spotify.music.offline.OfflineErrorResponse.InnerError.a {
        private Integer a;

        /* synthetic */ a(InnerError innerError, byte b) {
            this(innerError);
        }

        a() {
        }

        private a(InnerError innerError) {
            this.a = Integer.valueOf(innerError.code());
        }

        public final com.spotify.music.offline.OfflineErrorResponse.InnerError.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final InnerError a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" code");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_OfflineErrorResponse_InnerError(this.a.intValue());
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private AutoValue_OfflineErrorResponse_InnerError(int i) {
        this.code = i;
    }

    public final int code() {
        return this.code;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InnerError{code=");
        sb.append(this.code);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InnerError) {
            if (this.code == ((InnerError) obj).code()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.code ^ 1000003;
    }

    public final com.spotify.music.offline.OfflineErrorResponse.InnerError.a toBuilder() {
        return new a(this, 0);
    }
}
