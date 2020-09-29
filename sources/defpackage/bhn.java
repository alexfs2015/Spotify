package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

@cfp
/* renamed from: bhn reason: default package */
final class bhn extends RelativeLayout {
    boolean a;
    private cnn b;

    public bhn(Context context, String str, String str2) {
        super(context);
        this.b = new cnn(context, str);
        this.b.d = str2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.a) {
            this.b.a(motionEvent);
        }
        return false;
    }
}
