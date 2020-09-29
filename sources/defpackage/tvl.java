package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;

/* renamed from: tvl reason: default package */
public final class tvl {
    final Context a;

    public tvl(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: 0000 */
    public fsp a(String str, String str2, String str3, String str4, OnClickListener onClickListener, OnClickListener onClickListener2) {
        fsr a2 = fsy.a(this.a, str, str2);
        a2.e = true;
        return a2.a(str3, onClickListener).b(str4, onClickListener2).a();
    }
}
