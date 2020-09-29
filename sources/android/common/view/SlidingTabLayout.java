package android.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.music.R;

public class SlidingTabLayout extends HorizontalScrollView {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    /* access modifiers changed from: private */
    public ViewPager e;
    private a f;
    /* access modifiers changed from: private */
    public final defpackage.a g;

    class a implements e {
        private int a;

        private a() {
        }

        /* synthetic */ a(SlidingTabLayout slidingTabLayout, byte b2) {
            this();
        }

        public final void a(int i, float f, int i2) {
            int childCount = SlidingTabLayout.this.g.getChildCount();
            if (childCount != 0 && i >= 0 && i < childCount) {
                SlidingTabLayout.this.g.a(i, f);
                View childAt = SlidingTabLayout.this.g.getChildAt(i);
                SlidingTabLayout.this.a(i, childAt != null ? (int) (((float) childAt.getWidth()) * f) : 0);
                if (SlidingTabLayout.b(SlidingTabLayout.this) != null) {
                    SlidingTabLayout.b(SlidingTabLayout.this).a(i, f, i2);
                }
            }
        }

        public final void a(int i) {
            this.a = i;
            if (SlidingTabLayout.b(SlidingTabLayout.this) != null) {
                SlidingTabLayout.b(SlidingTabLayout.this).a(i);
            }
        }

        public final void b(int i) {
            if (this.a == 0) {
                SlidingTabLayout.this.g.a(i, 0.0f);
                SlidingTabLayout.this.a(i, 0);
            }
            if (SlidingTabLayout.b(SlidingTabLayout.this) != null) {
                SlidingTabLayout.b(SlidingTabLayout.this).b(i);
            }
        }
    }

    class b implements OnClickListener {
        private b() {
        }

        /* synthetic */ b(SlidingTabLayout slidingTabLayout, byte b) {
            this();
        }

        public final void onClick(View view) {
            for (int i = 0; i < SlidingTabLayout.this.g.getChildCount(); i++) {
                if (view == SlidingTabLayout.this.g.getChildAt(i)) {
                    SlidingTabLayout.this.e.b(i);
                    return;
                }
            }
        }
    }

    public interface c {
        int a(int i);

        int b(int i);
    }

    static /* synthetic */ e b(SlidingTabLayout slidingTabLayout) {
        return null;
    }

    public SlidingTabLayout(Context context) {
        this(context, null);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteDefaultsSlidingTabStyle);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uut.a(SlidingTabLayout.class, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.utr.a.f, i, 0);
        this.a = obtainStyledAttributes.getResourceId(defpackage.utr.a.m, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(defpackage.utr.a.n, 24);
        this.c = obtainStyledAttributes.getDimensionPixelSize(defpackage.utr.a.o, 16);
        this.d = obtainStyledAttributes.getDimensionPixelSize(defpackage.utr.a.p, 24);
        obtainStyledAttributes.recycle();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.g = new defpackage.a(context, attributeSet, i);
        addView(this.g, -1, -2);
    }

    public final void a(ViewPager viewPager) {
        this.g.removeAllViews();
        ViewPager viewPager2 = this.e;
        if (viewPager2 != null) {
            viewPager2.b((e) this.f);
        }
        this.e = viewPager;
        if (viewPager != null) {
            this.f = new a(this, 0);
            viewPager.a((e) this.f);
            sa saVar = (sa) fay.a(this.e.b);
            b bVar = new b(this, 0);
            for (int i = 0; i < saVar.b(); i++) {
                TextView textView = null;
                Context context = getContext();
                TextView textView2 = new TextView(context);
                textView2.setGravity(17);
                int i2 = this.a;
                if (i2 != 0) {
                    uuu.a(context, textView2, i2);
                } else {
                    textView2.setTextSize(2, 12.0f);
                }
                TypedValue typedValue = new TypedValue();
                getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
                textView2.setBackgroundResource(typedValue.resourceId);
                textView2.setAllCaps(true);
                int i3 = this.b;
                int i4 = this.c;
                textView2.setPadding(i3, i4, i3, i4);
                if (TextView.class.isInstance(textView2)) {
                    textView = textView2;
                }
                if (textView != null) {
                    textView.setText(saVar.b(i));
                }
                textView2.setOnClickListener(bVar);
                this.g.addView(textView2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewPager viewPager = this.e;
        if (viewPager != null) {
            a(viewPager.c, 0);
        }
    }

    /* access modifiers changed from: private */
    public void a(int i, int i2) {
        int childCount = this.g.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            View childAt = this.g.getChildAt(i);
            if (childAt != null) {
                int left = childAt.getLeft() + i2;
                if (i > 0 || i2 > 0) {
                    left -= this.d;
                }
                scrollTo(left, 0);
            }
        }
    }
}
