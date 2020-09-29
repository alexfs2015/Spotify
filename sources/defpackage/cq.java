package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.spotify.music.R;

/* renamed from: cq reason: default package */
public final class cq implements bz {
    Toolbar a;
    CharSequence b;
    Callback c;
    boolean d;
    private int e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private bm n;
    private int o;
    private int p;
    private Drawable q;

    public final int m() {
        return 0;
    }

    public cq(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.abc_action_bar_up_description);
    }

    private cq(Toolbar toolbar, boolean z, int i2) {
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.b = toolbar.n;
        this.l = toolbar.o;
        this.k = this.b != null;
        this.j = toolbar.e();
        String str = null;
        cp a2 = cp.a(toolbar.getContext(), null, a.a, R.attr.actionBarStyle, 0);
        this.q = a2.a(a.l);
        if (z) {
            CharSequence c2 = a2.c(a.r);
            if (!TextUtils.isEmpty(c2)) {
                b(c2);
            }
            CharSequence c3 = a2.c(a.p);
            if (!TextUtils.isEmpty(c3)) {
                this.l = c3;
                if ((this.e & 8) != 0) {
                    this.a.b(c3);
                }
            }
            Drawable a3 = a2.a(a.n);
            if (a3 != null) {
                this.i = a3;
                o();
            }
            Drawable a4 = a2.a(a.m);
            if (a4 != null) {
                this.h = a4;
                o();
            }
            if (this.j == null) {
                Drawable drawable = this.q;
                if (drawable != null) {
                    a(drawable);
                }
            }
            a(a2.a(a.h, 0));
            int g2 = a2.g(a.g, 0);
            if (g2 != 0) {
                View inflate = LayoutInflater.from(this.a.getContext()).inflate(g2, this.a, false);
                View view = this.g;
                if (!(view == null || (this.e & 16) == 0)) {
                    this.a.removeView(view);
                }
                this.g = inflate;
                if (!(inflate == null || (this.e & 16) == 0)) {
                    this.a.addView(this.g);
                }
                a(this.e | 16);
            }
            int f2 = a2.f(a.j, 0);
            if (f2 > 0) {
                LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = f2;
                this.a.setLayoutParams(layoutParams);
            }
            int d2 = a2.d(a.f, -1);
            int d3 = a2.d(a.e, -1);
            if (d2 >= 0 || d3 >= 0) {
                Toolbar toolbar2 = this.a;
                int max = Math.max(d2, 0);
                int max2 = Math.max(d3, 0);
                toolbar2.k();
                toolbar2.m.a(max, max2);
            }
            int g3 = a2.g(a.s, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.a;
                Context context = toolbar3.getContext();
                toolbar3.f = g3;
                if (toolbar3.b != null) {
                    toolbar3.b.setTextAppearance(context, g3);
                }
            }
            int g4 = a2.g(a.q, 0);
            if (g4 != 0) {
                Toolbar toolbar4 = this.a;
                Context context2 = toolbar4.getContext();
                toolbar4.g = g4;
                if (toolbar4.c != null) {
                    toolbar4.c.setTextAppearance(context2, g4);
                }
            }
            int g5 = a2.g(a.o, 0);
            if (g5 != 0) {
                this.a.a(g5);
            }
        } else {
            int i3 = 11;
            if (this.a.e() != null) {
                i3 = 15;
                this.q = this.a.e();
            }
            this.e = i3;
        }
        a2.a.recycle();
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.a.d())) {
                int i4 = this.p;
                if (i4 != 0) {
                    str = this.a.getContext().getString(i4);
                }
                this.m = str;
                q();
            }
        }
        this.m = this.a.d();
        this.a.a((OnClickListener) new OnClickListener() {
            private ar a;

            {
                ar arVar = new ar(cq.this.a.getContext(), 0, 16908332, 0, 0, cq.this.b);
                this.a = arVar;
            }

            public final void onClick(View view) {
                if (cq.this.c != null && cq.this.d) {
                    cq.this.c.onMenuItemSelected(0, this.a);
                }
            }
        });
    }

    public final ViewGroup a() {
        return this.a;
    }

    public final Context b() {
        return this.a.getContext();
    }

    public final boolean c() {
        Toolbar toolbar = this.a;
        return (toolbar.r == null || toolbar.r.a == null) ? false : true;
    }

    public final void d() {
        this.a.c();
    }

    public final void a(Callback callback) {
        this.c = callback;
    }

    public final void a(CharSequence charSequence) {
        if (!this.k) {
            c(charSequence);
        }
    }

    public final void b(CharSequence charSequence) {
        this.k = true;
        c(charSequence);
    }

    private void c(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.e & 8) != 0) {
            this.a.a(charSequence);
        }
    }

    private void o() {
        Drawable drawable;
        int i2 = this.e;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.i;
            if (drawable == null) {
                drawable = this.h;
            }
        } else {
            drawable = this.h;
        }
        this.a.a(drawable);
    }

    public final boolean e() {
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && toolbar.a != null && toolbar.a.b;
    }

    public final boolean f() {
        return this.a.N_();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.a
            androidx.appcompat.widget.ActionMenuView r1 = r0.a
            r2 = 0
            if (r1 == 0) goto L_0x0026
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            bm r1 = r0.c
            r3 = 1
            if (r1 == 0) goto L_0x0022
            bm r0 = r0.c
            bm$c r1 = r0.k
            if (r1 != 0) goto L_0x001d
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            return r3
        L_0x0026:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq.g():boolean");
    }

    public final boolean h() {
        return this.a.b();
    }

    public final boolean i() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView.c != null && actionMenuView.c.e()) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        this.d = true;
    }

    public final void a(Menu menu, a aVar) {
        if (this.n == null) {
            this.n = new bm(this.a.getContext());
            this.n.f = R.id.action_menu_presenter;
        }
        bm bmVar = this.n;
        bmVar.d = aVar;
        this.a.a((ax) menu, bmVar);
    }

    public final void k() {
        Toolbar toolbar = this.a;
        if (toolbar.a != null) {
            toolbar.a.c();
        }
    }

    public final int l() {
        return this.e;
    }

    public final void a(int i2) {
        int i3 = this.e ^ i2;
        this.e = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    q();
                }
                p();
            }
            if ((i3 & 3) != 0) {
                o();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.a(this.b);
                    this.a.b(this.l);
                } else {
                    this.a.a((CharSequence) null);
                    this.a.b((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0) {
                View view = this.g;
                if (view != null) {
                    if ((i2 & 16) != 0) {
                        this.a.addView(view);
                        return;
                    }
                    this.a.removeView(view);
                }
            }
        }
    }

    public final void a(cj cjVar) {
        View view = this.f;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.f);
            }
        }
        this.f = cjVar;
    }

    public final void a(boolean z) {
        Toolbar toolbar = this.a;
        toolbar.u = z;
        toolbar.requestLayout();
    }

    public final is a(final int i2, long j2) {
        return ip.n(this.a).a(i2 == 0 ? 1.0f : 0.0f).a(j2).a((it) new iu() {
            private boolean a = false;

            public final void a(View view) {
                cq.this.a.setVisibility(0);
            }

            public final void b(View view) {
                if (!this.a) {
                    cq.this.a.setVisibility(i2);
                }
            }

            public final void c(View view) {
                this.a = true;
            }
        });
    }

    public final void a(Drawable drawable) {
        this.j = drawable;
        p();
    }

    private void p() {
        if ((this.e & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.j;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.b(drawable);
            return;
        }
        this.a.b((Drawable) null);
    }

    private void q() {
        if ((this.e & 4) != 0) {
            if (TextUtils.isEmpty(this.m)) {
                this.a.b(this.p);
                return;
            }
            this.a.c(this.m);
        }
    }

    public final void b(int i2) {
        this.a.setVisibility(i2);
    }

    public final void a(a aVar, a aVar2) {
        Toolbar toolbar = this.a;
        toolbar.s = aVar;
        toolbar.t = aVar2;
        if (toolbar.a != null) {
            toolbar.a.a(aVar, aVar2);
        }
    }

    public final Menu n() {
        return this.a.f();
    }
}
