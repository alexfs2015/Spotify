package com.spotify.music.features.languagepicker.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.languagepicker.model.$AutoValue_AvailableLanguage reason: invalid class name */
abstract class C$AutoValue_AvailableLanguage extends AvailableLanguage {
    private final String bcp47;
    private final String imageUri;
    private final String name;

    C$AutoValue_AvailableLanguage(String str, String str2, String str3) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.imageUri = str2;
                if (str3 != null) {
                    this.bcp47 = str3;
                    return;
                }
                throw new NullPointerException("Null bcp47");
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null name");
    }

    @JsonProperty("name")
    public String name() {
        return this.name;
    }

    @JsonProperty("imageUri")
    public String imageUri() {
        return this.imageUri;
    }

    @JsonProperty("bcp47")
    public String bcp47() {
        return this.bcp47;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvailableLanguage{name=");
        sb.append(this.name);
        sb.append(", imageUri=");
        sb.append(this.imageUri);
        sb.append(", bcp47=");
        sb.append(this.bcp47);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AvailableLanguage) {
            AvailableLanguage availableLanguage = (AvailableLanguage) obj;
            return this.name.equals(availableLanguage.name()) && this.imageUri.equals(availableLanguage.imageUri()) && this.bcp47.equals(availableLanguage.bcp47());
        }
    }

    public int hashCode() {
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.imageUri.hashCode()) * 1000003) ^ this.bcp47.hashCode();
    }
}
