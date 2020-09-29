package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: pva reason: default package */
public final class pva implements spt {
    public final void a(sps sps) {
        sps.a(LinkType.REMOTE_CONFIGURATION, "Remote Configuration feature", (spa) $$Lambda$pva$UJIbaB3LX5EeqU2NWWhZosqd_FI.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        String str2 = (String) fay.a(jst.h());
        if (str2.endsWith("remoteconfiguration")) {
            return puz.c();
        }
        StringBuilder sb = new StringBuilder("Fragment for Remote Configuration URI not resolved: ");
        sb.append(str2);
        throw new RuntimeException(sb.toString());
    }
}
