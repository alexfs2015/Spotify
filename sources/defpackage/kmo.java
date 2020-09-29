package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.activesessionbanner.ActiveSessionBannerLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: kmo reason: default package */
public final class kmo extends c {
    final kmk a;
    public final kms b;
    final ActiveSessionBannerLogger c;
    final kne d;
    final kmw e;
    boolean f;
    private final String g;
    private final String h;
    private kmn i;
    private kmv j;
    private final kmp k;
    private final jjs l;

    public kmo(ActiveSessionBannerLogger activeSessionBannerLogger, Activity activity, kmp kmp, kmk kmk, kms kms, kne kne, kmw kmw) {
        this.c = activeSessionBannerLogger;
        this.l = (jjs) activity;
        this.d = kne;
        this.e = kmw;
        this.l.a(this);
        this.k = kmp;
        this.a = kmk;
        this.b = kms;
        StringBuilder sb = new StringBuilder("com.spotify.music.ACTIVE_SESSION_BANNER_VISIBLE_");
        sb.append(this.k.d());
        this.g = sb.toString();
        StringBuilder sb2 = new StringBuilder("com.spotify.music.ACTIVE_SESSION_PRESENTER_ACTIVE_");
        sb2.append(this.k.d());
        this.h = sb2.toString();
    }

    public final void a(kmn kmn) {
        this.i = kmn;
        this.j = new kmv();
        this.b.a(new $$Lambda$kmo$VHXy6__uxSdN6FlpXughySNfVZA(this));
    }

    public final void a() {
        this.b.a();
    }

    public final void aP_() {
        this.l.b(this);
    }

    public final void a(Bundle bundle) {
        kmn kmn = (kmn) fay.a(this.i);
        bundle.putString("com.spotify.music.BANNER_DESTINATION_PACKAGE", d().a);
        bundle.putBoolean(this.g, kmn.aH_());
        bundle.putBoolean(this.h, this.f);
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

    /* access modifiers changed from: private */
    public void b(boolean z) {
        kmn kmn = (kmn) fay.a(this.i);
        if (!z || !kmn.aH_()) {
            if (z) {
                ActiveSessionBannerLogger activeSessionBannerLogger = this.c;
                kne kne = this.d;
                bf bfVar = new bf(null, kne.a(), null, kne.b(), -1, null, ImpressionType.ITEM.toString(), RenderType.BANNER.toString(), (double) activeSessionBannerLogger.b.a());
                activeSessionBannerLogger.a.a(bfVar);
            }
            a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        kmn kmn = (kmn) fay.a(this.i);
        if (z) {
            kmn.a(this.k);
            kmn.b = this;
        } else if (this.f) {
            kmn.b = null;
        } else {
            return;
        }
        this.f = z;
        kmn.a(z);
    }

    public final kmv d() {
        return (kmv) fay.a(this.j);
    }
}
