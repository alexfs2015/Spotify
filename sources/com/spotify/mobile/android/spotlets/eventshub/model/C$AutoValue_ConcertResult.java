package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_ConcertResult reason: invalid class name */
abstract class C$AutoValue_ConcertResult extends ConcertResult {
    private final String clickThroughUrl;
    private final Concert concert;
    private final Boolean discovery;
    private final Boolean nearUser;
    private final String source;

    C$AutoValue_ConcertResult(Concert concert2, String str, String str2, Boolean bool, Boolean bool2) {
        if (concert2 != null) {
            this.concert = concert2;
            this.clickThroughUrl = str;
            this.source = str2;
            this.nearUser = bool;
            this.discovery = bool2;
            return;
        }
        throw new NullPointerException("Null concert");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r1.equals(r6.getClickThroughUrl()) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r1.equals(r6.getSource()) != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r1.equals(r6.getNearUser()) != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            r0 = 1
            r4 = 5
            if (r6 != r5) goto L_0x0006
            return r0
        L_0x0006:
            r4 = 5
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult
            r4 = 6
            r2 = 0
            r4 = 0
            if (r1 == 0) goto L_0x008b
            r4 = 2
            com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult r6 = (com.spotify.mobile.android.spotlets.eventshub.model.ConcertResult) r6
            com.spotify.mobile.android.spotlets.eventshub.model.Concert r1 = r5.concert
            com.spotify.mobile.android.spotlets.eventshub.model.Concert r3 = r6.getConcert()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008b
            r4 = 3
            java.lang.String r1 = r5.clickThroughUrl
            if (r1 != 0) goto L_0x002c
            r4 = 5
            java.lang.String r1 = r6.getClickThroughUrl()
            r4 = 6
            if (r1 != 0) goto L_0x008b
            r4 = 1
            goto L_0x0038
        L_0x002c:
            java.lang.String r3 = r6.getClickThroughUrl()
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 == 0) goto L_0x008b
        L_0x0038:
            r4 = 1
            java.lang.String r1 = r5.source
            r4 = 7
            if (r1 != 0) goto L_0x0047
            r4 = 2
            java.lang.String r1 = r6.getSource()
            if (r1 != 0) goto L_0x008b
            r4 = 7
            goto L_0x0054
        L_0x0047:
            r4 = 7
            java.lang.String r3 = r6.getSource()
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 == 0) goto L_0x008b
        L_0x0054:
            r4 = 4
            java.lang.Boolean r1 = r5.nearUser
            if (r1 != 0) goto L_0x0063
            r4 = 7
            java.lang.Boolean r1 = r6.getNearUser()
            r4 = 2
            if (r1 != 0) goto L_0x008b
            r4 = 3
            goto L_0x006f
        L_0x0063:
            java.lang.Boolean r3 = r6.getNearUser()
            r4 = 3
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 == 0) goto L_0x008b
        L_0x006f:
            r4 = 4
            java.lang.Boolean r1 = r5.discovery
            r4 = 5
            if (r1 != 0) goto L_0x007e
            java.lang.Boolean r6 = r6.getDiscovery()
            r4 = 0
            if (r6 != 0) goto L_0x008b
            r4 = 5
            goto L_0x008a
        L_0x007e:
            java.lang.Boolean r6 = r6.getDiscovery()
            r4 = 0
            boolean r6 = r1.equals(r6)
            r4 = 7
            if (r6 == 0) goto L_0x008b
        L_0x008a:
            return r0
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.C$AutoValue_ConcertResult.equals(java.lang.Object):boolean");
    }

    @JsonProperty("clickThruUrl")
    public String getClickThroughUrl() {
        return this.clickThroughUrl;
    }

    @JsonProperty("concert")
    public Concert getConcert() {
        return this.concert;
    }

    @JsonProperty("discovery")
    public Boolean getDiscovery() {
        return this.discovery;
    }

    @JsonProperty("nearUser")
    public Boolean getNearUser() {
        return this.nearUser;
    }

    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = (this.concert.hashCode() ^ 1000003) * 1000003;
        String str = this.clickThroughUrl;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.source;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Boolean bool = this.nearUser;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.discovery;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConcertResult{concert=");
        sb.append(this.concert);
        String str = "clsr=ghl ohuiU,rTc";
        sb.append(", clickThroughUrl=");
        sb.append(this.clickThroughUrl);
        String str2 = ",u mcr=se";
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", nearUser=");
        sb.append(this.nearUser);
        String str3 = "=cdvoi orse,";
        sb.append(", discovery=");
        sb.append(this.discovery);
        sb.append("}");
        return sb.toString();
    }
}
