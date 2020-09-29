package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: cmp reason: default package */
final class cmp extends cmq {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ cmn b;

    cmp(cmn cmn, Bundle bundle) {
        this.b = cmn;
        this.a = bundle;
        super(0);
    }

    public final void a() {
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            ((cmr) it.next()).a(this.a);
        }
    }
}
