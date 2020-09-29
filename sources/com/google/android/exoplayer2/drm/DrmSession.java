package com.google.android.exoplayer2.drm;

import defpackage.asw;
import java.util.Map;

public interface DrmSession<T extends asw> {

    public static class DrmSessionException extends Exception {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    int e();

    DrmSessionException f();

    T g();

    Map<String, String> h();
}
