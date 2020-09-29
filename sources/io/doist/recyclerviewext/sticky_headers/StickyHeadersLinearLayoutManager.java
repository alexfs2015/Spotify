package io.doist.recyclerviewext.sticky_headers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.c;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.u;
import defpackage.vur;
import java.util.ArrayList;
import java.util.List;

public class StickyHeadersLinearLayoutManager<T extends androidx.recyclerview.widget.RecyclerView.a<? extends u> & vur> extends LinearLayoutManager {
    /* access modifiers changed from: private */
    public int A;
    /* access modifiers changed from: private */
    public T a;
    /* access modifiers changed from: private */
    public List<Integer> b = new ArrayList(0);
    private c w = new a(this, 0);
    /* access modifiers changed from: private */
    public View x;
    /* access modifiers changed from: private */
    public int y = -1;
    /* access modifiers changed from: private */
    public int z = -1;

    class a extends c {
        private a() {
        }

        /* synthetic */ a(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, byte b) {
            this();
        }

        public final void a() {
            StickyHeadersLinearLayoutManager.this.b.clear();
            int b = StickyHeadersLinearLayoutManager.this.a.b();
            for (int i = 0; i < b; i++) {
                if (((vur) StickyHeadersLinearLayoutManager.this.a).g(i)) {
                    StickyHeadersLinearLayoutManager.this.b.add(Integer.valueOf(i));
                }
            }
            if (StickyHeadersLinearLayoutManager.this.x != null && !StickyHeadersLinearLayoutManager.this.b.contains(Integer.valueOf(StickyHeadersLinearLayoutManager.this.y))) {
                StickyHeadersLinearLayoutManager.this.d((o) null);
            }
        }

        public final void b(int i, int i2) {
            int size = StickyHeadersLinearLayoutManager.this.b.size();
            if (size > 0) {
                int a2 = StickyHeadersLinearLayoutManager.a(StickyHeadersLinearLayoutManager.this, i);
                while (a2 != -1 && a2 < size) {
                    StickyHeadersLinearLayoutManager.this.b.set(a2, Integer.valueOf(((Integer) StickyHeadersLinearLayoutManager.this.b.get(a2)).intValue() + i2));
                    a2++;
                }
            }
            for (int i3 = i; i3 < i + i2; i3++) {
                if (((vur) StickyHeadersLinearLayoutManager.this.a).g(i3)) {
                    int a3 = StickyHeadersLinearLayoutManager.a(StickyHeadersLinearLayoutManager.this, i3);
                    if (a3 != -1) {
                        StickyHeadersLinearLayoutManager.this.b.add(a3, Integer.valueOf(i3));
                    } else {
                        StickyHeadersLinearLayoutManager.this.b.add(Integer.valueOf(i3));
                    }
                }
            }
        }

        public final void c(int i, int i2) {
            int size = StickyHeadersLinearLayoutManager.this.b.size();
            if (size > 0) {
                int i3 = i + i2;
                for (int i4 = i3 - 1; i4 >= i; i4--) {
                    int b = StickyHeadersLinearLayoutManager.this.a(i4);
                    if (b != -1) {
                        StickyHeadersLinearLayoutManager.this.b.remove(b);
                        size--;
                    }
                }
                if (StickyHeadersLinearLayoutManager.this.x != null && !StickyHeadersLinearLayoutManager.this.b.contains(Integer.valueOf(StickyHeadersLinearLayoutManager.this.y))) {
                    StickyHeadersLinearLayoutManager.this.d((o) null);
                }
                int a2 = StickyHeadersLinearLayoutManager.a(StickyHeadersLinearLayoutManager.this, i3);
                while (a2 != -1 && a2 < size) {
                    StickyHeadersLinearLayoutManager.this.b.set(a2, Integer.valueOf(((Integer) StickyHeadersLinearLayoutManager.this.b.get(a2)).intValue() - i2));
                    a2++;
                }
            }
        }

