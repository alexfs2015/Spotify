package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import java.util.ArrayList;

/* renamed from: bke reason: default package */
public final class bke extends ViewSwitcher {
    final cnn a;
    final cpb b;
    boolean c = true;

    public bke(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.a = new cnn(context);
        cnn cnn = this.a;
        cnn.c = str;
        cnn.d = str2;
        if (context instanceof Activity) {
            this.b = new cpb((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.b = new cpb(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.b.a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.c();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.d();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.c) {
            this.a.a(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof cti)) {
                arrayList.add((cti) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((cti) obj).destroy();
        }
    }
}
