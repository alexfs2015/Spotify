package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: qdw reason: default package */
public final class qdw implements taa {
    /* access modifiers changed from: private */
    public static /* synthetic */ jqx a(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        String str2 = (String) fbp.a(jva.h());
        if (str2.endsWith("remoteconfiguration")) {
            return qdv.c();
        }
        StringBuilder sb = new StringBuilder("Fragment for Remote Configuration URI not resolved: ");
        sb.append(str2);
        throw new RuntimeException(sb.toString());
    }

    public final void a(szz szz) {
        szz.a(LinkType.REMOTE_CONFIGURATION, "Remote Configuration feature", (szh) $$Lambda$qdw$OSUIbZP41hgGZpbXsUpXtigERuQ.INSTANCE);
    }
}
