package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: pno reason: default package */
public final class pno {
    public static kmv<pnk> a(ssh ssh) {
        return koj.a(b(ssh));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pnk a(Boolean bool) {
        return bool.booleanValue() ? pnk.a(SessionState.PRODUCT_TYPE_FREE) : pnk.a("premium");
    }

    private static Observable<pnk> b(ssh ssh) {
        return ssh.a().c((Function<? super T, ? extends R>) $$Lambda$pno$YzbXdtqtCedLPEjWRcuq_sdGgk.INSTANCE);
    }
}
