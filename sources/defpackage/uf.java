package defpackage;

import android.content.Context;
import androidx.work.NetworkType;

/* renamed from: uf reason: default package */
public final class uf extends ub<tw> {
    public uf(Context context, vp vpVar) {
        super(un.a(context, vpVar).c);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ux uxVar) {
        return uxVar.j.b == NetworkType.UNMETERED;
    }

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        tw twVar = (tw) obj;
        return !twVar.a || twVar.c;
    }
}
