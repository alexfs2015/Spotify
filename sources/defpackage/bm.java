package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import java.util.ArrayList;

/* renamed from: bm reason: default package */
public final class bm extends as implements defpackage.hu.a {
    d g;
    public boolean h;
    e i;
    a j;
    c k;
    final f l = new f();
    int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final SparseBooleanArray t = new SparseBooleanArray();
    private b u;

    /* renamed from: bm$a */
    class a extends bc {
        public a(Context context, bi biVar, View view) {
            super(context, biVar, view, false, R.attr.actionOverflowMenuStyle);
            if (!((az) biVar.getItem()).f()) {
                this.a = bm.this.g == null ? (View) bm.this.e : bm.this.g;
            }
            a((defpackage.bd.a) bm.this.l);
        }

        public final void d() {
            bm bmVar = bm.this;
            bmVar.j = null;
            bmVar.m = 0;
            super.d();
        }
    }

    /* renamed from: bm$b */
    class b extends androidx.appcompat.view.menu.ActionMenuItemView.b {
        b() {
        }

        public final bg a() {
            if (bm.this.j != null) {
                return bm.this.j.a();
            }
            return null;
        }
    }

    /* renamed from: bm$c */
    class c implements Runnable {
        private e a;

        public c(e eVar) {
            this.a = eVar;
        }

        public final void run() {
            if (bm.this.c != null) {
                ax e = bm.this.c;
                if (e.b != null) {
                    e.b.a(e);
                }
            }
            View view = (View) bm.this.e;
            if (!(view == null || view.getWindowToken() == null || !this.a.b())) {
                bm.this.i = this.a;
            }
            bm.this.k = null;
        }
    }

    /* renamed from: bm$d */
    class d extends AppCompatImageView implements androidx.appcompat.widget.ActionMenuView.a {
        private final float[] b = new float[2];

        public final boolean c_() {
            return false;
        }

        public final boolean e() {
            return false;
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            cr.a(this, getContentDescription());
            setOnTouchListener(new cd(this, bm.this) {
                public final bg a() {
                    if (bm.this.i == null) {
                        return null;
                    }
                    return bm.this.i.a();
                }

                public final boolean b() {
                    bm.this.d();
                    return true;
                }

                public final boolean c() {
                    if (bm.this.k != null) {
                        return false;
                    }
                    bm.this.e();
                    return true;
                }
            });
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            bm.this.d();
            return true;
        }

        /* access modifiers changed from: protected */
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                gm.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: bm$e */
    class e extends bc {
        public e(Context context, ax axVar, View view, boolean z) {
            super(context, axVar, view, true, R.attr.actionOverflowMenuStyle);
            a((defpackage.bd.a) bm.this.l);
        }

        public final void d() {
            if (bm.this.c != null) {
                bm.this.c.close();
            }
            bm.this.i = null;
            super.d();
        }
    }

    /* renamed from: bm$f */
    class f implements defpackage.bd.a {
        f() {
        }

        public final boolean a(ax axVar) {
            if (axVar == null) {
                return false;
            }
            bm.this.m = ((bi) axVar).getItem().getItemId();
            defpackage.bd.a aVar = bm.this.d;
            if (aVar != null) {
                return aVar.a(axVar);
            }
            return false;
        }

        public final void a(ax axVar, boolean z) {
            if (axVar instanceof bi) {
                axVar.l().a(false);
            }
            defpackage.bd.a aVar = bm.this.d;
            if (aVar != null) {
                aVar.a(axVar, z);
            }
        }
    }

    /* renamed from: bm$g */
    static class g implements Parcelable {
        public static final Creator<g> CREATOR = new Creator<g>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new g[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new g(parcel);
            }
        };
        public int a;

        public final int describeContents() {
            return 0;
        }

        g() {
        }

