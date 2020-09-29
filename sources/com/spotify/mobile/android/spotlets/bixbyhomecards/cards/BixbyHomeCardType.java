package com.spotify.mobile.android.spotlets.bixbyhomecards.cards;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import com.spotify.music.R;

public enum BixbyHomeCardType {
    STREAMING(R.integer.streaming_card_id),
    STREAMING_US(R.integer.streaming_card_us_id);
    
    private final int mCardResId;

    static {
        values();
    }

    private BixbyHomeCardType(int i) {
        this.mCardResId = i;
    }

    public final inq a(Context context) {
        return new inq(b(context));
    }

    public final int b(Context context) {
        try {
            return context.getResources().getInteger(this.mCardResId);
        } catch (NotFoundException unused) {
            return -1;
        }
    }
}
