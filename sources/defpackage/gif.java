package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: gif reason: default package */
public final class gif {
    private final ConnectManager a;

    public gif(ConnectManager connectManager) {
        this.a = connectManager;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.spotify.mobile.android.connect.model.GaiaDevice>, for r3v0, types: [java.util.List, java.util.List<com.spotify.mobile.android.connect.model.GaiaDevice>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ io.reactivex.ObservableSource a(java.lang.String r2, java.util.List<com.spotify.mobile.android.connect.model.GaiaDevice> r3) {
        /*
            java.util.Iterator r3 = r3.iterator()
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r3.next()
            com.spotify.mobile.android.connect.model.GaiaDevice r0 = (com.spotify.mobile.android.connect.model.GaiaDevice) r0
            java.lang.String r1 = r0.getPhysicalIdentifier()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0004
            io.reactivex.Observable r2 = io.reactivex.Observable.b(r0)
            return r2
        L_0x001f:
            io.reactivex.Observable r2 = io.reactivex.Observable.c()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gif.a(java.lang.String, java.util.List):io.reactivex.ObservableSource");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(GaiaDevice gaiaDevice) {
        return !gaiaDevice.isActive();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, GaiaDevice gaiaDevice) {
        return gaiaDevice.getIdentifier().equals(str) || gaiaDevice.getPhysicalIdentifier().equals(str);
    }

    public final Observable<GaiaDevice> a(String str) {
        this.a.c(str);
        return this.a.g().a((Predicate<? super T>) new $$Lambda$gif$8JiadGglOzLhb5AtX63rivK3Wk<Object>(str)).c(1);
    }

    public final Observable<GaiaDevice> b(String str) {
        return this.a.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$gif$BBcI3W0zXiCZNq9XihUrv_d_5Vw<Object,Object>(str), false).a((Predicate<? super T>) $$Lambda$gif$WhkjsQYqzVeQ8HKYRnXHD2aGRWI.INSTANCE).c(1);
    }
}
