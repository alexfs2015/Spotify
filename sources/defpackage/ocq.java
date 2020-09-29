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

/* renamed from: ocq reason: default package */
public final class ocq extends c {
    public kpw a;
    public kfk b;
    public ocp c;
    public fqn d;
    public final Set<kpx> e;
    private final ocn f;
    private final kfj g;
    private final ocs h;
    private final a i;
    private final ocg j;
    private final hgy k;
    private final CompositeDisposable l = new CompositeDisposable();
    private final sff m;

    public ocq(ocn ocn, kfj kfj, ocs ocs, Activity activity, ocg ocg, hgy hgy, Set<kpx> set, sff sff) {
        this.f = ocn;
        this.g = kfj;
        this.h = ocs;
        this.i = (a) activity;
        this.e = set;
        this.i.a(this);
        this.k = hgy;
        this.j = ocg;
        this.m = sff;
    }

    /* access modifiers changed from: private */
    public void a(fqn fqn) {
        this.d = fqn;
        if (b(fqn)) {
            this.f.a(h());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if ((r4.b != null && r4.b.a() == com.spotify.mobile.android.waze.model.WazeBannerModel.Type.NAVIGATION_BANNER) != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r4) {
        /*
            r3 = this;
            kpw r0 = r3.d()
            boolean r0 = r0.aF_()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            kfk r0 = r3.g()
            boolean r0 = r0.aF_()
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
            ocn r4 = r3.f
            boolean r4 = r4.b
            if (r4 != 0) goto L_0x0044
            ocn r4 = r3.f
            r4.a()
            ocp r4 = r3.h()
            r4.a(r1)
            kfk r4 = r3.g()
            r4.a(r2)
            kpw r4 = r3.d()
            r4.a(r2)
            sff r4 = r3.m
            r4.a()
            return
        L_0x0044:
            ocp r4 = r3.h()
            r4.a(r2)
            kfk r4 = r3.g()
            boolean r4 = r4.aF_()
            if (r4 == 0) goto L_0x006d
            kfk r4 = r3.g()
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
            sff r4 = r3.m
            r4.b()
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocq.a(boolean):void");
    }

    private static boolean b(fqn fqn) {
        return fqn.a(sen.a) == RolloutFlag.ENABLED;
    }

    private kpw d() {
        return (kpw) fbp.a(this.a);
    }

    private kfk g() {
        return (kfk) fbp.a(this.b);
    }

    private ocp h() {
        return (ocp) fbp.a(this.c);
    }

    public final void a() {
        this.m.k();
        this.l.c();
        for (kpx a2 : this.e) {
            a2.a();
        }
        this.g.a();
        fqn fqn = this.d;
        if (fqn != null && b(fqn)) {
            this.f.a.c();
        }
    }

    public final void a(Bundle bundle) {
        bundle.putBoolean("start_trip_snack_item_dismissed", this.f.b);
    }

    public final void aN_() {
        this.i.b(this);
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.f.b = bundle.getBoolean("start_trip_snack_item_dismissed");
        }
    }

    public final void c() {
        for (kpx a2 : this.e) {
            a2.a(d());
        }
        this.g.a(g());
        if (this.l.d() > 0) {
            Assertion.c("Lifecycle mismatch detected: onStart called without matching onStop");
            this.l.c();
        }
        this.l.a(this.k.a().j().a((Consumer<? super T>) new $$Lambda$ocq$HU7vxVzievp5UBnmfucxA7gMcBU<Object>(this), (Consumer<? super Throwable>) $$Lambda$ocq$OidVP1zYdcswr6H07CCwEPnOU.INSTANCE));
        this.l.a(this.j.a().a((Consumer<? super T>) new $$Lambda$ocq$Fp03PumpNhMu36c3D_3k30B9aQ4<Object>(this), (Consumer<? super Throwable>) $$Lambda$ocq$zZnDDn9C6PJV7uqZiSUujGt4bs.INSTANCE));
    }

    public final void c(Bundle bundle) {
    }

    public final void e() {
        super.e();
        this.m.l();
    }
}