        public final void a(int i, int i2, int i3) {
            int size = StickyHeadersLinearLayoutManager.this.b.size();
            if (size > 0) {
                if (i < i2) {
                    int a2 = StickyHeadersLinearLayoutManager.a(StickyHeadersLinearLayoutManager.this, i);
                    while (a2 != -1 && a2 < size) {
                        int intValue = ((Integer) StickyHeadersLinearLayoutManager.this.b.get(a2)).intValue();
                        if (intValue < i || intValue >= i + 1) {
                            if (intValue < i + 1 || intValue > i2) {
                                break;
                            }
                            StickyHeadersLinearLayoutManager.this.b.set(a2, Integer.valueOf(intValue - 1));
                            a(a2);
                        } else {
                            StickyHeadersLinearLayoutManager.this.b.set(a2, Integer.valueOf(intValue - (i2 - i)));
                            a(a2);
                        }
                        a2++;
                    }
                    return;
                }
                int a3 = StickyHeadersLinearLayoutManager.a(StickyHeadersLinearLayoutManager.this, i2);
                while (a3 != -1 && a3 < size) {
                    int intValue2 = ((Integer) StickyHeadersLinearLayoutManager.this.b.get(a3)).intValue();
                    if (intValue2 < i || intValue2 >= i + 1) {
                        if (intValue2 < i2 || intValue2 > i) {
                            break;
                        }
                        StickyHeadersLinearLayoutManager.this.b.set(a3, Integer.valueOf(intValue2 + 1));
                        a(a3);
                    } else {
                        StickyHeadersLinearLayoutManager.this.b.set(a3, Integer.valueOf(intValue2 + (i2 - i)));
                        a(a3);
                    }
                    a3++;
                }
            }
        }

        private void a(int i) {
            int intValue = ((Integer) StickyHeadersLinearLayoutManager.this.b.remove(i)).intValue();
            int a2 = StickyHeadersLinearLayoutManager.a(StickyHeadersLinearLayoutManager.this, intValue);
            if (a2 != -1) {
                StickyHeadersLinearLayoutManager.this.b.add(a2, Integer.valueOf(intValue));
            } else {
                StickyHeadersLinearLayoutManager.this.b.add(Integer.valueOf(intValue));
            }
        }
    }

