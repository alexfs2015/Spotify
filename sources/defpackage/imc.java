package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.spotlets.bixbyhomecards.logging.StreamingCardEventLogger;

/* renamed from: imc reason: default package */
public final class imc implements vua<imb> {
    private final wlc<Context> a;
    private final wlc<ilz> b;
    private final wlc<Player> c;
    private final wlc<img> d;
    private final wlc<StreamingCardEventLogger> e;
    private final wlc<ilx> f;
    private final wlc<ilt> g;
    private final wlc<ilr> h;
    private final wlc<ilp> i;
    private final wlc<imi> j;

    private imc(wlc<Context> wlc, wlc<ilz> wlc2, wlc<Player> wlc3, wlc<img> wlc4, wlc<StreamingCardEventLogger> wlc5, wlc<ilx> wlc6, wlc<ilt> wlc7, wlc<ilr> wlc8, wlc<ilp> wlc9, wlc<imi> wlc10) {
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
    }

    public static imc a(wlc<Context> wlc, wlc<ilz> wlc2, wlc<Player> wlc3, wlc<img> wlc4, wlc<StreamingCardEventLogger> wlc5, wlc<ilx> wlc6, wlc<ilt> wlc7, wlc<ilr> wlc8, wlc<ilp> wlc9, wlc<imi> wlc10) {
        imc imc = new imc(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10);
        return imc;
    }

    public final /* synthetic */ Object get() {
        imb imb = new imb((Context) this.a.get(), (ilz) this.b.get(), (Player) this.c.get(), (img) this.d.get(), (StreamingCardEventLogger) this.e.get(), (ilx) this.f.get(), (ilt) this.g.get(), (ilr) this.h.get(), (ilp) this.i.get(), (imi) this.j.get());
        return imb;
    }
}
