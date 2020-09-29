package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: tyb reason: default package */
public final class tyb implements vua<gvk> {
    private final wlc<Player> a;
    private final wlc<txu> b;
    private final wlc<gyq> c;

    private tyb(wlc<Player> wlc, wlc<txu> wlc2, wlc<gyq> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tyb a(wlc<Player> wlc, wlc<txu> wlc2, wlc<gyq> wlc3) {
        return new tyb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (gvk) vuf.a(new txy((Player) this.a.get(), (txu) this.b.get(), (gyq) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
