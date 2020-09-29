package defpackage;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* renamed from: dgu reason: default package */
public final class dgu extends df {
    private WeakReference<dgv> a;

    public dgu(dgv dgv) {
        this.a = new WeakReference<>(dgv);
    }

    public final void a(ComponentName componentName, dd ddVar) {
        dgv dgv = (dgv) this.a.get();
        if (dgv != null) {
            dgv.a(ddVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        dgv dgv = (dgv) this.a.get();
        if (dgv != null) {
            dgv.a();
        }
    }
}
