package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: aj reason: default package */
public abstract class aj {
    Object b;
    boolean c;

    /* renamed from: aj$a */
    public interface a {
        void a(aj ajVar);

        boolean a(aj ajVar, Menu menu);

        boolean a(aj ajVar, MenuItem menuItem);

        boolean b(aj ajVar, Menu menu);
    }

    public abstract MenuInflater a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(CharSequence charSequence);

    public void a(boolean z) {
        this.c = z;
    }

    public abstract Menu b();

    public abstract void b(int i);

    public abstract void b(CharSequence charSequence);

    public abstract void c();

    public abstract void d();

    public abstract CharSequence f();

    public abstract CharSequence g();

    public boolean h() {
        return false;
    }

    public abstract View i();
}
