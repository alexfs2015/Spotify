package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: dus reason: default package */
final class dus implements dua {
    private final /* synthetic */ View a;
    private final /* synthetic */ dur b;

    dus(dur dur, View view) {
        this.b = dur;
        this.a = view;
    }

    public final void a() {
        this.b.onClick(this.a);
    }

    public final void a(MotionEvent motionEvent) {
        this.b.onTouch(null, motionEvent);
    }
}
