package com.spotify.mobile.android.spotlets.ads.sponsorship.model;

import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Sponsorships implements JacksonModel {
    public static final int DEFAULT_TTL_SECONDS = 1800;
    private long mTTLSeconds = 1800;

    @JsonProperty("sponsorships")
    public abstract ArrayList<Sponsorship> sponsorships();

    @JsonCreator
    public static Sponsorships create(@JsonProperty("sponsorships") ArrayList<Sponsorship> arrayList) {
        return new AutoValue_Sponsorships(arrayList);
    }

    public void setTTLSeconds(long j) {
        this.mTTLSeconds = j;
    }

    public long getTTLSeconds() {
        return this.mTTLSeconds;
    }

    public Sponsorship getSponsorship(String str) {
        ArrayList sponsorships = sponsorships();
        if (sponsorships == null) {
            return null;
        }
        Iterator it = sponsorships.iterator();
        while (it.hasNext()) {
            Sponsorship sponsorship = (Sponsorship) it.next();
            if (sponsorship.isEqual(str)) {
                return sponsorship;
            }
        }
        return null;
    }

    public void preserveDisplayState(Sponsorships sponsorships) {
        if (sponsorships != null) {
            ArrayList sponsorships2 = sponsorships.sponsorships();
            ArrayList sponsorships3 = sponsorships();
            if (!(sponsorships2 == null || sponsorships3 == null)) {
                Map createSponsorshipMap = createSponsorshipMap(sponsorships2);
                for (Entry entry : createSponsorshipMap(sponsorships3).entrySet()) {
                    String str = (String) entry.getKey();
                    Sponsorship sponsorship = (Sponsorship) entry.getValue();
                    Sponsorship sponsorship2 = (Sponsorship) createSponsorshipMap.get(str);
                    if (sponsorship2 != null && sponsorship2.wasDisplayedDuringSession()) {
                        sponsorship.displayedDuringSession();
                    }
                }
            }
        }
    }

    private Map<String, Sponsorship> createSponsorshipMap(List<Sponsorship> list) {
        HashMap hashMap = new HashMap();
        for (Sponsorship sponsorship : list) {
            hashMap.put(sponsorship.uri(), sponsorship);
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static Creator<? extends Sponsorship> getCreator() {
        return AutoValue_Sponsorship.CREATOR;
    }
}
