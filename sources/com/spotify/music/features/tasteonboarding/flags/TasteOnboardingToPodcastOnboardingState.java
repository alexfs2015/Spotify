package com.spotify.music.features.tasteonboarding.flags;

public enum TasteOnboardingToPodcastOnboardingState {
    CONTROL("control"),
    STHLM_BLACK("sthlm_black"),
    TOB_TO_POB("tob_to_pob"),
    INACTIVE(null);
    
    private final String mValue;

    private TasteOnboardingToPodcastOnboardingState(String str) {
        this.mValue = str;
    }
}
