package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: hou reason: default package */
public final class hou {
    public final jjf a;

    public hou(jjf jjf) {
        this.a = jjf;
    }

    public final void a(String str, long j, rqi rqi) {
        if (j != 0) {
            j jVar = new j(null, true, j, rqi.b, rqi.c);
            this.a.a(jVar);
        }
        this.a.a(a(str, rqi, "connected", (byte[]) null, (String) null));
        Logger.a("LogHelper.logStartSession sessionId: %s integrationType: %s name: %s", str, rqi.a, rqi.c);
    }

    public final void b(String str, long j, rqi rqi) {
        if (j != 0) {
            j jVar = new j(null, false, j, rqi.b, rqi.b);
            this.a.a(jVar);
        }
        this.a.a(a(str, rqi, "disconnected", (byte[]) null, (String) null));
        Logger.a("LogHelper.logEndSession sessionId: %s integrationType: %s name: %s", str, rqi.a, rqi.c);
    }

    public static z a(String str, rqi rqi, String str2, byte[] bArr, String str3) {
        rqi rqi2 = rqi;
        z zVar = new z(str, rqi2.b, rqi2.a, rqi2.d, bArr, str2, rqi2.e, rqi2.f, rqi2.g, rqi2.c, rqi2.h, str3);
        return zVar;
    }

    public final void a(String str, String str2, long j, long j2) {
        a(str, "get_item", "get_item", str2, (byte[]) null);
        Logger.a("LogHelper.logGetItems uri: %s page: %d index: %d", str2, Long.valueOf(j), Long.valueOf(j2));
    }

    public final void a(String str, String str2) {
        a(str, "play", "play", str2, (byte[]) null);
        Logger.a("LogHelper.logPlay uri: %s ", str2);
    }

    public final void a(String str, String str2, boolean z) {
        a(str, "save", z ? "save" : "unsave", str2, (byte[]) null);
        Logger.a("LogHelper.logSave uri: %s saved: %b", str2, Boolean.valueOf(z));
    }

    public final void b(String str, String str2) {
        a(str, "search", "search", (String) null, (byte[]) null);
        Logger.a("LogHelper.logSearch query: %s", str2);
    }

    public final void a(String str, int i) {
        String str2 = "pause";
        String str3 = "play";
        a(str, i == 0 ? str2 : str3, i == 0 ? str2 : str3, (String) null, (byte[]) null);
        Logger.a("LogHelper.logSetPlaySpeed speed: %d", Integer.valueOf(i));
    }

    public final void b(String str, int i) {
        a(str, "skip", i == 1 ? "skip_to_next" : "skip_to_previous", (String) null, (byte[]) null);
        Logger.a("LogHelper.logSkip %d", Integer.valueOf(i));
    }

    public final void c(String str, int i) {
        String str2 = i != 0 ? i != 1 ? i != 2 ? "invalid" : "repeat_all" : "repeat_one" : "repeat_off";
        a(str, "repeat", str2, (String) null, (byte[]) null);
        Logger.a("LogHelper.logSetRepeat %s", Integer.valueOf(i));
    }

    public final void a(String str, boolean z) {
        a(str, "shuffle", z ? "shuffle_enable" : "shuffle_disable", (String) null, (byte[]) null);
        Logger.a("LogHelper.logSetShuffle %b", Boolean.valueOf(z));
    }

    public void a(String str, String str2, String str3, String str4, byte[] bArr) {
        aa aaVar = new aa(str, str2, str3, str4, null);
        this.a.a(aaVar);
    }
}
