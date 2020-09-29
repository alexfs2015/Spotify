package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: oiy reason: default package */
public final class oiy implements wig<oix> {
    private final wzi<ojc> a;
    private final wzi<Scheduler> b;
    private final wzi<oji> c;
    private final wzi<ohk> d;
    private final wzi<uun> e;
    private final wzi<a> f;

    private oiy(wzi<ojc> wzi, wzi<Scheduler> wzi2, wzi<oji> wzi3, wzi<ohk> wzi4, wzi<uun> wzi5, wzi<a> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static oiy a(wzi<ojc> wzi, wzi<Scheduler> wzi2, wzi<oji> wzi3, wzi<ohk> wzi4, wzi<uun> wzi5, wzi<a> wzi6) {
        oiy oiy = new oiy(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return oiy;
    }

    public final /* synthetic */ Object get() {
        oix oix = new oix((ojc) this.a.get(), (Scheduler) this.b.get(), (oji) this.c.get(), (ohk) this.d.get(), (uun) this.e.get(), (a) this.f.get());
        return oix;
    }
}
