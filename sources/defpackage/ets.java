package defpackage;

import android.content.Context;

/* renamed from: ets reason: default package */
public final class ets {
    final Context a;
    String b;
    String c;
    String d;
    boolean e = true;
    Boolean f;
    eri g;

    public ets(Context context, eri eri) {
        bxo.a(context);
        Context applicationContext = context.getApplicationContext();
        bxo.a(applicationContext);
        this.a = applicationContext;
        if (eri != null) {
            this.g = eri;
            this.b = eri.f;
            this.c = eri.e;
            this.d = eri.d;
            this.e = eri.c;
            if (eri.g != null) {
                this.f = Boolean.valueOf(eri.g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
