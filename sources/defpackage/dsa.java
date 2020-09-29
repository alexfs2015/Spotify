package defpackage;

import android.content.Context;
import android.content.Intent;

@cey
/* renamed from: dsa reason: default package */
public final class dsa {
    private final Context a;

    public dsa(Context context) {
        bwx.a(context, (Object) "Context can not be null");
        this.a = context;
    }

    public final boolean a() {
        return ((Boolean) cod.a(this.a, new dsb())).booleanValue() && cab.a(this.a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(Intent intent) {
        bwx.a(intent, (Object) "Intent can not be null");
        return !this.a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
