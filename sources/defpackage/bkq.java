package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: bkq reason: default package */
final class bkq implements OnTouchListener {
    private final /* synthetic */ bla a;
    private final /* synthetic */ bko b;

    bkq(bko bko, bla bla) {
        this.b = bko;
        this.a = bla;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.a = true;
        if (this.b.b != null) {
            this.b.b.c();
        }
        return false;
    }
}
