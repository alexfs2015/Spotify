package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_ConcertTicketing reason: invalid class name */
abstract class C$AutoValue_ConcertTicketing extends ConcertTicketing {
    private final String maxPrice;
    private final String minPrice;

    C$AutoValue_ConcertTicketing(String str, String str2) {
        this.minPrice = str;
        this.maxPrice = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1.equals(r6.getMinPrice()) != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 4
            r0 = 1
            r4 = 0
            if (r6 != r5) goto L_0x0007
            r4 = 3
            return r0
        L_0x0007:
            r4 = 7
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.eventshub.model.ConcertTicketing
            r4 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.spotify.mobile.android.spotlets.eventshub.model.ConcertTicketing r6 = (com.spotify.mobile.android.spotlets.eventshub.model.ConcertTicketing) r6
            r4 = 4
            java.lang.String r1 = r5.minPrice
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r6.getMinPrice()
            r4 = 2
            if (r1 != 0) goto L_0x0046
            r4 = 4
            goto L_0x002b
        L_0x001e:
            r4 = 2
            java.lang.String r3 = r6.getMinPrice()
            r4 = 3
            boolean r1 = r1.equals(r3)
            r4 = 0
            if (r1 == 0) goto L_0x0046
        L_0x002b:
            r4 = 6
            java.lang.String r1 = r5.maxPrice
            if (r1 != 0) goto L_0x0039
            r4 = 4
            java.lang.String r6 = r6.getMaxPrice()
            r4 = 6
            if (r6 != 0) goto L_0x0046
            goto L_0x0045
        L_0x0039:
            java.lang.String r6 = r6.getMaxPrice()
            r4 = 4
            boolean r6 = r1.equals(r6)
            r4 = 1
            if (r6 == 0) goto L_0x0046
        L_0x0045:
            return r0
        L_0x0046:
            r4 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.C$AutoValue_ConcertTicketing.equals(java.lang.Object):boolean");
    }

    @JsonProperty("maxPrice")
    public String getMaxPrice() {
        return this.maxPrice;
    }

    @JsonProperty("minPrice")
    public String getMinPrice() {
        return this.minPrice;
    }

    public int hashCode() {
        String str = this.minPrice;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.maxPrice;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConcertTicketing{minPrice=");
        sb.append(this.minPrice);
        sb.append(", maxPrice=");
        sb.append(this.maxPrice);
        String str = "}";
        sb.append("}");
        return sb.toString();
    }
}
