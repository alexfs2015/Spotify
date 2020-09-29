package defpackage;

import android.content.res.Resources;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import io.reactivex.Scheduler;

/* renamed from: ozq reason: default package */
public final class ozq implements vua<ozp> {
    private final wlc<a> a;
    private final wlc<ozr> b;
    private final wlc<Scheduler> c;
    private final wlc<String> d;
    private final wlc<a> e;
    private final wlc<Boolean> f;
    private final wlc<tmy> g;
    private final wlc<Resources> h;
    private final wlc<ozn> i;
    private final wlc<ImpressionLogger> j;
    private final wlc<InteractionLogger> k;

    private ozq(wlc<a> wlc, wlc<ozr> wlc2, wlc<Scheduler> wlc3, wlc<String> wlc4, wlc<a> wlc5, wlc<Boolean> wlc6, wlc<tmy> wlc7, wlc<Resources> wlc8, wlc<ozn> wlc9, wlc<ImpressionLogger> wlc10, wlc<InteractionLogger> wlc11) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
    }

    public static ozq a(wlc<a> wlc, wlc<ozr> wlc2, wlc<Scheduler> wlc3, wlc<String> wlc4, wlc<a> wlc5, wlc<Boolean> wlc6, wlc<tmy> wlc7, wlc<Resources> wlc8, wlc<ozn> wlc9, wlc<ImpressionLogger> wlc10, wlc<InteractionLogger> wlc11) {
        ozq ozq = new ozq(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11);
        return ozq;
    }

    public final /* synthetic */ Object get() {
        ozp ozp = new ozp(vtz.b(this.a), (ozr) this.b.get(), (Scheduler) this.c.get(), (String) this.d.get(), (a) this.e.get(), ((Boolean) this.f.get()).booleanValue(), (tmy) this.g.get(), (Resources) this.h.get(), (ozn) this.i.get(), (ImpressionLogger) this.j.get(), (InteractionLogger) this.k.get());
        return ozp;
    }
}
