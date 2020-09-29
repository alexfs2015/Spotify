package com.spotify.music.libs.mediabrowserservice;

import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.RootListType;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.Iterator;
import java.util.List;

public class SpotifyMediaBrowserService extends mf implements ruc {
    public rub h;
    private rua i;

    public void onCreate() {
        vtj.a((Service) this);
        super.onCreate();
        rub rub = this.h;
        rua rua = new rua((Context) rub.a(rub.a.get(), 1), (MediaSessionCompat) rub.a(rub.b.get(), 2), (ruk) rub.a(rub.c.get(), 3), (hnj) rub.a(rub.d.get(), 4), (rtk) rub.a(rub.e.get(), 5), (rue) rub.a(rub.f.get(), 6), (rtg) rub.a(rub.g.get(), 7), (hou) rub.a(rub.h.get(), 8), (rtw) rub.a(rub.i.get(), 9), (ruc) rub.a(this, 10));
        this.i = rua;
        this.i.a();
    }

    public void onDestroy() {
        this.i.b();
        super.onDestroy();
    }

    public final a a(String str, int i2, Bundle bundle) {
        String str2;
        String str3;
        rua rua = this.i;
        boolean z = false;
        Logger.b("onGetRoot clientPackageName=%s", str);
        if (rua.j) {
            rua.a();
            rua.j = false;
        }
        if (!rua.e.a(str) || !rua.c.a(rua.a, str, i2, SpotifyMediaBrowserService.class.getName())) {
            Logger.e("onGetRoot: IGNORING request from untrusted package %s", str);
            hou hou = rua.f;
            a a = new a("AndroidOther").a(str);
            String str4 = "unknown";
            rqi a2 = a.c(str4).b(str4).a();
            hou.a.a(hou.a((String) null, a2, LogMessage.SEVERITY_ERROR, (byte[]) null, (String) null));
            Logger.a("LogHelper.logErrorSession integrationType: %s name: %s", a2.a, a2.c);
            return null;
        }
        if (bundle != null && bundle.getBoolean("android.service.media.extra.SUGGESTED", false)) {
            z = true;
        }
        if (z) {
            str2 = bundle.getString("com.spotify.music.extra.SUGGESTED_TYPE", null);
        } else {
            str2 = null;
        }
        rtk rtk = rua.d;
        rtk.a.a(str, rua.b, RootListType.forValue(str2));
        Iterator it = rua.d.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            rti rti = (rti) it.next();
            if (rti.a(str)) {
                str3 = rtg.a(str, rti.a());
                break;
            }
        }
        if (str3 == null) {
            return null;
        }
        gox gox = new gox();
        String str5 = "android.media.browse.SEARCH_SUPPORTED";
        gox.a.putBoolean(str5, Boolean.TRUE.booleanValue());
        return new a(str3, gox.b(2).a(1).a);
    }

    public final void a(String str, i<List<MediaItem>> iVar) {
        this.i.a(str, iVar);
    }

    public final void b(String str, i<List<MediaItem>> iVar) {
        this.i.a(str, iVar);
    }

    public final void a(String str, Bundle bundle, i<List<MediaItem>> iVar) {
        this.i.a(str, bundle, iVar);
    }

    public final void a(Token token) {
        if (this.g == null) {
            super.a(token);
        }
    }
}
