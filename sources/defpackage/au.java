package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: au reason: default package */
final class au extends bb implements OnKeyListener, OnDismissListener, bd {
    private static final int h = 2131623947;
    private defpackage.bd.a A;
    private OnDismissListener B;
    final Handler a;
    final List<a> b = new ArrayList();
    final OnGlobalLayoutListener c = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (au.this.e() && au.this.b.size() > 0 && !((a) au.this.b.get(0)).a.o) {
                View view = au.this.d;
                if (view == null || !view.isShown()) {
                    au.this.d();
                    return;
                }
                for (a aVar : au.this.b) {
                    aVar.a.d_();
                }
            }
        }
    };
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final List<ax> n = new ArrayList();
    private final OnAttachStateChangeListener o = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (au.this.e != null) {
                if (!au.this.e.isAlive()) {
                    au.this.e = view.getViewTreeObserver();
                }
                au.this.e.removeGlobalOnLayoutListener(au.this.c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final ce p = new ce() {
        public final void a(ax axVar, MenuItem menuItem) {
            au.this.a.removeCallbacksAndMessages(axVar);
        }

        public final void b(final ax axVar, final MenuItem menuItem) {
            final a aVar = null;
            au.this.a.removeCallbacksAndMessages(null);
            int size = au.this.b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (axVar == ((a) au.this.b.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < au.this.b.size()) {
                    aVar = (a) au.this.b.get(i2);
                }
                au.this.a.postAtTime(new Runnable() {
                    public final void run() {
                        if (aVar != null) {
                            au.this.f = true;
                            aVar.b.a(false);
                            au.this.f = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            axVar.a(menuItem, (bd) null, 4);
                        }
                    }
                }, axVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };
    private int q = 0;
    private int r = 0;
    private View s;
    private int t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    /* renamed from: au$a */
    static class a {
        public final cf a;
        public final ax b;
        public final int c;

        public a(cf cfVar, ax axVar, int i) {
            this.a = cfVar;
            this.b = axVar;
            this.c = i;
        }
    }

    public final void a(Parcelable parcelable) {
    }

    public final boolean a() {
        return false;
    }

    public final Parcelable f() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        return false;
    }

    public au(Context context, View view, int i2, int i3, boolean z2) {
        this.i = context;
        this.s = view;
        this.k = i2;
        this.l = i3;
        this.m = z2;
        this.y = false;
        this.t = j();
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    public final void b(boolean z2) {
        this.y = z2;
    }

    private cf i() {
        cf cfVar = new cf(this.i, null, this.k, this.l);
        cfVar.a = this.p;
        cfVar.l = this;
        cfVar.a((OnDismissListener) this);
        cfVar.k = this.s;
        cfVar.h = this.r;
        cfVar.a(true);
        cfVar.e(2);
        return cfVar;
    }

    public final void d_() {
        if (!e()) {
            for (ax c2 : this.n) {
                c(c2);
            }
            this.n.clear();
            this.d = this.s;
            if (this.d != null) {
                boolean z2 = this.e == null;
                this.e = this.d.getViewTreeObserver();
                if (z2) {
                    this.e.addOnGlobalLayoutListener(this.c);
                }
                this.d.addOnAttachStateChangeListener(this.o);
            }
        }
    }

    public final void d() {
        int size = this.b.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.b.toArray(new a[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                a aVar = aVarArr[i2];
                if (aVar.a.p.isShowing()) {
                    aVar.a.d();
                }
            }
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        d();
        return true;
    }

    private int j() {
        return ip.f(this.s) == 1 ? 0 : 1;
    }

    private int d(int i2) {
        List<a> list = this.b;
        cb cbVar = ((a) list.get(list.size() - 1)).a.e;
        int[] iArr = new int[2];
        cbVar.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.d.getWindowVisibleDisplayFrame(rect);
        if (this.t == 1) {
            if (iArr[0] + cbVar.getWidth() + i2 > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i2 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public final void a(ax axVar) {
        axVar.a((bd) this, this.i);
        if (e()) {
            c(axVar);
        } else {
            this.n.add(axVar);
        }
    }

    private void c(ax axVar) {
        View view;
        a aVar;
        int i2;
        int i3;
        int i4;
        LayoutInflater from = LayoutInflater.from(this.i);
        aw awVar = new aw(axVar, from, this.m, h);
        if (!e() && this.y) {
            awVar.b = true;
        } else if (e()) {
            awVar.b = bb.b(axVar);
        }
        int a2 = a(awVar, null, this.i, this.j);
        cf i5 = i();
        i5.a((ListAdapter) awVar);
        i5.d(a2);
        i5.h = this.r;
        if (this.b.size() > 0) {
            List<a> list = this.b;
            aVar = (a) list.get(list.size() - 1);
            view = a(aVar, axVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            i5.c(false);
            i5.a(null);
            int d2 = d(a2);
            boolean z2 = d2 == 1;
            this.t = d2;
            if (VERSION.SDK_INT >= 26) {
                i5.k = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr = new int[2];
                this.s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.r & 7) == 5) {
                    iArr[0] = iArr[0] + this.s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i2 = iArr2[0] - iArr[0];
                i3 = iArr2[1] - iArr[1];
            }
            if ((this.r & 5) != 5) {
                if (z2) {
                    a2 = view.getWidth();
                }
                i4 = i2 - a2;
                i5.g = i4;
                i5.b(true);
                i5.a(i3);
            } else if (!z2) {
                a2 = view.getWidth();
                i4 = i2 - a2;
                i5.g = i4;
                i5.b(true);
                i5.a(i3);
            }
            i4 = i2 + a2;
            i5.g = i4;
            i5.b(true);
            i5.a(i3);
        } else {
            if (this.u) {
                i5.g = this.w;
            }
            if (this.v) {
                i5.a(this.x);
            }
            i5.a(this.g);
        }
        this.b.add(new a(i5, axVar, this.t));
        i5.d_();
        cb cbVar = i5.e;
        cbVar.setOnKeyListener(this);
        if (aVar == null && this.z && axVar.f != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, cbVar, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(axVar.f);
            cbVar.addHeaderView(frameLayout, null, false);
            i5.d_();
        }
    }

    private static MenuItem a(ax axVar, ax axVar2) {
        int size = axVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = axVar.getItem(i2);
            if (item.hasSubMenu() && axVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(a aVar, ax axVar) {
        int i2;
        aw awVar;
        MenuItem a2 = a(aVar.b, axVar);
        if (a2 == null) {
            return null;
        }
        cb cbVar = aVar.a.e;
        ListAdapter adapter = cbVar.getAdapter();
        int i3 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i2 = headerViewListAdapter.getHeadersCount();
            awVar = (aw) headerViewListAdapter.getWrappedAdapter();
        } else {
            awVar = (aw) adapter;
            i2 = 0;
        }
        int count = awVar.getCount();
        while (true) {
            if (i3 >= count) {
                i3 = -1;
                break;
            } else if (a2 == awVar.getItem(i3)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return null;
        }
        int firstVisiblePosition = (i3 + i2) - cbVar.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= cbVar.getChildCount()) {
            return null;
        }
        return cbVar.getChildAt(firstVisiblePosition);
    }

    public final boolean e() {
        return this.b.size() > 0 && ((a) this.b.get(0)).a.p.isShowing();
    }

    public final void onDismiss() {
        a aVar;
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                aVar = null;
                break;
            }
            aVar = (a) this.b.get(i2);
            if (!aVar.a.p.isShowing()) {
                break;
            }
            i2++;
        }
        if (aVar != null) {
            aVar.b.a(false);
        }
    }

    public final void a(boolean z2) {
        for (a aVar : this.b) {
            a(aVar.a.e.getAdapter()).notifyDataSetChanged();
        }
    }

    public final void a(defpackage.bd.a aVar) {
        this.A = aVar;
    }

    public final boolean a(bi biVar) {
        for (a aVar : this.b) {
            if (biVar == aVar.b) {
                aVar.a.e.requestFocus();
                return true;
            }
        }
        if (!biVar.hasVisibleItems()) {
            return false;
        }
        a((ax) biVar);
        defpackage.bd.a aVar2 = this.A;
        if (aVar2 != null) {
            aVar2.a(biVar);
        }
        return true;
    }

    public final void a(int i2) {
        if (this.q != i2) {
            this.q = i2;
            this.r = hx.a(i2, ip.f(this.s));
        }
    }

    public final void a(View view) {
        if (this.s != view) {
            this.s = view;
            this.r = hx.a(this.q, ip.f(this.s));
        }
    }

    public final void a(OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    public final ListView g() {
        if (this.b.isEmpty()) {
            return null;
        }
        List<a> list = this.b;
        return ((a) list.get(list.size() - 1)).a.e;
    }

    public final void b(int i2) {
        this.u = true;
        this.w = i2;
    }

    public final void c(int i2) {
        this.v = true;
        this.x = i2;
    }

    public final void c(boolean z2) {
        this.z = z2;
    }

    public final void a(ax axVar, boolean z2) {
        int size = this.b.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (axVar == ((a) this.b.get(i2)).b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.b.size()) {
                ((a) this.b.get(i3)).b.a(false);
            }
            a aVar = (a) this.b.remove(i2);
            aVar.b.b((bd) this);
            if (this.f) {
                cf cfVar = aVar.a;
                if (VERSION.SDK_INT >= 23) {
                    cfVar.p.setExitTransition(null);
                }
                aVar.a.p.setAnimationStyle(0);
            }
            aVar.a.d();
            int size2 = this.b.size();
            if (size2 > 0) {
                this.t = ((a) this.b.get(size2 - 1)).c;
            } else {
                this.t = j();
            }
            if (size2 == 0) {
                d();
                defpackage.bd.a aVar2 = this.A;
                if (aVar2 != null) {
                    aVar2.a(axVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.e;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.e.removeGlobalOnLayoutListener(this.c);
                    }
                    this.e = null;
                }
                this.d.removeOnAttachStateChangeListener(this.o);
                this.B.onDismiss();
                return;
            }
            if (z2) {
                ((a) this.b.get(0)).b.a(false);
            }
        }
    }
}
