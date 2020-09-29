package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: bjy reason: default package */
final class bjy implements OnTouchListener {
    private final /* synthetic */ bjw a;

    bjy(bjw bjw) {
        this.a = bjw;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.a.h != null) {
            this.a.h.a(motionEvent);
        }
        return false;
    }
}
