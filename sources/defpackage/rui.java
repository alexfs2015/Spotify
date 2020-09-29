package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: rui reason: default package */
public final class rui extends ruk {
    public rui(Context context, rvn rvn, rwe rwe) {
        fbp.a(context);
        a(new rum(context, rvn, "release", ""));
        a(new rvb());
        a(new ruz());
        a(new rvm());
        a(rwe);
        a(new rvc());
        a(new rve((ActivityManager) context.getSystemService("activity")));
    }
}
