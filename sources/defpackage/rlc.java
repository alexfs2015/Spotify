package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: rlc reason: default package */
public final class rlc extends rle {
    public rlc(Context context, rmh rmh, rmy rmy) {
        fay.a(context);
        a(new rlg(context, rmh, "release", ""));
        a(new rlv());
        a(new rlt());
        a(new rmg());
        a(rmy);
        a(new rlw());
        a(new rly((ActivityManager) context.getSystemService("activity")));
    }
}
