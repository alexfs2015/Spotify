package com.spotify.music.newplaying.scroll.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

public class TouchBlockingFrameLayout extends FrameLayout {
    private boolean a;

    public TouchBlockingFrameLayout(Context context) {
        this(context, null);
    }

    public TouchBlockingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchBlockingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TouchBlockingFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(xfm xfm) {
        this.a = true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.a = false;
    }

    public final Flowable<Object> a() {
        return fom.a(this).a(BackpressureStrategy.DROP).b((Consumer<? super xfm>) new Consumer() {
            public final void accept(Object obj) {
                TouchBlockingFrameLayout.this.a((xfm) obj);
            }
        }).a(Functions.b(), Functions.d, (Action) new Action() {
            public final void run() {
                TouchBlockingFrameLayout.this.b();
            }
        });
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}