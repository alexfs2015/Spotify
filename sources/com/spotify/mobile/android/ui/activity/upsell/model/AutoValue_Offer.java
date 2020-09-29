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

    @JsonProperty("is_trial")
    public final boolean isTrial() {
        return this.isTrial;
    }

    @JsonProperty("initial_period")
    public final Period initialPeriod() {
        return this.initialPeriod;
    }

    @JsonProperty("recurring_period")
    public final Period recurringPeriod() {
        return this.recurringPeriod;
    }

    @JsonProperty("ad_targeting_key")
    public final String adTargetingKey() {
        return this.adTargetingKey;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Offer{isTrial=");
        sb.append(this.isTrial);
        sb.append(", initialPeriod=");
        sb.append(this.initialPeriod);
        sb.append(", recurringPeriod=");
        sb.append(this.recurringPeriod);
        sb.append(", adTargetingKey=");
        sb.append(this.adTargetingKey);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Offer) {
            Offer offer = (Offer) obj;
            if (this.isTrial == offer.isTrial() && this.initialPeriod.equals(offer.initialPeriod())) {
                Period period = this.recurringPeriod;
                if (period != null ? period.equals(offer.recurringPeriod()) : offer.recurringPeriod() == null) {
                    String str = this.adTargetingKey;
                    return str != null ? str.equals(offer.adTargetingKey()) : offer.adTargetingKey() == null;
                }
            }
        }
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
}
