package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase.a;
import com.google.common.collect.ImmutableList;
import com.spotify.eventsender.EventSenderDatabase;
import java.util.ArrayList;

/* renamed from: gfn reason: default package */
public final class gfn {
    public final gfq a;
    private final Context b;
    private final gfl c;
    private gfz d;
    private gfm e;
    private volatile boolean f;

    public gfn(Context context, xah xah, gfz gfz) {
        this.b = context.getApplicationContext();
        this.d = gfz;
        ggb ggb = new ggb(new a(context));
        String d2 = gfz.d();
        ghh ghh = new ghh((ghi) new a().a(xah).a(d2).a((a) xhc.a()).a().a(ghi.class), new ghj(), this.d.b());
        a a2 = pe.a(this.b, EventSenderDatabase.class, "event-sender.db").a(new ghe()).a();
        if (gfz.e()) {
            a2.c = true;
        }
        EventSenderDatabase eventSenderDatabase = (EventSenderDatabase) a2.b();
        ggl ggl = new ggl(ggb);
        gex gex = new gex(this.b);
        ggs ggs = new ggs(gex, new ggl(ggb), new ggu(eventSenderDatabase.j(), ggb));
        a aVar = new a(this.b, ggb, this.d.b(), gex, ggl);
        ggj ggj = new ggj(new ArrayList(aVar.a(this.d.a()).a.values()), 0);
        this.e = gfz.c();
        ggs ggs2 = ggs;
        gfh gfh = new gfh(ggs, eventSenderDatabase.j(), ggj, eventSenderDatabase.i(), this.d.b());
        gfg gfg = new gfg(this.d.b());
        gha k = eventSenderDatabase.k();
        ggx j = eventSenderDatabase.j();
        gfw gfw = new gfw();
        ghh.getClass();
        ggc ggc = new ggc(k, ggs2, j, ggj, gfw, new $$Lambda$oWjeZqoKWxz6vSEbJvkSUNbuw(ghh));
        ghc i = eventSenderDatabase.i();
        ghh.getClass();
        gfg gfg2 = gfg;
        gfe gfe = new gfe(i, gfg2, new $$Lambda$oWjeZqoKWxz6vSEbJvkSUNbuw(ghh), this.d.b(), true);
        ghc i2 = eventSenderDatabase.i();
        ghh.getClass();
        gfe gfe2 = new gfe(i2, gfg2, new $$Lambda$NYvCbjZ28shoM75R4cailzLVCxI(ghh), this.d.b(), false);
        this.c = new gfl(ImmutableList.a(ggc, gfe, gfe2), this.d.b());
        this.a = new gfq(gfh, this.d.b());
    }

    public final synchronized void a() {
        if (!this.f) {
            this.f = true;
            this.e.a(this.c);
        }
    }

    public final synchronized void b() {
        if (this.f) {
            this.e.a();
            this.f = false;
        }
    }
}
