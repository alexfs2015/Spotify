package defpackage;

import android.content.Intent;

/* renamed from: agh reason: default package */
public class agh {
    protected String a;

    public static void a(Intent intent) {
        String str = agg.a().b;
        if (str != null) {
            agg.a().a.sendBroadcast(intent, str);
        } else {
            agg.a().a.sendBroadcast(intent);
        }
    }

    public final void c(String str) {
        this.a = str;
    }
}
