package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: iev reason: default package */
public final class iev implements spt {
    private final a a;

    public iev(a aVar) {
        this.a = aVar;
    }

    public final void a(sps sps) {
        sps.a("com.spotify.mobile.android.ui.action.ads.screensaver.SHOW", "Show a screensaver ad", (wup<Intent, fpt, SessionState>) new $$Lambda$iev$lNzX_qFbjG23fzBxcfdygxL_95s<Intent,fpt,SessionState>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, fpt fpt, SessionState sessionState) {
        this.a.a((Ad) ((Bundle) fay.a(intent.getExtras(), (Object) "Expected ad in extras")).getParcelable("screensaver_ad"));
    }
}
