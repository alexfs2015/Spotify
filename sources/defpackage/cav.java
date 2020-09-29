package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.a;
import com.google.android.gms.dynamite.DynamiteModule.a.C0006a;
import com.google.android.gms.dynamite.DynamiteModule.a.b;

/* renamed from: cav reason: default package */
public final class cav implements a {
    public final b a(Context context, String str, C0006a aVar) {
        b bVar = new b();
        bVar.a = aVar.a(context, str);
        if (bVar.a != 0) {
            bVar.c = -1;
        } else {
            bVar.b = aVar.a(context, str, true);
            if (bVar.b != 0) {
                bVar.c = 1;
            }
        }
        return bVar;
    }
}
