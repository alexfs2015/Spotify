package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: ihi reason: default package */
public final class ihi implements taa {
    private final a a;

    public ihi(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, fqn fqn, SessionState sessionState) {
        this.a.a((Ad) ((Bundle) fbp.a(intent.getExtras(), (Object) "Expected ad in extras")).getParcelable("screensaver_ad"));
    }

    public final void a(szz szz) {
        szz.a("com.spotify.mobile.android.ui.action.ads.screensaver.SHOW", "Show a screensaver ad", (xiu<Intent, fqn, SessionState>) new $$Lambda$ihi$arcmXBcH2mg6WPEY84lRPjz7Td0<Intent,fqn,SessionState>(this));
    }
}
