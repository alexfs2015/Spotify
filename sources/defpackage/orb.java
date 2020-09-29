package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;

/* renamed from: orb reason: default package */
public final class orb implements vua<ora> {
    private final wlc<Player> a;
    private final wlc<String> b;

    private orb(wlc<Player> wlc, wlc<String> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static orb a(wlc<Player> wlc, wlc<String> wlc2) {
        return new orb(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ora(this.a, this.b);
    }
}
