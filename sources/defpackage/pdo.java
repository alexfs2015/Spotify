package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: pdo reason: default package */
public final class pdo {
    public boolean a;
    boolean b;
    boolean c;
    Bundle d;

    public final void a(List<omg> list, Bundle bundle) {
        this.c = true;
        this.d = bundle;
        if (this.a) {
            for (omg a2 : list) {
                a2.a(bundle);
            }
        }
    }

    public final void a(List<omg> list, a aVar) {
        this.b = true;
        if (this.a && aVar != null) {
            for (omg a2 : list) {
                a2.a(aVar);
            }
        }
    }
}
