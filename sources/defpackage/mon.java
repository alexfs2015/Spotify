package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: mon reason: default package */
public final class mon implements spt {
    public final void a(sps sps) {
        sps.a(LinkType.EVENTSENDER, "EventSender feature", (spa) $$Lambda$mon$n1nkrrXLHQv8dpkACBU8eCkZIk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ jol a(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        String str2 = (String) fay.a(jst.h());
        if (str2.endsWith("eventsender")) {
            return mok.c();
        }
        StringBuilder sb = new StringBuilder("Fragment for Remote Configuration URI not resolved: ");
        sb.append(str2);
        throw new RuntimeException(sb.toString());
    }
}
