package defpackage;

import com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/* renamed from: gdk reason: default package */
public final class gdk extends c {
    private final gdl a;
    private final gdf b;
    private final vix c;

    public gdk(gdl gdl, gdf gdf, vix vix) {
        this.a = gdl;
        this.b = gdf;
        this.c = vix;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((android.accounts.AccountManager.get(r0.a).getAccountsByType("com.osp.app.signin").length > 0) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.reactivex.Observable<com.spotify.effortlesslogin.prerequisites.EffortlessLoginPrerequisitesResult> W_() {
        /*
            r4 = this;
            gdl r0 = r4.a
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
            -$$Lambda$gdk$RuKgE13rFO3mXu8ZWVj_XgwYfAQ r1 = new -$$Lambda$gdk$RuKgE13rFO3mXu8ZWVj_XgwYfAQ
            r1.<init>(r4)
            io.reactivex.Observable r0 = r0.a(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gdk.W_():io.reactivex.Observable");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Boolean bool) {
        if (bool.booleanValue()) {
            return this.c.a().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$gdk$VKHIjU9FxRPnLTH2m2FkdcvnunU<Object,Object>(this), false).c((Function<? super T, ? extends R>) $$Lambda$gdk$OtJYmUujXFkpI7uZayimE2s_lY.INSTANCE);
        }
        return Observable.b(EffortlessLoginPrerequisitesResult.createFailure());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(viz viz) {
        return this.b.b(viz.a());
    }
}
