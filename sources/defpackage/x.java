package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: x reason: default package */
final class x extends ActionBar {
    bz a;
    boolean b;
    Callback c;
    private boolean d;
    private boolean e;
    private ArrayList<Object> f = new ArrayList<>();
    private final Runnable g = new Runnable() {
        /* JADX INFO: finally extract failed */
        public final void run() {
            x xVar = x.this;
            Menu h = xVar.h();
            ax axVar = h instanceof ax ? (ax) h : null;
            if (axVar != null) {
                axVar.e();
            }
            try {
                h.clear();
                if (!xVar.c.onCreatePanelMenu(0, h) || !xVar.c.onPreparePanel(0, null, h)) {
                    h.clear();
                }
                if (axVar != null) {
                    axVar.f();
                }
            } catch (Throwable th) {
                if (axVar != null) {
                    axVar.f();
                }
                throw th;
            }
        }
    };
    private final androidx.appcompat.widget.Toolbar.b h = new androidx.appcompat.widget.Toolbar.b() {
        public final boolean a(MenuItem menuItem) {
            return x.this.c.onMenuItemSelected(0, menuItem);
        }
    };

    /* renamed from: x$a */
    final class a implements defpackage.bd.a {
        private boolean a;

        a() {
        }

        public final void a(ax axVar, boolean z) {
            if (!this.a) {
                this.a = true;
                x.this.a.k();
                if (x.this.c != null) {
                    x.this.c.onPanelClosed(108, axVar);
                }
                this.a = false;
            }
        }

        public final boolean a(ax axVar) {
            if (x.this.c == null) {
                return false;
            }
            x.this.c.onMenuOpened(108, axVar);
            return true;
        }
    }

    /* renamed from: x$b */
    final class b implements defpackage.ax.a {
        b() {
        }

        public final void a(ax axVar) {
            if (x.this.c != null) {
                if (x.this.a.f()) {
                    x.this.c.onPanelClosed(108, axVar);
                } else if (x.this.c.onPreparePanel(0, null, axVar)) {
                    x.this.c.onMenuOpened(108, axVar);
                }
            }
        }

        public final boolean a(ax axVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: x$c */
    class c extends aq {
        public c(Callback callback) {
            super(callback);
        }

        public final View onCreatePanelView(int i) {
            return i == 0 ? new View(x.this.a.b()) : super.onCreatePanelView(i);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !x.this.b) {
                x.this.a.j();
                x.this.b = true;
            }
            return onPreparePanel;
        }
    }

    x(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.a = new cq(toolbar, false);
        this.c = new c(callback);
        this.a.a(this.c);
        toolbar.q = this.h;
        this.a.a(charSequence);
    }

    private void a(int i, int i2) {
        this.a.a((i & i2) | ((i2 ^ -1) & this.a.l()));
    }

    public final int a() {
        return this.a.l();
    }

    public final void a(float f2) {
        ip.e((View) this.a.a(), f2);
    }

    public final void a(Configuration configuration) {
        super.a(configuration);
    }

    public final void a(Drawable drawable) {
        this.a.a(drawable);
    }

    public final void a(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void a(boolean z) {
        a(z ? 4 : 0, 4);
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        Menu h2 = h();
        if (h2 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        h2.setQwertyMode(z);
        return h2.performShortcut(i, keyEvent, 0);
    }

    public final boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            c();
        }
        return true;
    }

    public final Context b() {
        return this.a.b();
    }

    public final void b(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void b(boolean z) {
        a(8, 8);
    }

    public final boolean c() {
        return this.a.h();
    }

    public final void d(boolean z) {
    }

    public final boolean d() {
        return this.a.i();
    }

    public final void e(boolean z) {
    }

    public final boolean e() {
        this.a.a().removeCallbacks(this.g);
        ip.a((View) this.a.a(), this.g);
        return true;
    }

    public final void f(boolean z) {
        if (z != this.e) {
            this.e = z;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.get(i);
            }
        }
    }

    public final boolean f() {
        if (!this.a.c()) {
            return false;
        }
        this.a.d();
        return true;
    }

    public final void g() {
        this.a.a().removeCallbacks(this.g);
    }

    /* access modifiers changed from: 0000 */
    public Menu h() {
        if (!this.d) {
            this.a.a((defpackage.bd.a) new a(), (defpackage.ax.a) new b());
            this.d = true;
        }
        return this.a.n();
    }
}
