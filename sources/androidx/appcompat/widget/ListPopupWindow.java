package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.spotify.music.R;
import java.lang.reflect.Method;

public class ListPopupWindow implements bg {
    private static Method a;
    private static Method b;
    private static Method c;
    private DataSetObserver A;
    private final d B;
    private final c C;
    private final a D;
    private Runnable E;
    private final Rect F;
    private Rect G;
    private Context d;
    public cb e;
    int f;
    public int g;
    public int h;
    int i;
    int j;
    public View k;
    public OnItemClickListener l;
    final e m;
    final Handler n;
    public boolean o;
    public PopupWindow p;
    private ListAdapter q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    class a implements Runnable {
        a() {
        }

        public final void run() {
            ListPopupWindow.this.i();
        }
    }

    class b extends DataSetObserver {
        b() {
        }

        public final void onChanged() {
            if (ListPopupWindow.this.p.isShowing()) {
                ListPopupWindow.this.d_();
            }
        }

        public final void onInvalidated() {
            ListPopupWindow.this.d();
        }
    }

    class c implements OnScrollListener {
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        c() {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.j() && ListPopupWindow.this.p.getContentView() != null) {
                ListPopupWindow.this.n.removeCallbacks(ListPopupWindow.this.m);
                ListPopupWindow.this.m.run();
            }
        }
    }

    class d implements OnTouchListener {
        d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.p != null && ListPopupWindow.this.p.isShowing() && x >= 0 && x < ListPopupWindow.this.p.getWidth() && y >= 0 && y < ListPopupWindow.this.p.getHeight()) {
                ListPopupWindow.this.n.postDelayed(ListPopupWindow.this.m, 250);
            } else if (action == 1) {
                ListPopupWindow.this.n.removeCallbacks(ListPopupWindow.this.m);
            }
            return false;
        }
    }

    class e implements Runnable {
        e() {
        }

        public final void run() {
            if (ListPopupWindow.this.e != null && ip.E(ListPopupWindow.this.e) && ListPopupWindow.this.e.getCount() > ListPopupWindow.this.e.getChildCount() && ListPopupWindow.this.e.getChildCount() <= ListPopupWindow.this.i) {
                ListPopupWindow.this.p.setInputMethodMode(2);
                ListPopupWindow.this.d_();
            }
        }
    }

    static {
        if (VERSION.SDK_INT <= 28) {
            try {
                a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (VERSION.SDK_INT <= 23) {
            try {
                b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.r = -2;
        this.f = -2;
        this.t = 1002;
        this.v = true;
        this.h = 0;
        this.y = false;
        this.z = false;
        this.i = Integer.MAX_VALUE;
        this.j = 0;
        this.m = new e();
        this.B = new d();
        this.C = new c();
        this.D = new a();
        this.F = new Rect();
        this.d = context;
        this.n = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.o.a.bg, i2, i3);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(defpackage.o.a.bh, 0);
        this.s = obtainStyledAttributes.getDimensionPixelOffset(defpackage.o.a.bi, 0);
        if (this.s != 0) {
            this.u = true;
        }
        obtainStyledAttributes.recycle();
        this.p = new AppCompatPopupWindow(context, attributeSet, i2, i3);
        this.p.setInputMethodMode(1);
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A;
        if (dataSetObserver == null) {
            this.A = new b();
        } else {
            ListAdapter listAdapter2 = this.q;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.q = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A);
        }
        cb cbVar = this.e;
        if (cbVar != null) {
            cbVar.setAdapter(this.q);
        }
    }

    public final void a(boolean z2) {
        this.o = true;
        this.p.setFocusable(true);
    }

    public final Drawable b() {
        return this.p.getBackground();
    }

    public final void a(Drawable drawable) {
        this.p.setBackgroundDrawable(drawable);
    }

    public final int f() {
        return this.g;
    }

    public final void b(int i2) {
        this.g = i2;
    }

    public final int c() {
        if (!this.u) {
            return 0;
        }
        return this.s;
    }

    public final void a(int i2) {
        this.s = i2;
        this.u = true;
    }

    public final void a(Rect rect) {
        this.G = rect != null ? new Rect(rect) : null;
    }

    public final void d(int i2) {
        Drawable background = this.p.getBackground();
        if (background != null) {
            background.getPadding(this.F);
            this.f = this.F.left + this.F.right + i2;
            return;
        }
        this.f = i2;
    }

    public final void d() {
        this.p.dismiss();
        this.p.setContentView(null);
        this.e = null;
        this.n.removeCallbacks(this.m);
    }

    public final void a(OnDismissListener onDismissListener) {
        this.p.setOnDismissListener(onDismissListener);
    }

    public final void e(int i2) {
        this.p.setInputMethodMode(2);
    }

    public final void i() {
        cb cbVar = this.e;
        if (cbVar != null) {
            cbVar.a = true;
            cbVar.requestLayout();
        }
    }

    public final boolean e() {
        return this.p.isShowing();
    }

    public final boolean j() {
        return this.p.getInputMethodMode() == 2;
    }

    public final ListView g() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public cb a(Context context, boolean z2) {
        return new cb(context, z2);
    }

    public final void b(boolean z2) {
        this.x = true;
        this.w = true;
    }

    private int a(View view, int i2, boolean z2) {
        if (VERSION.SDK_INT > 23) {
            return this.p.getMaxAvailableHeight(view, i2, z2);
        }
        Method method = b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.p, new Object[]{view, Integer.valueOf(i2), Boolean.valueOf(z2)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.p.getMaxAvailableHeight(view, i2);
    }

    public final void d_() {
        int i2;
        int i3;
        int makeMeasureSpec;
        if (this.e == null) {
            Context context = this.d;
            this.E = new Runnable() {
                public final void run() {
                    View view = ListPopupWindow.this.k;
                    if (view != null && view.getWindowToken() != null) {
                        ListPopupWindow.this.d_();
                    }
                }
            };
            this.e = a(context, !this.o);
            this.e.setAdapter(this.q);
            this.e.setOnItemClickListener(this.l);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener(new OnItemSelectedListener() {
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (i != -1) {
                        cb cbVar = ListPopupWindow.this.e;
                        if (cbVar != null) {
                            cbVar.a = false;
                        }
                    }
                }
            });
            this.e.setOnScrollListener(this.C);
            this.p.setContentView(this.e);
        } else {
            this.p.getContentView();
        }
        Drawable background = this.p.getBackground();
        int i4 = 0;
        if (background != null) {
            background.getPadding(this.F);
            i2 = this.F.top + this.F.bottom;
            if (!this.u) {
                this.s = -this.F.top;
            }
        } else {
            this.F.setEmpty();
            i2 = 0;
        }
        int a2 = a(this.k, this.s, this.p.getInputMethodMode() == 2);
        if (this.r == -1) {
            i3 = a2 + i2;
        } else {
            int i5 = this.f;
            if (i5 == -2) {
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.F.left + this.F.right), Integer.MIN_VALUE);
            } else if (i5 != -1) {
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else {
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.F.left + this.F.right), 1073741824);
            }
            int a3 = this.e.a(makeMeasureSpec, 0, -1, a2, -1);
            i3 = a3 + (a3 > 0 ? i2 + this.e.getPaddingTop() + this.e.getPaddingBottom() + 0 : 0);
        }
        boolean j2 = j();
        jl.a(this.p, this.t);
        if (!this.p.isShowing()) {
            int i6 = this.f;
            if (i6 == -1) {
                i6 = -1;
            } else if (i6 == -2) {
                i6 = this.k.getWidth();
            }
            int i7 = this.r;
            if (i7 == -1) {
                i3 = -1;
            } else if (i7 != -2) {
                i3 = i7;
            }
            this.p.setWidth(i6);
            this.p.setHeight(i3);
            if (VERSION.SDK_INT <= 28) {
                Method method = a;
                if (method != null) {
                    try {
                        method.invoke(this.p, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.p.setIsClippedToScreen(true);
            }
            this.p.setOutsideTouchable(true);
            this.p.setTouchInterceptor(this.B);
            if (this.x) {
                jl.a(this.p, this.w);
            }
            if (VERSION.SDK_INT <= 28) {
                Method method2 = c;
                if (method2 != null) {
                    try {
                        method2.invoke(this.p, new Object[]{this.G});
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.p.setEpicenterBounds(this.G);
            }
            PopupWindow popupWindow = this.p;
            View view = this.k;
            int i8 = this.g;
            int i9 = this.s;
            int i10 = this.h;
            if (VERSION.SDK_INT >= 19) {
                popupWindow.showAsDropDown(view, i8, i9, i10);
            } else {
                if ((hx.a(i10, ip.f(view)) & 7) == 5) {
                    i8 -= popupWindow.getWidth() - view.getWidth();
                }
                popupWindow.showAsDropDown(view, i8, i9);
            }
            this.e.setSelection(-1);
            if (!this.o || this.e.isInTouchMode()) {
                i();
            }
            if (!this.o) {
                this.n.post(this.D);
            }
        } else if (ip.E(this.k)) {
            int i11 = this.f;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.k.getWidth();
            }
            int i12 = this.r;
            if (i12 == -1) {
                if (!j2) {
                    i3 = -1;
                }
                if (j2) {
                    this.p.setWidth(this.f == -1 ? -1 : 0);
                    this.p.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.p;
                    if (this.f == -1) {
                        i4 = -1;
                    }
                    popupWindow2.setWidth(i4);
                    this.p.setHeight(-1);
                }
            } else if (i12 != -2) {
                i3 = i12;
            }
            this.p.setOutsideTouchable(true);
            this.p.update(this.k, this.g, this.s, i11 < 0 ? -1 : i11, i3 < 0 ? -1 : i3);
        }
    }
}
