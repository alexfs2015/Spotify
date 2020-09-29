package com.spotify.mobile.android.spotlets.ads.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.ads.model.$AutoValue_CompanionAd reason: invalid class name */
abstract class C$AutoValue_CompanionAd extends CompanionAd {
    private final int bitrate;
    private final boolean hasDisplay;
    private final int height;
    private final String imageHexId;
    private final boolean lockedRatio;
    private final String mimeType;
    private final boolean scalable;
    private final String url;
    private final int width;

    C$AutoValue_CompanionAd(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str3) {
        this.imageHexId = str;
        this.mimeType = str2;
        this.width = i;
        this.height = i2;
        this.scalable = z;
        this.lockedRatio = z2;
        this.hasDisplay = z3;
        this.bitrate = i3;
        this.url = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r1.equals(r6.getMimeType()) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        if (r1.equals(r6.getUrl()) != false) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 7
            r0 = 1
            if (r6 != r5) goto L_0x0005
            return r0
        L_0x0005:
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.ads.model.CompanionAd
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L_0x009e
            r4 = 3
            com.spotify.mobile.android.spotlets.ads.model.CompanionAd r6 = (com.spotify.mobile.android.spotlets.ads.model.CompanionAd) r6
            r4 = 3
            java.lang.String r1 = r5.imageHexId
            r4 = 7
            if (r1 != 0) goto L_0x001c
            r4 = 6
            java.lang.String r1 = r6.getImageHexId()
            if (r1 != 0) goto L_0x009e
            goto L_0x0028
        L_0x001c:
            java.lang.String r3 = r6.getImageHexId()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 4
            if (r1 == 0) goto L_0x009e
        L_0x0028:
            r4 = 5
            java.lang.String r1 = r5.mimeType
            r4 = 1
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r6.getMimeType()
            r4 = 4
            if (r1 != 0) goto L_0x009e
            r4 = 4
            goto L_0x0044
        L_0x0037:
            r4 = 6
            java.lang.String r3 = r6.getMimeType()
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 == 0) goto L_0x009e
        L_0x0044:
            int r1 = r5.width
            r4 = 2
            int r3 = r6.getWidth()
            r4 = 4
            if (r1 != r3) goto L_0x009e
            r4 = 6
            int r1 = r5.height
            r4 = 4
            int r3 = r6.getHeight()
            r4 = 1
            if (r1 != r3) goto L_0x009e
            boolean r1 = r5.scalable
            r4 = 4
            boolean r3 = r6.isScalable()
            r4 = 0
            if (r1 != r3) goto L_0x009e
            r4 = 6
            boolean r1 = r5.lockedRatio
            boolean r3 = r6.isLockedRatio()
            r4 = 6
            if (r1 != r3) goto L_0x009e
            r4 = 7
            boolean r1 = r5.hasDisplay
            r4 = 3
            boolean r3 = r6.isHasDisplay()
            r4 = 4
            if (r1 != r3) goto L_0x009e
            r4 = 6
            int r1 = r5.bitrate
            int r3 = r6.getBitrate()
            r4 = 2
            if (r1 != r3) goto L_0x009e
            java.lang.String r1 = r5.url
            if (r1 != 0) goto L_0x008f
            java.lang.String r6 = r6.getUrl()
            r4 = 6
            if (r6 != 0) goto L_0x009e
            r4 = 2
            goto L_0x009c
        L_0x008f:
            r4 = 3
            java.lang.String r6 = r6.getUrl()
            r4 = 4
            boolean r6 = r1.equals(r6)
            r4 = 5
            if (r6 == 0) goto L_0x009e
        L_0x009c:
            r4 = 2
            return r0
        L_0x009e:
            r4 = 6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.ads.model.C$AutoValue_CompanionAd.equals(java.lang.Object):boolean");
    }

    @JsonProperty("bitrate")
    public int getBitrate() {
        return this.bitrate;
    }

    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    @JsonProperty("image_hex_id")
    public String getImageHexId() {
        return this.imageHexId;
    }

    @JsonProperty("mime_type")
    public String getMimeType() {
        return this.mimeType;
    }

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.imageHexId;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.mimeType;
        int i2 = 1231;
        int hashCode2 = (((((((((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.width) * 1000003) ^ this.height) * 1000003) ^ (this.scalable ? 1231 : 1237)) * 1000003) ^ (this.lockedRatio ? 1231 : 1237)) * 1000003;
        if (!this.hasDisplay) {
            i2 = 1237;
        }
        int i3 = (((hashCode2 ^ i2) * 1000003) ^ this.bitrate) * 1000003;
        String str3 = this.url;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 ^ i;
    }

    @JsonProperty("has_display")
    public boolean isHasDisplay() {
        return this.hasDisplay;
    }

    @JsonProperty("locked_ratio")
    public boolean isLockedRatio() {
        return this.lockedRatio;
    }

    @JsonProperty("scalable")
    public boolean isScalable() {
        return this.scalable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CompanionAd{imageHexId=");
        sb.append(this.imageHexId);
        sb.append(", mimeType=");
        sb.append(this.mimeType);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        String str = "aesa,bcls =";
        sb.append(", scalable=");
        sb.append(this.scalable);
        String str2 = "c =mitaoRkd,ol";
        sb.append(", lockedRatio=");
        sb.append(this.lockedRatio);
        sb.append(", hasDisplay=");
        sb.append(this.hasDisplay);
        String str3 = "tt ro=ebai";
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        String str4 = "lr=u b";
        sb.append(", url=");
        sb.append(this.url);
        sb.append("}");
        return sb.toString();
    }
}
