package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.a;
import com.google.android.gms.dynamite.DynamiteModule.a.C0006a;
import com.google.android.gms.dynamite.DynamiteModule.a.b;

/* renamed from: cau reason: default package */
public final class cau implements a {
    public final b a(Context context, String str, C0006a aVar) {
        b bVar = new b();
        bVar.b = aVar.a(context, str, true);
        if (bVar.b != 0) {
            bVar.c = 1;
        } else {
            bVar.a = aVar.a(context, str);
            if (bVar.a != 0) {
                bVar.c = -1;
            }
        }
        return bVar;
    }
}
