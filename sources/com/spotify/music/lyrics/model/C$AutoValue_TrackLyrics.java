package com.spotify.music.lyrics.model;

import java.util.List;

/* renamed from: com.spotify.music.lyrics.model.$AutoValue_TrackLyrics reason: invalid class name */
abstract class C$AutoValue_TrackLyrics extends TrackLyrics {
    private final String kind;
    private final List<LyricsLineData> lines;
    private final String provider;
    private final ProviderAndroidIntent providerAndroidIntent;
    private final String publishersCredits;
    private final String trackId;
    private final String writers;

    C$AutoValue_TrackLyrics(List<LyricsLineData> list, String str, String str2, String str3, ProviderAndroidIntent providerAndroidIntent2, String str4, String str5) {
        if (list != null) {
            this.lines = list;
            if (str != null) {
                this.kind = str;
                if (str2 != null) {
                    this.trackId = str2;
                    this.provider = str3;
                    this.providerAndroidIntent = providerAndroidIntent2;
                    this.writers = str4;
                    this.publishersCredits = str5;
                    return;
                }
                throw new NullPointerException("Null trackId");
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null lines");
    }

    public List<LyricsLineData> getLines() {
        return this.lines;
    }

    public String getKind() {
        return this.kind;
    }

    public String getTrackId() {
        return this.trackId;
    }

    public String getProvider() {
        return this.provider;
    }

    public ProviderAndroidIntent getProviderAndroidIntent() {
        return this.providerAndroidIntent;
    }

    public String getWriters() {
        return this.writers;
    }

    public String getPublishersCredits() {
        return this.publishersCredits;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackLyrics{lines=");
        sb.append(this.lines);
        sb.append(", kind=");
        sb.append(this.kind);
        sb.append(", trackId=");
        sb.append(this.trackId);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", providerAndroidIntent=");
        sb.append(this.providerAndroidIntent);
        sb.append(", writers=");
        sb.append(this.writers);
        sb.append(", publishersCredits=");
        sb.append(this.publishersCredits);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TrackLyrics) {
            TrackLyrics trackLyrics = (TrackLyrics) obj;
            if (this.lines.equals(trackLyrics.getLines()) && this.kind.equals(trackLyrics.getKind()) && this.trackId.equals(trackLyrics.getTrackId())) {
                String str = this.provider;
                if (str != null ? str.equals(trackLyrics.getProvider()) : trackLyrics.getProvider() == null) {
                    ProviderAndroidIntent providerAndroidIntent2 = this.providerAndroidIntent;
                    if (providerAndroidIntent2 != null ? providerAndroidIntent2.equals(trackLyrics.getProviderAndroidIntent()) : trackLyrics.getProviderAndroidIntent() == null) {
                        String str2 = this.writers;
                        if (str2 != null ? str2.equals(trackLyrics.getWriters()) : trackLyrics.getWriters() == null) {
                            String str3 = this.publishersCredits;
                            return str3 != null ? str3.equals(trackLyrics.getPublishersCredits()) : trackLyrics.getPublishersCredits() == null;
                        }
                    }
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (((((this.lines.hashCode() ^ 1000003) * 1000003) ^ this.kind.hashCode()) * 1000003) ^ this.trackId.hashCode()) * 1000003;
        String str = this.provider;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ProviderAndroidIntent providerAndroidIntent2 = this.providerAndroidIntent;
        int hashCode3 = (hashCode2 ^ (providerAndroidIntent2 == null ? 0 : providerAndroidIntent2.hashCode())) * 1000003;
        String str2 = this.writers;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.publishersCredits;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 ^ i;
    }
}
