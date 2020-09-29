package com.spotify.music.features.yourlibrary.container.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.viewpager.widget.ViewPager;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.spotify.music.R;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import java.lang.ref.WeakReference;

public class GroupedTabLayout extends LinearLayout implements com.spotify.music.features.yourlibrary.container.view.ListenableScrollingViewBehavior.a {
    public ViewPager a;
    public androidx.viewpager.widget.ViewPager.e b;
    public androidx.viewpager.widget.ViewPager.d c;
    public qzz d;
    public rap e;
    /* access modifiers changed from: private */
    public rax f;
    private final HorizontalScrollView g;
    private final HorizontalScrollView h;
    private final FrameLayout i;
    private final d j;
    private final c k;
    private final c l;
    /* access modifiers changed from: private */
    public final boolean m;
    private View n;
    private int o;

    public class a implements androidx.viewpager.widget.ViewPager.d {
        private a() {
        }

        public /* synthetic */ a(GroupedTabLayout groupedTabLayout, byte b) {
            this();
        }

        public final void a(ViewPager viewPager, sf sfVar, sf sfVar2) {
            if (GroupedTabLayout.this.a == viewPager) {
                GroupedTabLayout.this.a(sfVar2);
            }
        }
    }

    public class b implements androidx.viewpager.widget.ViewPager.e {
        private final WeakReference<GroupedTabLayout> a;
        private int b;
        private boolean c;

        public b(GroupedTabLayout groupedTabLayout) {
            this.a = new WeakReference<>(groupedTabLayout);
            this.b = GroupedTabLayout.this.a.c;
        }

        public final void a(int i) {
        }

        public final void a(int i, float f, int i2) {
            int a2 = GroupedTabLayout.this.a(i, GroupedTabLayout.this.f.b.size());
            if (f > 0.0f && GroupedTabLayout.this.m) {
                a2--;
                f = 1.0f - f;
            }
            GroupedTabLayout groupedTabLayout = (GroupedTabLayout) this.a.get();
            if (groupedTabLayout != null) {
                GroupedTabLayout.a(groupedTabLayout, a2, f, this.b, this.c);
                this.c = this.c && (a2 != this.b || f > 0.0f);
            }
        }

        public final void b(int i) {
            int a2 = GroupedTabLayout.this.a(i, GroupedTabLayout.this.f.b.size());
            this.c = GroupedTabLayout.this.a(this.b) != GroupedTabLayout.this.a(a2);
            this.b = a2;
        }
    }

