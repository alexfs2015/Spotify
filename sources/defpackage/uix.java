package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: uix reason: default package */
public final class uix {
    public static xii<Boolean> a(hgz hgz) {
        return hgz.a(MoatAdEvent.EVENT_TYPE).d((xiy<? super T, ? extends xii<? extends R>>) $$Lambda$uix$vxqKTl7MtbctoLXiAjhHsKKDbn8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(String str) {
        return ScalarSynchronousObservable.d(Boolean.valueOf(str != null && str.startsWith("opt-in-trial")));
    }

    public static boolean a(fqn fqn) {
        return fqn != null && !((Boolean) fqn.a(uiw.a)).booleanValue();
    }

    public static xii<Boolean> b(hgz hgz) {
        return hgz.a("payment-state").d((xiy<? super T, ? extends xii<? extends R>>) $$Lambda$uix$30JCpICqaw_0ay1DuKWB2d2iUhI.INSTANCE);
    }

    public static boolean b(fqn fqn) {
        return fqn != null && ((Boolean) fqn.a(uiw.b)).booleanValue();
    }
}
