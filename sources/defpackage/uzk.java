package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

/* renamed from: uzk reason: default package */
public final class uzk {
    public final jlr a;
    private final wzi<PlayerState> b;

    public uzk(jlr jlr, wzi<PlayerState> wzi) {
        this.a = jlr;
        this.b = wzi;
    }

    public String a() {
        PlayerState playerState = (PlayerState) this.b.get();
        if (playerState == null) {
            return null;
        }
        return playerState.playbackId();
    }

    public void a(String str, String str2, String str3, String str4, int i, double d) {
        jlr jlr = this.a;
        String str5 = str2;
        bg bgVar = new bg(a(), "nowplaying/scroll", str5, "storylines", (long) i, str, str3, str4, d);
        jlr.a(bgVar);
    }
}
