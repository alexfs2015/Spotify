package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: inx reason: default package */
public final class inx {
    private final jlr a;

    inx(jlr jlr) {
        this.a = jlr;
    }

    public final void a(int i, String str, String str2, String str3, String str4) {
        jlr jlr = this.a;
        k kVar = new k(Integer.toString(i), str, str2, str3, str4);
        jlr.a(kVar);
        Logger.a("Log Bixby Home Cards Event: \n cardId: %s\n eventType: %s\n element: %s\n uri: %s\n currentlyPlaying: %s", Integer.valueOf(i), str, str2, str3, str4);
    }
}
