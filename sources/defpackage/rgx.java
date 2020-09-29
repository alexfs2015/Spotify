package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: rgx reason: default package */
public final class rgx implements wig<rgw> {
    private final wzi<rgy> a;
    private final wzi<Player> b;
    private final wzi<sso> c;
    private final wzi<rbg> d;

    private rgx(wzi<rgy> wzi, wzi<Player> wzi2, wzi<sso> wzi3, wzi<rbg> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rgx a(wzi<rgy> wzi, wzi<Player> wzi2, wzi<sso> wzi3, wzi<rbg> wzi4) {
        return new rgx(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rgw((rgy) this.a.get(), (Player) this.b.get(), (sso) this.c.get(), (rbg) this.d.get());
    }
}
