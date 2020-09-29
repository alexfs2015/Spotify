package com.comscore.streaming;

import com.comscore.util.MapUtils;
import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

public class Asset extends CppJavaBinder {
    private long a = 0;

    protected Asset() {
    }

    Asset(long j) {
        this.a = j;
    }

    private native boolean containsLabelNative(long j, String str);

    private native void destroyCppInstanceNative(long j);

    private native int getClipNumberNative(long j);

    private native String getLabelNative(long j, String str);

    private native Map<String, String> getLabelsNative(long j);

    private native boolean isAutoCalculatePositionsEnabledNative(long j);

    private native void removeLabelNative(long j, String str);

    private native void setAutoCalculatePositionsNative(long j, boolean z);

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
        return (obj instanceof Asset) && ((Asset) obj).a == this.a;
    }

    public int getClipNumber() {
        try {
            return getClipNumberNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return -1;
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

    public boolean isAutoCalculatePositionsEnabled() {
        try {
            return isAutoCalculatePositionsEnabledNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return true;
        }
    }

    public void removeLabel(String str) {
        try {
            removeLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setAutoCalculatePositions(boolean z) {
        try {
            setAutoCalculatePositionsNative(this.a, z);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabel(String str, String str2) {
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
