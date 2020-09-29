package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.spotlets.bixbyhomecards.logging.StreamingCardEventLogger;

/* renamed from: iop reason: default package */
public final class iop implements wig<ioo> {
    private final wzi<Context> a;
    private final wzi<iom> b;
    private final wzi<Player> c;
    private final wzi<iot> d;
    private final wzi<StreamingCardEventLogger> e;
    private final wzi<iok> f;
    private final wzi<iog> g;
    private final wzi<ioe> h;
    private final wzi<ioc> i;
    private final wzi<iov> j;

    private iop(wzi<Context> wzi, wzi<iom> wzi2, wzi<Player> wzi3, wzi<iot> wzi4, wzi<StreamingCardEventLogger> wzi5, wzi<iok> wzi6, wzi<iog> wzi7, wzi<ioe> wzi8, wzi<ioc> wzi9, wzi<iov> wzi10) {
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
    }

    public static iop a(wzi<Context> wzi, wzi<iom> wzi2, wzi<Player> wzi3, wzi<iot> wzi4, wzi<StreamingCardEventLogger> wzi5, wzi<iok> wzi6, wzi<iog> wzi7, wzi<ioe> wzi8, wzi<ioc> wzi9, wzi<iov> wzi10) {
        iop iop = new iop(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10);
        return iop;
    }

    public final /* synthetic */ Object get() {
        ioo ioo = new ioo((Context) this.a.get(), (iom) this.b.get(), (Player) this.c.get(), (iot) this.d.get(), (StreamingCardEventLogger) this.e.get(), (iok) this.f.get(), (iog) this.g.get(), (ioe) this.h.get(), (ioc) this.i.get(), (iov) this.j.get());
        return ioo;
    }
}
