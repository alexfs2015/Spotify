package defpackage;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* renamed from: dhl reason: default package */
public final class dhl extends df {
    private WeakReference<dhm> a;

    public dhl(dhm dhm) {
        this.a = new WeakReference<>(dhm);
    }

    public final void a(ComponentName componentName, dd ddVar) {
        dhm dhm = (dhm) this.a.get();
        if (dhm != null) {
            dhm.a(ddVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        dhm dhm = (dhm) this.a.get();
        if (dhm != null) {
            dhm.a();
        }
    }
}
