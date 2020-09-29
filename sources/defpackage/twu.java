package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: twu reason: default package */
public final class twu {
    public static boolean a(fpt fpt) {
        return fpt != null && !((Boolean) fpt.a(twt.a)).booleanValue();
    }

    public static boolean b(fpt fpt) {
        return fpt != null && ((Boolean) fpt.a(twt.b)).booleanValue();
    }

    public static wud<Boolean> a(hed hed) {
        return hed.a(MoatAdEvent.EVENT_TYPE).d((wut<? super T, ? extends wud<? extends R>>) $$Lambda$twu$0JUqVePuiGW9VzYJBkSEUVnomY.INSTANCE);
    }

    public static wud<Boolean> b(hed hed) {
        return hed.a("payment-state").d((wut<? super T, ? extends wud<? extends R>>) $$Lambda$twu$HeYTiLKCVGjdOCMBAxJquFBlIU.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wud a(String str) {
        return ScalarSynchronousObservable.d(Boolean.valueOf(str != null && str.startsWith("opt-in-trial")));
    }
}
