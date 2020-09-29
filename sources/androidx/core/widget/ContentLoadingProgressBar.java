package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
    long a;
    boolean b;
    boolean c;
    boolean d;
    private final Runnable e;
    private final Runnable f;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = -1;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = new Runnable() {
            public final void run() {
                ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
                contentLoadingProgressBar.b = false;
                contentLoadingProgressBar.a = -1;
                contentLoadingProgressBar.setVisibility(8);
            }
        };
        this.f = new Runnable() {
            public final void run() {
                ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
                contentLoadingProgressBar.c = false;
                contentLoadingProgressBar.a = System.currentTimeMillis();
                ContentLoadingProgressBar.this.setVisibility(0);
            }
        };
    }

    private void a() {
        removeCallbacks(this.e);
        removeCallbacks(this.f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }
}
