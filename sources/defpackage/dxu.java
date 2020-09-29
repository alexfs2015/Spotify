package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@cey
/* renamed from: dxu reason: default package */
final class dxu {
    final List<dyu> a = new ArrayList();

    dxu() {
    }

    /* access modifiers changed from: 0000 */
    public final void a(dyv dyv) {
        Handler handler = cmd.a;
        for (dyu dyt : this.a) {
            handler.post(new dyt(dyt, dyv));
        }
        this.a.clear();
    }
}
