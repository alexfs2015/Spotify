package defpackage;

import com.spotify.music.libs.connect.access.ConnectAccessViewModel;
import com.spotify.music.libs.connect.access.animation.logic.NudgeResolver;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: rxy reason: default package */
public final class rxy implements wig<ConnectAccessViewModel> {
    private final wzi<ryk> a;
    private final wzi<rxt> b;
    private final wzi<rxw> c;
    private final wzi<ryr> d;
    private final wzi<ryd> e;
    private final wzi<Scheduler> f;
    private final wzi<rym> g;
    private final wzi<NudgeResolver> h;
    private final wzi<Observable<Boolean>> i;

    private rxy(wzi<ryk> wzi, wzi<rxt> wzi2, wzi<rxw> wzi3, wzi<ryr> wzi4, wzi<ryd> wzi5, wzi<Scheduler> wzi6, wzi<rym> wzi7, wzi<NudgeResolver> wzi8, wzi<Observable<Boolean>> wzi9) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
    }

    public static rxy a(wzi<ryk> wzi, wzi<rxt> wzi2, wzi<rxw> wzi3, wzi<ryr> wzi4, wzi<ryd> wzi5, wzi<Scheduler> wzi6, wzi<rym> wzi7, wzi<NudgeResolver> wzi8, wzi<Observable<Boolean>> wzi9) {
        rxy rxy = new rxy(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9);
        return rxy;
    }

    public final /* synthetic */ Object get() {
        ConnectAccessViewModel connectAccessViewModel = new ConnectAccessViewModel((ryk) this.a.get(), (rxt) this.b.get(), (rxw) this.c.get(), (ryr) this.d.get(), (ryd) this.e.get(), (Scheduler) this.f.get(), (rym) this.g.get(), (NudgeResolver) this.h.get(), (Observable) this.i.get());
        return connectAccessViewModel;
    }
}
