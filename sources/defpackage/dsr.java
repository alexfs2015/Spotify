package defpackage;

import android.content.Context;
import android.content.Intent;

@cfp
/* renamed from: dsr reason: default package */
public final class dsr {
    private final Context a;

    public dsr(Context context) {
        bxo.a(context, (Object) "Context can not be null");
        this.a = context;
    }

    public final boolean a() {
        return ((Boolean) cou.a(this.a, new dss())).booleanValue() && cas.a(this.a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Intent intent) {
        bxo.a(intent, (Object) "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
