package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: hqy reason: default package */
public final class hqy {
    public final jlr a;

    public hqy(jlr jlr) {
        this.a = jlr;
    }

    public static z a(String str, rzt rzt, String str2, byte[] bArr, String str3) {
        rzt rzt2 = rzt;
        z zVar = new z(str, rzt2.b, rzt2.a, rzt2.d, bArr, str2, rzt2.e, rzt2.f, rzt2.g, rzt2.c, rzt2.h, str3);
        return zVar;
    }

    public final void a(String str, int i) {
        String str2 = "pause";
        String str3 = "play";
        a(str, i == 0 ? str2 : str3, i == 0 ? str2 : str3, (String) null, (byte[]) null);
        Logger.a("LogHelper.logSetPlaySpeed speed: %d", Integer.valueOf(i));
    }

    public final void a(String str, long j, rzt rzt) {
        if (j != 0) {
            j jVar = new j(null, true, j, rzt.b, rzt.c);
            this.a.a(jVar);
        }
        this.a.a(a(str, rzt, "connected", (byte[]) null, (String) null));
        Logger.a("LogHelper.logStartSession sessionId: %s integrationType: %s name: %s", str, rzt.a, rzt.c);
    }

    public final void a(String str, String str2) {
        a(str, "play", "play", str2, (byte[]) null);
        Logger.a("LogHelper.logPlay uri: %s ", str2);
    }

    public void a(String str, String str2, String str3, String str4, byte[] bArr) {
        aa aaVar = new aa(str, str2, str3, str4, null);
        this.a.a(aaVar);
    }

    public final void a(String str, String str2, boolean z) {
        a(str, "save", z ? "save" : "unsave", str2, (byte[]) null);
        Logger.a("LogHelper.logSave uri: %s saved: %b", str2, Boolean.valueOf(z));
    }

    public final void a(String str, boolean z) {
        a(str, "shuffle", z ? "shuffle_enable" : "shuffle_disable", (String) null, (byte[]) null);
        Logger.a("LogHelper.logSetShuffle %b", Boolean.valueOf(z));
    }

    public final void b(String str, int i) {
        a(str, "skip", i == 1 ? "skip_to_next" : "skip_to_previous", (String) null, (byte[]) null);
        Logger.a("LogHelper.logSkip %d", Integer.valueOf(i));
    }

    public final void b(String str, long j, rzt rzt) {
        if (j != 0) {
            j jVar = new j(null, false, j, rzt.b, rzt.b);
            this.a.a(jVar);
        }
        this.a.a(a(str, rzt, "disconnected", (byte[]) null, (String) null));
        Logger.a("LogHelper.logEndSession sessionId: %s integrationType: %s name: %s", str, rzt.a, rzt.c);
    }

    public final void c(String str, int i) {
        String str2 = i != 0 ? i != 1 ? i != 2 ? "invalid" : "repeat_all" : "repeat_one" : "repeat_off";
        a(str, "repeat", str2, (String) null, (byte[]) null);
        Logger.a("LogHelper.logSetRepeat %s", Integer.valueOf(i));
    }
}
