package com.spotify.music.playlist.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.s;

public class SimpleHeaderLayout extends FrameLayout {
    private tvv a;
    /* access modifiers changed from: private */
    public RecyclerView b;

    public SimpleHeaderLayout(Context context) {
        super(context);
    }

    public SimpleHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    static /* synthetic */ int a(SimpleHeaderLayout simpleHeaderLayout) {
        return simpleHeaderLayout.a.a() + simpleHeaderLayout.a.c();
    }

    private View a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return childAt;
            }
        }
        throw new IllegalStateException("Must have a RecyclerView as a child.");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i2 - i4 != i6 - i8) {
            this.b.k();
        }
    }

    static /* synthetic */ void a(SimpleHeaderLayout simpleHeaderLayout, int i) {
        int a2 = simpleHeaderLayout.a.a() + simpleHeaderLayout.a.c();
        float max = 1.0f - Math.max(((float) (i - simpleHeaderLayout.a.c())) / ((float) simpleHeaderLayout.a.a()), 0.0f);
        simpleHeaderLayout.a.a(Math.max(i - a2, simpleHeaderLayout.a.c() - a2), max);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof tvv) {
                this.a = (tvv) childAt;
                this.b = (RecyclerView) a();
                this.b.a((h) new h() {
                    public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
                        super.a(rect, view, recyclerView, sVar);
                        int f = RecyclerView.f(view);
                        if (f != -1 && f == 0) {
                            rect.top = SimpleHeaderLayout.a(SimpleHeaderLayout.this);
                        }
                    }
                });
                this.b.a((m) new m() {
                    public final void a(RecyclerView recyclerView, int i, int i2) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) SimpleHeaderLayout.this.b.d();
                        if (linearLayoutManager != null) {
                            int i3 = 0;
                            if (linearLayoutManager.j() == 0) {
                                int top = recyclerView.getChildAt(0).getTop();
                                if (top >= 0) {
                                    i3 = top;
                                }
                            }
                            SimpleHeaderLayout simpleHeaderLayout = SimpleHeaderLayout.this;
                            SimpleHeaderLayout.a(simpleHeaderLayout, Math.min(i3, SimpleHeaderLayout.a(simpleHeaderLayout)));
                        }
                    }
                });
                this.a.b().addOnLayoutChangeListener(new OnLayoutChangeListener() {
                    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        SimpleHeaderLayout.this.a(view, i, i2, i3, i4, i5, i6, i7, i8);
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Must have a GlueBehavingHeaderWithStickyArea as a child.");
    }
}
