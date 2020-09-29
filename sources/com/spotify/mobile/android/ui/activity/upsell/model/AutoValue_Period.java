package com.spotify.mobile.android.ui.activity.upsell.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_Period extends Period {
    private final int duration;
    private final String durationType;
    private final String formattedPrice;

    AutoValue_Period(int i, String str, String str2) {
        this.duration = i;
        if (str != null) {
            this.durationType = str;
            if (str2 != null) {
                this.formattedPrice = str2;
                return;
            }
            throw new NullPointerException("Null formattedPrice");
        }
        throw new NullPointerException("Null durationType");
    }

    @JsonProperty("duration")
    public final int duration() {
        return this.duration;
    }

    @JsonProperty("duration_type")
    public final String durationType() {
        return this.durationType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            if (this.duration == period.duration() && this.durationType.equals(period.durationType()) && this.formattedPrice.equals(period.formattedPrice())) {
                return true;
            }
        }
        return false;
    }

    @JsonProperty("formatted_price")
    public final String formattedPrice() {
        return this.formattedPrice;
    }

    public final int hashCode() {
        return ((((this.duration ^ 1000003) * 1000003) ^ this.durationType.hashCode()) * 1000003) ^ this.formattedPrice.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Period{duration=");
        sb.append(this.duration);
        sb.append(", durationType=");
        sb.append(this.durationType);
        sb.append(", formattedPrice=");
        sb.append(this.formattedPrice);
        String str = "}";
        sb.append("}");
        return sb.toString();
    }
}
