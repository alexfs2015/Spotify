package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.CC;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.Result;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;

/* renamed from: hlw reason: default package */
public final class hlw implements SpotifyServiceIntentProcessor {
    private final ConnectManager a;
    private final grx b;

    public /* synthetic */ Result a(boolean z, Intent intent, a aVar) {
        return CC.$default$a(this, z, intent, aVar);
    }

    public hlw(ConnectManager connectManager, grx grx) {
        this.a = connectManager;
        this.b = grx;
    }

    public final Result a(boolean z, Intent intent) {
        this.a.l();
        this.a.k();
        grx grx = this.b;
        grx.f = grx.g.a();
        if (grx.m) {
            fdh R_ = grx.e.iterator();
            while (R_.hasNext()) {
                grx.a((mfh) R_.next());
            }
            fdh R_2 = grx.e.iterator();
            while (R_2.hasNext()) {
                mfh mfh = (mfh) R_2.next();
                mfh.b(grx.f.c(mfh.a()).a);
            }
        }
        return Result.IGNORABLE;
    }
}
