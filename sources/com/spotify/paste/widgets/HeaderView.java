package com.spotify.paste.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.music.R;

public class HeaderView extends ViewGroup implements vhn {
    public final FrameLayout a;
    public final ImageView b;
    public final TextView c;
    public View d;
    public int e;
    private final ViewPager f;
    /* access modifiers changed from: private */
    public final ViewPagerIndicator g;
    /* access modifiers changed from: private */
    public final LinearLayout h;
    private final vhu i;
    private final TextView j;
    /* access modifiers changed from: private */
    public final sf k;
    /* access modifiers changed from: private */
    public sf l;
    /* access modifiers changed from: private */
    public final GestureDetector m;
    /* access modifiers changed from: private */
    public boolean n;
    private int o;
    private TypedValue p;
    private float q;
    private final DataSetObserver r;

    class a extends sf {
        private a() {
        }

        /* synthetic */ a(HeaderView headerView, byte b) {
            this();
        }

        public int a(Object obj) {
            if (obj.equals(HeaderView.this.h)) {
                return -1;
            }
            return super.a(obj) + 1;
        }

        public final Parcelable a() {
            if (HeaderView.this.l != null) {
                return HeaderView.this.l.a();
            }
            return null;
        }

        public Object a(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return HeaderView.this.l.a(viewGroup, i - 1);
            }
            viewGroup.addView(HeaderView.this.h);
            return HeaderView.this.h;
        }

        public final void a(Parcelable parcelable, ClassLoader classLoader) {
            if (HeaderView.this.l != null) {
                HeaderView.this.l.a(parcelable, classLoader);
            }
        }

        public final void a(ViewGroup viewGroup) {
            if (HeaderView.this.l != null) {
                HeaderView.this.l.a(viewGroup);
            }
        }

        public void a(ViewGroup viewGroup, int i, Object obj) {
            if (i == 0) {
                viewGroup.removeView(HeaderView.this.h);
            } else {
                HeaderView.this.l.a(viewGroup, i - 1, obj);
            }
        }

        public final boolean a(View view, Object obj) {
            return obj == HeaderView.this.h ? view == HeaderView.this.h : HeaderView.this.l.a(view, obj);
        }

        public final int b() {
            if (HeaderView.this.l != null) {
                return HeaderView.this.l.b() + 1;
            }
            return 1;
        }

        public CharSequence b(int i) {
            return i == 0 ? super.b(0) : HeaderView.this.l.b(i - 1);
        }

        public final void b(ViewGroup viewGroup) {
            if (HeaderView.this.l != null) {
                HeaderView.this.l.b(viewGroup);
            }
        }

        public void b(ViewGroup viewGroup, int i, Object obj) {
            if (HeaderView.this.l != null) {
                HeaderView.this.l.b(viewGroup, i, obj);
            }
        }

