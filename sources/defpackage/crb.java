package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;

@cfp
/* renamed from: crb reason: default package */
public final class crb {
    public static void a(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
        new crc(view, onGlobalLayoutListener).a();
    }

    public static void a(View view, OnScrollChangedListener onScrollChangedListener) {
        new crd(view, onScrollChangedListener).a();
    }
}
