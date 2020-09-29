package com.spotify.cosmos.session.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spotify.mobile.android.util.connectivity.ConnectionType;

final class AutoValue_SetConnectivityRequest extends SetConnectivityRequest {
    private final ConnectionType connectionType;

    static final class Builder extends Builder {
        private ConnectionType connectionType;

        Builder() {
        }

        /* access modifiers changed from: 0000 */
        public final SetConnectivityRequest build() {
            String str = "";
            if (this.connectionType == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" connectionType");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SetConnectivityRequest(this.connectionType);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        /* access modifiers changed from: 0000 */
        public final Builder connectionType(ConnectionType connectionType2) {
            if (connectionType2 != null) {
                this.connectionType = connectionType2;
                return this;
            }
            throw new NullPointerException("Null connectionType");
        }
    }

    private AutoValue_SetConnectivityRequest(ConnectionType connectionType2) {
        this.connectionType = connectionType2;
    }

    /* access modifiers changed from: 0000 */
    @JsonIgnore
    public final ConnectionType connectionType() {
        return this.connectionType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetConnectivityRequest)) {
            return false;
        }
        return this.connectionType.equals(((SetConnectivityRequest) obj).connectionType());
    }

    public final int hashCode() {
        return this.connectionType.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetConnectivityRequest{connectionType=");
        sb.append(this.connectionType);
        sb.append("}");
        return sb.toString();
    }
}
