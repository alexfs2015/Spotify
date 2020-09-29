package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: bse reason: default package */
final class bse extends a<ehs, c> {
    bse() {
    }

    public final /* synthetic */ f a(Context context, Looper looper, bwy bwy, Object obj, b bVar, c cVar) {
        c cVar2 = (c) obj;
        bxo.a(cVar2, (Object) "Setting the API options is required.");
        ehs ehs = new ehs(context, looper, bwy, cVar2.a, (long) cVar2.d, cVar2.b, cVar2.c, bVar, cVar);
        return ehs;
    }
}
