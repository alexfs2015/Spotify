package com.spotify.music.libs.performance.tracking;

import com.spotify.base.java.logging.Logger;

public final class ColdStartLegacyHolder {
    private static gnb sInstance;

    private ColdStartLegacyHolder() {
    }

    @Deprecated
    public static void commitMessages(String str) {
        gnb gnb = sInstance;
        if (gnb != null) {
            gnb.a(str, (String) null);
            return;
        }
        Logger.e(new IllegalStateException("Not initialized"), "Unable to process log request", new Object[0]);
    }

    @Deprecated
    public static void logCoreFeatureDuration(String str, long j) {
        gnb gnb = sInstance;
        if (gnb != null) {
            gnb.a(str, j);
            return;
        }
        Logger.e(new IllegalStateException("Not initialized"), "Unable to process log request", new Object[0]);
    }

    @Deprecated
    public static void logStep(String str, int i) {
        if (i == 1) {
            gnb gnb = sInstance;
            if (gnb != null) {
                gnb.c(str);
                return;
            }
            Logger.e(new IllegalStateException("Not initialized"), "Unable to process log request", new Object[0]);
        }
    }

    public static void setInstance(gnb gnb) {
        sInstance = gnb;
    }
}
