package com.spotify.music.features.trackcredits.model;

final class AutoValue_EditCredits extends EditCredits {
    private final String label;
    private final String url;

    AutoValue_EditCredits(String str, String str2) {
        if (str != null) {
            this.label = str;
            if (str2 != null) {
                this.url = str2;
                return;
            }
            throw new NullPointerException("Null url");
        }
        throw new NullPointerException("Null label");
    }

    public final String label() {
        return this.label;
    }

    public final String url() {
        return this.url;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditCredits{label=");
        sb.append(this.label);
        sb.append(", url=");
        sb.append(this.url);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EditCredits) {
            EditCredits editCredits = (EditCredits) obj;
            return this.label.equals(editCredits.label()) && this.url.equals(editCredits.url());
        }
    }

    public final int hashCode() {
        return ((this.label.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode();
    }
}
