package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.List;

public class LinearLayoutManager extends i implements androidx.recyclerview.widget.RecyclerView.r.b, defpackage.nz.d {
    private a A;
    private final b B;
    private int C;
    private c a;
    private boolean b;
    public int c;
    oh d;
    protected boolean e;
    boolean f;
    d g;
    private boolean w;
    private boolean x;
    private int y;
    private int z;

    static class a {
        oh a;
        int b;
        int c;
        boolean d;
        boolean e;

        a() {
            a();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            int i;
            if (this.d) {
                i = this.a.c();
            } else {
                i = this.a.b();
            }
            this.c = i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }

        public final void a(View view, int i) {
            int a2 = this.a.a();
            if (a2 >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int c2 = (this.a.c() - a2) - this.a.b(view);
                this.c = this.a.c() - c2;
                if (c2 > 0) {
                    int e2 = this.c - this.a.e(view);
                    int b2 = this.a.b();
                    int min = e2 - (b2 + Math.min(this.a.a(view) - b2, 0));
                    if (min < 0) {
                        this.c += Math.min(c2, -min);
                    }
                }
                return;
            }
            int a3 = this.a.a(view);
            int b3 = a3 - this.a.b();
            this.c = a3;
            if (b3 > 0) {
                int c3 = (this.a.c() - Math.min(0, (this.a.c() - a2) - this.a.b(view))) - (a3 + this.a.e(view));
                if (c3 < 0) {
                    this.c -= Math.min(b3, -c3);
                }
            }
        }

