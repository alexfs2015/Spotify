package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: unf reason: default package */
public final class unf implements wig<une> {
    private final wzi<Player> a;
    private final wzi<jtz> b;
    private final wzi<ums> c;

    private unf(wzi<Player> wzi, wzi<jtz> wzi2, wzi<ums> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static unf a(wzi<Player> wzi, wzi<jtz> wzi2, wzi<ums> wzi3) {
        return new unf(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new une(wif.b(this.a), (jtz) this.b.get(), (ums) this.c.get());
    }
}
