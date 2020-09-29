package com.spotify.music.libs.mediabrowserservice;

import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.Iterator;
import java.util.List;

public class SpotifyMediaBrowserService extends mk implements sdo {
    public sdn h;
    private sdm i;

    public final a a(String str, int i2, Bundle bundle) {
        String str2;
        sdm sdm = this.i;
        boolean z = false;
        Logger.b("onGetRoot clientPackageName=%s", str);
        if (sdm.j) {
            sdm.a();
            sdm.j = false;
        }
        if (!sdm.e.a(str) || !sdm.c.a(sdm.a, str, i2, SpotifyMediaBrowserService.class.getName())) {
            Logger.e("onGetRoot: IGNORING request from untrusted package %s", str);
            hqy hqy = sdm.f;
            a a = new a("AndroidOther").a(str);
            String str3 = "unknown";
            rzt a2 = a.c(str3).b(str3).a();
            hqy.a.a(hqy.a((String) null, a2, LogMessage.SEVERITY_ERROR, (byte[]) null, (String) null));
            Logger.a("LogHelper.logErrorSession integrationType: %s name: %s", a2.a, a2.c);
            return null;
        }
        if (bundle != null && bundle.getBoolean("android.service.media.extra.SUGGESTED", false)) {
            z = true;
        }
        String str4 = "default";
        if (z) {
            str4 = bundle.getString("com.spotify.music.extra.SUGGESTED_TYPE", str4);
        }
        scr scr = sdm.d;
        scr.a.a(str, sdm.b, str4);
        Iterator it = sdm.d.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            scp scp = (scp) it.next();
            if (scp.a(str)) {
                str2 = scn.a(str, scp.a());
                break;
            }
        }
        if (str2 == null) {
            return null;
        }
        gqn gqn = new gqn();
        String str5 = "android.media.browse.SEARCH_SUPPORTED";
        gqn.a.putBoolean(str5, Boolean.TRUE.booleanValue());
        return new a(str2, gqn.b(2).a(1).a);
    }

    public final void a(Token token) {
        if (this.g == null) {
            super.a(token);
        }
    }

    public final void a(String str, Bundle bundle, i<List<MediaItem>> iVar) {
        this.i.a(str, bundle, iVar);
    }

    public final void a(String str, i<List<MediaItem>> iVar) {
        this.i.a(str, iVar);
    }

    public final void b(String str, i<List<MediaItem>> iVar) {
        this.i.a(str, iVar);
    }

    public void onCreate() {
        whp.a((Service) this);
        super.onCreate();
        sdn sdn = this.h;
        sdm sdm = new sdm((Context) sdn.a(sdn.a.get(), 1), (MediaSessionCompat) sdn.a(sdn.b.get(), 2), (vex) sdn.a(sdn.c.get(), 3), (hpy) sdn.a(sdn.d.get(), 4), (scr) sdn.a(sdn.e.get(), 5), (sdr) sdn.a(sdn.f.get(), 6), (scn) sdn.a(sdn.g.get(), 7), (hqy) sdn.a(sdn.h.get(), 8), (sdh) sdn.a(sdn.i.get(), 9), (sdo) sdn.a(this, 10));
        this.i = sdm;
        this.i.a();
    }

    public void onDestroy() {
        this.i.b();
        super.onDestroy();
    }
}
