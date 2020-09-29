package com.spotify.music.features.trackcredits.model;

import java.util.List;

final class AutoValue_Artist extends Artist {
    private final String externalUrl;
    private final String name;
    private final List<String> subroles;
    private final String uri;
    private final double weight;

    AutoValue_Artist(String str, String str2, List<String> list, double d, String str3) {
        this.uri = str;
        this.name = str2;
        if (list != null) {
            this.subroles = list;
            this.weight = d;
            this.externalUrl = str3;
            return;
        }
        throw new NullPointerException("Null subroles");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Artist) {
            Artist artist = (Artist) obj;
            String str = this.uri;
            if (str != null ? str.equals(artist.uri()) : artist.uri() == null) {
                String str2 = this.name;
                if (str2 != null ? str2.equals(artist.name()) : artist.name() == null) {
                    if (this.subroles.equals(artist.subroles()) && Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(artist.weight())) {
                        String str3 = this.externalUrl;
                        return str3 != null ? str3.equals(artist.externalUrl()) : artist.externalUrl() == null;
                    }
                }
            }
        }
    }

    public final String externalUrl() {
        return this.externalUrl;
    }

    public final int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.name;
        int hashCode2 = (((((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.subroles.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.weight) >>> 32) ^ Double.doubleToLongBits(this.weight)))) * 1000003;
        String str3 = this.externalUrl;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String name() {
        return this.name;
    }

    public final List<String> subroles() {
        return this.subroles;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Artist{uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", subroles=");
        sb.append(this.subroles);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", externalUrl=");
        sb.append(this.externalUrl);
        sb.append("}");
        return sb.toString();
    }

    public final String uri() {
        return this.uri;
    }

    public final double weight() {
        return this.weight;
    }
}
