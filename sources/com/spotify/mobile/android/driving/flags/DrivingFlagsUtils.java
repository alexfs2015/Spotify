package com.spotify.mobile.android.driving.flags;

import rx.internal.util.ScalarSynchronousObservable;

public final class DrivingFlagsUtils {
    private final hec a;

    public enum JumpstartVariant {
        CONTROL,
        RESUME_CONTEXT_OR_RECENTLY_PLAYED
    }

    public DrivingFlagsUtils(hec hec) {
        this.a = hec;
    }

    public final wud<JumpstartVariant> a() {
        return vun.a((wrf<T>) this.a.a(gtv.a)).d((wut<? super T, ? extends wud<? extends R>>) $$Lambda$DrivingFlagsUtils$fRXlwFWsfYN8VOlWnYD5IJSQ7Zw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(Boolean bool) {
        if (bool.booleanValue()) {
            return ScalarSynchronousObservable.d(JumpstartVariant.RESUME_CONTEXT_OR_RECENTLY_PLAYED);
        }
        return ScalarSynchronousObservable.d(JumpstartVariant.CONTROL);
    }
}
