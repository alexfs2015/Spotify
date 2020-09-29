package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.c;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayList;

/* renamed from: kl reason: default package */
public abstract class kl extends sa {
    private final kf a;
    private final int b;
    private km c;
    private ArrayList<c> d;
    private ArrayList<Fragment> e;
    private Fragment f;

    public abstract Fragment a(int i);

    @Deprecated
    public kl(kf kfVar) {
        this(kfVar, 0);
    }

    private kl(kf kfVar, int i) {
        this.c = null;
        this.d = new ArrayList<>();
        this.e = new ArrayList<>();
        this.f = null;
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

    public final Object a(ViewGroup viewGroup, int i) {
        if (this.e.size() > i) {
            Fragment fragment = (Fragment) this.e.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.c == null) {
            this.c = this.a.a();
        }
        Fragment a2 = a(i);
        if (this.d.size() > i) {
            c cVar = (c) this.d.get(i);
            if (cVar != null) {
                a2.a(cVar);
            }
        }
        while (this.e.size() <= i) {
            this.e.add(null);
        }
        a2.d_(false);
        if (this.b == 0) {
            a2.e(false);
        }
        this.e.set(i, a2);
        this.c.a(viewGroup.getId(), a2);
        if (this.b == 1) {
            this.c.a(a2, State.STARTED);
        }
        return a2;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.c == null) {
            this.c = this.a.a();
        }
        while (this.d.size() <= i) {
            this.d.add(null);
        }
        this.d.set(i, fragment.u() ? this.a.a(fragment) : null);
        this.e.set(i, null);
        this.c.a(fragment);
        if (fragment == this.f) {
            this.f = null;
        }
    }

    public final void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.d_(false);
                if (this.b == 1) {
                    if (this.c == null) {
                        this.c = this.a.a();
                    }
                    this.c.a(this.f, State.STARTED);
                } else {
                    this.f.e(false);
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
            this.f = fragment;
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

    public final Parcelable a() {
        Bundle bundle;
        if (this.d.size() > 0) {
            bundle = new Bundle();
            c[] cVarArr = new c[this.d.size()];
            this.d.toArray(cVarArr);
            bundle.putParcelableArray("states", cVarArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.e.size(); i++) {
            Fragment fragment = (Fragment) this.e.get(i);
            if (fragment != null && fragment.u()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder("f");
                sb.append(i);
                this.a.a(bundle, sb.toString(), fragment);
            }
        }
        return bundle;
    }

    public final void a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.d.clear();
            this.e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.d.add((c) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a2 = this.a.a(bundle, str);
                    if (a2 != null) {
                        while (this.e.size() <= parseInt) {
                            this.e.add(null);
                        }
                        a2.d_(false);
                        this.e.set(parseInt, a2);
                    } else {
                        new StringBuilder("Bad fragment at key ").append(str);
                    }
                }
            }
        }
    }
}
