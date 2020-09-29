package com.spotify.music.features.trackcredits.model;

import java.util.List;

final class AutoValue_RoleCredits extends RoleCredits {
    private final List<Artist> artists;
    private final String roleTitle;

    AutoValue_RoleCredits(String str, List<Artist> list) {
        if (str != null) {
            this.roleTitle = str;
            if (list != null) {
                this.artists = list;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null roleTitle");
    }

    public final List<Artist> artists() {
        return this.artists;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RoleCredits) {
            RoleCredits roleCredits = (RoleCredits) obj;
            return this.roleTitle.equals(roleCredits.roleTitle()) && this.artists.equals(roleCredits.artists());
        }
    }

    public final int hashCode() {
        return ((this.roleTitle.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode();
    }

    public final String roleTitle() {
        return this.roleTitle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoleCredits{roleTitle=");
        sb.append(this.roleTitle);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append("}");
        return sb.toString();
    }
}
