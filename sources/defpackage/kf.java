package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: kf reason: default package */
public abstract class kf {
    static final kd a = new kd();
    kd b = null;

    /* renamed from: kf$a */
    public static abstract class a {
        public void a(Fragment fragment, View view) {
        }

        public void a(kf kfVar, Fragment fragment) {
        }
    }

    /* renamed from: kf$b */
    public interface b {
        void onBackStackChanged();
    }

    public abstract c a(Fragment fragment);

    public abstract Fragment a(int i);

    public abstract Fragment a(Bundle bundle, String str);

    public abstract Fragment a(String str);

    public abstract km a();

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

    public abstract boolean h();

    public kd g() {
        if (this.b == null) {
            this.b = a;
        }
        return this.b;
    }
}
