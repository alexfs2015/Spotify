package com.spotify.music.features.homemix.models;

import android.content.Context;
import com.spotify.music.R;

public enum HomeMixPlanType {
    FAMILY("FAMILY", R.string.home_mix_name_family_mix, R.string.home_mix_name_family, R.string.home_mix_family_mix_learn_more_url),
    DUO("DUO", R.string.home_mix_name_duo_mix, R.string.home_mix_name_duo, R.string.home_mix_duo_mix_learn_more_url),
    OTHER("", R.string.home_mix_name_family_mix, R.string.home_mix_name_family, R.string.home_mix_family_mix_learn_more_url);
    
    private final String mKey;
    private final int mMixNameResId;
    public final int mNameResId;
    public final int mUrlResId;

    private HomeMixPlanType(String str, int i, int i2, int i3) {
        this.mKey = str;
        this.mMixNameResId = i;
        this.mNameResId = i2;
        this.mUrlResId = i3;
    }

    public final String a(Context context) {
        return context.getString(this.mMixNameResId);
    }

    public static HomeMixPlanType a(String str) {
        HomeMixPlanType[] values;
        if (str != null) {
            for (HomeMixPlanType homeMixPlanType : values()) {
                if (homeMixPlanType.mKey.equals(str)) {
                    return homeMixPlanType;
                }
            }
        }
        return OTHER;
    }
}
