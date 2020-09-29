package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: vwy reason: default package */
public final class vwy implements Runnable {
    private final Context a;
    private final vwu b;

    public vwy(Context context, vwu vwu) {
        this.a = context;
        this.b = vwu;
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
