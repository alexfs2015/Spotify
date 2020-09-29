package defpackage;

import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.UUID;

/* renamed from: all reason: default package */
final class all {
    Long a;
    Long b;
    int c;
    Long d;
    aln e;
    UUID f;

    public all(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    private all(Long l, Long l2, UUID uuid) {
        this.a = l;
        this.b = l2;
        this.f = uuid;
    }

    public final void a() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(akc.g()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f.toString());
        edit.apply();
        aln aln = this.e;
        if (aln != null) {
            aln.a();
        }
    }
}
