package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: dvm reason: default package */
final class dvm implements dur {
    private final /* synthetic */ View a;
    private final /* synthetic */ dvk b;

    dvm(dvk dvk, View view) {
        this.b = dvk;
        this.a = view;
    }

    public final void a() {
        if (dvk.a(this.b, dvk.a)) {
            this.b.onClick(this.a);
        }
    }

    public final void a(MotionEvent motionEvent) {
        this.b.onTouch(null, motionEvent);
    }
}
