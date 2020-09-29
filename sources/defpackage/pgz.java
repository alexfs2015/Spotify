package defpackage;

import android.content.res.Resources;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import io.reactivex.Scheduler;

/* renamed from: pgz reason: default package */
public final class pgz implements wig<pgy> {
    private final wzi<a> a;
    private final wzi<pha> b;
    private final wzi<Scheduler> c;
    private final wzi<String> d;
    private final wzi<a> e;
    private final wzi<Boolean> f;
    private final wzi<tyx> g;
    private final wzi<Resources> h;
    private final wzi<pgw> i;
    private final wzi<ImpressionLogger> j;
    private final wzi<InteractionLogger> k;

    private pgz(wzi<a> wzi, wzi<pha> wzi2, wzi<Scheduler> wzi3, wzi<String> wzi4, wzi<a> wzi5, wzi<Boolean> wzi6, wzi<tyx> wzi7, wzi<Resources> wzi8, wzi<pgw> wzi9, wzi<ImpressionLogger> wzi10, wzi<InteractionLogger> wzi11) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
    }

    public static pgz a(wzi<a> wzi, wzi<pha> wzi2, wzi<Scheduler> wzi3, wzi<String> wzi4, wzi<a> wzi5, wzi<Boolean> wzi6, wzi<tyx> wzi7, wzi<Resources> wzi8, wzi<pgw> wzi9, wzi<ImpressionLogger> wzi10, wzi<InteractionLogger> wzi11) {
        pgz pgz = new pgz(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11);
        return pgz;
    }

    public final /* synthetic */ Object get() {
        pgy pgy = new pgy(wif.b(this.a), (pha) this.b.get(), (Scheduler) this.c.get(), (String) this.d.get(), (a) this.e.get(), ((Boolean) this.f.get()).booleanValue(), (tyx) this.g.get(), (Resources) this.h.get(), (pgw) this.i.get(), (ImpressionLogger) this.j.get(), (InteractionLogger) this.k.get());
        return pgy;
    }
}
