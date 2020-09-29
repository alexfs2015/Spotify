package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: ain reason: default package */
final class ain {
    final vxx a;
    private final Context b;

    public ain(Context context, vxx vxx) {
        this.b = context;
        this.a = vxx;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, String str2) {
        return b(CommonUtils.c(this.b, str), str2);
    }

    private String b(String str, String str2) {
        return a(str) ? str2 : str;
    }

    private static boolean a(String str) {
        return str == null || str.length() == 0;
    }
}
