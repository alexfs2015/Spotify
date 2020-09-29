package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: ukw reason: default package */
public final class ukw implements wig<gxk> {
    private final wzi<Player> a;
    private final wzi<ukp> b;
    private final wzi<hbj> c;

    private ukw(wzi<Player> wzi, wzi<ukp> wzi2, wzi<hbj> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ukw a(wzi<Player> wzi, wzi<ukp> wzi2, wzi<hbj> wzi3) {
        return new ukw(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (gxk) wil.a(new ukt((Player) this.a.get(), (ukp) this.b.get(), (hbj) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
