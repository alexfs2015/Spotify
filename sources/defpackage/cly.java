package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: cly reason: default package */
final class cly extends clz {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ clw b;

    cly(clw clw, Bundle bundle) {
        this.b = clw;
        this.a = bundle;
        super(0);
    }

    public final void a() {
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            ((cma) it.next()).a(this.a);
        }
    }
}
