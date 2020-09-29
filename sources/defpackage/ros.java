package defpackage;

import com.spotify.music.libs.connect.access.ConnectAccessViewModel;
import com.spotify.music.libs.connect.access.animation.logic.NudgeResolver;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: ros reason: default package */
public final class ros implements vua<ConnectAccessViewModel> {
    private final wlc<rpe> a;
    private final wlc<ron> b;
    private final wlc<roq> c;
    private final wlc<rpm> d;
    private final wlc<rox> e;
    private final wlc<Scheduler> f;
    private final wlc<rpg> g;
    private final wlc<NudgeResolver> h;
    private final wlc<Observable<Boolean>> i;

    private ros(wlc<rpe> wlc, wlc<ron> wlc2, wlc<roq> wlc3, wlc<rpm> wlc4, wlc<rox> wlc5, wlc<Scheduler> wlc6, wlc<rpg> wlc7, wlc<NudgeResolver> wlc8, wlc<Observable<Boolean>> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static ros a(wlc<rpe> wlc, wlc<ron> wlc2, wlc<roq> wlc3, wlc<rpm> wlc4, wlc<rox> wlc5, wlc<Scheduler> wlc6, wlc<rpg> wlc7, wlc<NudgeResolver> wlc8, wlc<Observable<Boolean>> wlc9) {
        ros ros = new ros(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return ros;
    }

    public final /* synthetic */ Object get() {
        ConnectAccessViewModel connectAccessViewModel = new ConnectAccessViewModel((rpe) this.a.get(), (ron) this.b.get(), (roq) this.c.get(), (rpm) this.d.get(), (rox) this.e.get(), (Scheduler) this.f.get(), (rpg) this.g.get(), (NudgeResolver) this.h.get(), (Observable) this.i.get());
        return connectAccessViewModel;
    }
}
