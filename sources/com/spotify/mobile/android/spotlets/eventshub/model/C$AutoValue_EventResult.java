package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_EventResult reason: invalid class name */
abstract class C$AutoValue_EventResult extends EventResult {
    private final List<String> artists;
    private final String closingDate;
    private final List<ConcertResult> concertResults;
    private final String location;
    private final String openingDate;
    private final String source;
    private final String venue;

    C$AutoValue_EventResult(List<ConcertResult> list, List<String> list2, String str, String str2, String str3, String str4, String str5) {
        if (list != null) {
            this.concertResults = list;
            if (list2 != null) {
                this.artists = list2;
                this.source = str;
                this.openingDate = str2;
                this.closingDate = str3;
                this.venue = str4;
                this.location = str5;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null concertResults");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r1.equals(r6.getSource()) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r1.equals(r6.getOpeningDate()) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        if (r1.equals(r6.getClosingDate()) != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (r1.equals(r6.getVenue()) != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (r1.equals(r6.getLocation()) != false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            r0 = 1
            r4 = 3
            if (r6 != r5) goto L_0x0007
            r4 = 1
            return r0
        L_0x0007:
            r4 = 7
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.eventshub.model.EventResult
            r4 = 1
            r2 = 0
            r4 = 4
            if (r1 == 0) goto L_0x00b7
            r4 = 5
            com.spotify.mobile.android.spotlets.eventshub.model.EventResult r6 = (com.spotify.mobile.android.spotlets.eventshub.model.EventResult) r6
            java.util.List<com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult> r1 = r5.concertResults
            r4 = 6
            java.util.List r3 = r6.getConcertResults()
            r4 = 7
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b7
            java.util.List<java.lang.String> r1 = r5.artists
            r4 = 2
            java.util.List r3 = r6.getArtists()
            r4 = 5
            boolean r1 = r1.equals(r3)
            r4 = 1
            if (r1 == 0) goto L_0x00b7
            r4 = 2
            java.lang.String r1 = r5.source
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = r6.getSource()
            r4 = 6
            if (r1 != 0) goto L_0x00b7
            r4 = 5
            goto L_0x004a
        L_0x003d:
            r4 = 6
            java.lang.String r3 = r6.getSource()
            r4 = 4
            boolean r1 = r1.equals(r3)
            r4 = 4
            if (r1 == 0) goto L_0x00b7
        L_0x004a:
            r4 = 0
            java.lang.String r1 = r5.openingDate
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = r6.getOpeningDate()
            r4 = 2
            if (r1 != 0) goto L_0x00b7
            r4 = 0
            goto L_0x0065
        L_0x0058:
            r4 = 5
            java.lang.String r3 = r6.getOpeningDate()
            r4 = 3
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 == 0) goto L_0x00b7
        L_0x0065:
            r4 = 6
            java.lang.String r1 = r5.closingDate
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = r6.getClosingDate()
            r4 = 6
            if (r1 != 0) goto L_0x00b7
            r4 = 1
            goto L_0x007f
        L_0x0073:
            java.lang.String r3 = r6.getClosingDate()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 0
            if (r1 == 0) goto L_0x00b7
        L_0x007f:
            java.lang.String r1 = r5.venue
            r4 = 1
            if (r1 != 0) goto L_0x008d
            java.lang.String r1 = r6.getVenue()
            r4 = 2
            if (r1 != 0) goto L_0x00b7
            r4 = 4
            goto L_0x0099
        L_0x008d:
            r4 = 5
            java.lang.String r3 = r6.getVenue()
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x00b7
        L_0x0099:
            java.lang.String r1 = r5.location
            r4 = 3
            if (r1 != 0) goto L_0x00a8
            r4 = 3
            java.lang.String r6 = r6.getLocation()
            r4 = 3
            if (r6 != 0) goto L_0x00b7
            r4 = 2
            goto L_0x00b5
        L_0x00a8:
            r4 = 6
            java.lang.String r6 = r6.getLocation()
            r4 = 2
            boolean r6 = r1.equals(r6)
            r4 = 2
            if (r6 == 0) goto L_0x00b7
        L_0x00b5:
            r4 = 3
            return r0
        L_0x00b7:
            r4 = 7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.C$AutoValue_EventResult.equals(java.lang.Object):boolean");
    }

    @JsonProperty("artists")
    public List<String> getArtists() {
        return this.artists;
    }

    @JsonProperty("closingDate")
    public String getClosingDate() {
        return this.closingDate;
    }

    @JsonProperty("concerts")
    public List<ConcertResult> getConcertResults() {
        return this.concertResults;
    }

    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    @JsonProperty("openingDate")
    public String getOpeningDate() {
        return this.openingDate;
    }

    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return this.venue;
    }

    public int hashCode() {
        int hashCode = (((this.concertResults.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode()) * 1000003;
        String str = this.source;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.openingDate;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.closingDate;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.venue;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.location;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 ^ i;
    }

    public String toString() {
        String str = "{tslRustrevleesnto=sucneEcR";
        StringBuilder sb = new StringBuilder("EventResult{concertResults=");
        sb.append(this.concertResults);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", source=");
        sb.append(this.source);
        String str2 = ",npm Doiatnge=";
        sb.append(", openingDate=");
        sb.append(this.openingDate);
        sb.append(", closingDate=");
        sb.append(this.closingDate);
        String str3 = " ueeonv,";
        sb.append(", venue=");
        sb.append(this.venue);
        String str4 = "i aonbcl=,o";
        sb.append(", location=");
        sb.append(this.location);
        String str5 = "}";
        sb.append("}");
        return sb.toString();
    }
}
