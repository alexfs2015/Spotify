package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: brn reason: default package */
final class brn extends a<ehb, c> {
    brn() {
    }

    public final /* synthetic */ f a(Context context, Looper looper, bwh bwh, Object obj, b bVar, c cVar) {
        c cVar2 = (c) obj;
        bwx.a(cVar2, (Object) "Setting the API options is required.");
        ehb ehb = new ehb(context, looper, bwh, cVar2.a, (long) cVar2.d, cVar2.b, cVar2.c, bVar, cVar);
        return ehb;
    }
}
