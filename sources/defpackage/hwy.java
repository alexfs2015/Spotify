package defpackage;

import com.spotify.messages.VoiceAdLog;

/* renamed from: hwy reason: default package */
public final class hwy {
    public final jvr a;
    public final jhu b;
    public boolean c = this.a.a(this.b.a, "android.permission.RECORD_AUDIO");
    private final gdz<fko> d;
    private final jrp e;

    public hwy(jvr jvr, gdz<fko> gdz, jhu jhu, jrp jrp) {
        this.a = jvr;
        this.d = gdz;
        this.b = jhu;
        this.e = jrp;
        a(this.c);
    }

    public void a(boolean z) {
        this.d.a((VoiceAdLog) VoiceAdLog.k().a(z ? "mic_perms_enabled" : "mic_perms_disabled").a(this.e.a()).b("").g());
    }
}
