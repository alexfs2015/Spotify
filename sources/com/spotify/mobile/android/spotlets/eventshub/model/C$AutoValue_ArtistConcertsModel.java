package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_ArtistConcertsModel reason: invalid class name */
abstract class C$AutoValue_ArtistConcertsModel extends ArtistConcertsModel {
    private final Artist artist;
    private final List<ConcertResult> concerts;
    private final String userLocation;

    C$AutoValue_ArtistConcertsModel(Artist artist2, String str, List<ConcertResult> list) {
        if (artist2 != null) {
            this.artist = artist2;
            this.userLocation = str;
            if (list != null) {
                this.concerts = list;
                return;
            }
            throw new NullPointerException("Null concerts");
        }
        throw new NullPointerException("Null artist");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r1.equals(r6.getUserLocation()) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            r4 = 2
            if (r6 != r5) goto L_0x0005
            return r0
        L_0x0005:
            r4 = 5
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.eventshub.model.ArtistConcertsModel
            r4 = 6
            r2 = 0
            if (r1 == 0) goto L_0x004a
            com.spotify.mobile.android.spotlets.eventshub.model.ArtistConcertsModel r6 = (com.spotify.mobile.android.spotlets.eventshub.model.ArtistConcertsModel) r6
            com.spotify.mobile.android.spotlets.eventshub.model.Artist r1 = r5.artist
            r4 = 5
            com.spotify.mobile.android.spotlets.eventshub.model.Artist r3 = r6.getArtist()
            r4 = 2
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x004a
            java.lang.String r1 = r5.userLocation
            if (r1 != 0) goto L_0x002b
            r4 = 4
            java.lang.String r1 = r6.getUserLocation()
            r4 = 7
            if (r1 != 0) goto L_0x004a
            r4 = 5
            goto L_0x0038
        L_0x002b:
            r4 = 5
            java.lang.String r3 = r6.getUserLocation()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x004a
        L_0x0038:
            r4 = 1
            java.util.List<com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult> r1 = r5.concerts
            r4 = 6
            java.util.List r6 = r6.getConcerts()
            r4 = 0
            boolean r6 = r1.equals(r6)
            r4 = 7
            if (r6 == 0) goto L_0x004a
            r4 = 5
            return r0
        L_0x004a:
            r4 = 7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.C$AutoValue_ArtistConcertsModel.equals(java.lang.Object):boolean");
    }

    @JsonProperty("artist")
    public Artist getArtist() {
        return this.artist;
    }

    @JsonProperty("concerts")
    public List<ConcertResult> getConcerts() {
        return this.concerts;
    }

    @JsonProperty("userLocation")
    public String getUserLocation() {
        return this.userLocation;
    }

    public int hashCode() {
        int hashCode = (this.artist.hashCode() ^ 1000003) * 1000003;
        String str = this.userLocation;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.concerts.hashCode();
    }

    public String toString() {
        String str = "elsrt=Merttidscotrta{oiCssn";
        StringBuilder sb = new StringBuilder("ArtistConcertsModel{artist=");
        sb.append(this.artist);
        String str2 = "trums=e,a cooLi";
        sb.append(", userLocation=");
        sb.append(this.userLocation);
        String str3 = "sne,otc rco";
        sb.append(", concerts=");
        sb.append(this.concerts);
        sb.append("}");
        return sb.toString();
    }
}
