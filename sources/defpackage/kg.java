package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.State;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: kg reason: default package */
public final class kg extends kf implements Factory2 {
    private static Interpolator I = new DecelerateInterpolator(2.5f);
    private static Interpolator J = new DecelerateInterpolator(1.5f);
    static boolean c = false;
    private boolean A;
    private ArrayList<jx> B;
    private ArrayList<Boolean> C;
    private ArrayList<Fragment> D;
    private Bundle E = null;
    private SparseArray<Parcelable> F = null;
    private ArrayList<g> G;
    private Runnable H = new Runnable() {
        public final void run() {
            kg.this.k();
        }
    };
    final ArrayList<Fragment> d = new ArrayList<>();
    public final HashMap<String, Fragment> e = new HashMap<>();
    ArrayList<jx> f;
    OnBackPressedDispatcher g;
    final l h = new l(false) {
        public final void b() {
            kg kgVar = kg.this;
            kgVar.k();
            if (kgVar.h.a) {
                kgVar.d();
            } else {
                kgVar.g.a();
            }
        }
    };
    public int i = 0;
    public ke j;
    kb k;
    public Fragment l;
    public boolean m;
    public ki n;
    private ArrayList<e> o;
    private boolean p;
    private int q = 0;
    private ArrayList<Fragment> r;
    private ArrayList<jx> s;
    private ArrayList<Integer> t;
    private ArrayList<defpackage.kf.b> u;
    private final CopyOnWriteArrayList<c> v = new CopyOnWriteArrayList<>();
    private Fragment w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* renamed from: kg$a */
    static class a {
        public final Animation a;
        public final Animator b;

        a(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: kg$b */
    static class b extends AnimationSet implements Runnable {
        private final ViewGroup a;
        private final View b;
        private boolean c;
        private boolean d;
        private boolean e = true;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.a = viewGroup;
            this.b = view;
            addAnimation(animation);
            this.a.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            this.e = true;
            if (!this.c) {
                if (!super.getTransformation(j, transformation)) {
                    this.c = true;
                    im.a(this.a, this);
                }
                return true;
            } else if (!this.d) {
                return true;
            } else {
                return false;
            }
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.e = true;
            if (!this.c) {
                if (!super.getTransformation(j, transformation, f)) {
                    this.c = true;
                    im.a(this.a, this);
                }
                return true;
            } else if (!this.d) {
                return true;
            } else {
                return false;
            }
        }

        public final void run() {
            if (this.c || !this.e) {
                this.a.endViewTransition(this.b);
                this.d = true;
                return;
            }
            this.e = false;
            this.a.post(this);
        }
    }

    /* renamed from: kg$c */
    static final class c {
        final defpackage.kf.a a;
        final boolean b;

        c(defpackage.kf.a aVar, boolean z) {
            this.a = aVar;
            this.b = z;
        }
    }

    /* renamed from: kg$d */
    static class d {
        public static final int[] a = {16842755, 16842960, 16842961};
    }

    /* renamed from: kg$e */
    interface e {
        boolean a(ArrayList<jx> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: kg$f */
    class f implements e {
        private String a = null;
        private int b;
        private int c;

        f(String str, int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean a(ArrayList<jx> arrayList, ArrayList<Boolean> arrayList2) {
            if (kg.this.l != null && this.b < 0 && this.a == null && kg.this.l.t().d()) {
                return false;
            }
            return kg.this.a(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    /* renamed from: kg$g */
    static class g implements androidx.fragment.app.Fragment.b {
        final boolean a;
        final jx b;
        int c;

        g(jx jxVar, boolean z) {
            this.a = z;
            this.b = jxVar;
        }

        public final void a() {
            this.c--;
            if (this.c == 0) {
                this.b.a.j();
            }
        }

        public final void b() {
            this.c++;
        }

        public final void c() {
            boolean z = this.c > 0;
            kg kgVar = this.b.a;
            int size = kgVar.d.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) kgVar.d.get(i);
                fragment.a((androidx.fragment.app.Fragment.b) null);
                if (z && fragment.ac()) {
                    fragment.I();
                }
            }
            this.b.a.a(this.b, this.a, !z, true);
        }

        public final void d() {
            this.b.a.a(this.b, this.a, false, false);
        }
    }

    public static int c(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new hm(str));
        ke keVar = this.j;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (keVar != null) {
            try {
                keVar.a(str3, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(str, str2, e2);
            }
        } else {
            try {
                a(str3, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e(str, str2, e3);
            }
        }
        throw runtimeException;
    }

    public final km a() {
        return new jx(this);
    }

    public final boolean b() {
        boolean k2 = k();
        x();
        return k2;
    }

    public void i() {
        ArrayList<e> arrayList = this.o;
        boolean z2 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            l lVar = this.h;
            if (e() <= 0 || !b(this.w)) {
                z2 = false;
            }
            lVar.a = z2;
            return;
        }
        this.h.a = true;
    }

    public final boolean b(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        kg kgVar = fragment.t;
        if (fragment != kgVar.l || !b(kgVar.w)) {
            return false;
        }
        return true;
    }

    public final void c() {
        a((e) new f(null, -1, 0), false);
    }

    public final boolean d() {
        v();
        return a((String) null, -1, 0);
    }

    public final void a(int i2, int i3) {
        if (i2 >= 0) {
            a((e) new f(null, i2, 1), false);
            return;
        }
        StringBuilder sb = new StringBuilder("Bad id: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private boolean a(String str, int i2, int i3) {
        k();
        c(true);
        Fragment fragment = this.l;
        if (fragment != null && fragment.t().d()) {
            return true;
        }
        boolean a2 = a(this.B, this.C, (String) null, -1, 0);
        if (a2) {
            this.p = true;
            try {
                b(this.B, this.C);
            } finally {
                w();
            }
        }
        i();
        z();
        B();
        return a2;
    }

    public final int e() {
        ArrayList<jx> arrayList = this.f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void a(defpackage.kf.b bVar) {
        if (this.u == null) {
            this.u = new ArrayList<>();
        }
        this.u.add(bVar);
    }

    public final void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.t != this) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        bundle.putString(str, fragment.h);
    }

    public final Fragment a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = (Fragment) this.e.get(string);
        if (fragment == null) {
            StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": unique id ");
            sb.append(string);
            a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return fragment;
    }

    public final List<Fragment> f() {
        List<Fragment> list;
        if (this.d.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.d) {
            list = (List) this.d.clone();
        }
        return list;
    }

    private ki o(Fragment fragment) {
        ki kiVar = this.n;
        ki kiVar2 = (ki) kiVar.b.get(fragment.h);
        if (kiVar2 != null) {
            return kiVar2;
        }
        ki kiVar3 = new ki(kiVar.d);
        kiVar.b.put(fragment.h, kiVar3);
        return kiVar3;
    }

    public final void c(Fragment fragment) {
        if (!h()) {
            this.n.a(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d(Fragment fragment) {
        if (!h()) {
            this.n.a.remove(fragment);
        }
    }

    public final androidx.fragment.app.Fragment.c a(Fragment fragment) {
        if (fragment.t != this) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        if (fragment.b_ > 0) {
            Bundle v2 = v(fragment);
            if (v2 != null) {
                return new androidx.fragment.app.Fragment.c(v2);
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.w;
        if (fragment != null) {
            hl.a(fragment, sb);
        } else {
            hl.a(this.j, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (!this.e.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.e.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size = this.d.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment2 = (Fragment) this.d.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.r;
        if (arrayList != null) {
            int size2 = arrayList.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment fragment3 = (Fragment) this.r.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(fragment3.toString());
                }
            }
        }
        ArrayList<jx> arrayList2 = this.f;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size3; i4++) {
                    jx jxVar = (jx) this.f.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(jxVar.toString());
                    jxVar.a(sb2, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.s != null) {
                int size4 = this.s.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        jx jxVar2 = (jx) this.s.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(jxVar2);
                    }
                }
            }
            if (this.t != null && this.t.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.t.toArray()));
            }
        }
        ArrayList<e> arrayList3 = this.o;
        if (arrayList3 != null) {
            int size5 = arrayList3.size();
            if (size5 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size5; i6++) {
                    e eVar = (e) this.o.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(eVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.j);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.k);
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.i);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.y);
        printWriter.print(" mStopped=");
        printWriter.print(this.z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.m);
        if (this.x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.x);
        }
    }

    private static a a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(I);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(J);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new a((Animation) animationSet);
    }

