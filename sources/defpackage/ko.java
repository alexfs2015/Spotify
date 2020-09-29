package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;

/* renamed from: ko reason: default package */
public abstract class ko extends sf {
    private final kk a;
    private final int b;
    private kr c;
    private Fragment d;

    @Deprecated
    public ko(kk kkVar) {
        this(kkVar, 0);
    }

    private ko(kk kkVar, int i) {
        this.c = null;
        this.d = null;
        this.a = kkVar;
        this.b = 0;
    }

    private static String a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    public final Parcelable a() {
        return null;
    }

    public abstract Fragment a(int i);

    public Object a(ViewGroup viewGroup, int i) {
        if (this.c == null) {
            this.c = this.a.a();
        }
        long j = (long) i;
        Fragment a2 = this.a.a(a(viewGroup.getId(), j));
        if (a2 != null) {
            this.c.c(a2);
        } else {
            a2 = a(i);
            this.c.a(viewGroup.getId(), a2, a(viewGroup.getId(), j));
        }
        if (a2 != this.d) {
            a2.d_(false);
            if (this.b == 1) {
                this.c.a(a2, State.STARTED);
            } else {
                a2.e(false);
            }
        }
        return a2;
    }

    public final void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.c == null) {
            this.c = this.a.a();
        }
        this.c.b(fragment);
        if (fragment == this.d) {
            this.d = null;
        }
    }

    public final boolean a(View view, Object obj) {
        return ((Fragment) obj).H == view;
    }

    public final void b(ViewGroup viewGroup) {
        kr krVar = this.c;
        if (krVar != null) {
            krVar.e();
            this.c = null;
        }
    }

    public final void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.d;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.d_(false);
                if (this.b == 1) {
                    if (this.c == null) {
                        this.c = this.a.a();
                    }
                    this.c.a(this.d, State.STARTED);
                } else {
                    this.d.e(false);
                }
            }
            fragment.d_(true);
            if (this.b == 1) {
                if (this.c == null) {
                    this.c = this.a.a();
                }
                this.c.a(fragment, State.RESUMED);
            } else {
                fragment.e(true);
            }
            this.d = fragment;
        }
    }
}
