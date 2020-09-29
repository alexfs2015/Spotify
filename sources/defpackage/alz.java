package defpackage;

import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.UUID;

/* renamed from: alz reason: default package */
final class alz {
    Long a;
    Long b;
    int c;
    Long d;
    amb e;
    UUID f;

    public alz(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    private alz(Long l, Long l2, UUID uuid) {
        this.a = l;
        this.b = l2;
        this.f = uuid;
    }

    public final void a() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(akq.g()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f.toString());
        edit.apply();
        amb amb = this.e;
        if (amb != null) {
            amb.a();
        }
    }
}
