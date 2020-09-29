package com.spotify.music.ads.voice.domain;

import com.spotify.music.R;

public enum CueType {
    LISTEN(R.raw.audio_interaction_listening),
    PLAY(R.raw.audio_confirm_playing_now),
    NEXT(R.raw.audio_no_confirm_on_to_next),
    ERROR(R.raw.audio_error_on_to_next);
    
    public final int mCueRes;

    private CueType(int i) {
        this.mCueRes = i;
    }
}
