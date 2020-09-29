package com.comscore;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

public class EventInfo extends CppJavaBinder {
    private long a = 0;

    public EventInfo() {
        try {
            this.a = newCppInstanceNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private static native boolean containsLabelNative(long j, String str);

    private static native boolean containsPublisherLabelNative(long j, String str, String str2);

    private static native boolean containsPublisherNative(long j, String str);

    private static native void destroyCppInstanceNative(long j);

    private static native String getLabelNative(long j, String str);

    private static native Map<String, String> getLabelsNative(long j);

    private static native String getPublisherLabelNative(long j, String str, String str2);

    private static native Map<String, String> getPublisherLabelsNative(long j, String str);

    private static native long newCppInstanceNative();

    private static native void removeAllLabelsNative(long j);

    private static native void removeAllPublisherLabelsNative(long j, String str);

    private static native void removeLabelNative(long j, String str);

    private static native void removePublisherLabelNative(long j, String str, String str2);

    private static native void removePublisherNative(long j, String str);

    private static native void setLabelNative(long j, String str, String str2);

    private static native void setLabelsNative(long j, Map<String, String> map);

    private static native void setPublisherLabelNative(long j, String str, String str2, String str3);

    private static native void setPublisherLabelsNative(long j, String str, Map<String, String> map);

    private static native void setPublisherNative(long j, String str);

    /* access modifiers changed from: 0000 */
    public long a() {
        return this.a;
    }

    public boolean containsLabel(String str) {
        try {
            return containsLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean containsPublisher(String str) {
        try {
            return containsPublisherNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public boolean containsPublisherLabel(String str, String str2) {
        try {
            return containsPublisherLabelNative(this.a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }

    public void destroyCppObject() {
        destroyCppInstanceNative(this.a);
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

    public String getPublisherLabel(String str, String str2) {
        try {
            return getPublisherLabelNative(this.a, str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public Map<String, String> getPublisherLabels(String str) {
        try {
            return getPublisherLabelsNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public void removeAllLabels() {
        try {
            removeAllLabelsNative(this.a);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeAllPublisherLabels(String str) {
        try {
            removeAllPublisherLabelsNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeLabel(String str) {
        try {
            removeLabelNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removePublisher(String str) {
        try {
            removePublisherNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removePublisherLabel(String str, String str2) {
        try {
            removePublisherLabelNative(this.a, str, str2);
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
            setLabelsNative(this.a, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPublisher(String str) {
        try {
            setPublisherNative(this.a, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPublisherLabel(String str, String str2, String str3) {
        try {
            setPublisherLabelNative(this.a, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPublisherLabels(String str, Map<String, String> map) {
        try {
            setPublisherLabelsNative(this.a, str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
