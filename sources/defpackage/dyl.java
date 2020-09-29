package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@cfp
/* renamed from: dyl reason: default package */
final class dyl {
    final List<dzl> a = new ArrayList();

    dyl() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(dzm dzm) {
        Handler handler = cmu.a;
        for (dzl dzk : this.a) {
            handler.post(new dzk(dzk, dzm));
        }
        this.a.clear();
    }
}
