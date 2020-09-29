package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;

/* renamed from: pir reason: default package */
public final class pir implements piq {
    private final String a;
    private final OffliningLogger b;
    private final jlr c;
    private final jtp d;

    public pir(String str, OffliningLogger offliningLogger, jlr jlr, jtp jtp) {
        this.a = str;
        this.b = offliningLogger;
        this.c = jlr;
        this.d = jtp;
    }

    public final void a(String str, String str2, String str3) {
        String str4 = this.a;
        String str5 = str4;
        String str6 = str2;
        String str7 = str;
        bg bgVar = new bg(str5, "com.spotify.feature.podcast.episode", str4, str6, 0, str7, "hit", str3, (double) this.d.a());
        this.c.a(bgVar);
    }

    public final void a(boolean z) {
        this.b.a(this.a, SourceElement.HEADER_ACTION, z);
    }
}
