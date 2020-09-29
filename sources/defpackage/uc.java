package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.NetworkType;

/* renamed from: uc reason: default package */
public final class uc extends ub<tw> {
    public uc(Context context, vp vpVar) {
        super(un.a(context, vpVar).c);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ux uxVar) {
        return uxVar.j.b == NetworkType.CONNECTED;
    }

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        tw twVar = (tw) obj;
        boolean z = true;
        if (VERSION.SDK_INT >= 26) {
            if (!twVar.a || !twVar.b) {
                return z;
            }
            return false;
        } else if (!twVar.a) {
            return true;
        } else {
            z = false;
        }
        return z;
    }
}
