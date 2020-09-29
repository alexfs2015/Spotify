package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_ConcertEntityModel reason: invalid class name */
abstract class C$AutoValue_ConcertEntityModel extends ConcertEntityModel {
    private final List<Album> albumsForConcert;
    private final List<Artist> artists;
    private final String color;
    private final ConcertResult concertResult;
    private final String ticketAvailability;
    private final List<ConcertResult> upcomingConcerts;
    private final String upcomingConcertsSource;
    private final String userLocation;

    C$AutoValue_ConcertEntityModel(ConcertResult concertResult2, List<Artist> list, List<ConcertResult> list2, List<Album> list3, String str, String str2, String str3, String str4) {
        if (concertResult2 != null) {
            this.concertResult = concertResult2;
            if (list != null) {
                this.artists = list;
                this.upcomingConcerts = list2;
                this.albumsForConcert = list3;
                this.userLocation = str;
                this.upcomingConcertsSource = str2;
                this.color = str3;
                this.ticketAvailability = str4;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null concertResult");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        if (r1.equals(r6.getTicketAvailability()) != false) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            r4 = 7
            if (r6 != r5) goto L_0x0005
            return r0
        L_0x0005:
            r4 = 3
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel
            r4 = 2
            r2 = 0
            if (r1 == 0) goto L_0x00cb
            com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel r6 = (com.spotify.mobile.android.spotlets.eventshub.model.ConcertEntityModel) r6
            com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult r1 = r5.concertResult
            com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult r3 = r6.getConcertResult()
            r4 = 4
            boolean r1 = r1.equals(r3)
            r4 = 7
            if (r1 == 0) goto L_0x00cb
            java.util.List<com.spotify.mobile.android.spotlets.eventshub.model.Artist> r1 = r5.artists
            java.util.List r3 = r6.getArtists()
            r4 = 5
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00cb
            r4 = 1
            java.util.List<com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult> r1 = r5.upcomingConcerts
            r4 = 5
            if (r1 != 0) goto L_0x0038
            r4 = 5
            java.util.List r1 = r6.getUpcomingConcerts()
            r4 = 2
            if (r1 != 0) goto L_0x00cb
            goto L_0x0044
        L_0x0038:
            r4 = 1
            java.util.List r3 = r6.getUpcomingConcerts()
            boolean r1 = r1.equals(r3)
            r4 = 1
            if (r1 == 0) goto L_0x00cb
        L_0x0044:
            java.util.List<com.spotify.mobile.android.spotlets.eventshub.model.Album> r1 = r5.albumsForConcert
            r4 = 6
            if (r1 != 0) goto L_0x0052
            r4 = 5
            java.util.List r1 = r6.getAlbumsForConcert()
            r4 = 5
            if (r1 != 0) goto L_0x00cb
            goto L_0x005e
        L_0x0052:
            r4 = 2
            java.util.List r3 = r6.getAlbumsForConcert()
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 == 0) goto L_0x00cb
        L_0x005e:
            r4 = 2
            java.lang.String r1 = r5.userLocation
            r4 = 0
            if (r1 != 0) goto L_0x006d
            r4 = 3
            java.lang.String r1 = r6.getUserLocation()
            r4 = 3
            if (r1 != 0) goto L_0x00cb
            goto L_0x0079
        L_0x006d:
            r4 = 1
            java.lang.String r3 = r6.getUserLocation()
            r4 = 0
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00cb
        L_0x0079:
            r4 = 0
            java.lang.String r1 = r5.upcomingConcertsSource
            if (r1 != 0) goto L_0x0087
            r4 = 1
            java.lang.String r1 = r6.getUpcomingConcertsSource()
            r4 = 1
            if (r1 != 0) goto L_0x00cb
            goto L_0x0094
        L_0x0087:
            r4 = 4
            java.lang.String r3 = r6.getUpcomingConcertsSource()
            r4 = 0
            boolean r1 = r1.equals(r3)
            r4 = 7
            if (r1 == 0) goto L_0x00cb
        L_0x0094:
            java.lang.String r1 = r5.color
            r4 = 3
            if (r1 != 0) goto L_0x00a2
            r4 = 4
            java.lang.String r1 = r6.getColor()
            r4 = 3
            if (r1 != 0) goto L_0x00cb
            goto L_0x00af
        L_0x00a2:
            r4 = 6
            java.lang.String r3 = r6.getColor()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 0
            if (r1 == 0) goto L_0x00cb
        L_0x00af:
            java.lang.String r1 = r5.ticketAvailability
            r4 = 5
            if (r1 != 0) goto L_0x00bd
            java.lang.String r6 = r6.getTicketAvailability()
            r4 = 5
            if (r6 != 0) goto L_0x00cb
            r4 = 3
            goto L_0x00c9
        L_0x00bd:
            java.lang.String r6 = r6.getTicketAvailability()
            r4 = 3
            boolean r6 = r1.equals(r6)
            r4 = 6
            if (r6 == 0) goto L_0x00cb
        L_0x00c9:
            r4 = 0
            return r0
        L_0x00cb:
            r4 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.C$AutoValue_ConcertEntityModel.equals(java.lang.Object):boolean");
    }

    @JsonProperty("albums")
    public List<Album> getAlbumsForConcert() {
        return this.albumsForConcert;
    }

    @JsonProperty("artists")
    public List<Artist> getArtists() {
        return this.artists;
    }

    @JsonProperty("color")
    public String getColor() {
        return this.color;
    }

    @JsonProperty("concert")
    public ConcertResult getConcertResult() {
        return this.concertResult;
    }

    @JsonProperty("ticketAvailability")
    public String getTicketAvailability() {
        return this.ticketAvailability;
    }

    @JsonProperty("upcomingConcerts")
    public List<ConcertResult> getUpcomingConcerts() {
        return this.upcomingConcerts;
    }

    @JsonProperty("upcomingConcertsSource")
    public String getUpcomingConcertsSource() {
        return this.upcomingConcertsSource;
    }

    @JsonProperty("userLocation")
    public String getUserLocation() {
        return this.userLocation;
    }

    public int hashCode() {
        int hashCode = (((this.concertResult.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode()) * 1000003;
        List<ConcertResult> list = this.upcomingConcerts;
        int i = 0;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<Album> list2 = this.albumsForConcert;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str = this.userLocation;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.upcomingConcertsSource;
        int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.color;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.ticketAvailability;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 ^ i;
    }

    public String toString() {
        String str = "dosMlnroctlCetnysrt=noictceteuR{E";
        StringBuilder sb = new StringBuilder("ConcertEntityModel{concertResult=");
        sb.append(this.concertResult);
        String str2 = "=rsma,t ti";
        sb.append(", artists=");
        sb.append(this.artists);
        String str3 = "gcoionCmru=, conetp";
        sb.append(", upcomingConcerts=");
        sb.append(this.upcomingConcerts);
        sb.append(", albumsForConcert=");
        sb.append(this.albumsForConcert);
        String str4 = "trauoboiLc,e=n ";
        sb.append(", userLocation=");
        sb.append(this.userLocation);
        String str5 = "tneSrmbproocus=cn,guoeic ";
        sb.append(", upcomingConcertsSource=");
        sb.append(this.upcomingConcertsSource);
        String str6 = "or=o lct";
        sb.append(", color=");
        sb.append(this.color);
        String str7 = " abti,vtpika=lelcyiti";
        sb.append(", ticketAvailability=");
        sb.append(this.ticketAvailability);
        String str8 = "}";
        sb.append("}");
        return sb.toString();
    }
}
