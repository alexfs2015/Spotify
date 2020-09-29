package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: uog reason: default package */
public final class uog {
    public final jjf a;
    private final wlc<PlayerState> b;

    public uog(jjf jjf, wlc<PlayerState> wlc) {
        this.a = jjf;
        this.b = wlc;
    }

    public void a(String str, String str2, String str3, String str4, int i, double d) {
        jjf jjf = this.a;
        String str5 = str2;
        bh bhVar = new bh(a(), "nowplaying/scroll", str5, "storylines", (long) i, str, str3, str4, d);
        jjf.a(bhVar);
    }

    public String a() {
        PlayerState playerState = (PlayerState) this.b.get();
        if (playerState == null) {
            return null;
        }
        return playerState.playbackId();
    }
}
