package com.spotify.mobile.android.driving.flags;

import rx.internal.util.ScalarSynchronousObservable;

public final class DrivingFlagsUtils {
    private final hgy a;

    public enum JumpstartVariant {
        CONTROL,
        RESUME_CONTEXT_OR_RECENTLY_PLAYED
    }

    public DrivingFlagsUtils(hgy hgy) {
        this.a = hgy;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(Boolean bool) {
        return bool.booleanValue() ? ScalarSynchronousObservable.d(JumpstartVariant.RESUME_CONTEXT_OR_RECENTLY_PLAYED) : ScalarSynchronousObservable.d(JumpstartVariant.CONTROL);
    }

    public final xii<JumpstartVariant> a() {
        return wit.a((xfk<T>) this.a.a(gvv.a)).d((xiy<? super T, ? extends xii<? extends R>>) $$Lambda$DrivingFlagsUtils$fk8AXbHIne00ENlDpbrPuORjnNU.INSTANCE);
    }
}
