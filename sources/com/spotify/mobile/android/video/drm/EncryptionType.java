package com.spotify.mobile.android.video.drm;

import java.util.UUID;

public enum EncryptionType {
    WIDEVINE,
    UNKNOWN;

    public static EncryptionType a(UUID uuid) {
        if (DrmUtil.a.equals(uuid)) {
            return WIDEVINE;
        }
        return UNKNOWN;
    }
}
