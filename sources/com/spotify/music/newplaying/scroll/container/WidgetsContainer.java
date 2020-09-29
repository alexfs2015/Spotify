package com.spotify.music.newplaying.scroll.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.spotify.music.R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.Flowable;
import io.reactivex.functions.Predicate;

public class WidgetsContainer extends LinearLayout implements tcn {
    private Flowable<tck> a;
    private int b;

    public WidgetsContainer(Context context) {
        this(context, null);
    }

    public WidgetsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetsContainer(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, 2132017729), attributeSet, i);
        setOrientation(1);
        setVisibility(8);
        this.b = getResources().getDimensionPixelSize(R.dimen.widgets_vertical_margin);
        this.a = new tcl(this).a().a(1).c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(float f, tck tck) {
        return tck.c() >= f;
    }

    private void b() {
        if (getChildCount() > 0) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }

    public final Flowable<tck> a(float f) {
        return this.a.a((Predicate<? super T>) new Predicate(1.0f) {
            private final /* synthetic */ float f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return WidgetsContainer.a(this.f$0, (tck) obj);
            }
        });
    }

    public final void a() {
        removeAllViews();
        b();
    }

    public final void a(int i) {
        removeViewAt(i);
        b();
    }

    public final void a(NowPlayingWidget nowPlayingWidget, int i) {
        View a2 = nowPlayingWidget.a(LayoutInflater.from(getContext()), this);
        a2.setTag(nowPlayingWidget.a());
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) a2.getLayoutParams();
        marginLayoutParams.bottomMargin = this.b;
        addView(a2, i, marginLayoutParams);
        b();
    }
}
