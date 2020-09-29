package defpackage;

import com.spotify.http.wg.WebgateTokenProvider;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: gis reason: default package */
public final class gis implements wig<gir> {
    private final wzi<WebgateTokenProvider> a;
    private final wzi<git> b;
    private final wzi<gjp> c;
    private final wzi<gio> d;
    private final wzi<ura> e;
    private final wzi<Observable<gcl>> f;
    private final wzi<Scheduler> g;

    private gis(wzi<WebgateTokenProvider> wzi, wzi<git> wzi2, wzi<gjp> wzi3, wzi<gio> wzi4, wzi<ura> wzi5, wzi<Observable<gcl>> wzi6, wzi<Scheduler> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static gis a(wzi<WebgateTokenProvider> wzi, wzi<git> wzi2, wzi<gjp> wzi3, wzi<gio> wzi4, wzi<ura> wzi5, wzi<Observable<gcl>> wzi6, wzi<Scheduler> wzi7) {
        gis gis = new gis(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return gis;
    }

    public final /* synthetic */ Object get() {
        gir gir = new gir((WebgateTokenProvider) this.a.get(), (git) this.b.get(), (gjp) this.c.get(), (gio) this.d.get(), (ura) this.e.get(), (Observable) this.f.get(), (Scheduler) this.g.get());
        return gir;
    }
}
