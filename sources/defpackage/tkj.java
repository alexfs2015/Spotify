package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.SectionId;

/* renamed from: tkj reason: default package */
public final class tkj {
    private final jlr a;
    private final wzi<PlayerState> b;
    private final sso c;
    private final String d;
    private final String e;

    public tkj(jlr jlr, wzi<PlayerState> wzi, sso sso, gkq gkq, String str) {
        this.a = jlr;
        this.b = wzi;
        this.c = sso;
        this.d = gkq.a();
        this.e = str;
    }

    private PlayerState a() {
        return (PlayerState) this.b.get();
    }

    private String b() {
        PlayerState a2 = a();
        if (a2 == null) {
            return null;
        }
        return a2.playbackId();
    }

    public void a(int i, String str, String str2) {
        jlr jlr = this.a;
        String b2 = b();
        String str3 = this.d;
        String sso = this.c.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(SectionId.SCROLL);
        be beVar = new be(b2, str3, sso, sb.toString(), (long) i, null, str, str2, (double) jtp.a.a());
        jlr.a(beVar);
    }
}
