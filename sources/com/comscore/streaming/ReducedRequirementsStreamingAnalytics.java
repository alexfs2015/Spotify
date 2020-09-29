package com.comscore.streaming;

import com.comscore.util.MapUtils;
import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

public class ReducedRequirementsStreamingAnalytics extends CppJavaBinder {
    private long a = 0;

    public ReducedRequirementsStreamingAnalytics() {
        try {
            this.a = newCppInstanceNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private native void destroyCppInstanceNative(long j);

    private native long newCppInstanceNative();

    private native void playAudioAdvertisementNative(long j, Map<String, String> map, int i);

    private native void playAudioContentPartNative(long j, Map<String, String> map, int i);

    private native void playVideoAdvertisementNative(long j, Map<String, String> map, int i);

    private native void playVideoContentPartNative(long j, Map<String, String> map, int i);

    private native void stopNative(long j);

    public void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void playAudioAdvertisement(Map<String, String> map, int i) {
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= AdType.ALLOWED_VALUES.length) {
                z = true;
                break;
            } else if (i == AdType.ALLOWED_VALUES[i2]) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            try {
                playAudioAdvertisementNative(this.a, MapUtils.mapOfStrings(map), i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void playAudioContentPart(Map<String, String> map, int i) {
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= ContentType.ALLOWED_VALUES.length) {
                z = true;
                break;
            } else if (i == ContentType.ALLOWED_VALUES[i2]) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            try {
                playAudioContentPartNative(this.a, MapUtils.mapOfStrings(map), i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void playVideoAdvertisement(Map<String, String> map, int i) {
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= AdType.ALLOWED_VALUES.length) {
                z = true;
                break;
            } else if (i == AdType.ALLOWED_VALUES[i2]) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            try {
                playVideoAdvertisementNative(this.a, MapUtils.mapOfStrings(map), i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void playVideoContentPart(Map<String, String> map, int i) {
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= ContentType.ALLOWED_VALUES.length) {
                z = true;
                break;
            } else if (i == ContentType.ALLOWED_VALUES[i2]) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            try {
                playVideoContentPartNative(this.a, MapUtils.mapOfStrings(map), i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void stop() {
        try {
            stopNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
