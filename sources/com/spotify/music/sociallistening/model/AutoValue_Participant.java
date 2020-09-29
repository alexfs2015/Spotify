package com.spotify.music.sociallistening.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_Participant extends Participant {
    private final String displayName;
    private final String id;
    private final String imageUrl;
    private final Boolean isHost;
    private final String largeImageUrl;
    private final String username;

    static final class Builder extends com.spotify.music.sociallistening.model.Participant.Builder {
        private String displayName;
        private String id;
        private String imageUrl;
        private Boolean isHost;
        private String largeImageUrl;
        private String username;

        Builder() {
        }

        public final com.spotify.music.sociallistening.model.Participant.Builder id(String str) {
            if (str != null) {
                this.id = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final com.spotify.music.sociallistening.model.Participant.Builder displayName(String str) {
            if (str != null) {
                this.displayName = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }

        public final com.spotify.music.sociallistening.model.Participant.Builder imageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public final com.spotify.music.sociallistening.model.Participant.Builder largeImageUrl(String str) {
            this.largeImageUrl = str;
            return this;
        }

        public final com.spotify.music.sociallistening.model.Participant.Builder isHost(Boolean bool) {
            this.isHost = bool;
            return this;
        }

        public final com.spotify.music.sociallistening.model.Participant.Builder username(String str) {
            if (str != null) {
                this.username = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        public final Participant build() {
            String str = "";
            if (this.id == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.displayName == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" displayName");
                str = sb2.toString();
            }
            if (this.username == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" username");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_Participant autoValue_Participant = new AutoValue_Participant(this.id, this.displayName, this.imageUrl, this.largeImageUrl, this.isHost, this.username);
                return autoValue_Participant;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_Participant(String str, String str2, String str3, String str4, Boolean bool, String str5) {
        this.id = str;
        this.displayName = str2;
        this.imageUrl = str3;
        this.largeImageUrl = str4;
        this.isHost = bool;
        this.username = str5;
    }

    @JsonProperty("id")
    public final String id() {
        return this.id;
    }

    @JsonProperty("display_name")
    public final String displayName() {
        return this.displayName;
    }

    @JsonProperty("image_url")
    public final String imageUrl() {
        return this.imageUrl;
    }

    @JsonProperty("large_image_url")
    public final String largeImageUrl() {
        return this.largeImageUrl;
    }

    @JsonProperty("is_host")
    public final Boolean isHost() {
        return this.isHost;
    }

    @JsonProperty("username")
    public final String username() {
        return this.username;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Participant{id=");
        sb.append(this.id);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", largeImageUrl=");
        sb.append(this.largeImageUrl);
        sb.append(", isHost=");
        sb.append(this.isHost);
        sb.append(", username=");
        sb.append(this.username);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Participant) {
            Participant participant = (Participant) obj;
            if (this.id.equals(participant.id()) && this.displayName.equals(participant.displayName())) {
                String str = this.imageUrl;
                if (str != null ? str.equals(participant.imageUrl()) : participant.imageUrl() == null) {
                    String str2 = this.largeImageUrl;
                    if (str2 != null ? str2.equals(participant.largeImageUrl()) : participant.largeImageUrl() == null) {
                        Boolean bool = this.isHost;
                        if (bool != null ? bool.equals(participant.isHost()) : participant.isHost() == null) {
                            if (this.username.equals(participant.username())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.id.hashCode() ^ 1000003) * 1000003) ^ this.displayName.hashCode()) * 1000003;
        String str = this.imageUrl;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.largeImageUrl;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.isHost;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.username.hashCode();
    }
}
