package com.spotify.android.stories.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Space;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

public class StoriesProgressView extends LinearLayout {
    public int a;
    public a b;
    private final List<PausableProgressBar> c;
    private int d;
    private int e;
    private int f;
    private int g;

    public interface a {
        void onStoryProgressComplete(int i);
    }

    public StoriesProgressView(Context context) {
        this(context, null);
    }

    public StoriesProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new ArrayList();
        this.d = 5;
        this.a = -1;
        this.g = -1;
        a(attributeSet);
    }

    public StoriesProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ArrayList();
        this.d = 5;
        this.a = -1;
        this.g = -1;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        setOrientation(0);
        b(attributeSet);
        this.d = getResources().getDimensionPixelSize(R.dimen.progress_bar_space);
        a();
    }

    private void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.unw.a.a);
        try {
            this.a = obtainStyledAttributes.getInt(defpackage.unw.a.d, 0);
            this.e = a(obtainStyledAttributes, defpackage.unw.a.c, R.color.default_progress_color);
            this.f = a(obtainStyledAttributes, defpackage.unw.a.b, R.color.default_background_progress_color);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private int a(TypedArray typedArray, int i, int i2) {
        return typedArray.getColor(i, gb.b(getResources(), i2, getContext().getTheme()));
    }

    public void a() {
        this.c.clear();
        removeAllViews();
        int i = 0;
        while (i < this.a) {
            PausableProgressBar d2 = d();
            this.c.add(d2);
            addView(d2);
            i++;
            if (i < this.a) {
                addView(e());
            }
        }
    }

    private PausableProgressBar d() {
        PausableProgressBar pausableProgressBar = new PausableProgressBar(getContext());
        pausableProgressBar.setLayoutParams(new LayoutParams(0, -2, 1.0f));
        pausableProgressBar.a(this.f);
        pausableProgressBar.b(this.e);
        return pausableProgressBar;
    }

    private View e() {
        Space space = new Space(getContext());
        space.setLayoutParams(new LayoutParams(this.d, 1));
        return space;
    }

    public final void a(int i, boolean z) {
        for (int i2 = 0; i2 < this.a; i2++) {
            PausableProgressBar pausableProgressBar = (PausableProgressBar) this.c.get(i2);
            if (i2 < i) {
                pausableProgressBar.a();
                pausableProgressBar.a.setVisibility(4);
                pausableProgressBar.b.setVisibility(0);
            } else if (i2 != i || !z) {
                pausableProgressBar.a();
                pausableProgressBar.a.setVisibility(4);
                pausableProgressBar.b.setVisibility(8);
            } else {
                b bVar = new b(0.0f, 1.0f, 1.0f, 1.0f, 0, 0.0f, 1, 0.0f);
                pausableProgressBar.c = bVar;
                pausableProgressBar.c.setDuration(pausableProgressBar.d);
                pausableProgressBar.c.setInterpolator(new LinearInterpolator());
                pausableProgressBar.c.setAnimationListener(new jxf() {
                    public final void onAnimationStart(Animation animation) {
                        PausableProgressBar.this.b.setVisibility(8);
                        PausableProgressBar.this.a.setVisibility(0);
                    }

                    public final void onAnimationEnd(Animation animation) {
                        if (PausableProgressBar.this.e != null) {
                            PausableProgressBar.this.e.onFinishProgress();
                        }
                    }
                });
                pausableProgressBar.c.setFillAfter(true);
                pausableProgressBar.a.startAnimation(pausableProgressBar.c);
            }
        }
        this.g = i;
    }

    public final void a(long j) {
        for (int i = 0; i < this.c.size(); i++) {
            ((PausableProgressBar) this.c.get(i)).d = 6000;
            ((PausableProgressBar) this.c.get(i)).e = new a(i) {
                private final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onFinishProgress() {
                    StoriesProgressView.this.a(this.f$1);
                }
            };
        }
    }

    public final void a(long[] jArr) {
        this.a = jArr.length;
        a();
        for (int i = 0; i < this.c.size(); i++) {
            ((PausableProgressBar) this.c.get(i)).d = jArr[i];
            ((PausableProgressBar) this.c.get(i)).e = new a(i) {
                private final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onFinishProgress() {
                    StoriesProgressView.this.a(this.f$1);
                }
            };
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.onStoryProgressComplete(i);
        }
    }

    public final void b() {
        int i = this.g;
        if (i >= 0) {
            PausableProgressBar pausableProgressBar = (PausableProgressBar) this.c.get(i);
            if (pausableProgressBar.c != null) {
                b bVar = pausableProgressBar.c;
                if (!bVar.b) {
                    bVar.a = 0;
                    bVar.b = true;
                }
            }
        }
    }

    public final void c() {
        int i = this.g;
        if (i >= 0) {
            PausableProgressBar pausableProgressBar = (PausableProgressBar) this.c.get(i);
            if (pausableProgressBar.c != null) {
                pausableProgressBar.c.b = false;
            }
        }
    }
}
