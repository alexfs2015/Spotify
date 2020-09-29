package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: dvj reason: default package */
final class dvj implements dur {
    private final /* synthetic */ View a;
    private final /* synthetic */ dvi b;

    dvj(dvi dvi, View view) {
        this.b = dvi;
        this.a = view;
    }

    public final void a() {
        this.b.onClick(this.a);
    }

    public final void a(MotionEvent motionEvent) {
        this.b.onTouch(null, motionEvent);
    }
}
