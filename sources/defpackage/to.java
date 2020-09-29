package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.NetworkType;

/* renamed from: to reason: default package */
public final class to extends tn<ti> {
    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        ti tiVar = (ti) obj;
        boolean z = true;
        if (VERSION.SDK_INT >= 26) {
            if (!tiVar.a || !tiVar.b) {
                return z;
            }
            return false;
        } else if (!tiVar.a) {
            return true;
        } else {
            z = false;
        }
        return z;
    }

    public to(Context context, vb vbVar) {
        super(tz.a(context, vbVar).c);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(uj ujVar) {
        return ujVar.j.b == NetworkType.CONNECTED;
    }
}
