package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_Artist reason: invalid class name */
abstract class C$AutoValue_Artist extends Artist {
    private final String getImageUri;
    private final Integer getMonthlyListener;
    private final String getName;
    private final String getUri;
    private final boolean hasAffinity;

    C$AutoValue_Artist(String str, String str2, String str3, boolean z, Integer num) {
        if (str != null) {
            this.getUri = str;
            this.getName = str2;
            this.getImageUri = str3;
            this.hasAffinity = z;
            this.getMonthlyListener = num;
            return;
        }
        throw new NullPointerException("Null getUri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r1.equals(r6.getName()) != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r1.equals(r6.getImageUri()) != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r1.equals(r6.getMonthlyListener()) != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0005
            r4 = 4
            return r0
        L_0x0005:
            r4 = 1
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.eventshub.model.Artist
            r4 = 7
            r2 = 0
            if (r1 == 0) goto L_0x007c
            r4 = 0
            com.spotify.mobile.android.spotlets.eventshub.model.Artist r6 = (com.spotify.mobile.android.spotlets.eventshub.model.Artist) r6
            java.lang.String r1 = r5.getUri
            r4 = 2
            java.lang.String r3 = r6.getUri()
            r4 = 0
            boolean r1 = r1.equals(r3)
            r4 = 4
            if (r1 == 0) goto L_0x007c
            r4 = 7
            java.lang.String r1 = r5.getName
            r4 = 7
            if (r1 != 0) goto L_0x002d
            r4 = 6
            java.lang.String r1 = r6.getName()
            if (r1 != 0) goto L_0x007c
            r4 = 4
            goto L_0x003a
        L_0x002d:
            r4 = 1
            java.lang.String r3 = r6.getName()
            r4 = 0
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 == 0) goto L_0x007c
        L_0x003a:
            java.lang.String r1 = r5.getImageUri
            r4 = 6
            if (r1 != 0) goto L_0x0048
            java.lang.String r1 = r6.getImageUri()
            r4 = 0
            if (r1 != 0) goto L_0x007c
            r4 = 2
            goto L_0x0054
        L_0x0048:
            java.lang.String r3 = r6.getImageUri()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 == 0) goto L_0x007c
        L_0x0054:
            r4 = 0
            boolean r1 = r5.hasAffinity
            r4 = 1
            boolean r3 = r6.hasAffinity()
            r4 = 1
            if (r1 != r3) goto L_0x007c
            r4 = 1
            java.lang.Integer r1 = r5.getMonthlyListener
            r4 = 7
            if (r1 != 0) goto L_0x006f
            r4 = 1
            java.lang.Integer r6 = r6.getMonthlyListener()
            r4 = 0
            if (r6 != 0) goto L_0x007c
            r4 = 4
            goto L_0x007b
        L_0x006f:
            java.lang.Integer r6 = r6.getMonthlyListener()
            r4 = 4
            boolean r6 = r1.equals(r6)
            r4 = 5
            if (r6 == 0) goto L_0x007c
        L_0x007b:
            return r0
        L_0x007c:
            r4 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.C$AutoValue_Artist.equals(java.lang.Object):boolean");
    }

    @JsonProperty("imageUri")
    public String getImageUri() {
        return this.getImageUri;
    }

    @JsonProperty("monthlyListeners")
    public Integer getMonthlyListener() {
        return this.getMonthlyListener;
    }

    @JsonProperty("name")
    public String getName() {
        return this.getName;
    }

    @JsonProperty("uri")
    public String getUri() {
        return this.getUri;
    }

    @JsonProperty("hasAffinity")
    public boolean hasAffinity() {
        return this.hasAffinity;
    }

    public int hashCode() {
        int hashCode = (this.getUri.hashCode() ^ 1000003) * 1000003;
        String str = this.getName;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.getImageUri;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.hasAffinity ? 1231 : 1237)) * 1000003;
        Integer num = this.getMonthlyListener;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Artist{getUri=");
        sb.append(this.getUri);
        sb.append(", getName=");
        sb.append(this.getName);
        sb.append(", getImageUri=");
        sb.append(this.getImageUri);
        String str = "t s=fhii,snayf";
        sb.append(", hasAffinity=");
        sb.append(this.hasAffinity);
        String str2 = "teemrM=nengotL, iysht";
        sb.append(", getMonthlyListener=");
        sb.append(this.getMonthlyListener);
        String str3 = "}";
        sb.append("}");
        return sb.toString();
    }
}
