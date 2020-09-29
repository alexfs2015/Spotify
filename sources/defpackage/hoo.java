package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hoo reason: default package */
public final class hoo implements SpotifyServiceIntentProcessor {
    private final ConnectManager a;
    private final mkk b;

    public hoo(ConnectManager connectManager, mkk mkk) {
        this.a = connectManager;
        this.b = mkk;
    }

    public final Result a(boolean z, Intent intent) {
        this.a.l();
        this.a.k();
        mkk mkk = this.b;
        mkk.f = mkk.g.a();
        if (mkk.m) {
            fdz R_ = mkk.e.iterator();
            while (R_.hasNext()) {
                mkk.a((mjt) R_.next());
            }
            fdz R_2 = mkk.e.iterator();
            while (R_2.hasNext()) {
                mjt mjt = (mjt) R_2.next();
                mjt.b(mkk.f.c(mjt.a()).a);
            }
        }
        return Result.IGNORABLE;
    }

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }
}
