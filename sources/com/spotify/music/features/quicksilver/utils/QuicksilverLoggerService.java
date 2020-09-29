package com.spotify.music.features.quicksilver.utils;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import java.io.IOException;

public class QuicksilverLoggerService extends fn {
    public giz b;
    public jlr c;

    public static void a(Context context, String str, String str2) {
        Class<QuicksilverLoggerService> cls = QuicksilverLoggerService.class;
        Intent intent = new Intent(context, cls);
        intent.setData(Uri.parse(str));
        if (str2 != null) {
            intent.putExtra("error_log_type", str2);
        }
        a(context, (Class) cls, 1982391, intent);
    }

    public final void a(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            Logger.a("No target defined.", new Object[0]);
            return;
        }
        xaj a = new a().a(data.toString()).a(Request.GET, (xak) null).a();
        try {
            xah xah = this.b.b;
            String stringExtra = intent.getStringExtra("error_log_type");
            xal b2 = xai.a(xah, a, false).b();
            Logger.a("QuicksilverLoggerService - Status: %s", b2.c == 200 ? "OK" : "NOT OK");
            if (!(b2.c == 200 || stringExtra == null)) {
                jlr jlr = this.c;
                ab abVar = new ab(stringExtra, a.a.toString(), (long) b2.c, b2.d, "");
                jlr.a(abVar);
            }
            if (b2.g != null) {
                b2.g.close();
            }
        } catch (IOException unused) {
            Logger.a("Logging dynamic upsell failed", new Object[0]);
        }
    }

    public void onCreate() {
        whp.a((Service) this);
        super.onCreate();
    }
}
