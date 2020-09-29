package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: ilk reason: default package */
public final class ilk {
    private final jjf a;

    ilk(jjf jjf) {
        this.a = jjf;
    }

    public final void a(int i, String str, String str2, String str3, String str4) {
        jjf jjf = this.a;
        k kVar = new k(Integer.toString(i), str, str2, str3, str4);
        jjf.a(kVar);
        Logger.a("Log Bixby Home Cards Event: \n cardId: %s\n eventType: %s\n element: %s\n uri: %s\n currentlyPlaying: %s", Integer.valueOf(i), str, str2, str3, str4);
    }
}
