package defpackage;

import android.content.Context;
import androidx.work.NetworkType;

/* renamed from: tr reason: default package */
public final class tr extends tn<ti> {
    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        ti tiVar = (ti) obj;
        return !tiVar.a || tiVar.c;
    }

    public tr(Context context, vb vbVar) {
        super(tz.a(context, vbVar).c);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(uj ujVar) {
        return ujVar.j.b == NetworkType.UNMETERED;
    }
}
