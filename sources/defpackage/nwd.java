package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.Set;

/* renamed from: nwd reason: default package */
public final class nwd extends c {
    public kmn a;
    public kdj b;
    public nwc c;
    public fpt d;
    public final Set<kmo> e;
    private final nwa f;
    private final kdi g;
    private final nwf h;
    private final a i;
    private final nvt j;
    private final hec k;
    private final CompositeDisposable l = new CompositeDisposable();
    private final rvv m;

    public final void c(Bundle bundle) {
    }

    public nwd(nwa nwa, kdi kdi, nwf nwf, Activity activity, nvt nvt, hec hec, Set<kmo> set, rvv rvv) {
        this.f = nwa;
        this.g = kdi;
        this.h = nwf;
        this.i = (a) activity;
        this.e = set;
        this.i.a(this);
        this.k = hec;
        this.j = nvt;
        this.m = rvv;
    }

    public final void c() {
        for (kmo a2 : this.e) {
            a2.a(d());
        }
        this.g.a(g());
        if (this.l.d() > 0) {
            Assertion.c("Lifecycle mismatch detected: onStart called without matching onStop");
            this.l.c();
        }
        this.l.a(this.k.a().j().a((Consumer<? super T>) new $$Lambda$nwd$jH0J7cVUKcYeb9y_0LqbYsXKe14<Object>(this), (Consumer<? super Throwable>) $$Lambda$nwd$Abshq2QVBvybagtCGWeURACZpA.INSTANCE));
        this.l.a(this.j.a().a((Consumer<? super T>) new $$Lambda$nwd$wOmoXNrqI_rEQos4vbqShEFyyxE<Object>(this), (Consumer<? super Throwable>) $$Lambda$nwd$EzJZnF2ApEYrGXAzkjvFDGG8G_c.INSTANCE));
    }

    /* access modifiers changed from: private */
    public void a(fpt fpt) {
        this.d = fpt;
        if (b(fpt)) {
            this.f.a(h());
        }
    }

    public final void e() {
        super.e();
        this.m.l();
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.f.b = bundle.getBoolean("start_trip_snack_item_dismissed");
        }
    }

    public final void a(Bundle bundle) {
        bundle.putBoolean("start_trip_snack_item_dismissed", this.f.b);
    }

    public final void a() {
        this.m.k();
        this.l.c();
        for (kmo a2 : this.e) {
            a2.a();
        }
        this.g.a();
        fpt fpt = this.d;
        if (fpt != null && b(fpt)) {
            this.f.a.c();
        }
    }

    public final void aP_() {
        this.i.b(this);
    }

    private static boolean b(fpt fpt) {
        return fpt.a(rvd.a) == RolloutFlag.ENABLED;
    }

    private kmn d() {
        return (kmn) fay.a(this.a);
    }

    private kdj g() {
        return (kdj) fay.a(this.b);
    }

    private nwc h() {
        return (nwc) fay.a(this.c);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if ((r4.b != null && r4.b.a() == com.spotify.mobile.android.waze.model.WazeBannerModel.Type.NAVIGATION_BANNER) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r4) {
        /*
            r3 = this;
            kmn r0 = r3.d()
            boolean r0 = r0.aH_()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            kdj r0 = r3.g()
            boolean r0 = r0.aH_()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 != 0) goto L_0x0044
            if (r4 == 0) goto L_0x0044
            nwa r4 = r3.f
            boolean r4 = r4.b
            if (r4 != 0) goto L_0x0044
            nwa r4 = r3.f
            r4.a()
            nwc r4 = r3.h()
            r4.a(r1)
            kdj r4 = r3.g()
            r4.a(r2)
            kmn r4 = r3.d()
            r4.a(r2)
            rvv r4 = r3.m
            r4.a()
            return
        L_0x0044:
            nwc r4 = r3.h()
            r4.a(r2)
            kdj r4 = r3.g()
            boolean r4 = r4.aH_()
            if (r4 == 0) goto L_0x006d
            kdj r4 = r3.g()
            com.spotify.mobile.android.waze.model.WazeBannerModel r0 = r4.b
            if (r0 == 0) goto L_0x0069
            com.spotify.mobile.android.waze.model.WazeBannerModel r4 = r4.b
            com.spotify.mobile.android.waze.model.WazeBannerModel$Type r4 = r4.a()
            com.spotify.mobile.android.waze.model.WazeBannerModel$Type r0 = com.spotify.mobile.android.waze.model.WazeBannerModel.Type.NAVIGATION_BANNER
            if (r4 != r0) goto L_0x0069
            r4 = 1
            goto L_0x006a
        L_0x0069:
            r4 = 0
        L_0x006a:
            if (r4 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            if (r1 == 0) goto L_0x0075
            rvv r4 = r3.m
            r4.b()
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwd.a(boolean):void");
    }
}
