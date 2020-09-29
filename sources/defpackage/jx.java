package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.b;
import androidx.lifecycle.Lifecycle.State;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: jx reason: default package */
final class jx extends km implements e {
    final kg a;
    int b = -1;
    private boolean t;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.b >= 0) {
            sb.append(" #");
            sb.append(this.b);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public jx(kg kgVar) {
        this.a = kgVar;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, Fragment fragment, String str, int i2) {
        super.a(i, fragment, str, i2);
        fragment.t = this.a;
    }

    public final km a(Fragment fragment) {
        if (fragment.t == null || fragment.t == this.a) {
            return super.a(fragment);
        }
        StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public final km b(Fragment fragment) {
        if (fragment.t == null || fragment.t == this.a) {
            return super.b(fragment);
        }
        StringBuilder sb = new StringBuilder("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public final km a(Fragment fragment, State state) {
        if (fragment.t != this.a) {
            StringBuilder sb = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.a);
            throw new IllegalArgumentException(sb.toString());
        } else if (state.a(State.CREATED)) {
            return super.a(fragment, state);
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot set maximum Lifecycle below ");
            sb2.append(State.CREATED);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i) {
        if (this.j) {
            boolean z = kg.c;
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.c.get(i2);
                if (aVar.b != null) {
                    aVar.b.s += i;
                    boolean z2 = kg.c;
                }
            }
        }
    }

    public final void a() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                ((Runnable) this.s.get(i)).run();
            }
            this.s = null;
        }
    }

    public final int b() {
        return b(false);
    }

    public final int c() {
        return b(true);
    }

    public final void d() {
        g();
        this.a.b((e) this, false);
    }

    public final void e() {
        g();
        this.a.b((e) this, true);
    }

    private int b(boolean z) {
        if (!this.t) {
            boolean z2 = kg.c;
            this.t = true;
            if (this.j) {
                this.b = this.a.a(this);
            } else {
                this.b = -1;
            }
            this.a.a((e) this, z);
            return this.b;
        }
        throw new IllegalStateException("commit already called");
    }

    public final boolean a(ArrayList<jx> arrayList, ArrayList<Boolean> arrayList2) {
        boolean z = kg.c;
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.j) {
            kg kgVar = this.a;
            if (kgVar.f == null) {
                kgVar.f = new ArrayList<>();
            }
            kgVar.f.add(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) this.c.get(i2);
            int i3 = aVar.b != null ? aVar.b.y : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ArrayList<jx> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) this.c.get(i4);
            int i5 = aVar.b != null ? aVar.b.y : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    jx jxVar = (jx) arrayList.get(i6);
                    int size2 = jxVar.c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        a aVar2 = (a) jxVar.c.get(i7);
                        if ((aVar2.b != null ? aVar2.b.y : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.c.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.b(this.h, this.i);
            }
            switch (aVar.a) {
                case 1:
                    fragment.j_(aVar.c);
                    this.a.a(fragment, false);
                    break;
                case 3:
                    fragment.j_(aVar.d);
                    this.a.h(fragment);
                    break;
                case 4:
                    fragment.j_(aVar.d);
                    kg.i(fragment);
                    break;
                case 5:
                    fragment.j_(aVar.c);
                    kg.j(fragment);
                    break;
                case 6:
                    fragment.j_(aVar.d);
                    this.a.k(fragment);
                    break;
                case 7:
                    fragment.j_(aVar.c);
                    this.a.l(fragment);
                    break;
                case 8:
                    this.a.m(fragment);
                    break;
                case 9:
                    this.a.m(null);
                    break;
                case 10:
                    this.a.a(fragment, aVar.h);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(aVar.a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.r || aVar.a == 1 || fragment == null)) {
                this.a.f(fragment);
            }
        }
        if (!this.r) {
            kg kgVar = this.a;
            kgVar.a(kgVar.i, true);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            a aVar = (a) this.c.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.b(kg.c(this.h), this.i);
            }
            switch (aVar.a) {
                case 1:
                    fragment.j_(aVar.f);
                    this.a.h(fragment);
                    break;
                case 3:
                    fragment.j_(aVar.e);
                    this.a.a(fragment, false);
                    break;
                case 4:
                    fragment.j_(aVar.e);
                    kg.j(fragment);
                    break;
                case 5:
                    fragment.j_(aVar.f);
                    kg.i(fragment);
                    break;
                case 6:
                    fragment.j_(aVar.e);
                    this.a.l(fragment);
                    break;
                case 7:
                    fragment.j_(aVar.f);
                    this.a.k(fragment);
                    break;
                case 8:
                    this.a.m(null);
                    break;
                case 9:
                    this.a.m(fragment);
                    break;
                case 10:
                    this.a.a(fragment, aVar.g);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(aVar.a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.r || aVar.a == 3 || fragment == null)) {
                this.a.f(fragment);
            }
        }
        if (!this.r && z) {
            kg kgVar = this.a;
            kgVar.a(kgVar.i, true);
        }
    }

    /* access modifiers changed from: 0000 */
    public final Fragment a(ArrayList<Fragment> arrayList, Fragment fragment) {
        int i;
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i < this.c.size()) {
            a aVar = (a) this.c.get(i);
            int i3 = aVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i4 = fragment3.y;
                    Fragment fragment4 = fragment2;
                    int i5 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList2.get(size);
                        if (fragment5.y == i4) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.c.add(i5, new a(9, fragment5));
                                    i5++;
                                    fragment4 = null;
                                }
                                a aVar2 = new a(3, fragment5);
                                aVar2.c = aVar.c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.c.add(i5, aVar2);
                                arrayList2.remove(fragment5);
                                i5++;
                            }
                        }
                    }
                    if (z) {
                        this.c.remove(i5);
                        i = i5 - 1;
                    } else {
                        aVar.a = 1;
                        arrayList2.add(fragment3);
                        i = i5;
                    }
                    fragment2 = fragment4;
                } else if (i3 == 3 || i3 == 6) {
                    arrayList2.remove(aVar.b);
                    if (aVar.b == fragment2) {
                        this.c.add(i, new a(9, aVar.b));
                        i++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.c.add(i, new a(9, fragment2));
                        i++;
                        fragment2 = aVar.b;
                    }
                }
                i2 = i + 1;
            }
            arrayList2.add(aVar.b);
            i2 = i + 1;
        }
        return fragment2;
    }

    /* access modifiers changed from: 0000 */
    public final Fragment b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            a aVar = (a) this.c.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }

    /* access modifiers changed from: 0000 */
    public final void a(b bVar) {
        for (int i = 0; i < this.c.size(); i++) {
            a aVar = (a) this.c.get(i);
            if (a(aVar)) {
                aVar.b.a(bVar);
            }
        }
    }

    static boolean a(a aVar) {
        Fragment fragment = aVar.b;
        return fragment != null && fragment.m && fragment.H != null && !fragment.B && !fragment.A && fragment.ac();
    }

    public final void a(String str, PrintWriter printWriter) {
        String str2;
        printWriter.print(str);
        printWriter.print("mName=");
        printWriter.print(this.k);
        printWriter.print(" mIndex=");
        printWriter.print(this.b);
        printWriter.print(" mCommitted=");
        printWriter.println(this.t);
        if (this.h != 0) {
            printWriter.print(str);
            printWriter.print("mTransition=#");
            printWriter.print(Integer.toHexString(this.h));
            printWriter.print(" mTransitionStyle=#");
            printWriter.println(Integer.toHexString(this.i));
        }
        if (!(this.d == 0 && this.e == 0)) {
            printWriter.print(str);
            printWriter.print("mEnterAnim=#");
            printWriter.print(Integer.toHexString(this.d));
            printWriter.print(" mExitAnim=#");
            printWriter.println(Integer.toHexString(this.e));
        }
        if (!(this.f == 0 && this.g == 0)) {
            printWriter.print(str);
            printWriter.print("mPopEnterAnim=#");
            printWriter.print(Integer.toHexString(this.f));
            printWriter.print(" mPopExitAnim=#");
            printWriter.println(Integer.toHexString(this.g));
        }
        if (!(this.l == 0 && this.m == null)) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbTitleRes=#");
            printWriter.print(Integer.toHexString(this.l));
            printWriter.print(" mBreadCrumbTitleText=");
            printWriter.println(this.m);
        }
        if (!(this.n == 0 && this.o == null)) {
            printWriter.print(str);
            printWriter.print("mBreadCrumbShortTitleRes=#");
            printWriter.print(Integer.toHexString(this.n));
            printWriter.print(" mBreadCrumbShortTitleText=");
            printWriter.println(this.o);
        }
        if (!this.c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                a aVar = (a) this.c.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("cmd=");
                        sb.append(aVar.a);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (!(aVar.c == 0 && aVar.d == 0)) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }
}
