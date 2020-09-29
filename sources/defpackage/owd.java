package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: owd reason: default package */
public final class owd {
    public boolean a;
    boolean b;
    boolean c;
    Bundle d;

    public final void a(List<ofc> list, Bundle bundle) {
        this.c = true;
        this.d = bundle;
        if (this.a) {
            for (ofc a2 : list) {
                a2.a(bundle);
            }
        }
    }

    public final void a(List<ofc> list, a aVar) {
        this.b = true;
        if (this.a && aVar != null) {
            for (ofc a2 : list) {
                a2.a(aVar);
            }
        }
    }
}
