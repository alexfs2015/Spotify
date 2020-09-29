package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mko reason: default package */
public final class mko implements spt {
    public final void a(sps sps) {
        sps.a(LinkType.DAILY_MIX_HUB, "Displays Daily Hix Hub UI", (spx) $$Lambda$mko$05UKHPB6jMppB2LanxNA5uhQ1kI.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ spw a(Intent intent, fpt fpt, SessionState sessionState) {
        if (((Boolean) fpt.a(mkb.a)).booleanValue()) {
            return spw.a((jol) mkc.ah());
        }
        return spw.a(jst.a(ViewUris.ap.toString()));
    }
}
