package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

@cey
/* renamed from: bgw reason: default package */
final class bgw extends RelativeLayout {
    boolean a;
    private cmw b;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.a) {
            this.b.a(motionEvent);
        }
        return false;
    }

    public bgw(Context context, String str, String str2) {
        super(context);
        this.b = new cmw(context, str);
        this.b.d = str2;
    }
}
