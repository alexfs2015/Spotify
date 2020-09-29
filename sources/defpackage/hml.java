package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hml reason: default package */
public final class hml implements SpotifyServiceIntentProcessor {
    private final hfi a;
    private final hil b;

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    public hml(hfi hfi, hil hil) {
        this.a = hfi;
        this.b = hil;
    }

    public final Result a(boolean z, Intent intent) {
        fay.a(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.session.LOGOUT"));
        jxr jxr = new jxr(new $$Lambda$hml$9flDVB_49YK0AWT_zGetD3qx6o(this));
        a b2 = jxr.b();
        this.b.a(jxr);
        b2.a();
        return Result.IGNORABLE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.d.a(true);
    }
}
