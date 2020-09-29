package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadingTracker.DataSource;
import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: njf reason: default package */
public final class njf extends rws<gzz> {
    public final /* synthetic */ boolean a(Object obj) {
        gzz gzz = (gzz) obj;
        return !hai.EMPTY.equals(gzz) && !gyi.a(gzz);
    }

    njf(a aVar, rwr rwr, sih sih, rdh rdh) {
        super(aVar, rwr, sih, rdh);
    }

    /* renamed from: a */
    public final wud<gzz> call(wud<gzz> wud) {
        return super.call(wud.b((wun<? super T>) new $$Lambda$njf$LWbTJ3cuU21eWoXQn5Lm4M_p5P0<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(gzz gzz) {
        if (nde.a(gzz, "home-error-empty-view") || nde.a(gzz)) {
            b();
        }
        if (nes.a(gzz.custom(), gzz.body())) {
            this.a = DataSource.CACHE;
            return;
        }
        if (gzz.custom().boolValue("remote", false)) {
            this.a = DataSource.REMOTE;
        }
    }
}
