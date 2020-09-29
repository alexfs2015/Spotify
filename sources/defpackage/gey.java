package defpackage;

import android.util.Log;

/* renamed from: gey reason: default package */
public final class gey implements gfu {
    public /* synthetic */ void a(String str, Object... objArr) {
        CC.$default$a(this, str, objArr);
    }

    public final void a(Throwable th, String str) {
        Log.e("EventSender", str, th);
    }
}
