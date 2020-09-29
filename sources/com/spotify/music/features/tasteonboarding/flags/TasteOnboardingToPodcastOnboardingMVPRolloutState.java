package com.spotify.music.features.tasteonboarding.flags;

public enum TasteOnboardingToPodcastOnboardingMVPRolloutState {
    CONTROL("control"),
    COLD_START("cold_start"),
    TOB_TO_OLD_POB("tob_to_old_pob"),
    TOB_TO_NEW_POB("tob_to_new_pob"),
    BANNER_TO_NEW_POB("banner_to_new_pob"),
    CARD_TO_NEW_POB("card_to_new_pob"),
    TOB_TO_NEW_POB_COLDSTART_VARIATION("tob_to_new_pob_coldstart_variation"),
    INACTIVE(null);
    
    private final String mValue;

    private TasteOnboardingToPodcastOnboardingMVPRolloutState(String str) {
        this.mValue = str;
    }
}
