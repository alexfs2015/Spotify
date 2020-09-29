package com.spotify.mobile.android.ui.activity.dynamicupsell;

import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import java.io.IOException;

public class DynamicUpsellLoggerService extends vto {
    public gho a;

    public DynamicUpsellLoggerService() {
        super("DynamicUpsellLoggerService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            Logger.a("Null intent passed to service.", new Object[0]);
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            Logger.a("No target defined.", new Object[0]);
            return;
        }
        try {
            wmf b = this.a.b.a(new a().a(data.toString()).a(Request.GET, (wme) null).a()).b();
            Logger.a("Dynamic Upsell - Status: %s", b.c == 200 ? "OK" : "NOT OK");
            if (b.g != null) {
                b.g.close();
            }
        } catch (IOException unused) {
            Logger.a("Logging dynamic upsell failed", new Object[0]);
        }
    }
}
