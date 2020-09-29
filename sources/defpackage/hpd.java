package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hpd reason: default package */
public final class hpd implements SpotifyServiceIntentProcessor {
    private final hie a;
    private final hlf b;

    public hpd(hie hie, hlf hlf) {
        this.a = hie;
        this.b = hlf;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.d.a(true);
    }

    public final Result a(boolean z, Intent intent) {
        fbp.a(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.session.LOGOUT"));
        jzr jzr = new jzr(new $$Lambda$hpd$7v7J4KmyL_GIJoR2BxN15aVeSk(this));
        a b2 = jzr.b();
        this.b.a(jzr);
        b2.a();
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