    static class c extends LinearLayout {
        public c(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    static class d extends FrameLayout {
        int a;

        d(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            ViewGroup viewGroup = (ViewGroup) getChildAt(0);
            if (viewGroup.getChildCount() > 0) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(this.a, 1073741824), MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), 1073741824));
                return;
            }
            super.onMeasure(i, i2);
        }
    }

    static class e extends LinearLayout {
        int a;
        private final int b;
        private final Paint c = new Paint();
        private int d;
        private int e;
        private float f;

        e(Context context) {
            super(context);
            setWillNotDraw(false);
            int color = getResources().getColor(R.color.green);
            this.c.setColor(color);
            this.b = getResources().getDimensionPixelSize(R.dimen.bottom_tabs_highlight_height);
            setGravity(8388611);
        }

        public final void a(int i, float f2) {
            this.e = i;
            this.f = f2;
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            View childAt = getChildAt(this.e);
            View childAt2 = getChildAt(Math.min(this.e + 1, getChildCount() - 1));
            int width = childAt.findViewById(R.id.bottom_tab_view_label).getWidth();
            this.d = width + Math.round(this.f * ((float) (childAt2.findViewById(R.id.bottom_tab_view_label).getWidth() - width)));
            int left = childAt.getLeft() + (childAt.getWidth() / 2);
            int round = left + Math.round(((float) ((childAt2.getLeft() + (childAt2.getWidth() / 2)) - left)) * this.f);
            int i = this.d;
            int i2 = round - (i / 2);
            int i3 = i + i2;
            int bottom = childAt.getBottom();
            canvas.drawRect(new Rect(i2, bottom - this.b, i3, bottom), this.c);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            measureChildren(makeMeasureSpec, makeMeasureSpec);
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                i3 += getChildAt(i4).getMeasuredWidth();
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(Math.max(this.a, i3), 1073741824), i2);
        }
    }

    public GroupedTabLayout(Context context) {
        this(context, null);
    }

    public GroupedTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupedTabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = vgi.a(context);
        setOrientation(1);
        this.i = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.top_tab_scroll, this, false);
        this.h = (HorizontalScrollView) this.i.findViewById(R.id.top_scroll);
        this.k = new c(context);
        this.h.addView(this.k);
        addView(this.i);
        this.g = (HorizontalScrollView) LayoutInflater.from(context).inflate(R.layout.bottom_tab_scroll, this, false);
        this.g.setHorizontalScrollBarEnabled(false);
        this.l = new c(context);
        this.j = new d(context);
        this.j.addView(this.l, new LayoutParams(-2, -2));
        this.g.addView(this.j, new FrameLayout.LayoutParams(100, -2));
        addView(this.g, new LayoutParams(-1, -2));
    }

    private float a(int i2, int i3, float f2) {
        if (i2 == i3 && f2 > 0.0f) {
            return this.m ? f2 : 1.0f - f2;
        }
        float f3 = (((float) i2) + f2) / ((float) i3);
        return this.m ? 1.0f - f3 : f3;
    }

    /* access modifiers changed from: private */
    public int a(int i2) {
        int size = this.f.a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += this.f.e(i4);
            if (i3 > i2) {
                return i4;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public int a(int i2, int i3) {
        return this.m ? (i3 - i2) - 1 : i2;
    }

    private void a() {
        this.k.removeAllViews();
        this.l.removeAllViews();
        if (this.f != null) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.f.a.size()) {
                YourLibraryTabView a2 = YourLibraryTabView.a(getContext(), (CharSequence) this.f.d.get(i2), this.k, false);
                a2.setOnClickListener(new OnClickListener(i2, a(i3, this.f.b.size())) {
                    private final /* synthetic */ int f$1;
                    private final /* synthetic */ int f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void onClick(View view) {
                        GroupedTabLayout.this.a(this.f$1, this.f$2, view);
                    }
                });
                this.k.addView(a2);
                e eVar = new e(getContext());
                int e2 = this.f.e(i2);
                int i4 = i3;
                int i5 = 0;
                while (i5 < e2) {
                    int a3 = a(i4, this.f.b.size());
                    YourLibraryTabView b2 = YourLibraryTabView.b(getContext(), this.f.b(a3), this.l, false);
                    b2.setOnClickListener(new OnClickListener(i2, a3, i5) {
                        private final /* synthetic */ int f$1;
                        private final /* synthetic */ int f$2;
                        private final /* synthetic */ int f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void onClick(View view) {
                            GroupedTabLayout.this.a(this.f$1, this.f$2, this.f$3, view);
                        }
                    });
                    eVar.addView(b2);
                    i5++;
                    i4++;
                }
                this.l.addView(eVar, new LayoutParams(-1, -2));
                i2++;
                i3 = i4;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, float f2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.l.getLayoutParams();
        float d2 = ((float) d(i2)) * f2;
        if (this.l.getMeasuredWidth() == 0) {
            this.l.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0), MeasureSpec.makeMeasureSpec(0, 0));
        }
        View childAt = this.l.getChildAt(i2);
        float f3 = -(d2 + ((float) (this.m ? this.l.getMeasuredWidth() - childAt.getRight() : childAt.getLeft())));
        if (this.m) {
            marginLayoutParams.rightMargin = Math.round(f3);
        } else {
            marginLayoutParams.leftMargin = Math.round(f3);
        }
        this.l.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, int i3, int i4, View view) {
        if (this.e != null) {
            rax rax = this.f;
            Optional c2 = rax.c(rax.d(i3));
            String str = (String) c2.a((Function<? super T, V>) $$Lambda$GroupedTabLayout$Va7vaGzYE4p6hnJPWsX_q4epmM.INSTANCE).d();
            InteractionLogger interactionLogger = this.e.a;
            StringBuilder sb = new StringBuilder("tab-navigation-");
            sb.append(i2);
            interactionLogger.a(str, sb.toString(), i4, InteractionType.HIT, "tab-selected");
        }
        qzz qzz = this.d;
        if (qzz == null) {
            this.a.b(i3);
        } else {
            qzz.a(this.f.d(i3), true);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, int i3, View view) {
        if (this.e != null) {
            rax rax = this.f;
            Optional c2 = rax.c(rax.d(i3));
            String str = (String) c2.a((Function<? super T, V>) $$Lambda$GroupedTabLayout$p2x9JW4X2NSBb2tz2gYNxS__rg.INSTANCE).d();
            String str2 = "group-navigation";
            int i4 = i2;
            this.e.a.a(str, str2, i4, InteractionType.HIT, "group-selected");
        }
        qzz qzz = this.d;
        if (qzz == null) {
            this.a.b(i3);
        } else {
            qzz.a(this.f.d(i3), true);
        }
    }

    private static void a(ViewGroup viewGroup, int i2, float f2) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            YourLibraryTabView yourLibraryTabView = (YourLibraryTabView) viewGroup.getChildAt(i3);
            if (i3 == i2) {
                yourLibraryTabView.a(1.0f - f2);
            } else if (i3 == i2 + 1) {
                yourLibraryTabView.a(f2);
            } else {
                yourLibraryTabView.a(0.0f);
            }
        }
    }

    private void a(HorizontalScrollView horizontalScrollView, int i2, int i3, int i4, float f2) {
        if (i2 > 0) {
            horizontalScrollView.scrollTo(Math.round(((float) i2) * a(i3, i4, f2)), 0);
        }
    }

    static /* synthetic */ void a(GroupedTabLayout groupedTabLayout, int i2, float f2, int i3, boolean z) {
        int b2 = groupedTabLayout.b(i2);
        int a2 = groupedTabLayout.a(i2);
        int childCount = groupedTabLayout.c(a2).getChildCount() - 1;
        float f3 = b2 == childCount ? f2 : 0.0f;
        a((ViewGroup) groupedTabLayout.k, a2, f3);
        int d2 = groupedTabLayout.d(a2);
        if (f3 == 0.0f) {
            groupedTabLayout.j.a = d2;
        } else {
            groupedTabLayout.j.a = d2 + Math.round(((float) (groupedTabLayout.d(a2 + 1) - d2)) * f3);
        }
        groupedTabLayout.l.post(new Runnable(a2, f3) {
            private final /* synthetic */ int f$1;
            private final /* synthetic */ float f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                GroupedTabLayout.this.a(this.f$1, this.f$2);
            }
        });
        groupedTabLayout.a(groupedTabLayout.h, groupedTabLayout.k.getMeasuredWidth() - groupedTabLayout.o, a2, groupedTabLayout.k.getChildCount() - 1, f3);
        groupedTabLayout.a(groupedTabLayout.g, groupedTabLayout.j.getMeasuredWidth() - groupedTabLayout.o, b2, childCount, f2);
        if (z) {
            int a3 = groupedTabLayout.a(i3);
            int b3 = groupedTabLayout.b(i3);
            e c2 = groupedTabLayout.c(a3);
            c2.a(b3, 0.0f);
            c2.requestLayout();
            a((ViewGroup) c2, b3, 0.0f);
            return;
        }
        e c3 = groupedTabLayout.c(a2);
        c3.a(b2, f2);
        c3.requestLayout();
        a((ViewGroup) c3, b2, f2);
    }

    private int b(int i2) {
        int size = this.f.a.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            int e2 = this.f.e(i3) + i4;
            if (e2 > i2) {
                return i2 - i4;
            }
            i3++;
            i4 = e2;
        }
        return -1;
    }

    private e c(int i2) {
        return (e) this.l.getChildAt(i2);
    }

    private int d(int i2) {
        if (this.l.getMeasuredWidth() == 0) {
            this.l.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0), MeasureSpec.makeMeasureSpec(0, 0));
        }
        return this.l.getChildAt(i2).getMeasuredWidth();
    }

    public final void a(View view) {
        int top = view.getTop() - gau.c(getContext());
        int top2 = this.h.getTop() + top;
        int bottom = this.h.getBottom() + top;
        int height = this.h.getHeight();
        if (bottom < 0) {
            this.i.setAlpha(0.0f);
        } else if (top2 < 0) {
            this.i.setAlpha((((float) top2) / ((float) height)) + 1.0f);
        } else {
            this.i.setAlpha(1.0f);
        }
        int top3 = this.g.getTop() + top;
        int bottom2 = top + this.g.getBottom();
        int height2 = this.g.getHeight();
        if (bottom2 < 0) {
            this.g.setAlpha(0.0f);
        } else if (top3 < 0) {
            this.g.setAlpha((((float) top3) / ((float) height2)) + 1.0f);
        } else {
            this.g.setAlpha(1.0f);
        }
    }

    public final void a(Optional<View> optional) {
        View view = this.n;
        if (view != null) {
            this.i.removeView(view);
        }
        if (optional.b()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388629;
            this.n = (View) optional.c();
            View view2 = this.n;
            view2.setPadding(view2.getPaddingLeft(), 0, this.n.getPaddingRight(), 0);
            this.i.addView(this.n, layoutParams);
        }
    }

    public void a(sf sfVar) {
        if (sfVar instanceof rax) {
            this.f = (rax) sfVar;
            a();
            return;
        }
        throw new AssertionError("Adapter not instance of GroupedPagerAdapter");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int i6 = i4 - i2;
        if (i6 != this.o && this.l.getChildCount() > 0) {
            this.o = i6;
            for (int i7 = 0; i7 < this.l.getChildCount(); i7++) {
                ((e) this.l.getChildAt(i7)).a = this.o;
            }
        }
    }
}
