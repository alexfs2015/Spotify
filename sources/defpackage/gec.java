package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase.a;
import com.google.common.collect.ImmutableList;
import com.spotify.eventsender.EventSenderDatabase;
import java.util.ArrayList;

/* renamed from: gec reason: default package */
public final class gec {
    public final gef a;
    private final Context b;
    private final gea c;
    private geo d;
    private geb e;
    private volatile boolean f;

    public gec(Context context, wmb wmb, geo geo) {
        this.b = context.getApplicationContext();
        this.d = geo;
        geq geq = new geq(new a(context));
        String d2 = geo.d();
        gfw gfw = new gfw((gfx) new a().a(wmb).a(d2).a((a) wsx.a()).a().a(gfx.class), new gfy(), this.d.b());
        a a2 = oz.a(this.b, EventSenderDatabase.class, "event-sender.db").a(new gft()).a();
        if (geo.e()) {
            a2.c = true;
        }
        EventSenderDatabase eventSenderDatabase = (EventSenderDatabase) a2.b();
        gfa gfa = new gfa(geq);
        gdm gdm = new gdm(this.b);
        gfh gfh = new gfh(gdm, new gfa(geq), new gfj(eventSenderDatabase.j(), geq));
        a aVar = new a(this.b, geq, this.d.b(), gdm, gfa);
        gey gey = new gey(new ArrayList(aVar.a(this.d.a()).a.values()), 0);
        this.e = geo.c();
        gfh gfh2 = gfh;
        gdw gdw = new gdw(gfh, eventSenderDatabase.j(), gey, eventSenderDatabase.i(), this.d.b());
        gdv gdv = new gdv(this.d.b());
        gfp k = eventSenderDatabase.k();
        gfm j = eventSenderDatabase.j();
        gel gel = new gel();
        gfw.getClass();
        ger ger = new ger(k, gfh2, j, gey, gel, new $$Lambda$suNWX8vtexMdL1ELBZVkagtQLtU(gfw));
        gfr i = eventSenderDatabase.i();
        gfw.getClass();
        gdv gdv2 = gdv;
        gdt gdt = new gdt(i, gdv2, new $$Lambda$suNWX8vtexMdL1ELBZVkagtQLtU(gfw), this.d.b(), true);
        gfr i2 = eventSenderDatabase.i();
        gfw.getClass();
        gdt gdt2 = new gdt(i2, gdv2, new $$Lambda$OcTPMytLHVo3tmRPzd65tjISlqA(gfw), this.d.b(), false);
        this.c = new gea(ImmutableList.a(ger, gdt, gdt2), this.d.b());
        this.a = new gef(gdw, this.d.b());
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
