package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: hu reason: default package */
public abstract class hu {
    protected final Context b;
    public a c;
    public b d;

    /* renamed from: hu$a */
    public interface a {
    }

    /* renamed from: hu$b */
    public interface b {
        void a();
    }

    public abstract View a();

    public void a(SubMenu subMenu) {
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return true;
    }

    public hu(Context context) {
        this.b = context;
    }

    public View a(MenuItem menuItem) {
        return a();
    }

    public void f() {
        if (this.d != null && d()) {
            b bVar = this.d;
            e();
            bVar.a();
        }
    }

    public void a(b bVar) {
        if (this.d != null) {
            StringBuilder sb = new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
        }
        this.d = bVar;
    }
}
