package defpackage;

import android.media.AudioManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: rzv reason: default package */
public final class rzv implements wig<rzu> {
    private final wzi<gmk> a;
    private final wzi<AudioManager> b;
    private final wzi<rzw> c;
    private final wzi<Player> d;

    private rzv(wzi<gmk> wzi, wzi<AudioManager> wzi2, wzi<rzw> wzi3, wzi<Player> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rzv a(wzi<gmk> wzi, wzi<AudioManager> wzi2, wzi<rzw> wzi3, wzi<Player> wzi4) {
        return new rzv(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new rzu((gmk) this.a.get(), wif.b(this.b), (rzw) this.c.get(), (Player) this.d.get());
    }
}