        g(Parcel parcel) {
            this.a = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    public bm(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    public final void a(Context context, ax axVar) {
        super.a(context, axVar);
        Resources resources = context.getResources();
        ai a2 = ai.a(context);
        if (!this.o) {
            boolean z = true;
            if (VERSION.SDK_INT < 19 && ViewConfiguration.get(a2.a).hasPermanentMenuKey()) {
                z = false;
            }
            this.n = z;
        }
        this.p = a2.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.r = a2.a();
        int i2 = this.p;
        if (this.n) {
            if (this.g == null) {
                this.g = new d(this.a);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.q = i2;
        this.s = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public final void c() {
        this.r = ai.a(this.b).a();
        if (this.c != null) {
            this.c.b(true);
        }
    }

    public final void b(boolean z) {
        this.n = true;
        this.o = true;
    }

    public final be a(ViewGroup viewGroup) {
        be beVar = this.e;
        be a2 = super.a(viewGroup);
        if (beVar != a2) {
            ((ActionMenuView) a2).a(this);
        }
        return a2;
    }

    public final View a(az azVar, View view, ViewGroup viewGroup) {
        View actionView = azVar.getActionView();
        if (actionView == null || azVar.j()) {
            actionView = super.a(azVar, view, viewGroup);
        }
        actionView.setVisibility(azVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public final void a(az azVar, defpackage.be.a aVar) {
        aVar.a(azVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.b = (ActionMenuView) this.e;
        if (this.u == null) {
            this.u = new b();
        }
        actionMenuItemView.c = this.u;
    }

    public final boolean a(az azVar) {
        return azVar.f();
    }

    public final void a(boolean z) {
        super.a(z);
        ((View) this.e).requestLayout();
        boolean z2 = false;
        if (this.c != null) {
            ax axVar = this.c;
            axVar.j();
            ArrayList<az> arrayList = axVar.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                hu huVar = ((az) arrayList.get(i2)).e;
                if (huVar != null) {
                    huVar.c = this;
                }
            }
        }
        ArrayList k2 = this.c != null ? this.c.k() : null;
        if (this.n && k2 != null) {
            int size2 = k2.size();
            if (size2 == 1) {
                z2 = !((az) k2.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.g == null) {
                this.g = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.g.getParent();
            if (viewGroup != this.e) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.e;
                actionMenuView.addView(this.g, actionMenuView.a());
            }
        } else {
            d dVar = this.g;
            if (dVar != null && dVar.getParent() == this.e) {
                ((ViewGroup) this.e).removeView(this.g);
            }
        }
        ((ActionMenuView) this.e).b = this.n;
    }

    public final boolean a(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.g) {
            return false;
        }
        return super.a(viewGroup, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.bi r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r8
        L_0x0009:
            ax r2 = r0.k
            ax r3 = r7.c
            if (r2 == r3) goto L_0x0014
            ax r0 = r0.k
            bi r0 = (defpackage.bi) r0
            goto L_0x0009
        L_0x0014:
            android.view.MenuItem r0 = r0.getItem()
            be r2 = r7.e
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x003a
            int r3 = r2.getChildCount()
            r4 = 0
        L_0x0023:
            if (r4 >= r3) goto L_0x003a
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof defpackage.be.a
            if (r6 == 0) goto L_0x0037
            r6 = r5
            be$a r6 = (defpackage.be.a) r6
            az r6 = r6.a()
            if (r6 != r0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x003a:
            r5 = 0
        L_0x003b:
            if (r5 != 0) goto L_0x003e
            return r1
        L_0x003e:
            android.view.MenuItem r0 = r8.getItem()
            int r0 = r0.getItemId()
            r7.m = r0
            int r0 = r8.size()
            r2 = 0
        L_0x004d:
            r3 = 1
            if (r2 >= r0) goto L_0x0065
            android.view.MenuItem r4 = r8.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x0062
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x0062
            r1 = 1
            goto L_0x0065
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004d
        L_0x0065:
            bm$a r0 = new bm$a
            android.content.Context r2 = r7.b
            r0.<init>(r2, r8, r5)
            r7.j = r0
            bm$a r0 = r7.j
            r0.a(r1)
            bm$a r0 = r7.j
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x007f
            super.a(r8)
            return r3
        L_0x007f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r8.<init>(r0)
            goto L_0x0088
        L_0x0087:
            throw r8
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.a(bi):boolean");
    }

    public final boolean d() {
        if (!this.n || i() || this.c == null || this.e == null || this.k != null || this.c.k().isEmpty()) {
            return false;
        }
        e eVar = new e(this.b, this.c, this.g, true);
        this.k = new c(eVar);
        ((View) this.e).post(this.k);
        super.a((bi) null);
        return true;
    }

    public final boolean e() {
        if (this.k == null || this.e == null) {
            e eVar = this.i;
            if (eVar == null) {
                return false;
            }
            eVar.c();
            return true;
        }
        ((View) this.e).removeCallbacks(this.k);
        this.k = null;
        return true;
    }

    public final boolean g() {
        return e() | h();
    }

    public final boolean h() {
        a aVar = this.j;
        if (aVar == null) {
            return false;
        }
        aVar.c();
        return true;
    }

    public final boolean i() {
        e eVar = this.i;
        return eVar != null && eVar.e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r17 = this;
            r0 = r17
            ax r1 = r0.c
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0013
            ax r1 = r0.c
            java.util.ArrayList r1 = r1.i()
            int r4 = r1.size()
            goto L_0x0015
        L_0x0013:
            r1 = r2
            r4 = 0
        L_0x0015:
            int r5 = r0.r
            int r6 = r0.q
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            be r8 = r0.e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r12 = r5
            r5 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0026:
            r13 = 1
            if (r5 >= r4) goto L_0x0050
            java.lang.Object r14 = r1.get(r5)
            az r14 = (defpackage.az) r14
            boolean r15 = r14.h()
            if (r15 == 0) goto L_0x0038
            int r10 = r10 + 1
            goto L_0x0042
        L_0x0038:
            boolean r15 = r14.g()
            if (r15 == 0) goto L_0x0041
            int r11 = r11 + 1
            goto L_0x0042
        L_0x0041:
            r9 = 1
        L_0x0042:
            boolean r13 = r0.h
            if (r13 == 0) goto L_0x004d
            boolean r13 = r14.isActionViewExpanded()
            if (r13 == 0) goto L_0x004d
            r12 = 0
        L_0x004d:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x0050:
            boolean r5 = r0.n
            if (r5 == 0) goto L_0x005b
            if (r9 != 0) goto L_0x0059
            int r11 = r11 + r10
            if (r11 <= r12) goto L_0x005b
        L_0x0059:
            int r12 = r12 + -1
        L_0x005b:
            int r12 = r12 - r10
            android.util.SparseBooleanArray r5 = r0.t
            r5.clear()
            r9 = r6
            r6 = 0
            r10 = 0
        L_0x0064:
            if (r6 >= r4) goto L_0x010b
            java.lang.Object r11 = r1.get(r6)
            az r11 = (defpackage.az) r11
            boolean r14 = r11.h()
            if (r14 == 0) goto L_0x0090
            android.view.View r14 = r0.a(r11, r2, r8)
            r14.measure(r7, r7)
            int r14 = r14.getMeasuredWidth()
            int r9 = r9 - r14
            if (r10 != 0) goto L_0x0081
            r10 = r14
        L_0x0081:
            int r14 = r11.getGroupId()
            if (r14 == 0) goto L_0x008a
            r5.put(r14, r13)
        L_0x008a:
            r11.d(r13)
        L_0x008d:
            r2 = 0
            goto L_0x0104
        L_0x0090:
            boolean r14 = r11.g()
            if (r14 == 0) goto L_0x0100
            int r14 = r11.getGroupId()
            boolean r15 = r5.get(r14)
            if (r12 > 0) goto L_0x00a2
            if (r15 == 0) goto L_0x00a7
        L_0x00a2:
            if (r9 <= 0) goto L_0x00a7
            r16 = 1
            goto L_0x00a9
        L_0x00a7:
            r16 = 0
        L_0x00a9:
            if (r16 == 0) goto L_0x00c3
            android.view.View r3 = r0.a(r11, r2, r8)
            r3.measure(r7, r7)
            int r3 = r3.getMeasuredWidth()
            int r9 = r9 - r3
            if (r10 != 0) goto L_0x00ba
            r10 = r3
        L_0x00ba:
            int r3 = r9 + r10
            if (r3 <= 0) goto L_0x00c0
            r3 = 1
            goto L_0x00c1
        L_0x00c0:
            r3 = 0
        L_0x00c1:
            r16 = r16 & r3
        L_0x00c3:
            r3 = r16
            if (r3 == 0) goto L_0x00cd
            if (r14 == 0) goto L_0x00cd
            r5.put(r14, r13)
            goto L_0x00f6
        L_0x00cd:
            if (r15 == 0) goto L_0x00f6
            r15 = 0
            r5.put(r14, r15)
            r15 = r12
            r12 = 0
        L_0x00d5:
            if (r12 >= r6) goto L_0x00f7
            java.lang.Object r16 = r1.get(r12)
            r2 = r16
            az r2 = (defpackage.az) r2
            int r13 = r2.getGroupId()
            if (r13 != r14) goto L_0x00f1
            boolean r13 = r2.f()
            if (r13 == 0) goto L_0x00ed
            int r15 = r15 + 1
        L_0x00ed:
            r13 = 0
            r2.d(r13)
        L_0x00f1:
            int r12 = r12 + 1
            r2 = 0
            r13 = 1
            goto L_0x00d5
        L_0x00f6:
            r15 = r12
        L_0x00f7:
            if (r3 == 0) goto L_0x00fb
            int r15 = r15 + -1
        L_0x00fb:
            r11.d(r3)
            r12 = r15
            goto L_0x008d
        L_0x0100:
            r2 = 0
            r11.d(r2)
        L_0x0104:
            int r6 = r6 + 1
            r2 = 0
            r3 = 0
            r13 = 1
            goto L_0x0064
        L_0x010b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.a():boolean");
    }

    public final void a(ax axVar, boolean z) {
        g();
        super.a(axVar, z);
    }

    public final Parcelable f() {
        g gVar = new g();
        gVar.a = this.m;
        return gVar;
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof g) {
            g gVar = (g) parcelable;
            if (gVar.a > 0) {
                MenuItem findItem = this.c.findItem(gVar.a);
                if (findItem != null) {
                    a((bi) findItem.getSubMenu());
                }
            }
        }
    }

    public final void a(ActionMenuView actionMenuView) {
        this.e = actionMenuView;
        actionMenuView.a = this.c;
    }
}
