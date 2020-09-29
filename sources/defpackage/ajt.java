package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: ajt reason: default package */
final class ajt implements ajz {
    private final Context a;
    private final ajz b;
    private boolean c = false;
    private String d;

    public ajt(Context context, ajz ajz) {
        this.a = context;
        this.b = ajz;
    }

    public final String a() {
        if (!this.c) {
            this.d = CommonUtils.l(this.a);
            this.c = true;
        }
        String str = this.d;
        if (str != null) {
            return str;
        }
        ajz ajz = this.b;
        if (ajz != null) {
            return ajz.a();
        }
        return null;
    }
}
