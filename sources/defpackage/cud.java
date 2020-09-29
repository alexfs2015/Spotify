package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@cey
/* renamed from: cud reason: default package */
public final class cud extends MutableContextWrapper {
    Activity a;
    Context b;
    private Context c;

    public cud(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Object getSystemService(String str) {
        return this.b.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.c = context.getApplicationContext();
        this.a = context instanceof Activity ? (Activity) context : null;
        this.b = context;
        super.setBaseContext(this.c);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.c.startActivity(intent);
    }
}
