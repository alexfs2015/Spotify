package com.comscore;

import android.content.Context;
import android.os.Looper;
import com.comscore.activation.Activation;
import com.comscore.activation.Activation.ActivationListener;
import com.comscore.android.vce.Vce;
import com.comscore.util.MapUtils;
import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;
import java.util.HashMap;
import java.util.Map;

public class Analytics {
    private static Configuration a = new Configuration();
    private static int b = 0;

    static {
        Setup.setUp();
    }

    private Analytics() {
    }

    private static void a(Throwable th) {
        b++;
        Logger.e("Error using the native library: ", th);
    }

    public static void aggregate(EventInfo eventInfo) {
        try {
            aggregateEventInfoNative(eventInfo.a());
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void aggregate(Map<String, String> map) {
        try {
            aggregateNative(MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void aggregateEventInfoNative(long j);

    private static native void aggregateNative(Map<String, String> map);

    public static void clearInternalData() {
        try {
            clearInternalDataNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void clearInternalDataNative();

    public static void clearOfflineCache() {
        try {
            clearOfflineCacheNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void clearOfflineCacheNative();

    public static void flushOfflineCache() {
        try {
            flushOfflineCacheNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void flushOfflineCacheNative();

    public static void getActivationCategories(String str, String str2, PublisherConfiguration publisherConfiguration, ActivationListener activationListener) {
        Activation.getCategories(str, str2, publisherConfiguration, activationListener);
    }

    public static Configuration getConfiguration() {
        return a;
    }

    protected static int getExceptionCounter() {
        return b;
    }

    public static int getLogLevel() {
        return Logger.getLogLevel();
    }

    private static native int getLogLevelNative();

    public static Vce getSharedVceInstance(Context context) {
        return Vce.getSharedInstance(context);
    }

    public static Map<String, String> getTrackingProperties() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return getTrackingPropertiesNative();
            } catch (UnsatisfiedLinkError e) {
                a(e);
                return new HashMap();
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    private static native Map<String, String> getTrackingPropertiesNative();

    public static String getVceVersion() {
        return Vce.getSdkVersion();
    }

    public static String getVersion() {
        try {
            return getVersionNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
            return null;
        }
    }

    private static native String getVersionNative();

    public static boolean isInitialized() {
        try {
            return isInitializedNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
            return false;
        }
    }

    private static native boolean isInitializedNative();

    public static void notifyEnterForeground() {
        try {
            notifyEnterForegroundNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyEnterForegroundNative();

    public static void notifyExitForeground() {
        try {
            notifyExitForegroundNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyExitForegroundNative();

    public static void notifyHiddenEvent() {
        try {
            notifyHiddenEventNative(null);
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void notifyHiddenEvent(EventInfo eventInfo) {
        try {
            notifyHiddenEventEventInfoNative(eventInfo.a());
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void notifyHiddenEvent(Map<String, String> map) {
        try {
            notifyHiddenEventNative(map);
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyHiddenEventEventInfoNative(long j);

    private static native void notifyHiddenEventNative(Map<String, String> map);

    public static void notifyUserInteraction() {
        try {
            notifyUserInteractionNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyUserInteractionNative();

    public static void notifyUxActive() {
        try {
            notifyUxActiveNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyUxActiveNative();

    public static void notifyUxInactive() {
        try {
            notifyUxInactiveNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyUxInactiveNative();

    public static void notifyViewEvent() {
        try {
            notifyViewEventNative(null);
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void notifyViewEvent(EventInfo eventInfo) {
        try {
            notifyViewEventEventInfoNative(eventInfo.a());
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void notifyViewEvent(Map<String, String> map) {
        try {
            notifyViewEventNative(MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyViewEventEventInfoNative(long j);

    private static native void notifyViewEventNative(Map<String, String> map);

    public static void setLogLevel(int i) {
        Logger.setLogLevel(i);
    }

    private static native void setLogLevelNative(int i);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void start(android.content.Context r2) {
        /*
            com.comscore.util.jni.JniComScoreHelper r0 = com.comscore.util.setup.Setup.getJniComScoreHelper()     // Catch:{ UnsatisfiedLinkError -> 0x0022 }
            if (r0 == 0) goto L_0x001a
            r1 = r0
            com.comscore.android.util.jni.AndroidJniHelper r1 = (com.comscore.android.util.jni.AndroidJniHelper) r1     // Catch:{ UnsatisfiedLinkError -> 0x0018 }
            r1.setContext(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0018 }
            com.comscore.util.jni.JniComScoreHelper r2 = com.comscore.util.setup.Setup.getJniComScoreHelper()     // Catch:{ UnsatisfiedLinkError -> 0x0018 }
            java.lang.String r2 = r2.getAppDataDir()     // Catch:{ UnsatisfiedLinkError -> 0x0018 }
            startNative(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0018 }
            goto L_0x0027
        L_0x0018:
            r2 = move-exception
            goto L_0x0024
        L_0x001a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ UnsatisfiedLinkError -> 0x0018 }
            java.lang.String r1 = "The class JniComScoreHelper has not been initialised."
            r2.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x0018 }
            throw r2     // Catch:{ UnsatisfiedLinkError -> 0x0018 }
        L_0x0022:
            r2 = move-exception
            r0 = 0
        L_0x0024:
            a(r2)
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.start()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.Analytics.start(android.content.Context):void");
    }

    private static native void startNative(String str);

    public static void updateUsageProperties() {
        try {
            updateUsagePropertiesNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void updateUsagePropertiesNative();
}
