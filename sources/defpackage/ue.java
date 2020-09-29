package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.NetworkType;

/* renamed from: ue reason: default package */
public final class ue extends ub<tw> {
    static {
        su.a("NetworkNotRoamingCtrlr");
    }

    public ue(Context context, vp vpVar) {
        super(un.a(context, vpVar).c);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ux uxVar) {
        return uxVar.j.b == NetworkType.NOT_ROAMING;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ boolean b(Object obj) {
        tw twVar = (tw) obj;
        boolean z = false;
        if (VERSION.SDK_INT < 24) {
            su.a();
            if (twVar.a) {
                return false;
            }
            z = true;
        } else if (!twVar.a || !twVar.d) {
            return true;
        }
        return z;
    }
}
