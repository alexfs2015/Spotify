package defpackage;

import com.spotify.messages.VoiceAdLog;

/* renamed from: hzk reason: default package */
public final class hzk {
    public final jxz a;
    public final jkk b;
    public boolean c = this.a.a(this.b.a, "android.permission.RECORD_AUDIO");
    private final gfk<fli> d;
    private final jtz e;

    public hzk(jxz jxz, gfk<fli> gfk, jkk jkk, jtz jtz) {
        this.a = jxz;
        this.d = gfk;
        this.b = jkk;
        this.e = jtz;
        a(this.c);
    }

    public void a(boolean z) {
        this.d.a((VoiceAdLog) VoiceAdLog.k().a(z ? "mic_perms_enabled" : "mic_perms_disabled").a(this.e.a()).b("").g());
    }
}
