package defpackage;

import android.util.Log;

/* renamed from: gdn reason: default package */
public final class gdn implements gej {
    public /* synthetic */ void a(String str, Object... objArr) {
        CC.$default$a(this, str, objArr);
    }

    public final void a(Throwable th, String str) {
        Log.e("EventSender", str, th);
    }
}