    public static class b implements Parcelable {
        public static final Creator<b> CREATOR = new Creator<b>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new b(parcel);
            }
        };
        /* access modifiers changed from: private */
        public Parcelable a;
        /* access modifiers changed from: private */
        public int b;
        /* access modifiers changed from: private */
        public int c;

        public int describeContents() {
            return 0;
        }

        public b() {
        }

        public b(Parcel parcel) {
            this.a = parcel.readParcelable(b.class.getClassLoader());
            this.b = parcel.readInt();
            this.c = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }

    public StickyHeadersLinearLayoutManager(Context context) {
        super(context);
    }

    public final void d(RecyclerView recyclerView) {
        super.d(recyclerView);
        a(recyclerView.c());
    }

    public final void a(androidx.recyclerview.widget.RecyclerView.a aVar, androidx.recyclerview.widget.RecyclerView.a aVar2) {
        super.a(aVar, aVar2);
        a(aVar2);
    }

    private void a(androidx.recyclerview.widget.RecyclerView.a<? extends u> aVar) {
        T t = this.a;
        if (t != null) {
            t.b(this.w);
        }
        if (aVar instanceof vur) {
            this.a = aVar;
            this.a.a(this.w);
            this.w.a();
            return;
        }
        this.a = null;
        this.b.clear();
    }

    public final Parcelable d() {
        b bVar = new b();
        bVar.a = super.d();
        bVar.b = this.z;
        bVar.c = this.A;
        return bVar;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof b) {
            b bVar = (b) parcelable;
            this.z = bVar.b;
            this.A = bVar.c;
            parcelable = bVar.a;
        }
        super.a(parcelable);
    }

    public final int b(int i, o oVar, s sVar) {
        v();
        int b2 = super.b(i, oVar, sVar);
        w();
        if (b2 != 0) {
            a(oVar, false);
        }
        return b2;
    }

    public final int a(int i, o oVar, s sVar) {
        v();
        int a2 = super.a(i, oVar, sVar);
        w();
        if (a2 != 0) {
            a(oVar, false);
        }
        return a2;
    }

    public final void c(o oVar, s sVar) {
        v();
        super.c(oVar, sVar);
        w();
        if (!sVar.g) {
            a(oVar, true);
        }
    }

    public final void a(int i, int i2) {
        a(i, i2, true);
    }

    private void a(int i, int i2, boolean z2) {
        e(-1, Integer.MIN_VALUE);
        int k = k(i);
        if (k == -1 || a(i) != -1) {
            super.a(i, i2);
            return;
        }
        int i3 = i - 1;
        if (a(i3) != -1) {
            super.a(i3, i2);
        } else if (this.x == null || k != a(this.y)) {
            e(i, i2);
            super.a(i, i2);
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            super.a(i, i2 + this.x.getHeight());
        }
    }

    private void v() {
        View view = this.x;
        if (view != null) {
            f(view);
        }
    }

    private void w() {
        View view = this.x;
        if (view != null) {
            c(view, -1);
        }
    }

    private void a(o oVar, boolean z2) {
        View view;
        View view2;
        int i;
        int size = this.b.size();
        int r = r();
        if (size > 0 && r > 0) {
            int i2 = 0;
            while (true) {
                view = null;
                if (i2 >= r) {
                    view2 = null;
                    i = -1;
                    i2 = -1;
                    break;
                }
                view2 = g(i2);
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                if (a(view2, layoutParams)) {
                    i = layoutParams.c.e();
                    break;
                }
                i2++;
            }
            if (!(view2 == null || i == -1)) {
                int k = k(i);
                int intValue = k != -1 ? ((Integer) this.b.get(k)).intValue() : -1;
                int i3 = k + 1;
                int intValue2 = size > i3 ? ((Integer) this.b.get(i3)).intValue() : -1;
                if (intValue != -1 && ((intValue != i || t(view2)) && intValue2 != intValue + 1)) {
                    View view3 = this.x;
                    if (!(view3 == null || d(view3) == this.a.a(intValue))) {
                        d(oVar);
                    }
                    if (this.x == null) {
                        a(oVar, intValue);
                    }
                    if (z2 || c(this.x) != intValue) {
                        b(oVar, intValue);
                    }
                    if (intValue2 != -1) {
                        View g = g(i2 + (intValue2 - i));
                        if (g != this.x) {
                            view = g;
                        }
                    }
                    View view4 = this.x;
                    view4.setTranslationX(c(view4, view));
                    View view5 = this.x;
                    view5.setTranslationY(b(view5, view));
                    return;
                }
            }
        }
        if (this.x != null) {
            d(oVar);
        }
    }

    private void a(o oVar, int i) {
        View b2 = oVar.b(i);
        a(b2);
        s(b2);
        g(b2);
        this.x = b2;
        this.y = i;
    }

    private void b(o oVar, int i) {
        oVar.a(this.x, i);
        this.y = i;
        s(this.x);
        if (this.z != -1) {
            final ViewTreeObserver viewTreeObserver = this.x.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    if (StickyHeadersLinearLayoutManager.this.z != -1) {
                        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = StickyHeadersLinearLayoutManager.this;
                        stickyHeadersLinearLayoutManager.a(stickyHeadersLinearLayoutManager.z, StickyHeadersLinearLayoutManager.this.A);
                        StickyHeadersLinearLayoutManager.this.e(-1, Integer.MIN_VALUE);
                    }
                }
            });
        }
    }

    private void s(View view) {
        a_(view, 0, 0);
        if (this.c == 1) {
            view.layout(getPaddingLeft(), 0, this.u - getPaddingRight(), view.getMeasuredHeight());
        } else {
            view.layout(0, getPaddingTop(), view.getMeasuredWidth(), this.v - getPaddingBottom());
        }
    }

    /* access modifiers changed from: private */
    public void d(o oVar) {
        View view = this.x;
        this.x = null;
        this.y = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        h(view);
        b(view);
        if (oVar != null) {
            oVar.a(view);
        }
    }

    /* access modifiers changed from: private */
    public int a(int i) {
        int size = this.b.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Integer) this.b.get(i3)).intValue() > i) {
                size = i3 - 1;
            } else if (((Integer) this.b.get(i3)).intValue() >= i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private int k(int i) {
        int size = this.b.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Integer) this.b.get(i3)).intValue() > i) {
                size = i3 - 1;
            } else {
                if (i3 < this.b.size() - 1) {
                    int i4 = i3 + 1;
                    if (((Integer) this.b.get(i4)).intValue() <= i) {
                        i2 = i4;
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public void e(int i, int i2) {
        this.z = i;
        this.A = i2;
    }

    public final void e(int i) {
        a(i, Integer.MIN_VALUE, true);
    }

    private boolean a(View view, LayoutParams layoutParams) {
        if (!layoutParams.c.n() && !layoutParams.c.k()) {
            if (this.c == 1) {
                if (this.e) {
                    if (((float) view.getTop()) + view.getTranslationY() <= ((float) this.v) + 0.0f) {
                        return true;
                    }
                    return false;
                } else if (((float) view.getBottom()) - view.getTranslationY() >= 0.0f) {
                    return true;
                } else {
                    return false;
                }
            } else if (this.e) {
                if (((float) view.getLeft()) + view.getTranslationX() <= ((float) this.u) + 0.0f) {
                    return true;
                }
                return false;
            } else if (((float) view.getRight()) - view.getTranslationX() >= 0.0f) {
                return true;
            }
        }
        return false;
    }

    private boolean t(View view) {
        return this.c == 1 ? this.e ? ((float) view.getBottom()) - view.getTranslationY() > ((float) this.v) + 0.0f : ((float) view.getTop()) + view.getTranslationY() < 0.0f : this.e ? ((float) view.getRight()) - view.getTranslationX() > ((float) this.u) + 0.0f : ((float) view.getLeft()) + view.getTranslationX() < 0.0f;
    }

    private float b(View view, View view2) {
        float f = 0.0f;
        if (this.c != 1) {
            return 0.0f;
        }
        if (this.e) {
            f = 0.0f + ((float) (this.v - view.getHeight()));
        }
        if (view2 == null) {
            return f;
        }
        int i = 0;
        if (this.e) {
            if (view2.getLayoutParams() instanceof MarginLayoutParams) {
                i = ((MarginLayoutParams) view2.getLayoutParams()).bottomMargin;
            }
            return Math.max((float) (view2.getBottom() + i), f);
        }
        if (view2.getLayoutParams() instanceof MarginLayoutParams) {
            i = ((MarginLayoutParams) view2.getLayoutParams()).topMargin;
        }
        return Math.min((float) ((view2.getTop() - i) - view.getHeight()), f);
    }

    private float c(View view, View view2) {
        float f = 0.0f;
        if (this.c == 1) {
            return 0.0f;
        }
        if (this.e) {
            f = 0.0f + ((float) (this.u - view.getWidth()));
        }
        if (view2 == null) {
            return f;
        }
        int i = 0;
        if (this.e) {
            if (view2.getLayoutParams() instanceof MarginLayoutParams) {
                i = ((MarginLayoutParams) view2.getLayoutParams()).rightMargin;
            }
            return Math.max((float) (view2.getRight() + i), f);
        }
        if (view2.getLayoutParams() instanceof MarginLayoutParams) {
            i = ((MarginLayoutParams) view2.getLayoutParams()).leftMargin;
        }
        return Math.min((float) ((view2.getLeft() - i) - view.getWidth()), f);
    }

    static /* synthetic */ int a(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i) {
        int size = stickyHeadersLinearLayoutManager.b.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (((Integer) stickyHeadersLinearLayoutManager.b.get(i4)).intValue() >= i) {
                    size = i4;
                }
            }
            if (((Integer) stickyHeadersLinearLayoutManager.b.get(i3)).intValue() >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }
}
