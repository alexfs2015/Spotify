package com.comscore.streaming;

import com.comscore.util.MapUtils;
import com.comscore.util.cpp.CppJavaBinder;
import com.comscore.util.log.Logger;
import java.util.Map;
import java.util.WeakHashMap;

public class PlaybackSession extends CppJavaBinder {
    public static final String[] STANDARD_METADATA_LABELS;
    private static WeakHashMap<Long, Asset> b = new WeakHashMap<>();
    private static Asset c = new Asset(0);
    private static Object d = new Object();
    private long a = 0;

    static {
        String[] strArr;
        try {
            strArr = getStandardMetadataLabelsNative();
        } catch (UnsatisfiedLinkError e) {
            String[] strArr2 = new String[0];
            Logger.e("Error using the native library: ", (Throwable) e);
            strArr = strArr2;
        }
        STANDARD_METADATA_LABELS = strArr;
    }

    protected PlaybackSession() {
    }

    PlaybackSession(long j) {
        this.a = j;
    }

    private native boolean containsLabelNative(long j, String str);

    private native void destroyCppInstanceNative(long j);

    private native long getAssetRefNative(long j, boolean z);

    private native String getLabelNative(long j, String str);

    private native Map<String, String> getLabelsNative(long j);

    private native String getPlaybackSessionIdNative(long j);

    private static native String[] getStandardMetadataLabelsNative();

    private native void removeLabelNative(long j, String str);

    private native void setAssetNative(long j, Map<String, String> map, boolean z);

    private native void setLabelNative(long j, String str, String str2);

    private native void setLabelsNative(long j, Map<String, String> map);

    public boolean containsLabel(String str) {
        try {
            return containsLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public void destroyCppObject() {
        destroyCppInstanceNative(this.a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof PlaybackSession) && ((PlaybackSession) obj).a == this.a;
    }

    public Asset getAsset() {
        return getAsset(true);
    }

    public Asset getAsset(boolean z) {
        try {
            long assetRefNative = getAssetRefNative(this.a, z);
            synchronized (d) {
                if (b.containsKey(Long.valueOf(assetRefNative))) {
                    Asset asset = (Asset) b.get(Long.valueOf(assetRefNative));
                    return asset;
                }
                Asset asset2 = new Asset(assetRefNative);
                b.put(Long.valueOf(assetRefNative), asset2);
                return asset2;
            }
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return c;
        }
    }

    public String getLabel(String str) {
        try {
            return getLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public Map<String, String> getLabels() {
        try {
            return getLabelsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public String getPlaybackSessionId() {
        try {
            return getPlaybackSessionIdNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public void removeLabel(String str) {
        try {
            removeLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setAsset(Map<String, String> map) {
        setAsset(map, false);
    }

    public void setAsset(Map<String, String> map, boolean z) {
        try {
            setAssetNative(this.a, MapUtils.mapOfStrings(map), z);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabel(String str, String str2) {
        if (str2 == null) {
            removeLabel(str);
            return;
        }
        try {
            setLabelNative(this.a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabels(Map<String, String> map) {
        try {
            setLabelsNative(this.a, MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
