package defpackage;

import android.content.Context;
import android.provider.Settings.Global;

/* renamed from: get reason: default package */
final class get {
    private final Context a;
    private gej b;

    get(Context context, gej gej) {
        this.a = context;
        this.b = gej;
    }

    public final int a() {
        try {
            return Global.getInt(this.a.getContentResolver(), "boot_count");
        } catch (Exception e) {
            this.b.a((Throwable) e, "Error in getting boot count.");
            return 0;
        }
    }
}
