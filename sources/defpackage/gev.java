package defpackage;

import com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/* renamed from: gev reason: default package */
public final class gev extends c {
    private final gew a;
    private final geq b;
    private final vwc c;

    public gev(gew gew, geq geq, vwc vwc) {
        this.a = gew;
        this.b = geq;
        this.c = vwc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        return bool.booleanValue() ? this.c.a().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$gev$LNXbfkzEFBBtp2nxvJF1ue1SE4c<Object,Object>(this), false).c((Function<? super T, ? extends R>) $$Lambda$gev$bjK4dIF3br6TsRJ6RNlDyHs0yks.INSTANCE) : Observable.b(EffortlessLoginPrerequisitesResult.createFailure());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(vwe vwe) {
        return this.b.b(vwe.a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((android.accounts.AccountManager.get(r0.a).getAccountsByType("com.osp.app.signin").length > 0) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.reactivex.Observable<com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult> W_() {
        /*
            r4 = this;
            gew r0 = r4.a
            boolean r1 = r0.a()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            android.content.Context r0 = r0.a
            android.accounts.AccountManager r0 = android.accounts.AccountManager.get(r0)
            java.lang.String r1 = "com.osp.app.signin"
            android.accounts.Account[] r0 = r0.getAccountsByType(r1)
            int r0 = r0.length
            if (r0 <= 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            io.reactivex.Observable r0 = io.reactivex.Observable.b(r0)
            -$$Lambda$gev$0gn2YU5C_o1Dgey2GWi0RI0gzto r1 = new -$$Lambda$gev$0gn2YU5C_o1Dgey2GWi0RI0gzto
            r1.<init>(r4)
            io.reactivex.Observable r0 = r0.a(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gev.W_():io.reactivex.Observable");
    }
}
