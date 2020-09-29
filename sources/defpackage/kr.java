package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: kr reason: default package */
public abstract class kr {
    private boolean a = true;
    ArrayList<a> c = new ArrayList<>();
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList<String> p;
    ArrayList<String> q;
    boolean r = false;
    ArrayList<Runnable> s;

    /* renamed from: kr$a */
    static final class a {
        int a;
        Fragment b;
        int c;
        int d;
        int e;
        int f;
        State g;
        State h;

        a() {
        }

        a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            this.g = State.RESUMED;
            this.h = State.RESUMED;
        }

        a(int i, Fragment fragment, State state) {
            this.a = 10;
            this.b = fragment;
            this.g = fragment.P;
            this.h = state;
        }
    }

    public final kr a(int i2, int i3) {
        return a(i2, i3, 0, 0);
    }

    public final kr a(int i2, int i3, int i4, int i5) {
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        return this;
    }

    public final kr a(int i2, Fragment fragment) {
        a(i2, fragment, (String) null, 1);
        return this;
    }

    public final kr a(int i2, Fragment fragment, String str) {
        a(i2, fragment, str, 1);
        return this;
    }

    public final kr a(View view, String str) {
        if (ks.a()) {
            String q2 = ip.q(view);
            if (q2 != null) {
                if (this.p == null) {
                    this.p = new ArrayList<>();
                    this.q = new ArrayList<>();
                } else {
                    String str2 = "' has already been added to the transaction.";
                    if (this.q.contains(str)) {
                        StringBuilder sb = new StringBuilder("A shared element with the target name '");
                        sb.append(str);
                        sb.append(str2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (this.p.contains(q2)) {
                        StringBuilder sb2 = new StringBuilder("A shared element with the source name '");
                        sb2.append(q2);
                        sb2.append(str2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                this.p.add(q2);
                this.q.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public kr a(Fragment fragment) {
        b(new a(3, fragment));
        return this;
    }

    public kr a(Fragment fragment, State state) {
        b(new a(10, fragment, state));
        return this;
    }

    public final kr a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    public final kr a(Runnable runnable) {
        h();
        if (this.s == null) {
            this.s = new ArrayList<>();
        }
        this.s.add(runnable);
        return this;
    }

    public final kr a(String str) {
        if (this.a) {
            this.j = true;
            this.k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, Fragment fragment, String str, int i3) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            if (fragment.z == null || str.equals(fragment.z)) {
                fragment.z = str;
            } else {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(str3);
                sb2.append(fragment.z);
                sb2.append(str2);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i2 != 0) {
            if (i2 == -1) {
                StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (fragment.x == 0 || fragment.x == i2) {
                fragment.x = i2;
                fragment.y = i2;
            } else {
                StringBuilder sb4 = new StringBuilder("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(str3);
                sb4.append(fragment.x);
                sb4.append(str2);
                sb4.append(i2);
                throw new IllegalStateException(sb4.toString());
            }
        }
        b(new a(i3, fragment));
    }

    public abstract int b();

    public final kr b(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            a(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public kr b(Fragment fragment) {
        b(new a(6, fragment));
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void b(a aVar) {
        this.c.add(aVar);
        aVar.c = this.d;
        aVar.d = this.e;
        aVar.e = this.f;
        aVar.f = this.g;
    }

    public abstract int c();

    public final kr c(Fragment fragment) {
        b(new a(7, fragment));
        return this;
    }

    public abstract void d();

    public abstract void e();

    public boolean g() {
        return this.c.isEmpty();
    }

    public final kr h() {
        if (!this.j) {
            this.a = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}
