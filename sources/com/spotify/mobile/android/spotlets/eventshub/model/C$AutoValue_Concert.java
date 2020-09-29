package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_Concert reason: invalid class name */
abstract class C$AutoValue_Concert extends Concert {
    private final List<Artist> artists;
    private final String dateString;
    private final boolean festival;
    private final String id;
    private final String location;
    private final List<ConcertPartner> partnerConcerts;
    private final List<ConcertTicketing> ticketing;
    private final String title;
    private final String venue;

    C$AutoValue_Concert(String str, String str2, String str3, String str4, String str5, List<Artist> list, boolean z, List<ConcertPartner> list2, List<ConcertTicketing> list3) {
        this.id = str;
        this.dateString = str2;
        this.title = str3;
        this.location = str4;
        this.venue = str5;
        if (list != null) {
            this.artists = list;
            this.festival = z;
            this.partnerConcerts = list2;
            this.ticketing = list3;
            return;
        }
        throw new NullPointerException("Null artists");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r1.equals(r6.getDateString()) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r1.equals(r6.getTitle()) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r1.equals(r6.getLocation()) != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ce, code lost:
        if (r1.equals(r6.getPartnerConcerts()) != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 2
            r0 = 1
            if (r6 != r5) goto L_0x0006
            r4 = 4
            return r0
        L_0x0006:
            r4 = 2
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.eventshub.model.Concert
            r4 = 5
            r2 = 0
            r4 = 4
            if (r1 == 0) goto L_0x00e9
            r4 = 2
            com.spotify.mobile.android.spotlets.eventshub.model.Concert r6 = (com.spotify.mobile.android.spotlets.eventshub.model.Concert) r6
            r4 = 3
            java.lang.String r1 = r5.id
            r4 = 6
            if (r1 != 0) goto L_0x001f
            java.lang.String r1 = r6.getId()
            r4 = 0
            if (r1 != 0) goto L_0x00e9
            goto L_0x002c
        L_0x001f:
            r4 = 2
            java.lang.String r3 = r6.getId()
            r4 = 5
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x00e9
        L_0x002c:
            r4 = 0
            java.lang.String r1 = r5.dateString
            r4 = 0
            if (r1 != 0) goto L_0x003c
            r4 = 2
            java.lang.String r1 = r6.getDateString()
            r4 = 7
            if (r1 != 0) goto L_0x00e9
            r4 = 5
            goto L_0x0048
        L_0x003c:
            java.lang.String r3 = r6.getDateString()
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 == 0) goto L_0x00e9
        L_0x0048:
            r4 = 5
            java.lang.String r1 = r5.title
            r4 = 2
            if (r1 != 0) goto L_0x0058
            r4 = 7
            java.lang.String r1 = r6.getTitle()
            r4 = 0
            if (r1 != 0) goto L_0x00e9
            r4 = 3
            goto L_0x0065
        L_0x0058:
            r4 = 7
            java.lang.String r3 = r6.getTitle()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 1
            if (r1 == 0) goto L_0x00e9
        L_0x0065:
            r4 = 2
            java.lang.String r1 = r5.location
            r4 = 3
            if (r1 != 0) goto L_0x0074
            java.lang.String r1 = r6.getLocation()
            r4 = 2
            if (r1 != 0) goto L_0x00e9
            r4 = 5
            goto L_0x0081
        L_0x0074:
            r4 = 1
            java.lang.String r3 = r6.getLocation()
            r4 = 2
            boolean r1 = r1.equals(r3)
            r4 = 0
            if (r1 == 0) goto L_0x00e9
        L_0x0081:
            r4 = 2
            java.lang.String r1 = r5.venue
            if (r1 != 0) goto L_0x008f
            r4 = 5
            java.lang.String r1 = r6.getVenue()
            r4 = 3
            if (r1 != 0) goto L_0x00e9
            goto L_0x009b
        L_0x008f:
            java.lang.String r3 = r6.getVenue()
            r4 = 0
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 == 0) goto L_0x00e9
        L_0x009b:
            java.util.List<com.spotify.mobile.android.spotlets.eventshub.model.Artist> r1 = r5.artists
            r4 = 2
            java.util.List r3 = r6.getArtists()
            r4 = 3
            boolean r1 = r1.equals(r3)
            r4 = 0
            if (r1 == 0) goto L_0x00e9
            r4 = 0
            boolean r1 = r5.festival
            boolean r3 = r6.isFestival()
            r4 = 3
            if (r1 != r3) goto L_0x00e9
            r4 = 6
            java.util.List<com.spotify.mobile.android.spotlets.eventshub.model.ConcertPartner> r1 = r5.partnerConcerts
            r4 = 0
            if (r1 != 0) goto L_0x00c3
            java.util.List r1 = r6.getPartnerConcerts()
            r4 = 0
            if (r1 != 0) goto L_0x00e9
            r4 = 1
            goto L_0x00d0
        L_0x00c3:
            r4 = 2
            java.util.List r3 = r6.getPartnerConcerts()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x00e9
        L_0x00d0:
            java.util.List<com.spotify.mobile.android.spotlets.eventshub.model.ConcertTicketing> r1 = r5.ticketing
            if (r1 != 0) goto L_0x00db
            java.util.List r6 = r6.getTicketing()
            if (r6 != 0) goto L_0x00e9
            goto L_0x00e7
        L_0x00db:
            r4 = 4
            java.util.List r6 = r6.getTicketing()
            r4 = 2
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00e9
        L_0x00e7:
            r4 = 7
            return r0
        L_0x00e9:
            r4 = 6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.C$AutoValue_Concert.equals(java.lang.Object):boolean");
    }

    @JsonProperty("artists")
    public List<Artist> getArtists() {
        return this.artists;
    }

    @JsonProperty("date")
    public String getDateString() {
        return this.dateString;
    }

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    @JsonProperty("partnerConcerts")
    public List<ConcertPartner> getPartnerConcerts() {
        return this.partnerConcerts;
    }

    @JsonProperty("ticketing")
    public List<ConcertTicketing> getTicketing() {
        return this.ticketing;
    }

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return this.venue;
    }

    public int hashCode() {
        int i;
        String str = this.id;
        int i2 = 0;
        if (str == null) {
            i = 0;
            boolean z = true;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.dateString;
        int hashCode = (i3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.title;
        int hashCode2 = (hashCode ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.location;
        int hashCode3 = (hashCode2 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.venue;
        int hashCode4 = (((((hashCode3 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ (this.festival ? 1231 : 1237)) * 1000003;
        List<ConcertPartner> list = this.partnerConcerts;
        int hashCode5 = (hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<ConcertTicketing> list2 = this.ticketing;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode5 ^ i2;
    }

    @JsonProperty("festival")
    public boolean isFestival() {
        return this.festival;
    }

    public String toString() {
        String str = "rost{=Ceidn";
        StringBuilder sb = new StringBuilder("Concert{id=");
        sb.append(this.id);
        String str2 = "aermdg=itS nt";
        sb.append(", dateString=");
        sb.append(this.dateString);
        String str3 = " lteo,it";
        sb.append(", title=");
        sb.append(this.title);
        String str4 = "c,tolbanio=";
        sb.append(", location=");
        sb.append(this.location);
        String str5 = "en u=eb,";
        sb.append(", venue=");
        sb.append(this.venue);
        sb.append(", artists=");
        sb.append(this.artists);
        String str6 = "a,f =vittle";
        sb.append(", festival=");
        sb.append(this.festival);
        String str7 = "tenptoCrpa,=nrsecr";
        sb.append(", partnerConcerts=");
        sb.append(this.partnerConcerts);
        String str8 = "t=,iie cnttk";
        sb.append(", ticketing=");
        sb.append(this.ticketing);
        sb.append("}");
        return sb.toString();
    }
}
