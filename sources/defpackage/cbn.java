package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.a;
import com.google.android.gms.dynamite.DynamiteModule.a.C0006a;
import com.google.android.gms.dynamite.DynamiteModule.a.b;

/* renamed from: cbn reason: default package */
public final class cbn implements a {
    public final b a(Context context, String str, C0006a aVar) {
        b bVar = new b();
        bVar.a = aVar.a(context, str);
        bVar.b = aVar.a(context, str, true);
        if (bVar.a == 0 && bVar.b == 0) {
            bVar.c = 0;
        } else if (bVar.a >= bVar.b) {
            bVar.c = -1;
        } else {
            bVar.c = 1;
        }
        return bVar;
    }
}
