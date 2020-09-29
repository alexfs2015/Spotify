package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: bjh reason: default package */
final class bjh implements OnTouchListener {
    private final /* synthetic */ bjf a;

    bjh(bjf bjf) {
        this.a = bjf;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.a.h != null) {
            this.a.h.a(motionEvent);
        }
        return false;
    }
}
