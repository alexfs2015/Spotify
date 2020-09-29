package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: bjz reason: default package */
final class bjz implements OnTouchListener {
    private final /* synthetic */ bkj a;
    private final /* synthetic */ bjx b;

    bjz(bjx bjx, bkj bkj) {
        this.b = bjx;
        this.a = bkj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.a = true;
        if (this.b.b != null) {
            this.b.b.c();
        }
        return false;
    }
}
