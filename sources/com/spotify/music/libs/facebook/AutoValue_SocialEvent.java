package com.spotify.music.libs.facebook;

final class AutoValue_SocialEvent extends SocialEvent {
    private final String description;
    private final SocialError socialError;

    static final class Builder extends com.spotify.music.libs.facebook.SocialEvent.Builder {
        private String description;
        private SocialError socialError;

        Builder() {
        }

        private Builder(SocialEvent socialEvent) {
            this.socialError = socialEvent.socialError();
            this.description = socialEvent.description();
        }

        public final com.spotify.music.libs.facebook.SocialEvent.Builder socialError(SocialError socialError2) {
            if (socialError2 != null) {
                this.socialError = socialError2;
                return this;
            }
            throw new NullPointerException("Null socialError");
        }

        public final com.spotify.music.libs.facebook.SocialEvent.Builder description(String str) {
            if (str != null) {
                this.description = str;
                return this;
            }
            throw new NullPointerException("Null description");
        }

        public final SocialEvent build() {
            String str = "";
            if (this.socialError == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" socialError");
                str = sb.toString();
            }
            if (this.description == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" description");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SocialEvent(this.socialError, this.description);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private AutoValue_SocialEvent(SocialError socialError2, String str) {
        this.socialError = socialError2;
        this.description = str;
    }

    public final SocialError socialError() {
        return this.socialError;
    }

    public final String description() {
        return this.description;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialEvent{socialError=");
        sb.append(this.socialError);
        sb.append(", description=");
        sb.append(this.description);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SocialEvent) {
            SocialEvent socialEvent = (SocialEvent) obj;
            return this.socialError.equals(socialEvent.socialError()) && this.description.equals(socialEvent.description());
        }
    }

    public final int hashCode() {
        return ((this.socialError.hashCode() ^ 1000003) * 1000003) ^ this.description.hashCode();
    }

    public final com.spotify.music.libs.facebook.SocialEvent.Builder toBuilder() {
        return new Builder(this);
    }
}
