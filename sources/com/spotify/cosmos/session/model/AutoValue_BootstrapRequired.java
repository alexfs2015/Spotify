package com.spotify.cosmos.session.model;

final class AutoValue_BootstrapRequired extends BootstrapRequired {
    private final String accessToken;

    AutoValue_BootstrapRequired(String str) {
        if (str != null) {
            this.accessToken = str;
            return;
        }
        throw new NullPointerException("Null accessToken");
    }

    public final String accessToken() {
        return this.accessToken;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BootstrapRequired)) {
            return false;
        }
        return this.accessToken.equals(((BootstrapRequired) obj).accessToken());
    }

    public final int hashCode() {
        return this.accessToken.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BootstrapRequired{accessToken=");
        sb.append(this.accessToken);
        sb.append("}");
        return sb.toString();
    }
}
