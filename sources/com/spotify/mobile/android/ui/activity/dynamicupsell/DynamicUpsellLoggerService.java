package com.spotify.mobile.android.ui.activity.dynamicupsell;

import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import java.io.IOException;

public class DynamicUpsellLoggerService extends whu {
    public giz a;

    public DynamicUpsellLoggerService() {
        super("DynamicUpsellLoggerService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String str;
        if (intent == null) {
            String str2 = "lNsss.nsvd ia ptucint troeee e";
            Logger.a("Null intent passed to service.", new Object[0]);
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            Logger.a("No target defined.", new Object[0]);
            return;
        }
        try {
            xal b = this.a.b.a(new a().a(data.toString()).a(Request.GET, (xak) null).a()).b();
            if (b.c == 200) {
                String str3 = "KO";
                str = "OK";
            } else {
                String str4 = " OKmTO";
                str = "NOT OK";
            }
            String str5 = "sDSmon sc :ts  at%aiply-leU";
            Logger.a("Dynamic Upsell - Status: %s", str);
            if (b.g != null) {
                b.g.close();
            }
        } catch (IOException unused) {
            String str6 = "s idyblpuicmdal aifLg nnoeleg";
            Logger.a("Logging dynamic upsell failed", new Object[0]);
        }
    }
}
