package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: kpx reason: default package */
public final class kpx extends c {
    final kpt a;
    public final kqb b;
    final ActiveSessionBannerLogger c;
    final kqn d;
    final kqf e;
    boolean f;
    private final String g;
    private final String h;
    private kpw i;
    private kqe j;
    private final kpy k;
    private final jme l;

    public kpx(ActiveSessionBannerLogger activeSessionBannerLogger, Activity activity, kpy kpy, kpt kpt, kqb kqb, kqn kqn, kqf kqf) {
        this.c = activeSessionBannerLogger;
        this.l = (jme) activity;
        this.d = kqn;
        this.e = kqf;
        this.l.a(this);
        this.k = kpy;
        this.a = kpt;
        this.b = kqb;
        StringBuilder sb = new StringBuilder("com.spotify.music.ACTIVE_SESSION_BANNER_VISIBLE_");
        sb.append(this.k.d());
        this.g = sb.toString();
        StringBuilder sb2 = new StringBuilder("com.spotify.music.ACTIVE_SESSION_PRESENTER_ACTIVE_");
        sb2.append(this.k.d());
        this.h = sb2.toString();
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        kpw kpw = (kpw) fbp.a(this.i);
        if (!z || !kpw.aF_()) {
            if (z) {
                ActiveSessionBannerLogger activeSessionBannerLogger = this.c;
                kqn kqn = this.d;
                be beVar = new be(null, kqn.a(), null, kqn.b(), -1, null, ImpressionType.ITEM.toString(), RenderType.BANNER.toString(), (double) activeSessionBannerLogger.b.a());
                activeSessionBannerLogger.a.a(beVar);
            }
            a(z);
        }
    }

    public final void a() {
        this.b.a();
    }

    public final void a(Bundle bundle) {
        kpw kpw = (kpw) fbp.a(this.i);
        bundle.putString("com.spotify.music.BANNER_DESTINATION_PACKAGE", d().a);
        bundle.putBoolean(this.g, kpw.aF_());
        bundle.putBoolean(this.h, this.f);
    }

    public final void a(kpw kpw) {
        this.i = kpw;
        this.j = new kqe();
        this.b.a(new $$Lambda$kpx$Ju2VD_nOX5G2uXTDcE6bMzkjzWY(this));
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        kpw kpw = (kpw) fbp.a(this.i);
        if (z) {
            kpw.a(this.k);
            kpw.b = this;
        } else if (this.f) {
            kpw.b = null;
        } else {
            return;
        }
        this.f = z;
        kpw.a(z);
    }

    public final void aN_() {
        this.l.b(this);
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            d().a = bundle.getString("com.spotify.music.BANNER_DESTINATION_PACKAGE");
            this.f = bundle.getBoolean(this.h);
            if (this.f) {
                a(bundle.getBoolean(this.g));
            }
        }
    }

    public final kqe d() {
        return (kqe) fbp.a(this.j);
    }
}
