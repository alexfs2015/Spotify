package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mph reason: default package */
public final class mph implements taa {
    /* access modifiers changed from: private */
    public static /* synthetic */ tad a(Intent intent, fqn fqn, SessionState sessionState) {
        return ((Boolean) fqn.a(mou.a)).booleanValue() ? tad.a((jqx) mov.ah()) : tad.a(jva.a(ViewUris.ao.toString()));
    }

    public final void a(szz szz) {
        szz.a(LinkType.DAILY_MIX_HUB, "Displays Daily Hix Hub UI", (tae) $$Lambda$mph$w0ajWpRorRF1uh7Pqwv7i6XlMKk.INSTANCE);
    }
}