    private static a a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(J);
        alphaAnimation.setDuration(220);
        return new a((Animation) alphaAnimation);
    }

    private a a(Fragment fragment, int i2, boolean z2, int i3) {
        int U = fragment.U();
        boolean z3 = false;
        fragment.j_(0);
        if (fragment.G != null && fragment.G.getLayoutTransition() != null) {
            return null;
        }
        if (U != 0) {
            boolean equals = "anim".equals(this.j.b.getResources().getResourceTypeName(U));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.j.b, U);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    z3 = true;
                } catch (NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.j.b, U);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.j.b, U);
                        if (loadAnimation2 != null) {
                            return new a(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0) {
            return null;
        }
        char c2 = 65535;
        if (i2 == 4097) {
            c2 = z2 ? (char) 1 : 2;
        } else if (i2 == 4099) {
            c2 = z2 ? (char) 5 : 6;
        } else if (i2 == 8194) {
            c2 = z2 ? (char) 3 : 4;
        }
        if (c2 < 0) {
            return null;
        }
        switch (c2) {
            case 1:
                return a(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(0.0f, 1.0f);
            case 6:
                return a(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.j.g()) {
                    i3 = this.j.h();
                }
                if (i3 == 0) {
                }
                return null;
        }
    }

    public final void e(Fragment fragment) {
        if (fragment.J) {
            if (this.p) {
                this.A = true;
                return;
            }
            fragment.J = false;
            a(fragment, this.i, 0, 0, false);
        }
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r8v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
        if (r0 != 3) goto L_0x0407;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v4
      assigns: []
      uses: []
      mth insns count: 431
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c5  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.fragment.app.Fragment r18, int r19, int r20, int r21, boolean r22) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r7.m
            r8 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r7.B
            if (r0 == 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0 = r19
            goto L_0x0016
        L_0x0011:
            r0 = r19
            if (r0 <= r8) goto L_0x0016
            r0 = 1
        L_0x0016:
            boolean r1 = r7.n
            if (r1 == 0) goto L_0x002c
            int r1 = r7.b_
            if (r0 <= r1) goto L_0x002c
            int r0 = r7.b_
            if (r0 != 0) goto L_0x002a
            boolean r0 = r18.k()
            if (r0 == 0) goto L_0x002a
            r0 = 1
            goto L_0x002c
        L_0x002a:
            int r0 = r7.b_
        L_0x002c:
            boolean r1 = r7.J
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x0039
            int r1 = r7.b_
            if (r1 >= r9) goto L_0x0039
            if (r0 <= r10) goto L_0x0039
            r0 = 2
        L_0x0039:
            androidx.lifecycle.Lifecycle$State r1 = r7.P
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.CREATED
            if (r1 != r2) goto L_0x0044
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x004e
        L_0x0044:
            androidx.lifecycle.Lifecycle$State r1 = r7.P
            int r1 = r1.ordinal()
            int r0 = java.lang.Math.min(r0, r1)
        L_0x004e:
            r11 = r0
            int r0 = r7.b_
            r12 = 0
            r13 = 0
            if (r0 > r11) goto L_0x02bb
            boolean r0 = r7.o
            if (r0 == 0) goto L_0x005e
            boolean r0 = r7.p
            if (r0 != 0) goto L_0x005e
            return
        L_0x005e:
            android.view.View r0 = r18.Z()
            if (r0 != 0) goto L_0x006a
            android.animation.Animator r0 = r18.aa()
            if (r0 == 0) goto L_0x007e
        L_0x006a:
            r7.a(r13)
            r7.a(r13)
            int r2 = r18.ab()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r17
            r1 = r18
            r0.a(r1, r2, r3, r4, r5)
        L_0x007e:
            int r0 = r7.b_
            if (r0 == 0) goto L_0x008d
            if (r0 == r8) goto L_0x01c3
            if (r0 == r10) goto L_0x02a3
            if (r0 == r9) goto L_0x008a
            goto L_0x0407
        L_0x008a:
            r0 = 3
            goto L_0x02ad
        L_0x008d:
            if (r11 <= 0) goto L_0x01c3
            android.os.Bundle r0 = r7.e
            if (r0 == 0) goto L_0x00ea
            android.os.Bundle r0 = r7.e
            ke r1 = r6.j
            android.content.Context r1 = r1.b
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.e
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f = r0
            android.os.Bundle r0 = r7.e
            java.lang.String r1 = "android:target_state"
            androidx.fragment.app.Fragment r0 = r6.a(r0, r1)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = r0.h
            goto L_0x00b8
        L_0x00b7:
            r0 = r13
        L_0x00b8:
            r7.k = r0
            java.lang.String r0 = r7.k
            if (r0 == 0) goto L_0x00c8
            android.os.Bundle r0 = r7.e
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r12)
            r7.l = r0
        L_0x00c8:
            java.lang.Boolean r0 = r7.g
            if (r0 == 0) goto L_0x00d7
            java.lang.Boolean r0 = r7.g
            boolean r0 = r0.booleanValue()
            r7.K = r0
            r7.g = r13
            goto L_0x00e1
        L_0x00d7:
            android.os.Bundle r0 = r7.e
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.K = r0
        L_0x00e1:
            boolean r0 = r7.K
            if (r0 != 0) goto L_0x00ea
            r7.J = r8
            if (r11 <= r10) goto L_0x00ea
            r11 = 2
        L_0x00ea:
            ke r0 = r6.j
            r7.u = r0
            androidx.fragment.app.Fragment r1 = r6.w
            r7.w = r1
            if (r1 == 0) goto L_0x00f7
            kg r0 = r1.v
            goto L_0x00f9
        L_0x00f7:
            kg r0 = r0.d
        L_0x00f9:
            r7.t = r0
            androidx.fragment.app.Fragment r0 = r7.j
            java.lang.String r14 = " that does not belong to this FragmentManager!"
            java.lang.String r15 = " declared target fragment "
            java.lang.String r5 = "Fragment "
            if (r0 == 0) goto L_0x0151
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.e
            androidx.fragment.app.Fragment r1 = r7.j
            java.lang.String r1 = r1.h
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r1 = r7.j
            if (r0 != r1) goto L_0x0133
            androidx.fragment.app.Fragment r0 = r7.j
            int r0 = r0.b_
            if (r0 > 0) goto L_0x0129
            androidx.fragment.app.Fragment r1 = r7.j
            r2 = 1
            r3 = 0
            r4 = 0
            r16 = 1
            r0 = r17
            r9 = r5
            r5 = r16
            r0.a(r1, r2, r3, r4, r5)
            goto L_0x012a
        L_0x0129:
            r9 = r5
        L_0x012a:
            androidx.fragment.app.Fragment r0 = r7.j
            java.lang.String r0 = r0.h
            r7.k = r0
            r7.j = r13
            goto L_0x0152
        L_0x0133:
            r9 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r7)
            r1.append(r15)
            androidx.fragment.app.Fragment r2 = r7.j
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0151:
            r9 = r5
        L_0x0152:
            java.lang.String r0 = r7.k
            if (r0 == 0) goto L_0x018e
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.e
            java.lang.String r1 = r7.k
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L_0x0171
            int r0 = r1.b_
            if (r0 > 0) goto L_0x018e
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r17
            r0.a(r1, r2, r3, r4, r5)
            goto L_0x018e
        L_0x0171:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r7)
            r1.append(r15)
            java.lang.String r2 = r7.k
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018e:
            ke r0 = r6.j
            android.content.Context r0 = r0.b
            r6.a(r7, r0, r12)
            r18.K()
            androidx.fragment.app.Fragment r0 = r7.w
            if (r0 != 0) goto L_0x01a1
            ke r0 = r6.j
            r0.a(r7)
        L_0x01a1:
            ke r0 = r6.j
            android.content.Context r0 = r0.b
            r6.b(r7, r0, r12)
            boolean r0 = r7.O
            if (r0 != 0) goto L_0x01bc
            android.os.Bundle r0 = r7.e
            r6.a(r7, r0, r12)
            android.os.Bundle r0 = r7.e
            r7.k(r0)
            android.os.Bundle r0 = r7.e
            r6.b(r7, r0, r12)
            goto L_0x01c3
        L_0x01bc:
            android.os.Bundle r0 = r7.e
            r7.i(r0)
            r7.b_ = r8
        L_0x01c3:
            if (r11 <= 0) goto L_0x01c8
            r17.q(r18)
        L_0x01c8:
            if (r11 <= r8) goto L_0x02a3
            boolean r0 = r7.o
            if (r0 != 0) goto L_0x028e
            int r0 = r7.y
            if (r0 == 0) goto L_0x0240
            int r0 = r7.y
            r1 = -1
            if (r0 != r1) goto L_0x01f2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot create fragment "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r6.a(r0)
        L_0x01f2:
            kb r0 = r6.k
            int r1 = r7.y
            android.view.View r0 = r0.a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0241
            boolean r1 = r7.q
            if (r1 != 0) goto L_0x0241
            android.content.Context r1 = r18.o()     // Catch:{ NotFoundException -> 0x0211 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x0211 }
            int r2 = r7.y     // Catch:{ NotFoundException -> 0x0211 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0211 }
            goto L_0x0213
        L_0x0211:
            java.lang.String r1 = "unknown"
        L_0x0213:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No view found for id 0x"
            r3.<init>(r4)
            int r4 = r7.y
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r6.a(r2)
            goto L_0x0241
        L_0x0240:
            r0 = r13
        L_0x0241:
            r7.G = r0
            android.os.Bundle r1 = r7.e
            android.view.LayoutInflater r1 = r7.h(r1)
            android.os.Bundle r2 = r7.e
            r7.b(r1, r0, r2)
            android.view.View r1 = r7.H
            if (r1 == 0) goto L_0x028c
            android.view.View r1 = r7.H
            r7.I = r1
            android.view.View r1 = r7.H
            r1.setSaveFromParentEnabled(r12)
            if (r0 == 0) goto L_0x0262
            android.view.View r1 = r7.H
            r0.addView(r1)
        L_0x0262:
            boolean r0 = r7.A
            if (r0 == 0) goto L_0x026d
            android.view.View r0 = r7.H
            r1 = 8
            r0.setVisibility(r1)
        L_0x026d:
            android.view.View r0 = r7.H
            android.os.Bundle r1 = r7.e
            r7.a(r0, r1)
            android.view.View r0 = r7.H
            android.os.Bundle r1 = r7.e
            r6.a(r7, r0, r1, r12)
            android.view.View r0 = r7.H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0288
            android.view.ViewGroup r0 = r7.G
            if (r0 == 0) goto L_0x0288
            goto L_0x0289
        L_0x0288:
            r8 = 0
        L_0x0289:
            r7.L = r8
            goto L_0x028e
        L_0x028c:
            r7.I = r13
        L_0x028e:
            android.os.Bundle r0 = r7.e
            r7.l(r0)
            android.os.Bundle r0 = r7.e
            r6.c(r7, r0, r12)
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x02a1
            android.os.Bundle r0 = r7.e
            r7.f(r0)
        L_0x02a1:
            r7.e = r13
        L_0x02a3:
            if (r11 <= r10) goto L_0x008a
            r18.L()
            r6.b(r7, r12)
            goto L_0x008a
        L_0x02ad:
            if (r11 <= r0) goto L_0x0407
            r18.M()
            r6.c(r7, r12)
            r7.e = r13
            r7.f = r13
            goto L_0x0407
        L_0x02bb:
            int r0 = r7.b_
            if (r0 <= r11) goto L_0x0407
            int r0 = r7.b_
            if (r0 == r8) goto L_0x0354
            if (r0 == r10) goto L_0x02dd
            r1 = 3
            if (r0 == r1) goto L_0x02d5
            r2 = 4
            if (r0 == r2) goto L_0x02cd
            goto L_0x0407
        L_0x02cd:
            if (r11 >= r2) goto L_0x02d5
            r18.P()
            r6.d(r7, r12)
        L_0x02d5:
            if (r11 >= r1) goto L_0x02dd
            r18.Q()
            r6.e(r7, r12)
        L_0x02dd:
            if (r11 >= r10) goto L_0x0354
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x02f2
            ke r0 = r6.j
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x02f2
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f
            if (r0 != 0) goto L_0x02f2
            r17.u(r18)
        L_0x02f2:
            r18.R()
            r6.f(r7, r12)
            android.view.View r0 = r7.H
            if (r0 == 0) goto L_0x0345
            android.view.ViewGroup r0 = r7.G
            if (r0 == 0) goto L_0x0345
            android.view.ViewGroup r0 = r7.G
            android.view.View r1 = r7.H
            r0.endViewTransition(r1)
            android.view.View r0 = r7.H
            r0.clearAnimation()
            androidx.fragment.app.Fragment r0 = r7.w
            if (r0 == 0) goto L_0x0316
            androidx.fragment.app.Fragment r0 = r7.w
            boolean r0 = r0.n
            if (r0 != 0) goto L_0x0345
        L_0x0316:
            int r0 = r6.i
            r1 = 0
            if (r0 <= 0) goto L_0x0336
            boolean r0 = r6.m
            if (r0 != 0) goto L_0x0336
            android.view.View r0 = r7.H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0336
            float r0 = r7.N
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0336
            r0 = r20
            r2 = r21
            kg$a r0 = r6.a(r7, r0, r12, r2)
            goto L_0x0337
        L_0x0336:
            r0 = r13
        L_0x0337:
            r7.N = r1
            if (r0 == 0) goto L_0x033e
            r6.a(r7, r0, r11)
        L_0x033e:
            android.view.ViewGroup r0 = r7.G
            android.view.View r1 = r7.H
            r0.removeView(r1)
        L_0x0345:
            r7.G = r13
            r7.H = r13
            r7.R = r13
            ln<lh> r0 = r7.S
            r0.b(r13)
            r7.I = r13
            r7.p = r12
        L_0x0354:
            if (r11 > 0) goto L_0x0407
            boolean r0 = r6.m
            if (r0 == 0) goto L_0x037b
            android.view.View r0 = r18.Z()
            if (r0 == 0) goto L_0x036b
            android.view.View r0 = r18.Z()
            r7.a(r13)
            r0.clearAnimation()
            goto L_0x037b
        L_0x036b:
            android.animation.Animator r0 = r18.aa()
            if (r0 == 0) goto L_0x037b
            android.animation.Animator r0 = r18.aa()
            r7.a(r13)
            r0.cancel()
        L_0x037b:
            android.view.View r0 = r18.Z()
            if (r0 != 0) goto L_0x0403
            android.animation.Animator r0 = r18.aa()
            if (r0 == 0) goto L_0x0389
            goto L_0x0403
        L_0x0389:
            boolean r0 = r7.n
            if (r0 == 0) goto L_0x0395
            boolean r0 = r18.k()
            if (r0 != 0) goto L_0x0395
            r0 = 1
            goto L_0x0396
        L_0x0395:
            r0 = 0
        L_0x0396:
            if (r0 != 0) goto L_0x03a4
            ki r1 = r6.n
            boolean r1 = r1.b(r7)
            if (r1 == 0) goto L_0x03a1
            goto L_0x03a4
        L_0x03a1:
            r7.b_ = r12
            goto L_0x03cf
        L_0x03a4:
            ke r1 = r6.j
            boolean r2 = r1 instanceof defpackage.lx
            if (r2 == 0) goto L_0x03af
            ki r1 = r6.n
            boolean r8 = r1.e
            goto L_0x03c0
        L_0x03af:
            android.content.Context r1 = r1.b
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x03c0
            ke r1 = r6.j
            android.content.Context r1 = r1.b
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r8 = r8 ^ r1
        L_0x03c0:
            if (r0 != 0) goto L_0x03c4
            if (r8 == 0) goto L_0x03c9
        L_0x03c4:
            ki r1 = r6.n
            r1.c(r7)
        L_0x03c9:
            r18.S()
            r6.g(r7, r12)
        L_0x03cf:
            r18.T()
            r6.h(r7, r12)
            if (r22 != 0) goto L_0x0407
            if (r0 != 0) goto L_0x03ff
            ki r0 = r6.n
            boolean r0 = r0.b(r7)
            if (r0 == 0) goto L_0x03e2
            goto L_0x03ff
        L_0x03e2:
            r7.u = r13
            r7.w = r13
            r7.t = r13
            java.lang.String r0 = r7.k
            if (r0 == 0) goto L_0x0407
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.e
            java.lang.String r1 = r7.k
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x0407
            boolean r1 = r0.C
            if (r1 == 0) goto L_0x0407
            r7.j = r0
            goto L_0x0407
        L_0x03ff:
            r17.s(r18)
            goto L_0x0407
        L_0x0403:
            r7.k_(r11)
            goto L_0x0408
        L_0x0407:
            r8 = r11
        L_0x0408:
            int r0 = r7.b_
            if (r0 == r8) goto L_0x042a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r7.b_
            r0.append(r1)
            r7.b_ = r8
        L_0x042a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg.a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    private void a(final Fragment fragment, a aVar, int i2) {
        final View view = fragment.H;
        final ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        fragment.k_(i2);
        if (aVar.a != null) {
            b bVar = new b(aVar.a, viewGroup, view);
            fragment.a(fragment.H);
            bVar.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    viewGroup.post(new Runnable() {
                        public final void run() {
                            if (fragment.Z() != null) {
                                fragment.a((View) null);
                                kg.this.a(fragment, fragment.ab(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            fragment.H.startAnimation(bVar);
            return;
        }
        Animator animator = aVar.b;
        fragment.a(aVar.b);
        animator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator aa = fragment.aa();
                fragment.a((Animator) null);
                if (aa != null && viewGroup.indexOfChild(view) < 0) {
                    kg kgVar = kg.this;
                    Fragment fragment = fragment;
                    kgVar.a(fragment, fragment.ab(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fragment.H);
        animator.start();
    }

    private void p(Fragment fragment) {
        a(fragment, this.i, 0, 0, false);
    }

    private void q(Fragment fragment) {
        if (fragment.o && !fragment.r) {
            fragment.b(fragment.h(fragment.e), null, fragment.e);
            if (fragment.H != null) {
                fragment.I = fragment.H;
                fragment.H.setSaveFromParentEnabled(false);
                if (fragment.A) {
                    fragment.H.setVisibility(8);
                }
                fragment.a(fragment.H, fragment.e);
                a(fragment, fragment.H, fragment.e, false);
                return;
            }
            fragment.I = null;
        }
    }

    private void r(final Fragment fragment) {
        if (fragment.H != null) {
            a a2 = a(fragment, fragment.V(), !fragment.A, fragment.W());
            if (a2 == null || a2.b == null) {
                if (a2 != null) {
                    fragment.H.startAnimation(a2.a);
                    a2.a.start();
                }
                fragment.H.setVisibility((!fragment.A || fragment.ad()) ? 0 : 8);
                if (fragment.ad()) {
                    fragment.h(false);
                }
            } else {
                a2.b.setTarget(fragment.H);
                if (!fragment.A) {
                    fragment.H.setVisibility(0);
                } else if (fragment.ad()) {
                    fragment.h(false);
                } else {
                    final ViewGroup viewGroup = fragment.G;
                    final View view = fragment.H;
                    viewGroup.startViewTransition(view);
                    a2.b.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.H != null && fragment.A) {
                                fragment.H.setVisibility(8);
                            }
                        }
                    });
                }
                a2.b.start();
            }
        }
        if (fragment.m && w(fragment)) {
            this.x = true;
        }
        fragment.M = false;
    }

    /* access modifiers changed from: 0000 */
    public final void f(Fragment fragment) {
        if (fragment != null && this.e.containsKey(fragment.h)) {
            int i2 = this.i;
            if (fragment.n) {
                if (fragment.k()) {
                    i2 = Math.min(i2, 1);
                } else {
                    i2 = Math.min(i2, 0);
                }
            }
            a(fragment, i2, fragment.V(), fragment.W(), false);
            if (fragment.H != null) {
                Fragment t2 = t(fragment);
                if (t2 != null) {
                    View view = t2.H;
                    ViewGroup viewGroup = fragment.G;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(fragment.H);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.H, indexOfChild);
                    }
                }
                if (fragment.L && fragment.G != null) {
                    if (fragment.N > 0.0f) {
                        fragment.H.setAlpha(fragment.N);
                    }
                    fragment.N = 0.0f;
                    fragment.L = false;
                    a a2 = a(fragment, fragment.V(), true, fragment.W());
                    if (a2 != null) {
                        if (a2.a != null) {
                            fragment.H.startAnimation(a2.a);
                        } else {
                            a2.b.setTarget(fragment.H);
                            a2.b.start();
                        }
                    }
                }
            }
            if (fragment.M) {
                r(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, boolean z2) {
        if (this.j == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.i) {
            this.i = i2;
            int size = this.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                f((Fragment) this.d.get(i3));
            }
            for (Fragment fragment : this.e.values()) {
                if (fragment != null && ((fragment.n || fragment.B) && !fragment.L)) {
                    f(fragment);
                }
            }
            u();
            if (this.x) {
                ke keVar = this.j;
                if (keVar != null && this.i == 4) {
                    keVar.f();
                    this.x = false;
                }
            }
        }
    }

    private void u() {
        for (Fragment fragment : this.e.values()) {
            if (fragment != null) {
                e(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void g(Fragment fragment) {
        if (this.e.get(fragment.h) == null) {
            this.e.put(fragment.h, fragment);
            if (fragment.D) {
                if (fragment.C) {
                    c(fragment);
                } else {
                    d(fragment);
                }
                fragment.D = false;
            }
        }
    }

    private void s(Fragment fragment) {
        if (this.e.get(fragment.h) != null) {
            for (Fragment fragment2 : this.e.values()) {
                if (fragment2 != null && fragment.h.equals(fragment2.k)) {
                    fragment2.j = fragment;
                    fragment2.k = null;
                }
            }
            this.e.put(fragment.h, null);
            d(fragment);
            if (fragment.k != null) {
                fragment.j = (Fragment) this.e.get(fragment.k);
            }
            fragment.ab_();
            fragment.h = UUID.randomUUID().toString();
            fragment.m = false;
            fragment.n = false;
            fragment.o = false;
            fragment.p = false;
            fragment.q = false;
            fragment.s = 0;
            fragment.t = null;
            fragment.v = new kg();
            fragment.u = null;
            fragment.x = 0;
            fragment.y = 0;
            fragment.z = null;
            fragment.A = false;
            fragment.B = false;
        }
    }

    public final void a(Fragment fragment, boolean z2) {
        g(fragment);
        if (fragment.B) {
            return;
        }
        if (!this.d.contains(fragment)) {
            synchronized (this.d) {
                this.d.add(fragment);
            }
            fragment.m = true;
            fragment.n = false;
            if (fragment.H == null) {
                fragment.M = false;
            }
            if (w(fragment)) {
                this.x = true;
            }
            if (z2) {
                p(fragment);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    public final void h(Fragment fragment) {
        boolean z2 = !fragment.k();
        if (!fragment.B || z2) {
            synchronized (this.d) {
                this.d.remove(fragment);
            }
            if (w(fragment)) {
                this.x = true;
            }
            fragment.m = false;
            fragment.n = true;
        }
    }

    public static void i(Fragment fragment) {
        if (!fragment.A) {
            fragment.A = true;
            fragment.M = true ^ fragment.M;
        }
    }

    public static void j(Fragment fragment) {
        if (fragment.A) {
            fragment.A = false;
            fragment.M = !fragment.M;
        }
    }

    public final void k(Fragment fragment) {
        if (!fragment.B) {
            fragment.B = true;
            if (fragment.m) {
                synchronized (this.d) {
                    this.d.remove(fragment);
                }
                if (w(fragment)) {
                    this.x = true;
                }
                fragment.m = false;
            }
        }
    }

    public final void l(Fragment fragment) {
        if (fragment.B) {
            fragment.B = false;
            if (fragment.m) {
                return;
            }
            if (!this.d.contains(fragment)) {
                synchronized (this.d) {
                    this.d.add(fragment);
                }
                fragment.m = true;
                if (w(fragment)) {
                    this.x = true;
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Fragment already added: ");
            sb.append(fragment);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final Fragment a(int i2) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.d.get(size);
            if (fragment != null && fragment.x == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.e.values()) {
            if (fragment2 != null && fragment2.x == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public final Fragment a(String str) {
        if (str != null) {
            for (int size = this.d.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.d.get(size);
                if (fragment != null && str.equals(fragment.z)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (Fragment fragment2 : this.e.values()) {
                if (fragment2 != null && str.equals(fragment2.z)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment b(String str) {
        for (Fragment fragment : this.e.values()) {
            if (fragment != null) {
                Fragment c_ = fragment.c_(str);
                if (c_ != null) {
                    return c_;
                }
            }
        }
        return null;
    }

    private void v() {
        if (h()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final boolean h() {
        return this.y || this.z;
    }

    public final void a(e eVar, boolean z2) {
        if (!z2) {
            v();
        }
        synchronized (this) {
            if (!this.m) {
                if (this.j != null) {
                    if (this.o == null) {
                        this.o = new ArrayList<>();
                    }
                    this.o.add(eVar);
                    j();
                    return;
                }
            }
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void j() {
        synchronized (this) {
            boolean z2 = false;
            boolean z3 = this.G != null && !this.G.isEmpty();
            if (this.o != null && this.o.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.j.c.removeCallbacks(this.H);
                this.j.c.post(this.H);
                i();
            }
        }
    }

    public final int a(jx jxVar) {
        synchronized (this) {
            if (this.t != null) {
                if (this.t.size() > 0) {
                    int intValue = ((Integer) this.t.remove(this.t.size() - 1)).intValue();
                    this.s.set(intValue, jxVar);
                    return intValue;
                }
            }
            if (this.s == null) {
                this.s = new ArrayList<>();
            }
            int size = this.s.size();
            this.s.add(jxVar);
            return size;
        }
    }

    private void a(int i2, jx jxVar) {
        synchronized (this) {
            if (this.s == null) {
                this.s = new ArrayList<>();
            }
            int size = this.s.size();
            if (i2 < size) {
                this.s.set(i2, jxVar);
            } else {
                while (size < i2) {
                    this.s.add(null);
                    if (this.t == null) {
                        this.t = new ArrayList<>();
                    }
                    this.t.add(Integer.valueOf(size));
                    size++;
                }
                this.s.add(jxVar);
            }
        }
    }

    private void c(boolean z2) {
        if (this.p) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.j == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.j.c.getLooper()) {
            if (!z2) {
                v();
            }
            if (this.B == null) {
                this.B = new ArrayList<>();
                this.C = new ArrayList<>();
            }
            this.p = true;
            try {
                a(null, null);
            } finally {
                this.p = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public final void b(e eVar, boolean z2) {
        if (!z2 || (this.j != null && !this.m)) {
            c(z2);
            if (eVar.a(this.B, this.C)) {
                this.p = true;
                try {
                    b(this.B, this.C);
                } finally {
                    w();
                }
            }
            i();
            z();
            B();
        }
    }

    private void w() {
        this.p = false;
        this.C.clear();
        this.B.clear();
    }

    /* JADX INFO: finally extract failed */
    public final boolean k() {
        c(true);
        boolean z2 = false;
        while (c(this.B, this.C)) {
            this.p = true;
            try {
                b(this.B, this.C);
                w();
                z2 = true;
            } catch (Throwable th) {
                w();
                throw th;
            }
        }
        i();
        z();
        B();
        return z2;
    }

    private void a(ArrayList<jx> arrayList, ArrayList<Boolean> arrayList2) {
        ArrayList<g> arrayList3 = this.G;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            g gVar = (g) this.G.get(i2);
            if (arrayList != null && !gVar.a) {
                int indexOf = arrayList.indexOf(gVar.b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    this.G.remove(i2);
                    i2--;
                    size--;
                    gVar.d();
                    i2++;
                }
            }
            if ((gVar.c == 0) || (arrayList != null && gVar.b.a(arrayList, 0, arrayList.size()))) {
                this.G.remove(i2);
                i2--;
                size--;
                if (arrayList != null && !gVar.a) {
                    int indexOf2 = arrayList.indexOf(gVar.b);
                    if (indexOf2 != -1 && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                        gVar.d();
                    }
                }
                gVar.c();
            }
            i2++;
        }
    }

    private void b(ArrayList<jx> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!((jx) arrayList.get(i2)).r) {
                    if (i3 != i2) {
                        a(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                        while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((jx) arrayList.get(i3)).r) {
                            i3++;
                        }
                    }
                    a(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                a(arrayList, arrayList2, i3, size);
            }
        }
    }

    private void a(ArrayList<jx> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        ArrayList<jx> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i2;
        int i6 = i3;
        boolean z2 = ((jx) arrayList3.get(i5)).r;
        ArrayList<Fragment> arrayList5 = this.D;
        if (arrayList5 == null) {
            this.D = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.D.addAll(this.d);
        Fragment fragment = this.l;
        boolean z3 = false;
        for (int i7 = i5; i7 < i6; i7++) {
            jx jxVar = (jx) arrayList3.get(i7);
            if (!((Boolean) arrayList4.get(i7)).booleanValue()) {
                fragment = jxVar.a(this.D, fragment);
            } else {
                fragment = jxVar.b(this.D, fragment);
            }
            z3 = z3 || jxVar.j;
        }
        this.D.clear();
        if (!z2) {
            kn.a(this, arrayList, arrayList2, i2, i3, false);
        }
        b(arrayList, arrayList2, i2, i3);
        if (z2) {
            dq dqVar = new dq();
            b(dqVar);
            int a2 = a(arrayList, arrayList2, i2, i3, dqVar);
            a(dqVar);
            i4 = a2;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z2) {
            kn.a(this, arrayList, arrayList2, i2, i4, true);
            a(this.i, true);
        }
        while (i5 < i6) {
            jx jxVar2 = (jx) arrayList3.get(i5);
            if (((Boolean) arrayList4.get(i5)).booleanValue() && jxVar2.b >= 0) {
                int i8 = jxVar2.b;
                synchronized (this) {
                    this.s.set(i8, null);
                    if (this.t == null) {
                        this.t = new ArrayList<>();
                    }
                    this.t.add(Integer.valueOf(i8));
                }
                jxVar2.b = -1;
            }
            jxVar2.a();
            i5++;
        }
        if (z3) {
            A();
        }
    }

    private static void a(dq<Fragment> dqVar) {
        int size = dqVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = (Fragment) dqVar.a[i2];
            if (!fragment.m) {
                View y2 = fragment.y();
                fragment.N = y2.getAlpha();
                y2.setAlpha(0.0f);
            }
        }
    }

    private int a(ArrayList<jx> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, dq<Fragment> dqVar) {
        boolean z2;
        boolean z3;
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            jx jxVar = (jx) arrayList.get(i5);
            boolean booleanValue = ((Boolean) arrayList2.get(i5)).booleanValue();
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i6 >= jxVar.c.size()) {
                    z3 = false;
                    break;
                } else if (jx.a((a) jxVar.c.get(i6))) {
                    z3 = true;
                    break;
                } else {
                    i6++;
                }
            }
            if (!z3 || jxVar.a(arrayList, i5 + 1, i3)) {
                z2 = false;
            }
            if (z2) {
                if (this.G == null) {
                    this.G = new ArrayList<>();
                }
                g gVar = new g(jxVar, booleanValue);
                this.G.add(gVar);
                jxVar.a((androidx.fragment.app.Fragment.b) gVar);
                if (booleanValue) {
                    jxVar.f();
                } else {
                    jxVar.a(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, jxVar);
                }
                b(dqVar);
            }
        }
        return i4;
    }

    /* access modifiers changed from: 0000 */
    public final void a(jx jxVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            jxVar.a(z4);
        } else {
            jxVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(jxVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            kn.a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            a(this.i, true);
        }
        for (Fragment fragment : this.e.values()) {
            if (fragment != null && fragment.H != null && fragment.L && jxVar.b(fragment.y)) {
                if (fragment.N > 0.0f) {
                    fragment.H.setAlpha(fragment.N);
                }
                if (z4) {
                    fragment.N = 0.0f;
                } else {
                    fragment.N = -1.0f;
                    fragment.L = false;
                }
            }
        }
    }

    private Fragment t(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        View view = fragment.H;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.d.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = (Fragment) this.d.get(indexOf);
                if (fragment2.G == viewGroup && fragment2.H != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private static void b(ArrayList<jx> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            jx jxVar = (jx) arrayList.get(i2);
            boolean z2 = true;
            if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                jxVar.a(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                jxVar.a(z2);
            } else {
                jxVar.a(1);
                jxVar.f();
            }
            i2++;
        }
    }

    private void b(dq<Fragment> dqVar) {
        int i2 = this.i;
        if (i2 > 0) {
            int min = Math.min(i2, 3);
            int size = this.d.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = (Fragment) this.d.get(i3);
                if (fragment.b_ < min) {
                    a(fragment, min, fragment.U(), fragment.V(), false);
                    if (fragment.H != null && !fragment.A && fragment.L) {
                        dqVar.add(fragment);
                    }
                }
            }
        }
    }

    private void x() {
        if (this.G != null) {
            while (!this.G.isEmpty()) {
                ((g) this.G.remove(0)).c();
            }
        }
    }

    private void y() {
        for (Fragment fragment : this.e.values()) {
            if (fragment != null) {
                if (fragment.Z() != null) {
                    int ab = fragment.ab();
                    View Z = fragment.Z();
                    Animation animation = Z.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        Z.clearAnimation();
                    }
                    fragment.a((View) null);
                    a(fragment, ab, 0, 0, false);
                } else if (fragment.aa() != null) {
                    fragment.aa().end();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c(java.util.ArrayList<defpackage.jx> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<kg$e> r0 = r4.o     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.util.ArrayList<kg$e> r0 = r4.o     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            java.util.ArrayList<kg$e> r0 = r4.o     // Catch:{ all -> 0x003a }
            int r0 = r0.size()     // Catch:{ all -> 0x003a }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<kg$e> r3 = r4.o     // Catch:{ all -> 0x003a }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003a }
            kg$e r3 = (defpackage.kg.e) r3     // Catch:{ all -> 0x003a }
            boolean r3 = r3.a(r5, r6)     // Catch:{ all -> 0x003a }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<kg$e> r5 = r4.o     // Catch:{ all -> 0x003a }
            r5.clear()     // Catch:{ all -> 0x003a }
            ke r5 = r4.j     // Catch:{ all -> 0x003a }
            android.os.Handler r5 = r5.c     // Catch:{ all -> 0x003a }
            java.lang.Runnable r6 = r4.H     // Catch:{ all -> 0x003a }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            return r1
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003d:
            throw r5
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg.c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    private void z() {
        if (this.A) {
            this.A = false;
            u();
        }
    }

    private void A() {
        if (this.u != null) {
            for (int i2 = 0; i2 < this.u.size(); i2++) {
                ((defpackage.kf.b) this.u.get(i2)).onBackStackChanged();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ArrayList<jx> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<jx> arrayList3 = this.f;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                i4 = this.f.size() - 1;
                while (i4 >= 0) {
                    jx jxVar = (jx) this.f.get(i4);
                    if ((str != null && str.equals(jxVar.k)) || (i2 >= 0 && i2 == jxVar.b)) {
                        break;
                    }
                    i4--;
                }
                if (i4 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                        jx jxVar2 = (jx) this.f.get(i4);
                        if ((str == null || !str.equals(jxVar2.k)) && (i2 < 0 || i2 != jxVar2.b)) {
                            break;
                        }
                    }
                }
            } else {
                i4 = -1;
            }
            if (i4 == this.f.size() - 1) {
                return false;
            }
            for (int size2 = this.f.size() - 1; size2 > i4; size2--) {
                arrayList.add(this.f.remove(size2));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    private void u(Fragment fragment) {
        if (fragment.I != null) {
            SparseArray<Parcelable> sparseArray = this.F;
            if (sparseArray == null) {
                this.F = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.I.saveHierarchyState(this.F);
            if (this.F.size() > 0) {
                fragment.f = this.F;
                this.F = null;
            }
        }
    }

    private Bundle v(Fragment fragment) {
        Bundle bundle;
        if (this.E == null) {
            this.E = new Bundle();
        }
        fragment.m(this.E);
        d(fragment, this.E, false);
        if (!this.E.isEmpty()) {
            bundle = this.E;
            this.E = null;
        } else {
            bundle = null;
        }
        if (fragment.H != null) {
            u(fragment);
        }
        if (fragment.f != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f);
        }
        if (!fragment.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.K);
        }
        return bundle;
    }

    public final Parcelable l() {
        String str;
        String str2;
        ArrayList<String> arrayList;
        x();
        y();
        k();
        this.y = true;
        jy[] jyVarArr = null;
        if (this.e.isEmpty()) {
            return null;
        }
        ArrayList<kk> arrayList2 = new ArrayList<>(this.e.size());
        Iterator it = this.e.values().iterator();
        boolean z2 = false;
        while (true) {
            str = " was removed from the FragmentManager";
            str2 = "Failure saving state: active ";
            if (!it.hasNext()) {
                break;
            }
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                if (fragment.t != this) {
                    StringBuilder sb = new StringBuilder(str2);
                    sb.append(fragment);
                    sb.append(str);
                    a((RuntimeException) new IllegalStateException(sb.toString()));
                }
                kk kkVar = new kk(fragment);
                arrayList2.add(kkVar);
                if (fragment.b_ <= 0 || kkVar.b != null) {
                    kkVar.b = fragment.e;
                } else {
                    kkVar.b = v(fragment);
                    if (fragment.k != null) {
                        Fragment fragment2 = (Fragment) this.e.get(fragment.k);
                        if (fragment2 == null) {
                            StringBuilder sb2 = new StringBuilder("Failure saving state: ");
                            sb2.append(fragment);
                            sb2.append(" has target not in fragment manager: ");
                            sb2.append(fragment.k);
                            a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        if (kkVar.b == null) {
                            kkVar.b = new Bundle();
                        }
                        a(kkVar.b, "android:target_state", fragment2);
                        if (fragment.l != 0) {
                            kkVar.b.putInt("android:target_req_state", fragment.l);
                        }
                    }
                }
                z2 = true;
            }
        }
        if (!z2) {
            return null;
        }
        int size = this.d.size();
        if (size > 0) {
            arrayList = new ArrayList<>(size);
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                Fragment fragment3 = (Fragment) it2.next();
                arrayList.add(fragment3.h);
                if (fragment3.t != this) {
                    StringBuilder sb3 = new StringBuilder(str2);
                    sb3.append(fragment3);
                    sb3.append(str);
                    a((RuntimeException) new IllegalStateException(sb3.toString()));
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<jx> arrayList3 = this.f;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            if (size2 > 0) {
                jyVarArr = new jy[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    jyVarArr[i2] = new jy((jx) this.f.get(i2));
                }
            }
        }
        kh khVar = new kh();
        khVar.a = arrayList2;
        khVar.b = arrayList;
        khVar.c = jyVarArr;
        Fragment fragment4 = this.l;
        if (fragment4 != null) {
            khVar.d = fragment4.h;
        }
        khVar.e = this.q;
        return khVar;
    }

    public final void a(Parcelable parcelable) {
        int i2;
        kk kkVar;
        if (parcelable != null) {
            kh khVar = (kh) parcelable;
            if (khVar.a != null) {
                Iterator it = this.n.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Fragment fragment = (Fragment) it.next();
                    Iterator it2 = khVar.a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            kkVar = null;
                            break;
                        }
                        kkVar = (kk) it2.next();
                        if (kkVar.a.equals(fragment.h)) {
                            break;
                        }
                    }
                    if (kkVar == null) {
                        Fragment fragment2 = fragment;
                        a(fragment2, 1, 0, 0, false);
                        fragment.n = true;
                        a(fragment2, 0, 0, 0, false);
                    } else {
                        kkVar.c = fragment;
                        fragment.f = null;
                        fragment.s = 0;
                        fragment.p = false;
                        fragment.m = false;
                        fragment.k = fragment.j != null ? fragment.j.h : null;
                        fragment.j = null;
                        if (kkVar.b != null) {
                            kkVar.b.setClassLoader(this.j.b.getClassLoader());
                            fragment.f = kkVar.b.getSparseParcelableArray("android:view_state");
                            fragment.e = kkVar.b;
                        }
                    }
                }
                this.e.clear();
                Iterator it3 = khVar.a.iterator();
                while (it3.hasNext()) {
                    kk kkVar2 = (kk) it3.next();
                    if (kkVar2 != null) {
                        Fragment a2 = kkVar2.a(this.j.b.getClassLoader(), g());
                        a2.t = this;
                        this.e.put(a2.h, a2);
                        kkVar2.c = null;
                    }
                }
                this.d.clear();
                if (khVar.b != null) {
                    Iterator it4 = khVar.b.iterator();
                    while (it4.hasNext()) {
                        String str = (String) it4.next();
                        Fragment fragment3 = (Fragment) this.e.get(str);
                        if (fragment3 == null) {
                            StringBuilder sb = new StringBuilder("No instantiated fragment for (");
                            sb.append(str);
                            sb.append(")");
                            a((RuntimeException) new IllegalStateException(sb.toString()));
                        }
                        fragment3.m = true;
                        if (!this.d.contains(fragment3)) {
                            synchronized (this.d) {
                                this.d.add(fragment3);
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder("Already added ");
                            sb2.append(fragment3);
                            throw new IllegalStateException(sb2.toString());
                        }
                    }
                }
                if (khVar.c != null) {
                    this.f = new ArrayList<>(khVar.c.length);
                    for (jy a3 : khVar.c) {
                        jx a4 = a3.a(this);
                        this.f.add(a4);
                        if (a4.b >= 0) {
                            a(a4.b, a4);
                        }
                    }
                } else {
                    this.f = null;
                }
                if (khVar.d != null) {
                    this.l = (Fragment) this.e.get(khVar.d);
                    n(this.l);
                }
                this.q = khVar.e;
            }
        }
    }

    private void B() {
        this.e.values().removeAll(Collections.singleton(null));
    }

    public final void a(ke keVar, kb kbVar, Fragment fragment) {
        if (this.j == null) {
            this.j = keVar;
            this.k = kbVar;
            this.w = fragment;
            if (this.w != null) {
                i();
            }
            if (keVar instanceof m) {
                m mVar = (m) keVar;
                this.g = mVar.c();
                if (fragment != 0) {
                    mVar = fragment;
                }
                this.g.a(mVar, this.h);
            }
            if (fragment != 0) {
                this.n = fragment.t.o(fragment);
            } else if (keVar instanceof lx) {
                this.n = ki.a(((lx) keVar).ar_());
            } else {
                this.n = new ki(false);
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    public final void m() {
        this.y = false;
        this.z = false;
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = (Fragment) this.d.get(i2);
            if (fragment != null) {
                fragment.v.m();
            }
        }
    }

    public final void n() {
        this.y = false;
        this.z = false;
        b(1);
    }

    public final void o() {
        this.y = false;
        this.z = false;
        b(2);
    }

    public final void p() {
        this.y = false;
        this.z = false;
        b(3);
    }

    public final void q() {
        this.y = false;
        this.z = false;
        b(4);
    }

    public final void r() {
        this.z = true;
        b(2);
    }

    public final void s() {
        this.m = true;
        k();
        b(0);
        this.j = null;
        this.k = null;
        this.w = null;
        if (this.g != null) {
            this.h.a();
            this.g = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void b(int i2) {
        try {
            this.p = true;
            a(i2, false);
            this.p = false;
            k();
        } catch (Throwable th) {
            this.p = false;
            throw th;
        }
    }

    public final void a(boolean z2) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.d.get(size);
            if (fragment != null) {
                fragment.f(z2);
            }
        }
    }

    public final void b(boolean z2) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.d.get(size);
            if (fragment != null) {
                fragment.g(z2);
            }
        }
    }

    public final void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            Fragment fragment = (Fragment) this.d.get(i2);
            if (fragment != null) {
                fragment.a(configuration);
            }
        }
    }

    public final void t() {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            Fragment fragment = (Fragment) this.d.get(i2);
            if (fragment != null) {
                fragment.O();
            }
        }
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.i <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            Fragment fragment = (Fragment) this.d.get(i2);
            if (fragment != null && fragment.b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.r != null) {
            for (int i3 = 0; i3 < this.r.size(); i3++) {
                Fragment fragment2 = (Fragment) this.r.get(i3);
                if (arrayList != null) {
                    arrayList.contains(fragment2);
                }
            }
        }
        this.r = arrayList;
        return z2;
    }

    public final boolean a(Menu menu) {
        if (this.i <= 0) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            Fragment fragment = (Fragment) this.d.get(i2);
            if (fragment != null && fragment.b(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public final boolean a(MenuItem menuItem) {
        if (this.i <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            Fragment fragment = (Fragment) this.d.get(i2);
            if (fragment != null && fragment.b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        if (this.i <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            Fragment fragment = (Fragment) this.d.get(i2);
            if (fragment != null && fragment.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        if (this.i > 0) {
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                Fragment fragment = (Fragment) this.d.get(i2);
                if (fragment != null) {
                    fragment.c(menu);
                }
            }
        }
    }

    public final void m(Fragment fragment) {
        if (fragment == null || (this.e.get(fragment.h) == fragment && (fragment.u == null || fragment.t == this))) {
            Fragment fragment2 = this.l;
            this.l = fragment;
            n(fragment2);
            n(this.l);
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public void n(Fragment fragment) {
        if (fragment != null && this.e.get(fragment.h) == fragment) {
            fragment.N();
        }
    }

    public final void a(Fragment fragment, State state) {
        if (this.e.get(fragment.h) == fragment && (fragment.u == null || fragment.t == this)) {
            fragment.P = state;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public final kd g() {
        kg kgVar = this;
        while (true) {
            if (super.g() != a) {
                break;
            }
            Fragment fragment = kgVar.w;
            if (fragment == null) {
                kgVar.b = new kd() {
                    public final Fragment c(ClassLoader classLoader, String str) {
                        return Fragment.a(kg.this.j.b, str, (Bundle) null);
                    }
                };
                break;
            }
            kgVar = fragment.t;
        }
        return super.g();
    }

    public final void a(defpackage.kf.a aVar, boolean z2) {
        this.v.add(new c(aVar, false));
    }

    public final void a(defpackage.kf.a aVar) {
        synchronized (this.v) {
            int i2 = 0;
            int size = this.v.size();
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (((c) this.v.get(i2)).a == aVar) {
                    this.v.remove(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    private void a(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.a(fragment, context, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void b(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.b(fragment, context, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void a(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.a(fragment, bundle, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void b(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.b(fragment, bundle, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void c(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.c(fragment, bundle, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void a(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!z2 || cVar.b) {
                cVar.a.a(fragment, view);
            }
        }
    }

    private void b(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.b(fragment, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void c(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.c(fragment, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void d(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.d(fragment, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void e(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.e(fragment, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void d(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.d(fragment, bundle, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void f(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.f(fragment, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void g(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.g(fragment, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void h(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.w;
        if (fragment2 != null) {
            kg kgVar = fragment2.t;
            if (kgVar instanceof kg) {
                kgVar.h(fragment, true);
            }
        }
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!z2 || cVar.b) {
                cVar.a.a((kf) this, fragment);
            }
        }
    }

    private boolean C() {
        boolean z2 = false;
        for (Fragment fragment : this.e.values()) {
            if (fragment != null) {
                z2 = w(fragment);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    private static boolean w(Fragment fragment) {
        return (fragment.E && fragment.F) || fragment.v.C();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        Fragment fragment2 = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (str2 == null || !kd.a(context.getClassLoader(), str2)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment2 = a(resourceId);
        }
        if (fragment2 == null && string != null) {
            fragment2 = a(string);
        }
        if (fragment2 == null && i2 != -1) {
            fragment2 = a(i2);
        }
        if (fragment2 == null) {
            Fragment c2 = g().c(context.getClassLoader(), str2);
            c2.o = true;
            c2.x = resourceId != 0 ? resourceId : i2;
            c2.y = i2;
            c2.z = string;
            c2.p = true;
            c2.t = this;
            c2.u = this.j;
            c2.a(attributeSet, c2.e);
            a(c2, true);
            fragment = c2;
        } else if (!fragment2.p) {
            fragment2.p = true;
            fragment2.u = this.j;
            fragment2.a(attributeSet, fragment2.e);
            fragment = fragment2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Duplicate id 0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(", tag ");
            sb2.append(string);
            sb2.append(", or parent id 0x");
            sb2.append(Integer.toHexString(i2));
            sb2.append(" with another fragment for ");
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.i > 0 || !fragment.o) {
            p(fragment);
        } else {
            a(fragment, 1, 0, 0, false);
        }
        if (fragment.H != null) {
            if (resourceId != 0) {
                fragment.H.setId(resourceId);
            }
            if (fragment.H.getTag() == null) {
                fragment.H.setTag(string);
            }
            return fragment.H;
        }
        StringBuilder sb3 = new StringBuilder("Fragment ");
        sb3.append(str2);
        sb3.append(" did not create a view.");
        throw new IllegalStateException(sb3.toString());
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
