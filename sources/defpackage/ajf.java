package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: ajf reason: default package */
final class ajf implements ajl {
    private final Context a;
    private final ajl b;
    private boolean c = false;
    private String d;

    public ajf(Context context, ajl ajl) {
        this.a = context;
        this.b = ajl;
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
        ajl ajl = this.b;
        if (ajl != null) {
            return ajl.a();
        }
        return null;
    }
}
