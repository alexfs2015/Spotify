package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: wle reason: default package */
public final class wle implements Runnable {
    private final Context a;
    private final wla b;

    public wle(Context context, wla wla) {
        this.a = context;
        this.b = wla;
    }

    public final void run() {
        try {
            CommonUtils.a(this.a, "Performing time based file roll over.");
            if (!this.b.c()) {
                this.b.d();
            }
        } catch (Exception unused) {
            CommonUtils.b(this.a, "Failed to roll over file");
        }
    }
}
