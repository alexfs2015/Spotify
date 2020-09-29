package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: s reason: default package */
public abstract class s {
    static int a = -100;
    static final dq<WeakReference<s>> b = new dq<>();
    static final Object c = new Object();

    s() {
    }

    public static s a(Activity activity, r rVar) {
        return new t(activity, rVar);
    }

    public static s a(Dialog dialog, r rVar) {
        return new t(dialog, rVar);
    }

    static void a(s sVar) {
        synchronized (c) {
            b(sVar);
        }
    }

    static void b(s sVar) {
        synchronized (c) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                s sVar2 = (s) ((WeakReference) it.next()).get();
                if (sVar2 == sVar || sVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract ActionBar a();

    public void a(int i) {
    }

    public abstract void a(Configuration configuration);

    public abstract void a(View view);

    public abstract void a(View view, LayoutParams layoutParams);

    public abstract void a(Toolbar toolbar);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract <T extends View> T b(int i);

    public abstract void b(View view, LayoutParams layoutParams);

    public abstract void c();

    public abstract void c(int i);

    public abstract void d();

    public abstract boolean d(int i);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public void h() {
    }

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public int m() {
        return -100;
    }
}
