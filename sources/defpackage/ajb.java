package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: ajb reason: default package */
final class ajb {
    final wmd a;
    private final Context b;

    public ajb(Context context, wmd wmd) {
        this.b = context;
        this.a = wmd;
    }

    private static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    private String b(String str, String str2) {
        return a(str) ? str2 : str;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, String str2) {
        return b(CommonUtils.c(this.b, str), str2);
    }
}
