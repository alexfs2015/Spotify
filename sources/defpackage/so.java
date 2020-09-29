package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.e;
import java.util.Locale;

/* renamed from: so reason: default package */
public final class so extends m {
    public e a;
    public int b;
    public boolean c;
    boolean d;
    private final ViewPager2 e;
    private final RecyclerView f = this.e.e;
    private final LinearLayoutManager g = ((LinearLayoutManager) this.f.d());
    private int h;
    private a i = new a();
    private int j;
    private int k;
    private boolean l;
    private boolean m;

    /* renamed from: so$a */
    static final class a {
        int a;
        float b;
        int c;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.a = -1;
            this.b = 0.0f;
            this.c = 0;
        }
    }

    public so(ViewPager2 viewPager2) {
        this.e = viewPager2;
        c();
    }

    private void a(int i2) {
        if ((this.h != 3 || this.b != 0) && this.b != i2) {
            this.b = i2;
            e eVar = this.a;
            if (eVar != null) {
                eVar.b(i2);
            }
        }
    }

    private void a(int i2, float f2, int i3) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.a(i2, f2, i3);
        }
    }

    private void b(int i2) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    private void c() {
        this.h = 0;
        this.b = 0;
        this.i.a();
        this.j = -1;
        this.k = -1;
        this.l = false;
        this.m = false;
        this.d = false;
        this.c = false;
    }

    private void d() {
        int i2;
        a aVar = this.i;
        aVar.a = this.g.j();
        if (aVar.a == -1) {
            aVar.a();
            return;
        }
        View c2 = this.g.c(aVar.a);
        if (c2 == null) {
            aVar.a();
            return;
        }
        int q = LinearLayoutManager.q(c2);
        int r = LinearLayoutManager.r(c2);
        int o = LinearLayoutManager.o(c2);
        int p = LinearLayoutManager.p(c2);
        LayoutParams layoutParams = c2.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            q += marginLayoutParams.leftMargin;
            r += marginLayoutParams.rightMargin;
            o += marginLayoutParams.topMargin;
            p += marginLayoutParams.bottomMargin;
        }
        int height = c2.getHeight() + o + p;
        int width = r + c2.getWidth() + q;
        if (this.g.c == 0) {
            i2 = (c2.getLeft() - q) - this.f.getPaddingLeft();
            if (this.e.e()) {
                i2 = -i2;
            }
        } else {
            i2 = (c2.getTop() - o) - this.f.getPaddingTop();
            width = height;
        }
        aVar.c = -i2;
        if (aVar.c >= 0) {
            aVar.b = width == 0 ? 0.0f : ((float) aVar.c) / ((float) width);
        } else if (new sk(this.g).a()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.c)}));
        }
    }

    private boolean e() {
        int i2 = this.h;
        return i2 == 1 || i2 == 4;
    }

    public final void a(int i2, boolean z) {
        this.h = z ? 2 : 3;
        boolean z2 = false;
        this.d = false;
        if (this.k != i2) {
            z2 = true;
        }
        this.k = i2;
        a(2);
        if (z2) {
            b(i2);
        }
    }

    public final void a(RecyclerView recyclerView, int i2) {
        boolean z = true;
        if (!(this.h == 1 && this.b == 1) && i2 == 1) {
            this.d = false;
            this.h = 1;
            int i3 = this.k;
            if (i3 != -1) {
                this.j = i3;
                this.k = -1;
            } else if (this.j == -1) {
                this.j = this.g.j();
            }
            a(1);
        } else if (!e() || i2 != 2) {
            if (e() && i2 == 0) {
                d();
                if (!this.m) {
                    if (this.i.a != -1) {
                        a(this.i.a, 0.0f, 0);
                    }
                } else if (this.i.c != 0) {
                    z = false;
                } else if (this.j != this.i.a) {
                    b(this.i.a);
                }
                if (z) {
                    a(0);
                    c();
                }
            }
            if (this.h == 2 && i2 == 0 && this.c) {
                d();
                if (this.i.c == 0) {
                    if (this.k != this.i.a) {
                        b(this.i.a == -1 ? 0 : this.i.a);
                    }
                    a(0);
                    c();
                }
            }
        } else {
            if (this.m) {
                a(2);
                this.l = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.e.e()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.m = r4
            r3.d()
            boolean r0 = r3.l
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0041
            r3.l = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.e
            boolean r6 = r6.e()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            if (r5 == 0) goto L_0x0031
            so$a r5 = r3.i
            int r5 = r5.c
            if (r5 == 0) goto L_0x0031
            so$a r5 = r3.i
            int r5 = r5.a
            int r5 = r5 + r4
            goto L_0x0035
        L_0x0031:
            so$a r5 = r3.i
            int r5 = r5.a
        L_0x0035:
            r3.k = r5
            int r5 = r3.j
            int r6 = r3.k
            if (r5 == r6) goto L_0x004f
            r3.b(r6)
            goto L_0x004f
        L_0x0041:
            int r5 = r3.h
            if (r5 != 0) goto L_0x004f
            so$a r5 = r3.i
            int r5 = r5.a
            if (r5 != r1) goto L_0x004c
            r5 = 0
        L_0x004c:
            r3.b(r5)
        L_0x004f:
            so$a r5 = r3.i
            int r5 = r5.a
            if (r5 != r1) goto L_0x0057
            r5 = 0
            goto L_0x005b
        L_0x0057:
            so$a r5 = r3.i
            int r5 = r5.a
        L_0x005b:
            so$a r6 = r3.i
            float r6 = r6.b
            so$a r0 = r3.i
            int r0 = r0.c
            r3.a(r5, r6, r0)
            so$a r5 = r3.i
            int r5 = r5.a
            int r6 = r3.k
            if (r5 == r6) goto L_0x0070
            if (r6 != r1) goto L_0x0080
        L_0x0070:
            so$a r5 = r3.i
            int r5 = r5.c
            if (r5 != 0) goto L_0x0080
            int r5 = r3.b
            if (r5 == r4) goto L_0x0080
            r3.a(r2)
            r3.c()
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so.a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final boolean a() {
        return this.b == 0;
    }

    public final double b() {
        d();
        double d2 = (double) this.i.a;
        double d3 = (double) this.i.b;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return d2 + d3;
    }
}
