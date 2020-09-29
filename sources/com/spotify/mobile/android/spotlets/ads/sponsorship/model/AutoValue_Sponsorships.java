package com.spotify.mobile.android.spotlets.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

final class AutoValue_Sponsorships extends Sponsorships {
    private final ArrayList<Sponsorship> sponsorships;

    AutoValue_Sponsorships(ArrayList<Sponsorship> arrayList) {
        this.sponsorships = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sponsorships)) {
            return false;
        }
        Sponsorships sponsorships2 = (Sponsorships) obj;
        ArrayList<Sponsorship> arrayList = this.sponsorships;
        ArrayList sponsorships3 = sponsorships2.sponsorships();
        return arrayList == null ? sponsorships3 == null : arrayList.equals(sponsorships3);
    }

    public final int hashCode() {
        ArrayList<Sponsorship> arrayList = this.sponsorships;
        return (arrayList == null ? 0 : arrayList.hashCode()) ^ 1000003;
    }

    @JsonProperty("sponsorships")
    public final ArrayList<Sponsorship> sponsorships() {
        return this.sponsorships;
    }

    public final String toString() {
        String str = "pss{npssph=soosssoiroShnip";
        StringBuilder sb = new StringBuilder("Sponsorships{sponsorships=");
        sb.append(this.sponsorships);
        sb.append("}");
        return sb.toString();
    }
}
