package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;

/* renamed from: kj reason: default package */
public abstract class kj extends sa {
    private final kf a;
    private final int b;
    private km c;
    private Fragment d;

    public final Parcelable a() {
        return null;
    }

    public abstract Fragment a(int i);

    public final void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    public kj(kf kfVar) {
        this(kfVar, 0);
    }

    private kj(kf kfVar, int i) {
        this.c = null;
        this.d = null;
        this.a = kfVar;
        this.b = 0;
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

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

    public final void b(ViewGroup viewGroup) {
        km kmVar = this.c;
        if (kmVar != null) {
            kmVar.e();
            this.c = null;
        }
    }

    public final boolean a(View view, Object obj) {
        return ((Fragment) obj).H == view;
    }

    private static String a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }
}
