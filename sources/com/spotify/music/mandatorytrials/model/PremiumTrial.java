package com.spotify.music.mandatorytrials.model;

public enum PremiumTrial {
    ACTIVE("opt-in-trial"),
    EXPIRED("expired-opt-in-trial"),
    INACTIVE(null);
    
    public final String mValue;

    private PremiumTrial(String str) {
        this.mValue = str;
    }
}
