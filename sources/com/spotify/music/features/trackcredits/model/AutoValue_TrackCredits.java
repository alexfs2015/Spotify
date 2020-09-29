package com.spotify.music.features.trackcredits.model;

import java.util.List;

final class AutoValue_TrackCredits extends TrackCredits {
    private final EditCredits editCredits;
    private final String label;
    private final List<RoleCredits> roleCredits;
    private final Source source;
    private final String trackTitle;
    private final String trackUri;

    AutoValue_TrackCredits(String str, String str2, String str3, List<RoleCredits> list, EditCredits editCredits2, Source source2) {
        if (str != null) {
            this.label = str;
            if (str2 != null) {
                this.trackUri = str2;
                if (str3 != null) {
                    this.trackTitle = str3;
                    if (list != null) {
                        this.roleCredits = list;
                        if (editCredits2 != null) {
                            this.editCredits = editCredits2;
                            this.source = source2;
                            return;
                        }
                        throw new NullPointerException("Null editCredits");
                    }
                    throw new NullPointerException("Null roleCredits");
                }
                throw new NullPointerException("Null trackTitle");
            }
            throw new NullPointerException("Null trackUri");
        }
        throw new NullPointerException("Null label");
    }

    public final String label() {
        return this.label;
    }

    public final String trackUri() {
        return this.trackUri;
    }

    public final String trackTitle() {
        return this.trackTitle;
    }

    public final List<RoleCredits> roleCredits() {
        return this.roleCredits;
    }

    public final EditCredits editCredits() {
        return this.editCredits;
    }

    public final Source source() {
        return this.source;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackCredits{label=");
        sb.append(this.label);
        sb.append(", trackUri=");
        sb.append(this.trackUri);
        sb.append(", trackTitle=");
        sb.append(this.trackTitle);
        sb.append(", roleCredits=");
        sb.append(this.roleCredits);
        sb.append(", editCredits=");
        sb.append(this.editCredits);
        sb.append(", source=");
        sb.append(this.source);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TrackCredits) {
            TrackCredits trackCredits = (TrackCredits) obj;
            if (this.label.equals(trackCredits.label()) && this.trackUri.equals(trackCredits.trackUri()) && this.trackTitle.equals(trackCredits.trackTitle()) && this.roleCredits.equals(trackCredits.roleCredits()) && this.editCredits.equals(trackCredits.editCredits())) {
                Source source2 = this.source;
                return source2 != null ? source2.equals(trackCredits.source()) : trackCredits.source() == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((((((((this.label.hashCode() ^ 1000003) * 1000003) ^ this.trackUri.hashCode()) * 1000003) ^ this.trackTitle.hashCode()) * 1000003) ^ this.roleCredits.hashCode()) * 1000003) ^ this.editCredits.hashCode()) * 1000003;
        Source source2 = this.source;
        return hashCode ^ (source2 == null ? 0 : source2.hashCode());
    }
}
