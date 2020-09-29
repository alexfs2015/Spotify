package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.NetworkType;

/* renamed from: tp reason: default package */
public final class tp extends tn<ti> {
    /* access modifiers changed from: 0000 */
    public final /* synthetic */ boolean b(Object obj) {
        ti tiVar = (ti) obj;
        boolean z = false;
        if (VERSION.SDK_INT < 26) {
            sg.a();
            if (tiVar.a) {
                return false;
            }
            z = true;
        } else if (!tiVar.a || !tiVar.c) {
            return true;
        }
        return z;
    }

    static {
        sg.a("NetworkMeteredCtrlr");
    }

    public tp(Context context, vb vbVar) {
        super(tz.a(context, vbVar).c);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(uj ujVar) {
        return ujVar.j.b == NetworkType.METERED;
    }
}
