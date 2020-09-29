package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;

/* renamed from: pbi reason: default package */
public final class pbi implements pbh {
    private final String a;
    private final OffliningLogger b;
    private final jjf c;
    private final jrf d;

    public pbi(String str, OffliningLogger offliningLogger, jjf jjf, jrf jrf) {
        this.a = str;
        this.b = offliningLogger;
        this.c = jjf;
        this.d = jrf;
    }

    public final void a(String str, String str2, String str3) {
        String str4 = this.a;
        jrf jrf = this.d;
        String str5 = str4;
        String str6 = str2;
        String str7 = str;
        bh bhVar = new bh(str5, "com.spotify.feature.podcast.episode", str4, str6, 0, str7, "hit", str3, (double) System.currentTimeMillis());
        this.c.a(bhVar);
    }

    public final void a(boolean z) {
        this.b.a(this.a, SourceElement.HEADER_ACTION, z);
    }
}
