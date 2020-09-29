package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.ArrayList;
import java.util.List;

public class StreamingConfiguration extends CppJavaBinder {
    ArrayList<String> a;
    private long b;

    public static class Builder {
        ArrayList<String> a = new ArrayList<>();
        boolean b = false;

        public StreamingConfiguration build() {
            return new StreamingConfiguration(this);
        }

        public Builder restrictedPublishersList(List<String> list) {
            this.a.clear();
            this.a.addAll(list);
            return this;
        }

        public Builder restrictedPublishersList(String... strArr) {
            ArrayList arrayList = new ArrayList();
            for (String add : strArr) {
                arrayList.add(add);
            }
            restrictedPublishersList((List<String>) arrayList);
            return this;
        }

        public Builder setSystemClockJumpDetection(boolean z) {
            this.b = z;
            return this;
        }
    }

    private StreamingConfiguration(Builder builder) {
        this.b = 0;
        try {
            this.b = newCppInstanceNative(builder.a, builder.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private native void destroyCppInstanceNative(long j);

    private native boolean getSystemClockJumpDetectionNative(long j);

    private native long newCppInstanceNative(List<String> list, boolean z);

    /* access modifiers changed from: 0000 */
    public long a() {
        return this.b;
    }

    public void destroyCppObject() {
        try {
            destroyCppInstanceNative(this.b);
            this.b = 0;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public boolean getSystemClockJumpDetection() {
        try {
            return getSystemClockJumpDetectionNative(this.b);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return false;
        }
    }
}
