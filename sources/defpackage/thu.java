package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: thu reason: default package */
public final class thu implements wig<tht> {
    private final wzi<Player> a;
    private final wzi<vcq> b;
    private final wzi<lal> c;
    private final wzi<vde> d;
    private final wzi<thq> e;

    private thu(wzi<Player> wzi, wzi<vcq> wzi2, wzi<lal> wzi3, wzi<vde> wzi4, wzi<thq> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static thu a(wzi<Player> wzi, wzi<vcq> wzi2, wzi<lal> wzi3, wzi<vde> wzi4, wzi<thq> wzi5) {
        thu thu = new thu(wzi, wzi2, wzi3, wzi4, wzi5);
        return thu;
    }

    public final /* synthetic */ Object get() {
        tht tht = new tht((Player) this.a.get(), (vcq) this.b.get(), (lal) this.c.get(), (vde) this.d.get(), (thq) this.e.get());
        return tht;
    }
}
