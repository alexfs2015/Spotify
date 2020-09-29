package defpackage;

import com.spotify.mobile.android.spotlets.eventshub.model.EventResult;
import java.util.Calendar;

/* renamed from: ivl reason: default package */
public final class ivl implements wig<ivk> {
    private final wzi<ivt> a;
    private final wzi<szp> b;
    private final wzi<EventResult> c;
    private final wzi<iwh> d;
    private final wzi<Calendar> e;
    private final wzi<jtz> f;

    private ivl(wzi<ivt> wzi, wzi<szp> wzi2, wzi<EventResult> wzi3, wzi<iwh> wzi4, wzi<Calendar> wzi5, wzi<jtz> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static ivl a(wzi<ivt> wzi, wzi<szp> wzi2, wzi<EventResult> wzi3, wzi<iwh> wzi4, wzi<Calendar> wzi5, wzi<jtz> wzi6) {
        ivl ivl = new ivl(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return ivl;
    }

    public final /* synthetic */ Object get() {
        ivk ivk = new ivk((ivt) this.a.get(), (szp) this.b.get(), (EventResult) this.c.get(), (iwh) this.d.get(), (Calendar) this.e.get(), (jtz) this.f.get());
        return ivk;
    }
}
