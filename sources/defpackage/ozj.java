package defpackage;

import com.spotify.music.features.podcast.entity.topic.CETopicsRolloutHelper;
import io.reactivex.Scheduler;

/* renamed from: ozj reason: default package */
public final class ozj implements vua<ozi> {
    private final wlc<CETopicsRolloutHelper> a;
    private final wlc<a> b;
    private final wlc<tse> c;
    private final wlc<ozk> d;
    private final wlc<Scheduler> e;
    private final wlc<String> f;
    private final wlc<a> g;
    private final wlc<Boolean> h;

    private ozj(wlc<CETopicsRolloutHelper> wlc, wlc<a> wlc2, wlc<tse> wlc3, wlc<ozk> wlc4, wlc<Scheduler> wlc5, wlc<String> wlc6, wlc<a> wlc7, wlc<Boolean> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static ozj a(wlc<CETopicsRolloutHelper> wlc, wlc<a> wlc2, wlc<tse> wlc3, wlc<ozk> wlc4, wlc<Scheduler> wlc5, wlc<String> wlc6, wlc<a> wlc7, wlc<Boolean> wlc8) {
        ozj ozj = new ozj(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return ozj;
    }

    public final /* synthetic */ Object get() {
        ozi ozi = new ozi((CETopicsRolloutHelper) this.a.get(), vtz.b(this.b), (tse) this.c.get(), (ozk) this.d.get(), (Scheduler) this.e.get(), (String) this.f.get(), (a) this.g.get(), ((Boolean) this.h.get()).booleanValue());
        return ozi;
    }
}
