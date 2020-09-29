package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: kk reason: default package */
public abstract class kk {
    static final ki a = new ki();
    ki b = null;

    /* renamed from: kk$a */
    public static abstract class a {
        public void a(kk kkVar, Fragment fragment) {
        }

        public void a(kk kkVar, Fragment fragment, View view) {
        }
    }

    /* renamed from: kk$b */
    public interface b {
        void onBackStackChanged();
    }

    public abstract c a(Fragment fragment);

    public abstract Fragment a(int i);

    public abstract Fragment a(Bundle bundle, String str);

    public abstract Fragment a(String str);

    public abstract kr a();

    public abstract void a(int i, int i2);

    public abstract void a(Bundle bundle, String str, Fragment fragment);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void a(a aVar);

    public abstract void a(a aVar, boolean z);

    public abstract void a(b bVar);

    public abstract boolean b();

    public abstract void c();

    public abstract boolean d();

    public abstract int e();

    public abstract List<Fragment> f();

    public abstract boolean g();

    public ki h() {
        if (this.b == null) {
            this.b = a;
        }
        return this.b;
    }

    public abstract boolean i();
}
