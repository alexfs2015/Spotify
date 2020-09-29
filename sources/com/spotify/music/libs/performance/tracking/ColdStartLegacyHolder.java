package com.spotify.music.libs.performance.tracking;

import com.spotify.base.java.logging.Logger;

public final class ColdStartLegacyHolder {
    private static glm sInstance;

    private ColdStartLegacyHolder() {
    }

    public static void setInstance(glm glm) {
        sInstance = glm;
    }

    @Deprecated
    public static void logStep(String str, int i) {
        if (i == 1) {
            glm glm = sInstance;
            if (glm != null) {
                glm.c(str);
                return;
            }
            Logger.e(new IllegalStateException("Not initialized"), "Unable to process log request", new Object[0]);
        }
    }

    @Deprecated
    public static void logCoreFeatureDuration(String str, long j) {
        glm glm = sInstance;
        if (glm != null) {
            glm.a(str, j);
            return;
        }
        Logger.e(new IllegalStateException("Not initialized"), "Unable to process log request", new Object[0]);
    }

    @Deprecated
    public static void commitMessages(String str) {
        glm glm = sInstance;
        if (glm != null) {
            glm.a(str, (String) null);
            return;
        }
        Logger.e(new IllegalStateException("Not initialized"), "Unable to process log request", new Object[0]);
    }
}
