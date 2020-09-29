package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: qkf reason: default package */
public final class qkf implements wig<qke> {
    private final wzi<Player> a;
    private final wzi<sso> b;
    private final wzi<has> c;

    private qkf(wzi<Player> wzi, wzi<sso> wzi2, wzi<has> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qkf a(wzi<Player> wzi, wzi<sso> wzi2, wzi<has> wzi3) {
        return new qkf(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qke((Player) this.a.get(), (sso) this.b.get(), (has) this.c.get());
    }
}
