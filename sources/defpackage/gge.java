package defpackage;

import android.content.Context;
import android.provider.Settings.Global;

/* renamed from: gge reason: default package */
final class gge {
    private final Context a;
    private gfu b;

    gge(Context context, gfu gfu) {
        this.a = context;
        this.b = gfu;
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
