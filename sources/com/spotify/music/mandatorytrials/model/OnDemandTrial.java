package com.spotify.music.mandatorytrials.model;

public enum OnDemandTrial {
    ACTIVE("active"),
    EXPIRED("expired"),
    INELIGIBLE("ineligible"),
    INACTIVE(null);
    
    public final String mValue;

    private OnDemandTrial(String str) {
        this.mValue = str;
    }
}
