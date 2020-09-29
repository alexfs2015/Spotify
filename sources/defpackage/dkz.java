package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: dkz reason: default package */
public final class dkz implements dmi {
    private WeakReference<dut> a;

    public dkz(dut dut) {
        this.a = new WeakReference<>(dut);
    }

    public final View a() {
        dut dut = (dut) this.a.get();
        if (dut != null) {
            return dut.l();
        }
        return null;
    }

    public final boolean b() {
        return this.a.get() == null;
    }

    public final dmi c() {
        return new dlb((dut) this.a.get());
    }
}
