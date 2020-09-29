package com.spotify.mobile.android.spotlets.creatorartist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.creatorartist.model.$AutoValue_LinksModel reason: invalid class name */
abstract class C$AutoValue_LinksModel extends LinksModel {
    private final String facebookLink;
    private final String instagramLink;
    private final String twitterLink;
    private final String wikipediaLink;

    C$AutoValue_LinksModel(String str, String str2, String str3, String str4) {
        this.twitterLink = str;
        this.instagramLink = str2;
        this.wikipediaLink = str3;
        this.facebookLink = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r1.equals(r6.getTwitterLink()) != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r1.equals(r6.getInstagramLink()) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r1.equals(r6.getWikipediaLink()) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 5
            r0 = 1
            if (r6 != r5) goto L_0x0006
            r4 = 0
            return r0
        L_0x0006:
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.creatorartist.model.LinksModel
            r4 = 2
            r2 = 0
            r4 = 2
            if (r1 == 0) goto L_0x007d
            r4 = 0
            com.spotify.mobile.android.spotlets.creatorartist.model.LinksModel r6 = (com.spotify.mobile.android.spotlets.creatorartist.model.LinksModel) r6
            r4 = 4
            java.lang.String r1 = r5.twitterLink
            r4 = 7
            if (r1 != 0) goto L_0x0020
            r4 = 5
            java.lang.String r1 = r6.getTwitterLink()
            r4 = 6
            if (r1 != 0) goto L_0x007d
            r4 = 4
            goto L_0x002c
        L_0x0020:
            java.lang.String r3 = r6.getTwitterLink()
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 0
            if (r1 == 0) goto L_0x007d
        L_0x002c:
            java.lang.String r1 = r5.instagramLink
            r4 = 6
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = r6.getInstagramLink()
            r4 = 5
            if (r1 != 0) goto L_0x007d
            r4 = 6
            goto L_0x0046
        L_0x003a:
            java.lang.String r3 = r6.getInstagramLink()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 0
            if (r1 == 0) goto L_0x007d
        L_0x0046:
            java.lang.String r1 = r5.wikipediaLink
            r4 = 4
            if (r1 != 0) goto L_0x0055
            r4 = 4
            java.lang.String r1 = r6.getWikipediaLink()
            r4 = 5
            if (r1 != 0) goto L_0x007d
            r4 = 2
            goto L_0x0060
        L_0x0055:
            r4 = 3
            java.lang.String r3 = r6.getWikipediaLink()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x007d
        L_0x0060:
            r4 = 3
            java.lang.String r1 = r5.facebookLink
            r4 = 2
            if (r1 != 0) goto L_0x006f
            r4 = 1
            java.lang.String r6 = r6.getFacebookLink()
            r4 = 1
            if (r6 != 0) goto L_0x007d
            goto L_0x007b
        L_0x006f:
            java.lang.String r6 = r6.getFacebookLink()
            r4 = 6
            boolean r6 = r1.equals(r6)
            r4 = 3
            if (r6 == 0) goto L_0x007d
        L_0x007b:
            r4 = 3
            return r0
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.creatorartist.model.C$AutoValue_LinksModel.equals(java.lang.Object):boolean");
    }

    @JsonProperty("facebook")
    public String getFacebookLink() {
        return this.facebookLink;
    }

    @JsonProperty("instagram")
    public String getInstagramLink() {
        return this.instagramLink;
    }

    @JsonProperty("twitter")
    public String getTwitterLink() {
        return this.twitterLink;
    }

    @JsonProperty("wikipedia")
    public String getWikipediaLink() {
        return this.wikipediaLink;
    }

    public int hashCode() {
        String str = this.twitterLink;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.instagramLink;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.wikipediaLink;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.facebookLink;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        String str = "iestiwtonLkldrs{nMkiteL";
        StringBuilder sb = new StringBuilder("LinksModel{twitterLink=");
        sb.append(this.twitterLink);
        String str2 = "i tmg=Lnksramna,";
        sb.append(", instagramLink=");
        sb.append(this.instagramLink);
        sb.append(", wikipediaLink=");
        sb.append(this.wikipediaLink);
        String str3 = "o,kLoif=k nboec";
        sb.append(", facebookLink=");
        sb.append(this.facebookLink);
        String str4 = "}";
        sb.append("}");
        return sb.toString();
    }
}
