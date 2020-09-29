package defpackage;

import android.content.Intent;

/* renamed from: agv reason: default package */
public class agv {
    protected String a;

    public static void a(Intent intent) {
        String str = agu.a().b;
        if (str != null) {
            agu.a().a.sendBroadcast(intent, str);
        } else {
            agu.a().a.sendBroadcast(intent);
        }
    }

    public final void b(String str) {
        this.a = str;
    }
}
