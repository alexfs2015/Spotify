package defpackage;

import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.Scheduler;

/* renamed from: pce reason: default package */
public final class pce implements wig<pcd> {
    private final wzi<String> a;
    private final wzi<hgz> b;
    private final wzi<RxWebToken> c;
    private final wzi<Scheduler> d;

    private pce(wzi<String> wzi, wzi<hgz> wzi2, wzi<RxWebToken> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pce a(wzi<String> wzi, wzi<hgz> wzi2, wzi<RxWebToken> wzi3, wzi<Scheduler> wzi4) {
        return new pce(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new pcd((String) this.a.get(), (hgz) this.b.get(), (RxWebToken) this.c.get(), (Scheduler) this.d.get());
    }
}