        public final void b(View view, int i) {
            if (this.d) {
                this.c = this.a.b(view) + this.a.a();
            } else {
                this.c = this.a.a(view);
            }
            this.b = i;
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b() {
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    static class c {
        boolean a = true;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h = 0;
        boolean i = false;
        int j;
        List<u> k = null;
        boolean l;

        c() {
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(s sVar) {
            int i2 = this.d;
            return i2 >= 0 && i2 < sVar.a();
        }

        /* access modifiers changed from: 0000 */
        public final View a(o oVar) {
            if (this.k != null) {
                return a();
            }
            View a2 = oVar.a(this.d, false);
            this.d += this.e;
            return a2;
        }

        private View a() {
            int size = this.k.size();
            int i2 = 0;
            while (i2 < size) {
                View view = ((u) this.k.get(i2)).o;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (layoutParams.c.n() || this.d != layoutParams.c.d()) {
                    i2++;
                } else {
                    a(view);
                    return view;
                }
            }
            return null;
        }

        public final void a(View view) {
            View b2 = b(view);
            if (b2 == null) {
                this.d = -1;
            } else {
                this.d = ((LayoutParams) b2.getLayoutParams()).c.d();
            }
        }

        private View b(View view) {
            int size = this.k.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = ((u) this.k.get(i3)).o;
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.c.n()) {
                    int d2 = (layoutParams.c.d() - this.d) * this.e;
                    if (d2 >= 0 && d2 < i2) {
                        view2 = view3;
                        if (d2 == 0) {
                            break;
                        }
                        i2 = d2;
                    }
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Creator<d> CREATOR = new Creator<d>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }
        };
        int a;
        int b;
        boolean c;

        public final int describeContents() {
            return 0;
        }

        public d() {
        }

        d(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.c = z;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            return this.a >= 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(o oVar, s sVar, a aVar, int i) {
    }

    public final boolean p_() {
        return true;
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    public LinearLayoutManager(int i, boolean z2) {
        this.c = 1;
        this.e = false;
        this.f = false;
        this.w = false;
        this.x = true;
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.g = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        b(i);
        b(z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.c = 1;
        this.e = false;
        this.f = false;
        this.w = false;
        this.x = true;
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.g = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        androidx.recyclerview.widget.RecyclerView.i.b a2 = a(context, attributeSet, i, i2);
        b(a2.a);
        b(a2.c);
        a(a2.d);
    }

    public LayoutParams a() {
        return new LayoutParams(-2, -2);
    }

    public void a(RecyclerView recyclerView, o oVar) {
        super.a(recyclerView, oVar);
    }

    public final void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (r() > 0) {
            accessibilityEvent.setFromIndex(j());
            accessibilityEvent.setToIndex(l());
        }
    }

    public Parcelable d() {
        d dVar = this.g;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (r() > 0) {
            h();
            boolean z2 = this.b ^ this.f;
            dVar2.c = z2;
            if (z2) {
                View y2 = y();
                dVar2.b = this.d.c() - this.d.b(y2);
                dVar2.a = c(y2);
            } else {
                View x2 = x();
                dVar2.a = c(x2);
                dVar2.b = this.d.a(x2) - this.d.b();
            }
        } else {
            dVar2.a = -1;
        }
        return dVar2;
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.g = (d) parcelable;
            o_();
        }
    }

    public boolean e() {
        return this.c == 0;
    }

    public boolean f() {
        return this.c == 1;
    }

    public void a(boolean z2) {
        a((String) null);
        if (this.w != z2) {
            this.w = z2;
            o_();
        }
    }

    public final void b(int i) {
        if (i == 0 || i == 1) {
            a((String) null);
            if (i != this.c || this.d == null) {
                this.d = oh.a(this, i);
                this.A.a = this.d;
                this.c = i;
                o_();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private void v() {
        boolean z2 = true;
        if (this.c == 1 || !g()) {
            z2 = this.e;
        } else if (this.e) {
            z2 = false;
        }
        this.f = z2;
    }

    private void b(boolean z2) {
        a((String) null);
        if (z2 != this.e) {
            this.e = z2;
            o_();
        }
    }

    public final View c(int i) {
        int r = r();
        if (r == 0) {
            return null;
        }
        int c2 = i - c(g(0));
        if (c2 >= 0 && c2 < r) {
            View g2 = g(c2);
            if (c(g2) == i) {
                return g2;
            }
        }
        return super.c(i);
    }

    public void a(RecyclerView recyclerView, s sVar, int i) {
        od odVar = new od(recyclerView.getContext());
        odVar.b = i;
        a((r) odVar);
    }

    public final PointF d(int i) {
        if (r() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < c(g(0))) {
            z2 = true;
        }
        if (z2 != this.f) {
            i2 = -1;
        }
        if (this.c == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.recyclerview.widget.RecyclerView.o r17, androidx.recyclerview.widget.RecyclerView.s r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.g
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.y
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.a()
            if (r3 != 0) goto L_0x0019
            r16.c(r17)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.g
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.g
            int r3 = r3.a
            r0.y = r3
        L_0x0029:
            r16.h()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            r5 = 0
            r3.a = r5
            r16.v()
            android.view.View r3 = r16.s()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.A
            boolean r6 = r6.e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            if (r6 == 0) goto L_0x0073
            int r6 = r0.y
            if (r6 != r4) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.g
            if (r6 == 0) goto L_0x004a
            goto L_0x0073
        L_0x004a:
            if (r3 == 0) goto L_0x0244
            oh r6 = r0.d
            int r6 = r6.a(r3)
            oh r9 = r0.d
            int r9 = r9.c()
            if (r6 >= r9) goto L_0x0068
            oh r6 = r0.d
            int r6 = r6.b(r3)
            oh r9 = r0.d
            int r9 = r9.b()
            if (r6 > r9) goto L_0x0244
        L_0x0068:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.A
            int r9 = c(r3)
            r6.a(r3, r9)
            goto L_0x0244
        L_0x0073:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            r3.a()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            boolean r6 = r0.f
            boolean r9 = r0.w
            r6 = r6 ^ r9
            r3.d = r6
            boolean r6 = r2.g
            if (r6 != 0) goto L_0x017f
            int r6 = r0.y
            if (r6 != r4) goto L_0x008b
            goto L_0x017f
        L_0x008b:
            if (r6 < 0) goto L_0x017b
            int r9 = r18.a()
            if (r6 < r9) goto L_0x0095
            goto L_0x017b
        L_0x0095:
            int r6 = r0.y
            r3.b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.g
            if (r6 == 0) goto L_0x00cb
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x00cb
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.g
            boolean r6 = r6.c
            r3.d = r6
            boolean r6 = r3.d
            if (r6 == 0) goto L_0x00bc
            oh r6 = r0.d
            int r6 = r6.c()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.g
            int r9 = r9.b
            int r6 = r6 - r9
            r3.c = r6
            goto L_0x0179
        L_0x00bc:
            oh r6 = r0.d
            int r6 = r6.b()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.g
            int r9 = r9.b
            int r6 = r6 + r9
            r3.c = r6
            goto L_0x0179
        L_0x00cb:
            int r6 = r0.z
            if (r6 != r7) goto L_0x015c
            int r6 = r0.y
            android.view.View r6 = r0.c(r6)
            if (r6 == 0) goto L_0x013a
            oh r9 = r0.d
            int r9 = r9.e(r6)
            oh r10 = r0.d
            int r10 = r10.e()
            if (r9 <= r10) goto L_0x00ea
            r3.b()
            goto L_0x0179
        L_0x00ea:
            oh r9 = r0.d
            int r9 = r9.a(r6)
            oh r10 = r0.d
            int r10 = r10.b()
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x0105
            oh r6 = r0.d
            int r6 = r6.b()
            r3.c = r6
            r3.d = r5
            goto L_0x0179
        L_0x0105:
            oh r9 = r0.d
            int r9 = r9.c()
            oh r10 = r0.d
            int r10 = r10.b(r6)
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x011f
            oh r6 = r0.d
            int r6 = r6.c()
            r3.c = r6
            r3.d = r8
            goto L_0x0179
        L_0x011f:
            boolean r9 = r3.d
            if (r9 == 0) goto L_0x0131
            oh r9 = r0.d
            int r6 = r9.b(r6)
            oh r9 = r0.d
            int r9 = r9.a()
            int r6 = r6 + r9
            goto L_0x0137
        L_0x0131:
            oh r9 = r0.d
            int r6 = r9.a(r6)
        L_0x0137:
            r3.c = r6
            goto L_0x0179
        L_0x013a:
            int r6 = r16.r()
            if (r6 <= 0) goto L_0x0158
            android.view.View r6 = r0.g(r5)
            int r6 = c(r6)
            int r9 = r0.y
            if (r9 >= r6) goto L_0x014e
            r6 = 1
            goto L_0x014f
        L_0x014e:
            r6 = 0
        L_0x014f:
            boolean r9 = r0.f
            if (r6 != r9) goto L_0x0155
            r6 = 1
            goto L_0x0156
        L_0x0155:
            r6 = 0
        L_0x0156:
            r3.d = r6
        L_0x0158:
            r3.b()
            goto L_0x0179
        L_0x015c:
            boolean r6 = r0.f
            r3.d = r6
            if (r6 == 0) goto L_0x016e
            oh r6 = r0.d
            int r6 = r6.c()
            int r9 = r0.z
            int r6 = r6 - r9
            r3.c = r6
            goto L_0x0179
        L_0x016e:
            oh r6 = r0.d
            int r6 = r6.b()
            int r9 = r0.z
            int r6 = r6 + r9
            r3.c = r6
        L_0x0179:
            r6 = 1
            goto L_0x0180
        L_0x017b:
            r0.y = r4
            r0.z = r7
        L_0x017f:
            r6 = 0
        L_0x0180:
            if (r6 != 0) goto L_0x0240
            int r6 = r16.r()
            if (r6 == 0) goto L_0x022d
            android.view.View r6 = r16.s()
            if (r6 == 0) goto L_0x01bf
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r9 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r9
            androidx.recyclerview.widget.RecyclerView$u r10 = r9.c
            boolean r10 = r10.n()
            if (r10 != 0) goto L_0x01b2
            androidx.recyclerview.widget.RecyclerView$u r10 = r9.c
            int r10 = r10.d()
            if (r10 < 0) goto L_0x01b2
            androidx.recyclerview.widget.RecyclerView$u r9 = r9.c
            int r9 = r9.d()
            int r10 = r18.a()
            if (r9 >= r10) goto L_0x01b2
            r9 = 1
            goto L_0x01b3
        L_0x01b2:
            r9 = 0
        L_0x01b3:
            if (r9 == 0) goto L_0x01bf
            int r9 = c(r6)
            r3.a(r6, r9)
        L_0x01bc:
            r6 = 1
            goto L_0x022e
        L_0x01bf:
            boolean r6 = r0.b
            boolean r9 = r0.w
            if (r6 != r9) goto L_0x022d
            boolean r6 = r3.d
            if (r6 == 0) goto L_0x01d7
            boolean r6 = r0.f
            if (r6 == 0) goto L_0x01d2
            android.view.View r6 = r16.d(r17, r18)
            goto L_0x01e4
        L_0x01d2:
            android.view.View r6 = r16.e(r17, r18)
            goto L_0x01e4
        L_0x01d7:
            boolean r6 = r0.f
            if (r6 == 0) goto L_0x01e0
            android.view.View r6 = r16.e(r17, r18)
            goto L_0x01e4
        L_0x01e0:
            android.view.View r6 = r16.d(r17, r18)
        L_0x01e4:
            if (r6 == 0) goto L_0x022d
            int r9 = c(r6)
            r3.b(r6, r9)
            boolean r9 = r2.g
            if (r9 != 0) goto L_0x01bc
            boolean r9 = r16.q_()
            if (r9 == 0) goto L_0x01bc
            oh r9 = r0.d
            int r9 = r9.a(r6)
            oh r10 = r0.d
            int r10 = r10.c()
            if (r9 >= r10) goto L_0x0216
            oh r9 = r0.d
            int r6 = r9.b(r6)
            oh r9 = r0.d
            int r9 = r9.b()
            if (r6 >= r9) goto L_0x0214
            goto L_0x0216
        L_0x0214:
            r6 = 0
            goto L_0x0217
        L_0x0216:
            r6 = 1
        L_0x0217:
            if (r6 == 0) goto L_0x01bc
            boolean r6 = r3.d
            if (r6 == 0) goto L_0x0224
            oh r6 = r0.d
            int r6 = r6.c()
            goto L_0x022a
        L_0x0224:
            oh r6 = r0.d
            int r6 = r6.b()
        L_0x022a:
            r3.c = r6
            goto L_0x01bc
        L_0x022d:
            r6 = 0
        L_0x022e:
            if (r6 != 0) goto L_0x0240
            r3.b()
            boolean r6 = r0.w
            if (r6 == 0) goto L_0x023d
            int r6 = r18.a()
            int r6 = r6 - r8
            goto L_0x023e
        L_0x023d:
            r6 = 0
        L_0x023e:
            r3.b = r6
        L_0x0240:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            r3.e = r8
        L_0x0244:
            int r3 = r0.h(r2)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.a
            int r6 = r6.j
            if (r6 < 0) goto L_0x0251
            r6 = r3
            r3 = 0
            goto L_0x0252
        L_0x0251:
            r6 = 0
        L_0x0252:
            oh r9 = r0.d
            int r9 = r9.b()
            int r3 = r3 + r9
            oh r9 = r0.d
            int r9 = r9.f()
            int r6 = r6 + r9
            boolean r9 = r2.g
            if (r9 == 0) goto L_0x029b
            int r9 = r0.y
            if (r9 == r4) goto L_0x029b
            int r10 = r0.z
            if (r10 == r7) goto L_0x029b
            android.view.View r7 = r0.c(r9)
            if (r7 == 0) goto L_0x029b
            boolean r9 = r0.f
            if (r9 == 0) goto L_0x0286
            oh r9 = r0.d
            int r9 = r9.c()
            oh r10 = r0.d
            int r7 = r10.b(r7)
            int r9 = r9 - r7
            int r7 = r0.z
            goto L_0x0295
        L_0x0286:
            oh r9 = r0.d
            int r7 = r9.a(r7)
            oh r9 = r0.d
            int r9 = r9.b()
            int r7 = r7 - r9
            int r9 = r0.z
        L_0x0295:
            int r9 = r9 - r7
            if (r9 <= 0) goto L_0x029a
            int r3 = r3 + r9
            goto L_0x029b
        L_0x029a:
            int r6 = r6 - r9
        L_0x029b:
            androidx.recyclerview.widget.LinearLayoutManager$a r7 = r0.A
            boolean r7 = r7.d
            if (r7 == 0) goto L_0x02a9
            boolean r7 = r0.f
            if (r7 == 0) goto L_0x02a7
        L_0x02a5:
            r7 = 1
            goto L_0x02ae
        L_0x02a7:
            r7 = -1
            goto L_0x02ae
        L_0x02a9:
            boolean r7 = r0.f
            if (r7 == 0) goto L_0x02a5
            goto L_0x02a7
        L_0x02ae:
            androidx.recyclerview.widget.LinearLayoutManager$a r9 = r0.A
            r0.a(r1, r2, r9, r7)
            r16.a(r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.a
            boolean r9 = r16.w()
            r7.l = r9
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.a
            boolean r9 = r2.g
            r7.i = r9
            androidx.recyclerview.widget.LinearLayoutManager$a r7 = r0.A
            boolean r7 = r7.d
            if (r7 == 0) goto L_0x031d
            androidx.recyclerview.widget.LinearLayoutManager$a r7 = r0.A
            r0.b(r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.a
            r7.h = r3
            r0.a(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            int r3 = r3.b
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.a
            int r7 = r7.d
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            int r9 = r9.c
            if (r9 <= 0) goto L_0x02e9
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            int r9 = r9.c
            int r6 = r6 + r9
        L_0x02e9:
            androidx.recyclerview.widget.LinearLayoutManager$a r9 = r0.A
            r0.a(r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            r9.h = r6
            int r6 = r9.d
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.a
            int r10 = r10.e
            int r6 = r6 + r10
            r9.d = r6
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.a
            r0.a(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.a
            int r6 = r6.b
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            int r9 = r9.c
            if (r9 <= 0) goto L_0x036f
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            int r9 = r9.c
            r0.f(r7, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            r3.h = r9
            r0.a(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            int r3 = r3.b
            goto L_0x036f
        L_0x031d:
            androidx.recyclerview.widget.LinearLayoutManager$a r7 = r0.A
            r0.a(r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.a
            r7.h = r6
            r0.a(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.a
            int r6 = r6.b
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.a
            int r7 = r7.d
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            int r9 = r9.c
            if (r9 <= 0) goto L_0x033c
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            int r9 = r9.c
            int r3 = r3 + r9
        L_0x033c:
            androidx.recyclerview.widget.LinearLayoutManager$a r9 = r0.A
            r0.b(r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            r9.h = r3
            int r3 = r9.d
            androidx.recyclerview.widget.LinearLayoutManager$c r10 = r0.a
            int r10 = r10.e
            int r3 = r3 + r10
            r9.d = r3
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            r0.a(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            int r3 = r3.b
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            int r9 = r9.c
            if (r9 <= 0) goto L_0x036f
            androidx.recyclerview.widget.LinearLayoutManager$c r9 = r0.a
            int r9 = r9.c
            r0.e(r7, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.a
            r6.h = r9
            r0.a(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.a
            int r6 = r6.b
        L_0x036f:
            int r7 = r16.r()
            if (r7 <= 0) goto L_0x0393
            boolean r7 = r0.f
            boolean r9 = r0.w
            r7 = r7 ^ r9
            if (r7 == 0) goto L_0x0387
            int r7 = r0.a(r6, r1, r2, r8)
            int r3 = r3 + r7
            int r6 = r6 + r7
            int r7 = r0.b(r3, r1, r2, r5)
            goto L_0x0391
        L_0x0387:
            int r7 = r0.b(r3, r1, r2, r8)
            int r3 = r3 + r7
            int r6 = r6 + r7
            int r7 = r0.a(r6, r1, r2, r5)
        L_0x0391:
            int r3 = r3 + r7
            int r6 = r6 + r7
        L_0x0393:
            boolean r7 = r2.k
            if (r7 == 0) goto L_0x0430
            int r7 = r16.r()
            if (r7 == 0) goto L_0x0430
            boolean r7 = r2.g
            if (r7 != 0) goto L_0x0430
            boolean r7 = r16.q_()
            if (r7 != 0) goto L_0x03a9
            goto L_0x0430
        L_0x03a9:
            java.util.List<androidx.recyclerview.widget.RecyclerView$u> r7 = r1.d
            int r9 = r7.size()
            android.view.View r10 = r0.g(r5)
            int r10 = c(r10)
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x03ba:
            if (r11 >= r9) goto L_0x03f1
            java.lang.Object r14 = r7.get(r11)
            androidx.recyclerview.widget.RecyclerView$u r14 = (androidx.recyclerview.widget.RecyclerView.u) r14
            boolean r15 = r14.n()
            if (r15 != 0) goto L_0x03ed
            int r15 = r14.d()
            if (r15 >= r10) goto L_0x03d0
            r15 = 1
            goto L_0x03d1
        L_0x03d0:
            r15 = 0
        L_0x03d1:
            boolean r8 = r0.f
            if (r15 == r8) goto L_0x03d7
            r8 = -1
            goto L_0x03d8
        L_0x03d7:
            r8 = 1
        L_0x03d8:
            if (r8 != r4) goto L_0x03e4
            oh r8 = r0.d
            android.view.View r14 = r14.o
            int r8 = r8.e(r14)
            int r12 = r12 + r8
            goto L_0x03ed
        L_0x03e4:
            oh r8 = r0.d
            android.view.View r14 = r14.o
            int r8 = r8.e(r14)
            int r13 = r13 + r8
        L_0x03ed:
            int r11 = r11 + 1
            r8 = 1
            goto L_0x03ba
        L_0x03f1:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.a
            r4.k = r7
            r4 = 0
            if (r12 <= 0) goto L_0x0411
            android.view.View r7 = r16.x()
            int r7 = c(r7)
            r0.f(r7, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            r3.h = r12
            r3.c = r5
            r3.a(r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            r0.a(r1, r3, r2, r5)
        L_0x0411:
            if (r13 <= 0) goto L_0x042c
            android.view.View r3 = r16.y()
            int r3 = c(r3)
            r0.e(r3, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            r3.h = r13
            r3.c = r5
            r3.a(r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.a
            r0.a(r1, r3, r2, r5)
        L_0x042c:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.a
            r1.k = r4
        L_0x0430:
            boolean r1 = r2.g
            if (r1 != 0) goto L_0x043d
            oh r1 = r0.d
            int r2 = r1.e()
            r1.b = r2
            goto L_0x0442
        L_0x043d:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.A
            r1.a()
        L_0x0442:
            boolean r1 = r0.w
            r0.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    public void a(s sVar) {
        super.a(sVar);
        this.g = null;
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.A.a();
    }

    private int a(int i, o oVar, s sVar, boolean z2) {
        int c2 = this.d.c() - i;
        if (c2 <= 0) {
            return 0;
        }
        int i2 = -c(-c2, oVar, sVar);
        int i3 = i + i2;
        if (z2) {
            int c3 = this.d.c() - i3;
            if (c3 > 0) {
                this.d.a(c3);
                return c3 + i2;
            }
        }
        return i2;
    }

    private int b(int i, o oVar, s sVar, boolean z2) {
        int b2 = i - this.d.b();
        if (b2 <= 0) {
            return 0;
        }
        int i2 = -c(b2, oVar, sVar);
        int i3 = i + i2;
        if (z2) {
            int b3 = i3 - this.d.b();
            if (b3 > 0) {
                this.d.a(-b3);
                i2 -= b3;
            }
        }
        return i2;
    }

    private void a(a aVar) {
        e(aVar.b, aVar.c);
    }

    private void e(int i, int i2) {
        this.a.c = this.d.c() - i2;
        this.a.e = this.f ? -1 : 1;
        c cVar = this.a;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void b(a aVar) {
        f(aVar.b, aVar.c);
    }

    private void f(int i, int i2) {
        this.a.c = i2 - this.d.b();
        c cVar = this.a;
        cVar.d = i;
        cVar.e = this.f ? 1 : -1;
        c cVar2 = this.a;
        cVar2.f = -1;
        cVar2.b = i2;
        cVar2.g = Integer.MIN_VALUE;
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        if (this.a == null) {
            this.a = new c();
        }
    }

    public void e(int i) {
        this.y = i;
        this.z = Integer.MIN_VALUE;
        d dVar = this.g;
        if (dVar != null) {
            dVar.a = -1;
        }
        o_();
    }

    public void a(int i, int i2) {
        this.y = i;
        this.z = i2;
        d dVar = this.g;
        if (dVar != null) {
            dVar.a = -1;
        }
        o_();
    }

    public int a(int i, o oVar, s sVar) {
        if (this.c == 1) {
            return 0;
        }
        return c(i, oVar, sVar);
    }

    public int b(int i, o oVar, s sVar) {
        if (this.c == 0) {
            return 0;
        }
        return c(i, oVar, sVar);
    }

    public final int b(s sVar) {
        return i(sVar);
    }

    public final int c(s sVar) {
        return i(sVar);
    }

    public final int d(s sVar) {
        return j(sVar);
    }

    public final int e(s sVar) {
        return j(sVar);
    }

    public final int f(s sVar) {
        return k(sVar);
    }

    public final int g(s sVar) {
        return k(sVar);
    }

    private int i(s sVar) {
        if (r() == 0) {
            return 0;
        }
        h();
        oh ohVar = this.d;
        View a2 = a(!this.x, true);
        return ok.a(sVar, ohVar, a2, b(!this.x, true), this, this.x, this.f);
    }

    private int j(s sVar) {
        if (r() == 0) {
            return 0;
        }
        h();
        oh ohVar = this.d;
        View a2 = a(!this.x, true);
        return ok.a(sVar, ohVar, a2, b(!this.x, true), this, this.x);
    }

    private int k(s sVar) {
        if (r() == 0) {
            return 0;
        }
        h();
        oh ohVar = this.d;
        View a2 = a(!this.x, true);
        return ok.b(sVar, ohVar, a2, b(!this.x, true), this, this.x);
    }

    private void a(int i, int i2, boolean z2, s sVar) {
        int i3;
        this.a.l = w();
        this.a.h = h(sVar);
        c cVar = this.a;
        cVar.f = i;
        int i4 = -1;
        if (i == 1) {
            cVar.h += this.d.f();
            View y2 = y();
            c cVar2 = this.a;
            if (!this.f) {
                i4 = 1;
            }
            cVar2.e = i4;
            this.a.d = c(y2) + this.a.e;
            this.a.b = this.d.b(y2);
            i3 = this.d.b(y2) - this.d.c();
        } else {
            View x2 = x();
            this.a.h += this.d.b();
            c cVar3 = this.a;
            if (this.f) {
                i4 = 1;
            }
            cVar3.e = i4;
            this.a.d = c(x2) + this.a.e;
            this.a.b = this.d.a(x2);
            i3 = (-this.d.a(x2)) + this.d.b();
        }
        c cVar4 = this.a;
        cVar4.c = i2;
        if (z2) {
            cVar4.c -= i3;
        }
        this.a.g = i3;
    }

    private boolean w() {
        return this.d.g() == 0 && this.d.d() == 0;
    }

    /* access modifiers changed from: 0000 */
    public void a(s sVar, c cVar, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        int i = cVar.d;
        if (i >= 0 && i < sVar.a()) {
            aVar.a(i, Math.max(0, cVar.g));
        }
    }

    public final void a(int i, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        int i2;
        boolean z2;
        d dVar = this.g;
        int i3 = -1;
        if (dVar == null || !dVar.a()) {
            v();
            z2 = this.f;
            i2 = this.y;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            z2 = this.g.c;
            i2 = this.g.a;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            aVar.a(i2, 0);
            i2 += i3;
        }
    }

    public final void a(int i, int i2, s sVar, androidx.recyclerview.widget.RecyclerView.i.a aVar) {
        if (this.c != 0) {
            i = i2;
        }
        if (r() != 0 && i != 0) {
            h();
            a(i > 0 ? 1 : -1, Math.abs(i), true, sVar);
            a(sVar, this.a, aVar);
        }
    }

    private int c(int i, o oVar, s sVar) {
        if (r() == 0 || i == 0) {
            return 0;
        }
        this.a.a = true;
        h();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, sVar);
        int a2 = this.a.g + a(oVar, this.a, sVar, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.d.a(-i);
        this.a.j = i;
        return i;
    }

    public final void a(String str) {
        if (this.g == null) {
            super.a(str);
        }
    }

    private void a(o oVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, oVar);
                }
                return;
            }
            while (i > i2) {
                a(i, oVar);
                i--;
            }
        }
    }

    private void a(o oVar, c cVar) {
        if (cVar.a && !cVar.l) {
            if (cVar.f == -1) {
                int i = cVar.g;
                int r = r();
                if (i >= 0) {
                    int d2 = this.d.d() - i;
                    if (this.f) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= r) {
                                break;
                            }
                            View g2 = g(i2);
                            if (this.d.a(g2) < d2 || this.d.d(g2) < d2) {
                                a(oVar, 0, i2);
                            } else {
                                i2++;
                            }
                        }
                        a(oVar, 0, i2);
                    } else {
                        int i3 = r - 1;
                        int i4 = i3;
                        while (i4 >= 0) {
                            View g3 = g(i4);
                            if (this.d.a(g3) < d2 || this.d.d(g3) < d2) {
                                a(oVar, i3, i4);
                            } else {
                                i4--;
                            }
                        }
                    }
                }
                return;
            }
            int i5 = cVar.g;
            if (i5 >= 0) {
                int r2 = r();
                if (this.f) {
                    int i6 = r2 - 1;
                    int i7 = i6;
                    while (true) {
                        if (i7 < 0) {
                            break;
                        }
                        View g4 = g(i7);
                        if (this.d.b(g4) > i5 || this.d.c(g4) > i5) {
                            a(oVar, i6, i7);
                        } else {
                            i7--;
                        }
                    }
                    a(oVar, i6, i7);
                    return;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= r2) {
                        break;
                    }
                    View g5 = g(i8);
                    if (this.d.b(g5) > i5 || this.d.c(g5) > i5) {
                        a(oVar, 0, i8);
                    } else {
                        i8++;
                    }
                }
                a(oVar, 0, i8);
            }
        }
    }

    private int a(o oVar, c cVar, s sVar, boolean z2) {
        int i = cVar.c;
        if (cVar.g != Integer.MIN_VALUE) {
            if (cVar.c < 0) {
                cVar.g += cVar.c;
            }
            a(oVar, cVar);
        }
        int i2 = cVar.c + cVar.h;
        b bVar = this.B;
        while (true) {
            if ((!cVar.l && i2 <= 0) || !cVar.a(sVar)) {
                break;
            }
            bVar.a();
            a(oVar, sVar, cVar, bVar);
            if (bVar.b) {
                break;
            }
            cVar.b += bVar.a * cVar.f;
            if (!bVar.c || this.a.k != null || !sVar.g) {
                cVar.c -= bVar.a;
                i2 -= bVar.a;
            }
            if (cVar.g != Integer.MIN_VALUE) {
                cVar.g += bVar.a;
                if (cVar.c < 0) {
                    cVar.g += cVar.c;
                }
                a(oVar, cVar);
            }
            if (z2 && bVar.d) {
                break;
            }
        }
        return i - cVar.c;
    }

    /* access modifiers changed from: 0000 */
    public void a(o oVar, s sVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a2 = cVar.a(oVar);
        if (a2 == null) {
            bVar.b = true;
            return;
        }
        LayoutParams layoutParams = (LayoutParams) a2.getLayoutParams();
        if (cVar.k == null) {
            if (this.f == (cVar.f == -1)) {
                b(a2, -1);
            } else {
                b(a2, 0);
            }
        } else {
            if (this.f == (cVar.f == -1)) {
                a(a2, -1);
            } else {
                a(a2, 0);
            }
        }
        a_(a2, 0, 0);
        bVar.a = this.d.e(a2);
        if (this.c == 1) {
            if (g()) {
                i5 = this.u - getPaddingRight();
                i3 = i5 - this.d.f(a2);
            } else {
                i3 = getPaddingLeft();
                i5 = this.d.f(a2) + i3;
            }
            if (cVar.f == -1) {
                i2 = cVar.b;
                int i6 = i5;
                i4 = cVar.b - bVar.a;
                i = i6;
            } else {
                int i7 = cVar.b;
                i2 = cVar.b + bVar.a;
                i = i5;
                i4 = i7;
            }
        } else {
            i4 = getPaddingTop();
            int f2 = this.d.f(a2) + i4;
            if (cVar.f == -1) {
                int i8 = f2;
                i3 = cVar.b - bVar.a;
                i = cVar.b;
                i2 = i8;
            } else {
                int i9 = cVar.b;
                i = cVar.b + bVar.a;
                int i10 = i9;
                i2 = f2;
                i3 = i10;
            }
        }
        b(a2, i3, i4, i, i2);
        if (layoutParams.c.n() || layoutParams.c.u()) {
            bVar.c = true;
        }
        bVar.d = a2.hasFocusable();
    }

    /* access modifiers changed from: 0000 */
    public final int f(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.c == 1) ? 1 : Integer.MIN_VALUE : this.c == 0 ? 1 : Integer.MIN_VALUE : this.c == 1 ? -1 : Integer.MIN_VALUE : this.c == 0 ? -1 : Integer.MIN_VALUE : (this.c != 1 && g()) ? -1 : 1 : (this.c != 1 && g()) ? 1 : -1;
    }

    private View x() {
        return g(this.f ? r() - 1 : 0);
    }

    private View y() {
        return g(this.f ? 0 : r() - 1);
    }

    private View a(boolean z2, boolean z3) {
        if (this.f) {
            return a(r() - 1, -1, z2, true);
        }
        return a(0, r(), z2, true);
    }

    private View b(boolean z2, boolean z3) {
        if (this.f) {
            return a(0, r(), z2, true);
        }
        return a(r() - 1, -1, z2, true);
    }

    private View d(o oVar, s sVar) {
        return a(oVar, sVar, 0, r(), sVar.a());
    }

    private View e(o oVar, s sVar) {
        return a(oVar, sVar, r() - 1, -1, sVar.a());
    }

    /* access modifiers changed from: 0000 */
    public View a(o oVar, s sVar, int i, int i2, int i3) {
        h();
        int b2 = this.d.b();
        int c2 = this.d.c();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g2 = g(i);
            int c3 = c(g2);
            if (c3 >= 0 && c3 < i3) {
                if (((LayoutParams) g2.getLayoutParams()).c.n()) {
                    if (view2 == null) {
                        view2 = g2;
                    }
                } else if (this.d.a(g2) < c2 && this.d.b(g2) >= b2) {
                    return g2;
                } else {
                    if (view == null) {
                        view = g2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private View z() {
        return g(0, r());
    }

    private View A() {
        return g(r() - 1, -1);
    }

    public final int j() {
        View a2 = a(0, r(), false, true);
        if (a2 == null) {
            return -1;
        }
        return c(a2);
    }

    public final int k() {
        View a2 = a(0, r(), true, false);
        if (a2 == null) {
            return -1;
        }
        return c(a2);
    }

    public int l() {
        View a2 = a(r() - 1, -1, false, true);
        if (a2 == null) {
            return -1;
        }
        return c(a2);
    }

    public int m() {
        View a2 = a(r() - 1, -1, true, false);
        if (a2 == null) {
            return -1;
        }
        return c(a2);
    }

    private View a(int i, int i2, boolean z2, boolean z3) {
        h();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        if (this.c == 0) {
            return this.i.a(i, i2, i4, i3);
        }
        return this.j.a(i, i2, i4, i3);
    }

    private View g(int i, int i2) {
        int i3;
        int i4;
        h();
        char c2 = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c2 == 0) {
            return g(i);
        }
        if (this.d.a(g(i)) < this.d.b()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.c == 0) {
            return this.i.a(i, i2, i4, i3);
        }
        return this.j.a(i, i2, i4, i3);
    }

    public View a(View view, int i, o oVar, s sVar) {
        View view2;
        View view3;
        v();
        if (r() == 0) {
            return null;
        }
        int f2 = f(i);
        if (f2 == Integer.MIN_VALUE) {
            return null;
        }
        h();
        h();
        a(f2, (int) (((float) this.d.e()) * 0.33333334f), false, sVar);
        c cVar = this.a;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        a(oVar, cVar, sVar, true);
        if (f2 == -1) {
            if (this.f) {
                view2 = A();
            } else {
                view2 = z();
            }
        } else if (this.f) {
            view2 = z();
        } else {
            view2 = A();
        }
        if (f2 == -1) {
            view3 = x();
        } else {
            view3 = y();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public boolean q_() {
        return this.g == null && this.b == this.w;
    }

    public final void a(View view, View view2) {
        a("Cannot drop a view during a scroll or layout calculation");
        h();
        v();
        int c2 = c(view);
        int c3 = c(view2);
        char c4 = c2 < c3 ? (char) 1 : 65535;
        if (this.f) {
            if (c4 == 1) {
                a(c3, this.d.c() - (this.d.a(view2) + this.d.e(view)));
            } else {
                a(c3, this.d.c() - this.d.b(view2));
            }
        } else if (c4 == 65535) {
            a(c3, this.d.a(view2));
        } else {
            a(c3, this.d.b(view2) - this.d.e(view));
        }
    }

    private int h(s sVar) {
        if (sVar.a != -1) {
            return this.d.e();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return ip.f(this.h) == 1;
    }

    /* access modifiers changed from: 0000 */
    public final boolean r_() {
        boolean z2;
        if (!(this.t == 1073741824 || this.s == 1073741824)) {
            int r = r();
            int i = 0;
            while (true) {
                if (i >= r) {
                    z2 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = g(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z2 = true;
                    break;
                }
                i++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
