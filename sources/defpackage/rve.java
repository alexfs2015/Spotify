package defpackage;

import com.spotify.mobile.android.flags.RolloutFlag;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: rve reason: default package */
public final class rve {
    private final Observable<fpt> a;

    rve(hec hec) {
        this.a = hec.a().j();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(fpt fpt) {
        return Boolean.valueOf(fpt.a(rvd.a) == RolloutFlag.ENABLED);
    }

    public final Observable<Boolean> a() {
        return this.a.c((Function<? super T, ? extends R>) $$Lambda$rve$UjAN8KDoskzlprIfLZ25SZiUmo.INSTANCE);
    }
}
