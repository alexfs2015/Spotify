package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: iva reason: default package */
public final class iva implements vua<iuz> {
    private final wlc<InteractionLogger> a;
    private final wlc<PlayerState> b;
    private final wlc<rpg> c;
    private final wlc<gjf> d;
    private final wlc<sih> e;

    private iva(wlc<InteractionLogger> wlc, wlc<PlayerState> wlc2, wlc<rpg> wlc3, wlc<gjf> wlc4, wlc<sih> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static iva a(wlc<InteractionLogger> wlc, wlc<PlayerState> wlc2, wlc<rpg> wlc3, wlc<gjf> wlc4, wlc<sih> wlc5) {
        iva iva = new iva(wlc, wlc2, wlc3, wlc4, wlc5);
        return iva;
    }

    public final /* synthetic */ Object get() {
        iuz iuz = new iuz((InteractionLogger) this.a.get(), this.b, (rpg) this.c.get(), (gjf) this.d.get(), (sih) this.e.get());
        return iuz;
    }
}
