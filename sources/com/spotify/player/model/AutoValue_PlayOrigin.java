package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

final class AutoValue_PlayOrigin extends PlayOrigin {
    private final String deviceIdentifier;
    private final String externalReferrer;
    private final ImmutableSet<String> featureClasses;
    private final String featureIdentifier;
    private final String featureVersion;
    private final String referrerIdentifier;
    private final String viewUri;

    static final class Builder extends com.spotify.player.model.PlayOrigin.Builder {
        private String deviceIdentifier;
        private String externalReferrer;
        private ImmutableSet<String> featureClasses;
        private String featureIdentifier;
        private String featureVersion;
        private String referrerIdentifier;
        private String viewUri;

        Builder() {
        }

        private Builder(PlayOrigin playOrigin) {
            this.featureIdentifier = playOrigin.featureIdentifier();
            this.featureVersion = playOrigin.featureVersion();
            this.viewUri = playOrigin.viewUri();
            this.externalReferrer = playOrigin.externalReferrer();
            this.referrerIdentifier = playOrigin.referrerIdentifier();
            this.deviceIdentifier = playOrigin.deviceIdentifier();
            this.featureClasses = playOrigin.featureClasses();
        }

        public final com.spotify.player.model.PlayOrigin.Builder featureIdentifier(String str) {
            if (str != null) {
                this.featureIdentifier = str;
                return this;
            }
            throw new NullPointerException("Null featureIdentifier");
        }

        public final com.spotify.player.model.PlayOrigin.Builder featureVersion(String str) {
            if (str != null) {
                this.featureVersion = str;
                return this;
            }
            throw new NullPointerException("Null featureVersion");
        }

        public final com.spotify.player.model.PlayOrigin.Builder viewUri(String str) {
            if (str != null) {
                this.viewUri = str;
                return this;
            }
            throw new NullPointerException("Null viewUri");
        }

        public final com.spotify.player.model.PlayOrigin.Builder externalReferrer(String str) {
            if (str != null) {
                this.externalReferrer = str;
                return this;
            }
            throw new NullPointerException("Null externalReferrer");
        }

        public final com.spotify.player.model.PlayOrigin.Builder referrerIdentifier(String str) {
            if (str != null) {
                this.referrerIdentifier = str;
                return this;
            }
            throw new NullPointerException("Null referrerIdentifier");
        }

        public final com.spotify.player.model.PlayOrigin.Builder deviceIdentifier(String str) {
            if (str != null) {
                this.deviceIdentifier = str;
                return this;
            }
            throw new NullPointerException("Null deviceIdentifier");
        }

        public final com.spotify.player.model.PlayOrigin.Builder featureClasses(Set<String> set) {
            this.featureClasses = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final PlayOrigin build() {
            String str = "";
            if (this.featureIdentifier == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" featureIdentifier");
                str = sb.toString();
            }
            if (this.featureVersion == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" featureVersion");
                str = sb2.toString();
            }
            if (this.viewUri == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" viewUri");
                str = sb3.toString();
            }
            if (this.externalReferrer == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" externalReferrer");
                str = sb4.toString();
            }
            if (this.referrerIdentifier == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" referrerIdentifier");
                str = sb5.toString();
            }
            if (this.deviceIdentifier == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" deviceIdentifier");
                str = sb6.toString();
            }
            if (this.featureClasses == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" featureClasses");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PlayOrigin autoValue_PlayOrigin = new AutoValue_PlayOrigin(this.featureIdentifier, this.featureVersion, this.viewUri, this.externalReferrer, this.referrerIdentifier, this.deviceIdentifier, this.featureClasses);
                return autoValue_PlayOrigin;
            }
            StringBuilder sb8 = new StringBuilder("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }
    }

    private AutoValue_PlayOrigin(String str, String str2, String str3, String str4, String str5, String str6, ImmutableSet<String> immutableSet) {
        this.featureIdentifier = str;
        this.featureVersion = str2;
        this.viewUri = str3;
        this.externalReferrer = str4;
        this.referrerIdentifier = str5;
        this.deviceIdentifier = str6;
        this.featureClasses = immutableSet;
    }

    @JsonProperty("feature_identifier")
    public final String featureIdentifier() {
        return this.featureIdentifier;
    }

    @JsonProperty("feature_version")
    public final String featureVersion() {
        return this.featureVersion;
    }

    @JsonProperty("view_uri")
    public final String viewUri() {
        return this.viewUri;
    }

    @JsonProperty("external_referrer")
    public final String externalReferrer() {
        return this.externalReferrer;
    }

    @JsonProperty("referrer_identifier")
    public final String referrerIdentifier() {
        return this.referrerIdentifier;
    }

    @JsonProperty("device_identifier")
    public final String deviceIdentifier() {
        return this.deviceIdentifier;
    }

    @JsonProperty("feature_classes")
    public final ImmutableSet<String> featureClasses() {
        return this.featureClasses;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayOrigin{featureIdentifier=");
        sb.append(this.featureIdentifier);
        sb.append(", featureVersion=");
        sb.append(this.featureVersion);
        sb.append(", viewUri=");
        sb.append(this.viewUri);
        sb.append(", externalReferrer=");
        sb.append(this.externalReferrer);
        sb.append(", referrerIdentifier=");
        sb.append(this.referrerIdentifier);
        sb.append(", deviceIdentifier=");
        sb.append(this.deviceIdentifier);
        sb.append(", featureClasses=");
        sb.append(this.featureClasses);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlayOrigin) {
            PlayOrigin playOrigin = (PlayOrigin) obj;
            return this.featureIdentifier.equals(playOrigin.featureIdentifier()) && this.featureVersion.equals(playOrigin.featureVersion()) && this.viewUri.equals(playOrigin.viewUri()) && this.externalReferrer.equals(playOrigin.externalReferrer()) && this.referrerIdentifier.equals(playOrigin.referrerIdentifier()) && this.deviceIdentifier.equals(playOrigin.deviceIdentifier()) && this.featureClasses.equals(playOrigin.featureClasses());
        }
    }

    public final int hashCode() {
        return ((((((((((((this.featureIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.featureVersion.hashCode()) * 1000003) ^ this.viewUri.hashCode()) * 1000003) ^ this.externalReferrer.hashCode()) * 1000003) ^ this.referrerIdentifier.hashCode()) * 1000003) ^ this.deviceIdentifier.hashCode()) * 1000003) ^ this.featureClasses.hashCode();
    }

    public final com.spotify.player.model.PlayOrigin.Builder toBuilder() {
        return new Builder(this);
    }
}