        public float k_(int i) {
            return i == 0 ? super.k_(0) : HeaderView.this.l.k_(i - 1);
        }
    }

    class b extends a {
        private b() {
            super(HeaderView.this, 0);
        }

        /* synthetic */ b(HeaderView headerView, byte b) {
            this();
        }

        private int a(int i) {
            return HeaderView.this.l.b() - i;
        }

        private boolean d(int i) {
            return i == b() - 1;
        }

        public final int a(Object obj) {
            if (obj.equals(HeaderView.this.h)) {
                return -1;
            }
            return HeaderView.this.l.b() - super.a(obj);
        }

        public final Object a(ViewGroup viewGroup, int i) {
            if (!d(i)) {
                return HeaderView.this.l.a(viewGroup, a(i));
            }
            viewGroup.addView(HeaderView.this.h);
            return HeaderView.this.h;
        }

        public final void a(ViewGroup viewGroup, int i, Object obj) {
            if (d(i)) {
                viewGroup.removeView(HeaderView.this.h);
            } else {
                HeaderView.this.l.a(viewGroup, a(i), obj);
            }
        }

        public final CharSequence b(int i) {
            return d(i) ? super.b(0) : HeaderView.this.l.b(a(i));
        }

        public final void b(ViewGroup viewGroup, int i, Object obj) {
            if (HeaderView.this.l != null) {
                HeaderView.this.l.b(viewGroup, a(i), obj);
            }
        }

        public final float k_(int i) {
            return d(i) ? super.k_(0) : HeaderView.this.l.k_(a(i));
        }
    }

    public HeaderView(Context context) {
        this(context, null);
    }

    public HeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteDefaultsHeaderStyle);
    }

    public HeaderView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.p = new TypedValue();
        this.q = 1.0f;
        this.r = new DataSetObserver() {
            private void a() {
                HeaderView.this.g.requestLayout();
                HeaderView.this.g.invalidate();
                HeaderView.this.k.c();
            }

            public final void onChanged() {
                a();
            }

            public final void onInvalidated() {
                a();
            }
        };
        vgk.a(HeaderView.class, this);
        if (vgi.a(context)) {
            this.k = new b(this, 0);
        } else {
            this.k = new a(this, 0);
        }
        this.f = new ViewPager(context) {
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                super.onLayout(false, getLeft(), getTop(), getRight(), getBottom());
            }

            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (!HeaderView.this.n) {
                    HeaderView headerView = HeaderView.this;
                    headerView.n = headerView.m.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    HeaderView.this.n = false;
                }
                HeaderView headerView2 = HeaderView.this;
                headerView2.requestDisallowInterceptTouchEvent(headerView2.n);
                return super.onTouchEvent(motionEvent);
            }
        };
        this.f.setId(R.id.header_viewpager);
        this.h = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.paste_header, this.f, false);
        this.a = (FrameLayout) this.h.findViewById(R.id.image_container);
        this.o = this.a.getLayoutParams().width;
        this.b = (ImageView) this.h.findViewById(R.id.image);
        this.i = new vhu((ViewGroup) this.h.findViewById(R.id.image_overlay));
        this.c = (TextView) this.h.findViewById(R.id.title);
        this.j = (TextView) this.h.findViewById(R.id.header_subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.vho.a.B, i2, 0);
        a((CharSequence) obtainStyledAttributes.getString(defpackage.vho.a.C));
        int resourceId = obtainStyledAttributes.getResourceId(defpackage.vho.a.E, 0);
        if (resourceId != 0) {
            vgl.a(context, this.c, resourceId);
        }
        if (!obtainStyledAttributes.getValue(defpackage.vho.a.D, this.p)) {
            this.p = null;
        }
        obtainStyledAttributes.recycle();
        this.f.a(this.k);
        int a2 = vfj.a(8.0f, context.getResources());
        this.g = new ViewPagerIndicator(context);
        this.g.setPadding(a2, 0, a2, a2);
        this.g.a(this.f);
        addView(this.f);
        addView(this.g);
        this.m = new GestureDetector(context, new SimpleOnGestureListener() {
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return Math.abs(f) > Math.abs(f2);
            }
        });
    }

    private void a(int i2) {
        if (vgi.a(getContext())) {
            this.f.b(this.k.b() - 1);
        } else {
            this.f.b(0);
        }
    }

    private int b(int i2, int i3) {
        int i4;
        int i5 = this.e;
        if (i5 != 0) {
            return i5;
        }
        TypedValue typedValue = this.p;
        if (typedValue != null) {
            float f2 = (float) i2;
            i4 = (int) typedValue.getFraction(f2, f2);
        } else {
            i4 = i2 / 2;
        }
        int i6 = i4;
        return i3 > 0 ? Math.min(i6, i3) : i6;
    }

    public final ImageView a() {
        return this.b;
    }

    public final void a(int i2, int i3) {
        this.a.getLayoutParams().width = i2;
        this.a.getLayoutParams().height = i3;
        this.o = i2;
        this.q = ((float) i3) / ((float) i2);
    }

    public final void a(View view) {
        this.i.a(view);
    }

    public final void a(e eVar) {
        this.f.a(eVar);
    }

    public final void a(CharSequence charSequence) {
        if (getResources().getConfiguration().orientation == 2) {
            charSequence = "";
        }
        this.c.setText(charSequence);
        this.c.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void a(sf sfVar) {
        sf sfVar2 = this.l;
        if (sfVar2 != null) {
            sfVar2.b(this.r);
        }
        this.l = sfVar;
        sf sfVar3 = this.l;
        if (sfVar3 != null) {
            sfVar3.a(this.r);
        }
        this.k.c();
        a(0);
        this.g.requestLayout();
        this.g.invalidate();
    }

    public final View b() {
        return this;
    }

    public final void b(View view) {
        View view2 = this.d;
        if (view2 != view) {
            if (view2 != null) {
                this.h.removeView(view2);
            }
            this.d = view;
            if (view != null) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.topMargin = vfj.b(10.0f, getResources());
                view.setLayoutParams(layoutParams);
                this.h.addView(view);
            }
        }
    }

    public final void b(CharSequence charSequence) {
        this.j.setText(charSequence);
        this.j.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        ViewPager viewPager = this.f;
        viewPager.layout(0, 0, viewPager.getMeasuredWidth(), this.f.getMeasuredHeight());
        int measuredWidth = ((i6 - this.g.getMeasuredWidth()) / 2) + 0;
        int measuredHeight = this.f.getMeasuredHeight() + 0;
        ViewPagerIndicator viewPagerIndicator = this.g;
        viewPagerIndicator.layout(measuredWidth, measuredHeight, viewPagerIndicator.getMeasuredWidth() + measuredWidth, this.g.getMeasuredHeight() + measuredHeight);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i3);
        int mode = MeasureSpec.getMode(i3);
        this.g.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        int b2 = b(size, this.o);
        this.a.getLayoutParams().width = this.o;
        this.a.getLayoutParams().height = (int) (((float) this.o) * this.q);
        this.b.getLayoutParams().width = b2;
        this.b.getLayoutParams().height = b2;
        this.h.measure(i2, MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.h.getMeasuredHeight() + this.g.getMeasuredHeight();
        if (mode != 0 && measuredHeight > size2) {
            int i4 = measuredHeight - size2;
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.width -= i4;
            ViewGroup.LayoutParams layoutParams2 = this.a.getLayoutParams();
            layoutParams2.height -= i4;
            int b3 = b(size, this.o - i4);
            this.b.getLayoutParams().width = b3;
            this.b.getLayoutParams().height = b3;
        }
        if (mode != 0) {
            i3 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - this.g.getMeasuredHeight(), 1073741824);
        }
        this.h.measure(i2, i3);
        this.f.measure(MeasureSpec.makeMeasureSpec(this.h.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(this.h.getMeasuredHeight(), 1073741824));
        setMeasuredDimension(this.h.getMeasuredWidth(), this.h.getMeasuredHeight() + this.g.getMeasuredHeight());
    }
}
