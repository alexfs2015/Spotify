package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import java.util.ArrayList;

/* renamed from: bjn reason: default package */
public final class bjn extends ViewSwitcher {
    final cmw a;
    final cok b;
    boolean c = true;

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
            if (childAt != null && (childAt instanceof csr)) {
                arrayList.add((csr) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((csr) obj).destroy();
        }
    }

    public bjn(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.a = new cmw(context);
        cmw cmw = this.a;
        cmw.c = str;
        cmw.d = str2;
        if (context instanceof Activity) {
            this.b = new cok((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.b = new cok(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.b.a();
    }
}
