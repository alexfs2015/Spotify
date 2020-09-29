package com.spotify.mobile.android.spotlets.eventshub.model;

import com.spotify.music.R;

public enum EventSection {
    RECOMMENDATIONS(0, R.string.events_hub_section_title_recommended),
    POPULAR(1, R.string.events_hub_section_title_popular),
    ALL(2, R.string.events_hub_section_title_all);
    
    public static final EventSection[] d = null;
    public final int mSectionId;
    public final int mTitleStringId;

    static {
        d = values();
    }

    private EventSection(int i, int i2) {
        this.mSectionId = i;
        this.mTitleStringId = i2;
    }
}
