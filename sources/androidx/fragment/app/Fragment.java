package androidx.fragment.app;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener, lm, mc, pr {
    static final Object a_ = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F = true;
    public ViewGroup G;
    public View H;
    public View I;
    public boolean J;
    public boolean K = true;
    public boolean L;
    public boolean M;
    public float N;
    public boolean O;
    public State P = State.RESUMED;
    public ln Q;
    public kv R;
    public ls<lm> S = new ls<>();
    private a T;
    private Runnable U = new Runnable() {
        public final void run() {
            Fragment.this.I();
        }
    };
    private LayoutInflater V;
    private pq W;
    private Boolean a = null;
    private boolean b;
    public int b_ = 0;
    public Bundle e;
    public SparseArray<Parcelable> f;
    public Boolean g;
    public String h = UUID.randomUUID().toString();
    public Bundle i;
    public Fragment j;
    public String k = null;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public kl t;
    public kj u;
    public kl v = new kl();
    public Fragment w;
    public int x;
    public int y;
    public String z;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    static class a {
        View a;
        Animator b;
        int c;
        int d;
        int e;
        int f;
        Object g = null;
        Object h = Fragment.a_;
        Object i = null;
        Object j = Fragment.a_;
        Object k = null;
        Object l = Fragment.a_;
        fp m = null;
        fp n = null;
        boolean o;
        b p;
        boolean q;

        a() {
        }
    }

    public interface b {
        void a();

        void b();
    }

    public static class c implements Parcelable {
        public static final Creator<c> CREATOR = new ClassLoaderCreator<c>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }
        };
        public final Bundle a;

        public c(Bundle bundle) {
            this.a = bundle;
        }

        c(Parcel parcel, ClassLoader classLoader) {
            this.a = parcel.readBundle();
            if (classLoader != null) {
                Bundle bundle = this.a;
                if (bundle != null) {
                    bundle.setClassLoader(classLoader);
                }
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }
    }

    public Fragment() {
        ab_();
    }

    @Deprecated
    public static Fragment a(Context context, String str, Bundle bundle) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            Fragment fragment = (Fragment) ki.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.g(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            StringBuilder sb = new StringBuilder(str3);
            sb.append(str);
            sb.append(str2);
            throw new InstantiationException(sb.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb2 = new StringBuilder(str3);
            sb2.append(str);
            sb2.append(str2);
            throw new InstantiationException(sb2.toString(), e3);
        } catch (NoSuchMethodException e4) {
            StringBuilder sb3 = new StringBuilder(str3);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new InstantiationException(sb3.toString(), e4);
        } catch (InvocationTargetException e5) {
            StringBuilder sb4 = new StringBuilder(str3);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new InstantiationException(sb4.toString(), e5);
        }
    }

    private boolean ai() {
        kl klVar = this.t;
        if (klVar == null) {
            return false;
        }
        return klVar.i();
    }

    private a aj() {
        if (this.T == null) {
            this.T = new a();
        }
        return this.T;
    }

    public void A() {
        this.b = true;
    }

    public void B() {
        this.b = true;
    }

    public final Object C() {
        if (this.T == null) {
        }
        return null;
    }

    public final Object D() {
        a aVar = this.T;
        if (aVar == null) {
            return null;
        }
        return aVar.h == a_ ? C() : this.T.h;
    }

    public final Object E() {
        if (this.T == null) {
        }
        return null;
    }

    public final Object F() {
        a aVar = this.T;
        if (aVar == null) {
            return null;
        }
        return aVar.j == a_ ? E() : this.T.j;
    }

    public final Object G() {
        a aVar = this.T;
        if (aVar == null) {
            return null;
        }
        return aVar.k;
    }

    public final Object H() {
        a aVar = this.T;
        if (aVar == null) {
            return null;
        }
        return aVar.l == a_ ? G() : this.T.l;
    }

    public final void I() {
        kl klVar = this.t;
        if (klVar == null || klVar.j == null) {
            aj().o = false;
        } else if (Looper.myLooper() != this.t.j.c.getLooper()) {
            this.t.j.c.postAtFrontOfQueue(new Runnable() {
                public final void run() {
                    Fragment.this.J();
                }
            });
        } else {
            J();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void J() {
        b bVar;
        a aVar = this.T;
        if (aVar == null) {
            bVar = null;
        } else {
            aVar.o = false;
            bVar = aVar.p;
            this.T.p = null;
        }
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void K() {
        this.v.a(this.u, (kg) new kg() {
            public final View a(int i) {
                if (Fragment.this.H != null) {
                    return Fragment.this.H.findViewById(i);
                }
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(this);
                sb.append(" does not have a view");
                throw new IllegalStateException(sb.toString());
            }

            public final boolean e_() {
                return Fragment.this.H != null;
            }
        }, this);
        this.b = false;
        a(this.u.b);
        if (!this.b) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onAttach()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    public final void L() {
        this.v.n();
        this.v.l();
        this.b_ = 3;
        this.b = false;
        aP_();
        if (this.b) {
            this.Q.a(Event.ON_START);
            if (this.H != null) {
                this.R.a(Event.ON_START);
            }
            this.v.q();
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new SuperNotCalledException(sb.toString());
    }

    public final void M() {
        this.v.n();
        this.v.l();
        this.b_ = 4;
        this.b = false;
        z();
        if (this.b) {
            this.Q.a(Event.ON_RESUME);
            if (this.H != null) {
                this.R.a(Event.ON_RESUME);
            }
            this.v.r();
            this.v.l();
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new SuperNotCalledException(sb.toString());
    }

    public final void N() {
        boolean b2 = this.t.b(this);
        Boolean bool = this.a;
        if (bool == null || bool.booleanValue() != b2) {
            this.a = Boolean.valueOf(b2);
            kl klVar = this.v;
            klVar.j();
            klVar.n(klVar.l);
        }
    }

    public final void O() {
        onLowMemory();
        this.v.u();
    }

    public final void P() {
        this.v.b(3);
        if (this.H != null) {
            this.R.a(Event.ON_PAUSE);
        }
        this.Q.a(Event.ON_PAUSE);
        this.b_ = 3;
        this.b = false;
        A();
        if (!this.b) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    public final void Q() {
        this.v.s();
        if (this.H != null) {
            this.R.a(Event.ON_STOP);
        }
        this.Q.a(Event.ON_STOP);
        this.b_ = 2;
        this.b = false;
        h();
        if (!this.b) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    public final void R() {
        this.v.b(1);
        if (this.H != null) {
            this.R.a(Event.ON_DESTROY);
        }
        this.b_ = 1;
        this.b = false;
        aw_();
        if (this.b) {
            md.a(this).a();
            this.r = false;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new SuperNotCalledException(sb.toString());
    }

    public final void S() {
        this.v.t();
        this.Q.a(Event.ON_DESTROY);
        this.b_ = 0;
        this.b = false;
        this.O = false;
        B();
        if (!this.b) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDestroy()");
            throw new SuperNotCalledException(sb.toString());
        }
    }

    public final void T() {
        this.b = false;
        aI_();
        this.V = null;
        if (!this.b) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new SuperNotCalledException(sb.toString());
        } else if (!this.v.m) {
            this.v.t();
            this.v = new kl();
        }
    }

    public final int U() {
        a aVar = this.T;
        if (aVar == null) {
            return 0;
        }
        return aVar.d;
    }

    public final int V() {
        a aVar = this.T;
        if (aVar == null) {
            return 0;
        }
        return aVar.e;
    }

    public final int W() {
        a aVar = this.T;
        if (aVar == null) {
            return 0;
        }
        return aVar.f;
    }

    public final fp X() {
        if (this.T == null) {
        }
        return null;
    }

    public final fp Y() {
        if (this.T == null) {
        }
        return null;
    }

    public final Lifecycle Y_() {
        return this.Q;
    }

    public final View Z() {
        a aVar = this.T;
        if (aVar == null) {
            return null;
        }
        return aVar.a;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public final String a(int i2) {
        return o().getResources().getString(i2);
    }

    public final String a(int i2, Object... objArr) {
        return o().getResources().getString(i2, objArr);
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public final void a(Animator animator) {
        aj().b = animator;
    }

    public void a(Context context) {
        this.b = true;
        kj kjVar = this.u;
        if ((kjVar == null ? null : kjVar.a) != null) {
            this.b = false;
            this.b = true;
        }
    }

    public void a(Intent intent) {
        kj kjVar = this.u;
        if (kjVar != null) {
            kjVar.a(this, intent, -1, (Bundle) null);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public final void a(Intent intent, int i2, Bundle bundle) {
        kj kjVar = this.u;
        if (kjVar != null) {
            kjVar.a(this, intent, i2, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public final void a(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.v.a(configuration);
    }

    public final void a(AttributeSet attributeSet, Bundle bundle) {
        this.b = true;
        kj kjVar = this.u;
        if ((kjVar == null ? null : kjVar.a) != null) {
            this.b = false;
            this.b = true;
        }
    }

    public void a(Menu menu) {
    }

    public void a(Menu menu, MenuInflater menuInflater) {
    }

    public final void a(View view) {
        aj().a = view;
    }

    public void a(View view, Bundle bundle) {
    }

    public final void a(b bVar) {
        aj();
        if (bVar != this.T.p) {
            if (bVar == null || this.T.p == null) {
                if (bVar != null) {
                    bVar.b();
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void a(c cVar) {
        if (this.t == null) {
            this.e = (cVar == null || cVar.a == null) ? null : cVar.a;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public final void a(Fragment fragment, int i2) {
        kl klVar = this.t;
        kl klVar2 = fragment != null ? fragment.t : null;
        if (klVar == null || klVar2 == null || klVar == klVar2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (fragment2 != this) {
                    fragment2 = fragment2.m();
                } else {
                    StringBuilder sb = new StringBuilder("Setting ");
                    sb.append(fragment);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (fragment == null) {
                this.k = null;
                this.j = null;
            } else if (this.t == null || fragment.t == null) {
                this.k = null;
                this.j = fragment;
            } else {
                this.k = fragment.h;
                this.j = null;
            }
            this.l = i2;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Fragment ");
        sb2.append(fragment);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mTag=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.b_);
        printWriter.print(" mWho=");
        printWriter.print(this.h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.w);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.i);
        }
        if (this.e != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.e);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f);
        }
        Fragment m2 = m();
        if (m2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.l);
        }
        if (U() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(U());
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.H);
        }
        if (Z() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(Z());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(ab());
        }
        if (n() != null) {
            md.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder("Child ");
        sb.append(this.v);
        sb.append(":");
        printWriter.println(sb.toString());
        kl klVar = this.v;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        klVar.a(sb2.toString(), fileDescriptor, printWriter, strArr);
    }

    public boolean a(MenuItem menuItem) {
        return false;
    }

    public void aI_() {
        this.b = true;
    }

    public final pp aO_() {
        return this.W.a;
    }

    public void aP_() {
        this.b = true;
    }

    public final void a_(Object obj) {
        aj().k = obj;
    }

    public final Animator aa() {
        a aVar = this.T;
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    public final int ab() {
        a aVar = this.T;
        if (aVar == null) {
            return 0;
        }
        return aVar.c;
    }

    public void ab_() {
        this.Q = new ln(this);
        this.W = pq.a((pr) this);
        if (VERSION.SDK_INT >= 19) {
            this.Q.a((ll) new lk() {
                public final void a(lm lmVar, Event event) {
                    if (event == Event.ON_STOP && Fragment.this.H != null) {
                        Fragment.this.H.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    public final boolean ac() {
        if (this.T == null) {
        }
        return false;
    }

    public final boolean ad() {
        a aVar = this.T;
        if (aVar == null) {
            return false;
        }
        return aVar.q;
    }

    public final mb aq_() {
        kl klVar = this.t;
        if (klVar != null) {
            kn knVar = klVar.n;
            mb mbVar = (mb) knVar.c.get(this.h);
            if (mbVar != null) {
                return mbVar;
            }
            mb mbVar2 = new mb();
            knVar.c.put(this.h, mbVar2);
            return mbVar2;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void aw_() {
        this.b = true;
    }

    public final void b(int i2, int i3) {
        if (this.T != null || i2 != 0 || i3 != 0) {
            aj();
            a aVar = this.T;
            aVar.e = i2;
            aVar.f = i3;
        }
    }

    public void b(Bundle bundle) {
        boolean z2 = true;
        this.b = true;
        i(bundle);
        if (this.v.i <= 0) {
            z2 = false;
        }
        if (!z2) {
            this.v.o();
        }
    }

    public final void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.n();
        boolean z2 = true;
        this.r = true;
        this.R = new kv();
        this.H = a(layoutInflater, viewGroup, bundle);
        if (this.H != null) {
            this.R.b();
            this.S.b(this.R);
            return;
        }
        if (this.R.a == null) {
            z2 = false;
        }
        if (!z2) {
            this.R = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final boolean b(Menu menu) {
        boolean z2 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            z2 = true;
            a(menu);
        }
        return z2 | this.v.a(menu);
    }

    public final boolean b(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            z2 = true;
            a(menu, menuInflater);
        }
        return z2 | this.v.a(menu, menuInflater);
    }

    public final boolean b(MenuItem menuItem) {
        return !this.A && ((this.E && this.F && a(menuItem)) || this.v.a(menuItem));
    }

    public LayoutInflater c(Bundle bundle) {
        kj kjVar = this.u;
        if (kjVar != null) {
            LayoutInflater e2 = kjVar.e();
            hz.a(e2, this.v);
            return e2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final void c(Menu menu) {
        if (!this.A) {
            this.v.b(menu);
        }
    }

    public final void c(boolean z2) {
        if (this.E != z2) {
            this.E = z2;
            if (u() && !this.A) {
                this.u.f();
            }
        }
    }

    public final boolean c(MenuItem menuItem) {
        return !this.A && this.v.b(menuItem);
    }

    public final Fragment c_(String str) {
        return str.equals(this.h) ? this : this.v.b(str);
    }

    public final void c_(boolean z2) {
        this.C = true;
        kl klVar = this.t;
        if (klVar != null) {
            klVar.c(this);
        } else {
            this.D = true;
        }
    }

    public void d(Bundle bundle) {
        this.b = true;
    }

    public final void d_(boolean z2) {
        if (this.F != z2) {
            this.F = z2;
            if (this.E && u() && !this.A) {
                this.u.f();
            }
        }
    }

    public void e(Bundle bundle) {
    }

    @Deprecated
    public final void e(boolean z2) {
        if (!this.K && z2 && this.b_ < 3 && this.t != null && u() && this.O) {
            this.t.e(this);
        }
        this.K = z2;
        this.J = this.b_ < 3 && !z2;
        if (this.e != null) {
            this.g = Boolean.valueOf(z2);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final void f(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.f = null;
        }
        this.b = false;
        j(bundle);
        if (!this.b) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new SuperNotCalledException(sb.toString());
        } else if (this.H != null) {
            this.R.a(Event.ON_CREATE);
        }
    }

    public final void f(boolean z2) {
        this.v.a(z2);
    }

    public final void g(Bundle bundle) {
        if (this.t == null || !ai()) {
            this.i = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final void g(boolean z2) {
        this.v.b(z2);
    }

    public final LayoutInflater h(Bundle bundle) {
        this.V = c(bundle);
        return this.V;
    }

    public void h() {
        this.b = true;
    }

    public final void h(boolean z2) {
        aj().q = z2;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final void i(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.v.a(parcelable);
                this.v.o();
            }
        }
    }

    public final void i_(int i2) {
        if (this.T != null || i2 != 0) {
            aj().d = i2;
        }
    }

    public void j(Bundle bundle) {
        this.b = true;
    }

    public final void j_(int i2) {
        aj().c = i2;
    }

    public final void k(Bundle bundle) {
        this.v.n();
        this.b_ = 1;
        this.b = false;
        this.W.a(bundle);
        b(bundle);
        this.O = true;
        if (this.b) {
            this.Q.a(Event.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new SuperNotCalledException(sb.toString());
    }

    public final boolean k() {
        return this.s > 0;
    }

    public final Bundle l() {
        Bundle bundle = this.i;
        if (bundle != null) {
            return bundle;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }

    public final void l(Bundle bundle) {
        this.v.n();
        this.b_ = 2;
        this.b = false;
        d(bundle);
        if (this.b) {
            this.v.p();
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new SuperNotCalledException(sb.toString());
    }

    public final Fragment m() {
        Fragment fragment = this.j;
        if (fragment != null) {
            return fragment;
        }
        kl klVar = this.t;
        if (klVar == null || this.k == null) {
            return null;
        }
        return (Fragment) klVar.e.get(this.k);
    }

    public final void m(Bundle bundle) {
        e(bundle);
        this.W.b(bundle);
        Parcelable m2 = this.v.m();
        if (m2 != null) {
            bundle.putParcelable("android:support:fragments", m2);
        }
    }

    public final Context n() {
        kj kjVar = this.u;
        if (kjVar == null) {
            return null;
        }
        return kjVar.b;
    }

    public final Context o() {
        Context n2 = n();
        if (n2 != null) {
            return n2;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.b = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        q().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.b = true;
    }

    public final kf p() {
        kj kjVar = this.u;
        if (kjVar == null) {
            return null;
        }
        return (kf) kjVar.a;
    }

    public final kf q() {
        kf p2 = p();
        if (p2 != null) {
            return p2;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public final Object r() {
        kj kjVar = this.u;
        if (kjVar == null) {
            return null;
        }
        return kjVar.i();
    }

    public final kk s() {
        kl klVar = this.t;
        if (klVar != null) {
            return klVar;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    public void startActivityForResult(Intent intent, int i2) {
        a(intent, i2, (Bundle) null);
    }

    public final kk t() {
        if (this.u != null) {
            return this.v;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        hl.a(this, sb);
        sb.append(" (");
        sb.append(this.h);
        sb.append(")");
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" ");
            sb.append(this.z);
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        return this.u != null && this.m;
    }

    public final boolean v() {
        return this.b_ >= 4;
    }

    public final boolean w() {
        if (u() && !this.A) {
            View view = this.H;
            if (!(view == null || view.getWindowToken() == null || this.H.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    public final LayoutInflater x() {
        LayoutInflater layoutInflater = this.V;
        return layoutInflater == null ? h((Bundle) null) : layoutInflater;
    }

    public final View y() {
        View view = this.H;
        if (view != null) {
            return view;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    public void z() {
        this.b = true;
    }
}
