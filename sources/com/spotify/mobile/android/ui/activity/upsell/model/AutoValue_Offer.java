package com.spotify.mobile.android.ui.activity.upsell.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_Offer extends Offer {
    private final String adTargetingKey;
    private final Period initialPeriod;
    private final boolean isTrial;
    private final Period recurringPeriod;

    AutoValue_Offer(boolean z, Period period, Period period2, String str) {
        this.isTrial = z;
        if (period != null) {
            this.initialPeriod = period;
            this.recurringPeriod = period2;
            this.adTargetingKey = str;
            return;
        }
        throw new NullPointerException("Null initialPeriod");
    }

    @JsonProperty("ad_targeting_key")
    public final String adTargetingKey() {
        return this.adTargetingKey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r1.equals(r6.recurringPeriod()) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            r4 = 0
            if (r6 != r5) goto L_0x0005
            return r0
        L_0x0005:
            r4 = 7
            boolean r1 = r6 instanceof com.spotify.mobile.android.ui.activity.upsell.model.Offer
            r4 = 0
            r2 = 0
            r4 = 7
            if (r1 == 0) goto L_0x0061
            r4 = 2
            com.spotify.mobile.android.ui.activity.upsell.model.Offer r6 = (com.spotify.mobile.android.ui.activity.upsell.model.Offer) r6
            r4 = 2
            boolean r1 = r5.isTrial
            boolean r3 = r6.isTrial()
            r4 = 1
            if (r1 != r3) goto L_0x0061
            r4 = 2
            com.spotify.mobile.android.ui.activity.upsell.model.Period r1 = r5.initialPeriod
            com.spotify.mobile.android.ui.activity.upsell.model.Period r3 = r6.initialPeriod()
            r4 = 1
            boolean r1 = r1.equals(r3)
            r4 = 3
            if (r1 == 0) goto L_0x0061
            com.spotify.mobile.android.ui.activity.upsell.model.Period r1 = r5.recurringPeriod
            if (r1 != 0) goto L_0x0037
            r4 = 2
            com.spotify.mobile.android.ui.activity.upsell.model.Period r1 = r6.recurringPeriod()
            r4 = 6
            if (r1 != 0) goto L_0x0061
            r4 = 1
            goto L_0x0044
        L_0x0037:
            r4 = 4
            com.spotify.mobile.android.ui.activity.upsell.model.Period r3 = r6.recurringPeriod()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 3
            if (r1 == 0) goto L_0x0061
        L_0x0044:
            java.lang.String r1 = r5.adTargetingKey
            r4 = 5
            if (r1 != 0) goto L_0x0053
            r4 = 0
            java.lang.String r6 = r6.adTargetingKey()
            r4 = 5
            if (r6 != 0) goto L_0x0061
            r4 = 5
            goto L_0x0060
        L_0x0053:
            r4 = 0
            java.lang.String r6 = r6.adTargetingKey()
            r4 = 5
            boolean r6 = r1.equals(r6)
            r4 = 1
            if (r6 == 0) goto L_0x0061
        L_0x0060:
            return r0
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.activity.upsell.model.AutoValue_Offer.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = ((((this.isTrial ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.initialPeriod.hashCode()) * 1000003;
        Period period = this.recurringPeriod;
        int i = 0;
        int hashCode2 = (hashCode ^ (period == null ? 0 : period.hashCode())) * 1000003;
        String str = this.adTargetingKey;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 ^ i;
    }

    @JsonProperty("initial_period")
    public final Period initialPeriod() {
        return this.initialPeriod;
    }

    @JsonProperty("is_trial")
    public final boolean isTrial() {
        return this.isTrial;
    }

    @JsonProperty("recurring_period")
    public final Period recurringPeriod() {
        return this.recurringPeriod;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Offer{isTrial=");
        sb.append(this.isTrial);
        sb.append(", initialPeriod=");
        sb.append(this.initialPeriod);
        String str = "Prse ieoi=rudgcrr,";
        sb.append(", recurringPeriod=");
        sb.append(this.recurringPeriod);
        String str2 = "rgam, Tteindy=gae";
        sb.append(", adTargetingKey=");
        sb.append(this.adTargetingKey);
        sb.append("}");
        return sb.toString();
    }
}
