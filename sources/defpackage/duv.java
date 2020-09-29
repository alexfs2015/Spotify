package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: duv reason: default package */
final class duv implements dua {
    private final /* synthetic */ View a;
    private final /* synthetic */ dut b;

    duv(dut dut, View view) {
        this.b = dut;
        this.a = view;
    }

    public final void a() {
        if (dut.a(this.b, dut.a)) {
            this.b.onClick(this.a);
        }
    }

    public final void a(MotionEvent motionEvent) {
        this.b.onTouch(null, motionEvent);
    }
}
