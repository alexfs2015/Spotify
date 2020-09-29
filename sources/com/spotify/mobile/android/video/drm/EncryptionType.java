package com.spotify.mobile.android.video.drm;

import com.comscore.android.id.IdHelperAndroid;
import java.util.UUID;

public enum EncryptionType {
    WIDEVINE("widevine"),
    NONE(IdHelperAndroid.NO_ID_AVAILABLE),
    UNKNOWN("unknown");
    
    private final String mLiteral;

    private EncryptionType(String str) {
        this.mLiteral = str;
    }

    public static EncryptionType a(UUID uuid) {
        return DrmUtil.a.equals(uuid) ? WIDEVINE : UNKNOWN;
    }

    public final String toString() {
        return this.mLiteral;
    }
}
