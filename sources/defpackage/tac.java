package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.nowplaying.common.view.logging.NowPlayingLogConstants.SectionId;

/* renamed from: tac reason: default package */
public final class tac {
    private final jjf a;
    private final wlc<PlayerState> b;
    private final sih c;
    private final String d;
    private final String e;

    public tac(jjf jjf, wlc<PlayerState> wlc, sih sih, gjf gjf, String str) {
        this.a = jjf;
        this.b = wlc;
        this.c = sih;
        this.d = gjf.a();
        this.e = str;
    }

    public void a(int i, String str, String str2) {
        jjf jjf = this.a;
        String b2 = b();
        String str3 = this.d;
        String sih = this.c.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(SectionId.SCROLL);
        bf bfVar = new bf(b2, str3, sih, sb.toString(), (long) i, null, str, str2, (double) jrf.a.a());
        jjf.a(bfVar);
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
}
