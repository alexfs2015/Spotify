package androidx.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;

public abstract class Transition implements Cloneable {
    private static ThreadLocal<dp<Animator, a>> C = new ThreadLocal<>();
    private static final int[] a = {2, 1, 3, 4};
    private static final PathMotion m = new PathMotion() {
        public final Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private ArrayList<qz> A;
    private ArrayList<qz> B;
    private ViewGroup D = null;
    private int E = 0;
    private boolean F = false;
    private boolean G = false;
    private ArrayList<c> H = null;
    private ArrayList<Animator> I = new ArrayList<>();
    long b = -1;
    public long c = -1;
    TimeInterpolator d = null;
    public ArrayList<Integer> e = new ArrayList<>();
    public ArrayList<View> f = new ArrayList<>();
    TransitionSet g = null;
    boolean h = false;
    ArrayList<Animator> i = new ArrayList<>();
    qx j;
    b k;
    PathMotion l = m;
    private String n = getClass().getName();
    private ArrayList<String> o = null;
    private ArrayList<Class> p = null;
    private ArrayList<Integer> q = null;
    private ArrayList<View> r = null;
    private ArrayList<Class> s = null;
    private ArrayList<String> t = null;
    private ArrayList<Integer> u = null;
    private ArrayList<View> v = null;
    private ArrayList<Class> w = null;
    private ra x = new ra();
    private ra y = new ra();
    private int[] z = a;

    static class a {
        View a;
        String b;
        qz c;
        rr d;
        Transition e;

        a(View view, String str, Transition transition, rr rrVar, qz qzVar) {
            this.a = view;
            this.b = str;
            this.c = qzVar;
            this.d = rrVar;
            this.e = transition;
        }
    }

    public static abstract class b {
        public abstract Rect a();
    }

    public interface c {
        void a();

        void a(Transition transition);

        void b();

        void c();
    }

    public Transition() {
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qu.a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long a2 = (long) gc.a(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "duration", 1, -1);
        if (a2 >= 0) {
            a(a2);
        }
        long a3 = (long) gc.a(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "startDelay", 2, -1);
        if (a3 > 0) {
            b(a3);
        }
        int c2 = gc.c(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (c2 > 0) {
            a((TimeInterpolator) AnimationUtils.loadInterpolator(context, c2));
        }
        String a4 = gc.a(obtainStyledAttributes, (XmlPullParser) xmlResourceParser, "matchOrder", 3);
        if (a4 != null) {
            a(b(a4));
        }
        obtainStyledAttributes.recycle();
    }

    private static void a(ra raVar, View view, qz qzVar) {
        raVar.a.put(view, qzVar);
        int id = view.getId();
        if (id >= 0) {
            if (raVar.b.indexOfKey(id) >= 0) {
                raVar.b.put(id, null);
            } else {
                raVar.b.put(id, view);
            }
        }
        String q2 = ip.q(view);
        if (q2 != null) {
            if (raVar.d.containsKey(q2)) {
                raVar.d.put(q2, null);
            } else {
                raVar.d.put(q2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (raVar.c.a(itemIdAtPosition) >= 0) {
                    View view2 = (View) raVar.c.a(itemIdAtPosition, null);
                    if (view2 != null) {
                        ip.a(view2, false);
                        raVar.c.b(itemIdAtPosition, null);
                    }
                    return;
                }
                ip.a(view, true);
                raVar.c.b(itemIdAtPosition, view);
            }
        }
    }

    private void a(ra raVar, ra raVar2) {
        ra raVar3 = raVar;
        ra raVar4 = raVar2;
        dp dpVar = new dp((dv) raVar3.a);
        dp dpVar2 = new dp((dv) raVar4.a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.z;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                for (int size = dpVar.size() - 1; size >= 0; size--) {
                    View view = (View) dpVar.b(size);
                    if (view != null && b(view)) {
                        qz qzVar = (qz) dpVar2.remove(view);
                        if (!(qzVar == null || qzVar.b == null || !b(qzVar.b))) {
                            this.A.add((qz) dpVar.d(size));
                            this.B.add(qzVar);
                        }
                    }
                }
            } else if (i3 == 2) {
                dp<String, View> dpVar3 = raVar3.d;
                dp<String, View> dpVar4 = raVar4.d;
                int size2 = dpVar3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    View view2 = (View) dpVar3.c(i4);
                    if (view2 != null && b(view2)) {
                        View view3 = (View) dpVar4.get(dpVar3.b(i4));
                        if (view3 != null && b(view3)) {
                            qz qzVar2 = (qz) dpVar.get(view2);
                            qz qzVar3 = (qz) dpVar2.get(view3);
                            if (!(qzVar2 == null || qzVar3 == null)) {
                                this.A.add(qzVar2);
                                this.B.add(qzVar3);
                                dpVar.remove(view2);
                                dpVar2.remove(view3);
                            }
                        }
                    }
                }
            } else if (i3 == 3) {
                SparseArray<View> sparseArray = raVar3.b;
                SparseArray<View> sparseArray2 = raVar4.b;
                int size3 = sparseArray.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    View view4 = (View) sparseArray.valueAt(i5);
                    if (view4 != null && b(view4)) {
                        View view5 = (View) sparseArray2.get(sparseArray.keyAt(i5));
                        if (view5 != null && b(view5)) {
                            qz qzVar4 = (qz) dpVar.get(view4);
                            qz qzVar5 = (qz) dpVar2.get(view5);
                            if (!(qzVar4 == null || qzVar5 == null)) {
                                this.A.add(qzVar4);
                                this.B.add(qzVar5);
                                dpVar.remove(view4);
                                dpVar2.remove(view5);
                            }
                        }
                    }
                }
            } else if (i3 == 4) {
                ds<View> dsVar = raVar3.c;
                ds<View> dsVar2 = raVar4.c;
                int b2 = dsVar.b();
                for (int i6 = 0; i6 < b2; i6++) {
                    View view6 = (View) dsVar.c(i6);
                    if (view6 != null && b(view6)) {
                        View view7 = (View) dsVar2.a(dsVar.b(i6), null);
                        if (view7 != null && b(view7)) {
                            qz qzVar6 = (qz) dpVar.get(view6);
                            qz qzVar7 = (qz) dpVar2.get(view7);
                            if (!(qzVar6 == null || qzVar7 == null)) {
                                this.A.add(qzVar6);
                                this.B.add(qzVar7);
                                dpVar.remove(view6);
                                dpVar2.remove(view7);
                            }
                        }
                    }
                }
            }
            i2++;
        }
        for (int i7 = 0; i7 < dpVar.size(); i7++) {
            qz qzVar8 = (qz) dpVar.c(i7);
            if (b(qzVar8.b)) {
                this.A.add(qzVar8);
                this.B.add(null);
            }
        }
        for (int i8 = 0; i8 < dpVar2.size(); i8++) {
            qz qzVar9 = (qz) dpVar2.c(i8);
            if (b(qzVar9.b)) {
                this.B.add(qzVar9);
                this.A.add(null);
            }
        }
    }

    private void a(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.z = a;
            return;
        }
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (!(i3 > 0 && i3 <= 4)) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!a(iArr, i2)) {
                i2++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.z = (int[]) iArr.clone();
    }

    private static boolean a(qz qzVar, qz qzVar2, String str) {
        Object obj = qzVar.a.get(str);
        Object obj2 = qzVar2.a.get(str);
        return !(obj == null && obj2 == null) && (obj == null || obj2 == null || !obj.equals(obj2));
    }

    private static boolean a(int[] iArr, int i2) {
        int i3 = iArr[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            if (iArr[i4] == i3) {
                return true;
            }
        }
        return false;
    }

    private static int[] b(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i2] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i2] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i2] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i2] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                i2--;
                iArr = iArr2;
            } else {
                StringBuilder sb = new StringBuilder("Unknown match type in matchOrder: '");
                sb.append(trim);
                sb.append("'");
                throw new InflateException(sb.toString());
            }
            i2++;
        }
        return iArr;
    }

    private void c(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                qz qzVar = new qz();
                qzVar.b = view;
                if (z2) {
                    a(qzVar);
                } else {
                    b(qzVar);
                }
                qzVar.c.add(this);
                c(qzVar);
                if (z2) {
                    a(this.x, view, qzVar);
                } else {
                    a(this.y, view, qzVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    c(viewGroup.getChildAt(i2), z2);
                }
            }
        }
    }

    private static dp<Animator, a> g() {
        dp<Animator, a> dpVar = (dp) C.get();
        if (dpVar != null) {
            return dpVar;
        }
        dp<Animator, a> dpVar2 = new dp<>();
        C.set(dpVar2);
        return dpVar2;
    }

    public Animator a(ViewGroup viewGroup, qz qzVar, qz qzVar2) {
        return null;
    }

    public Transition a(int i2) {
        if (i2 != 0) {
            this.e.add(Integer.valueOf(i2));
        }
        return this;
    }

    public Transition a(long j2) {
        this.c = j2;
        return this;
    }

    public Transition a(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
        return this;
    }

    public Transition a(c cVar) {
        if (this.H == null) {
            this.H = new ArrayList<>();
        }
        this.H.add(cVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        String str2 = ") ";
        if (this.c != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.c);
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (this.b != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.b);
            sb4.append(str2);
            sb2 = sb4.toString();
        }
        if (this.d != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.d);
            sb5.append(str2);
            sb2 = sb5.toString();
        }
        if (this.e.size() <= 0 && this.f.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        String str3 = ", ";
        if (this.e.size() > 0) {
            String str4 = sb7;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str4);
                    sb8.append(str3);
                    str4 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str4);
                sb9.append(this.e.get(i2));
                str4 = sb9.toString();
            }
            sb7 = str4;
        }
        if (this.f.size() > 0) {
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                if (i3 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(str3);
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.f.get(i3));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }

    public final qz a(View view, boolean z2) {
        Transition transition = this;
        while (true) {
            TransitionSet transitionSet = transition.g;
            if (transitionSet == null) {
                break;
            }
            transition = transitionSet;
        }
        return (qz) (z2 ? transition.x : transition.y).a.get(view);
    }

    public final void a(ViewGroup viewGroup) {
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        a(this.x, this.y);
        dp g2 = g();
        int size = g2.size();
        rr a2 = rj.a(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = (Animator) g2.b(i2);
            if (animator != null) {
                a aVar = (a) g2.get(animator);
                if (!(aVar == null || aVar.a == null || !a2.equals(aVar.d))) {
                    qz qzVar = aVar.c;
                    View view = aVar.a;
                    qz a3 = a(view, true);
                    qz b2 = b(view, true);
                    if (!(a3 == null && b2 == null) && aVar.e.a(qzVar, b2)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            g2.remove(animator);
                        }
                    }
                }
            }
        }
        a(viewGroup, this.x, this.y, this.A, this.B);
        b();
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, ra raVar, ra raVar2, ArrayList<qz> arrayList, ArrayList<qz> arrayList2) {
        int i2;
        int i3;
        View view;
        Animator animator;
        qz qzVar;
        Animator animator2;
        qz qzVar2;
        ViewGroup viewGroup2 = viewGroup;
        dp g2 = g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            qz qzVar3 = (qz) arrayList.get(i4);
            qz qzVar4 = (qz) arrayList2.get(i4);
            if (qzVar3 != null && !qzVar3.c.contains(this)) {
                qzVar3 = null;
            }
            if (qzVar4 != null && !qzVar4.c.contains(this)) {
                qzVar4 = null;
            }
            if (!(qzVar3 == null && qzVar4 == null)) {
                if (qzVar3 == null || qzVar4 == null || a(qzVar3, qzVar4)) {
                    Animator a2 = a(viewGroup2, qzVar3, qzVar4);
                    if (a2 != null) {
                        if (qzVar4 != null) {
                            view = qzVar4.b;
                            String[] a3 = a();
                            if (view != null && a3 != null && a3.length > 0) {
                                qzVar2 = new qz();
                                qzVar2.b = view;
                                animator2 = a2;
                                i3 = size;
                                qz qzVar5 = (qz) raVar2.a.get(view);
                                if (qzVar5 != null) {
                                    int i5 = 0;
                                    while (i5 < a3.length) {
                                        int i6 = i4;
                                        qz qzVar6 = qzVar5;
                                        qzVar2.a.put(a3[i5], qzVar5.a.get(a3[i5]));
                                        i5++;
                                        ArrayList<qz> arrayList3 = arrayList2;
                                        i4 = i6;
                                        qzVar5 = qzVar6;
                                    }
                                }
                                i2 = i4;
                                int size2 = g2.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size2) {
                                        break;
                                    }
                                    a aVar = (a) g2.get((Animator) g2.b(i7));
                                    if (aVar.c != null && aVar.a == view && aVar.b.equals(this.n) && aVar.c.equals(qzVar2)) {
                                        qzVar = qzVar2;
                                        animator = null;
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                animator2 = a2;
                                i3 = size;
                                i2 = i4;
                                qzVar2 = null;
                            }
                            qzVar = qzVar2;
                            animator = animator2;
                        } else {
                            Animator animator3 = a2;
                            i3 = size;
                            i2 = i4;
                            view = qzVar3.b;
                            animator = animator3;
                            qzVar = null;
                        }
                        if (animator != null) {
                            qx qxVar = this.j;
                            if (qxVar != null) {
                                long a4 = qxVar.a(viewGroup2, this, qzVar3, qzVar4);
                                sparseIntArray.put(this.I.size(), (int) a4);
                                j2 = Math.min(a4, j2);
                            }
                            long j3 = j2;
                            a aVar2 = new a(view, this.n, this, rj.a(viewGroup), qzVar);
                            g2.put(animator, aVar2);
                            this.I.add(animator);
                            j2 = j3;
                        }
                        i4 = i2 + 1;
                        size = i3;
                    }
                }
            }
            i3 = size;
            i2 = i4;
            i4 = i2 + 1;
            size = i3;
        }
        if (j2 != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator4 = (Animator) this.I.get(sparseIntArray.keyAt(i8));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i8)) - j2) + animator4.getStartDelay());
            }
        }
    }

    public final void a(ViewGroup viewGroup, boolean z2) {
        a(z2);
        if (this.e.size() > 0 || this.f.size() > 0) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                View findViewById = viewGroup.findViewById(((Integer) this.e.get(i2)).intValue());
                if (findViewById != null) {
                    qz qzVar = new qz();
                    qzVar.b = findViewById;
                    if (z2) {
                        a(qzVar);
                    } else {
                        b(qzVar);
                    }
                    qzVar.c.add(this);
                    c(qzVar);
                    if (z2) {
                        a(this.x, findViewById, qzVar);
                    } else {
                        a(this.y, findViewById, qzVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                View view = (View) this.f.get(i3);
                qz qzVar2 = new qz();
                qzVar2.b = view;
                if (z2) {
                    a(qzVar2);
                } else {
                    b(qzVar2);
                }
                qzVar2.c.add(this);
                c(qzVar2);
                if (z2) {
                    a(this.x, view, qzVar2);
                } else {
                    a(this.y, view, qzVar2);
                }
            }
            return;
        }
        c(viewGroup, z2);
    }

    public void a(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.l = m;
        } else {
            this.l = pathMotion;
        }
    }

    public void a(b bVar) {
        this.k = bVar;
    }

    public void a(qx qxVar) {
        this.j = qxVar;
    }

    public abstract void a(qz qzVar);

    public final void a(boolean z2) {
        if (z2) {
            this.x.a.clear();
            this.x.b.clear();
            this.x.c.c();
            return;
        }
        this.y.a.clear();
        this.y.b.clear();
        this.y.c.c();
    }

    public boolean a(qz qzVar, qz qzVar2) {
        if (!(qzVar == null || qzVar2 == null)) {
            String[] a2 = a();
            if (a2 != null) {
                for (String a3 : a2) {
                    if (a(qzVar, qzVar2, a3)) {
                        return true;
                    }
                }
            } else {
                for (String a4 : qzVar.a.keySet()) {
                    if (a(qzVar, qzVar2, a4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String[] a() {
        return null;
    }

    public Transition b(long j2) {
        this.b = j2;
        return this;
    }

    public Transition b(c cVar) {
        ArrayList<c> arrayList = this.H;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(cVar);
        if (this.H.size() == 0) {
            this.H = null;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final qz b(View view, boolean z2) {
        Transition transition = this;
        while (true) {
            TransitionSet transitionSet = transition.g;
            if (transitionSet == null) {
                break;
            }
            transition = transitionSet;
        }
        ArrayList<qz> arrayList = z2 ? transition.A : transition.B;
        qz qzVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            qz qzVar2 = (qz) arrayList.get(i3);
            if (qzVar2 == null) {
                return null;
            }
            if (qzVar2.b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            qzVar = (qz) (z2 ? transition.B : transition.A).get(i2);
        }
        return qzVar;
    }

    /* access modifiers changed from: protected */
    public void b() {
        c();
        final dp g2 = g();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (g2.containsKey(animator)) {
                c();
                if (animator != null) {
                    animator.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            g2.remove(animator);
                            Transition.this.i.remove(animator);
                        }

                        public final void onAnimationStart(Animator animator) {
                            Transition.this.i.add(animator);
                        }
                    });
                    if (animator == null) {
                        d();
                    } else {
                        long j2 = this.c;
                        if (j2 >= 0) {
                            animator.setDuration(j2);
                        }
                        long j3 = this.b;
                        if (j3 >= 0) {
                            animator.setStartDelay(j3);
                        }
                        TimeInterpolator timeInterpolator = this.d;
                        if (timeInterpolator != null) {
                            animator.setInterpolator(timeInterpolator);
                        }
                        animator.addListener(new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                Transition.this.d();
                                animator.removeListener(this);
                            }
                        });
                        animator.start();
                    }
                }
            }
        }
        this.I.clear();
        d();
    }

    public abstract void b(qz qzVar);

    /* access modifiers changed from: 0000 */
    public final boolean b(View view) {
        return (this.e.size() == 0 && this.f.size() == 0) || this.e.contains(Integer.valueOf(view.getId())) || this.f.contains(view);
    }

    public Transition c(View view) {
        this.f.add(view);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (this.E == 0) {
            ArrayList<c> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList2.get(i2)).c();
                }
            }
            this.G = false;
        }
        this.E++;
    }

    /* access modifiers changed from: 0000 */
    public void c(qz qzVar) {
        if (this.j != null && !qzVar.a.isEmpty()) {
            String[] a2 = this.j.a();
            if (a2 != null) {
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= a2.length) {
                        z2 = true;
                        break;
                    } else if (!qzVar.a.containsKey(a2[i2])) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z2) {
                    this.j.a(qzVar);
                }
            }
        }
    }

    public Transition d(View view) {
        this.f.remove(view);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void d() {
        this.E--;
        if (this.E == 0) {
            ArrayList<c> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList2.get(i2)).a(this);
                }
            }
            for (int i3 = 0; i3 < this.x.c.b(); i3++) {
                View view = (View) this.x.c.c(i3);
                if (view != null) {
                    ip.a(view, false);
                }
            }
            for (int i4 = 0; i4 < this.y.c.b(); i4++) {
                View view2 = (View) this.y.c.c(i4);
                if (view2 != null) {
                    ip.a(view2, false);
                }
            }
            this.G = true;
        }
    }

    public final Rect e() {
        b bVar = this.k;
        if (bVar == null) {
            return null;
        }
        return bVar.a();
    }

    public void e(View view) {
        int i2;
        if (!this.G) {
            dp g2 = g();
            int size = g2.size();
            rr a2 = rj.a(view);
            int i3 = size - 1;
            while (true) {
                i2 = 0;
                if (i3 < 0) {
                    break;
                }
                a aVar = (a) g2.c(i3);
                if (aVar.a != null && a2.equals(aVar.d)) {
                    Animator animator = (Animator) g2.b(i3);
                    if (VERSION.SDK_INT >= 19) {
                        animator.pause();
                    } else {
                        ArrayList listeners = animator.getListeners();
                        if (listeners != null) {
                            int size2 = listeners.size();
                            while (i2 < size2) {
                                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i2);
                                if (animatorListener instanceof defpackage.qf.a) {
                                    ((defpackage.qf.a) animatorListener).onAnimationPause(animator);
                                }
                                i2++;
                            }
                        }
                    }
                }
                i3--;
            }
            ArrayList<c> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size3 = arrayList2.size();
                while (i2 < size3) {
                    ((c) arrayList2.get(i2)).a();
                    i2++;
                }
            }
            this.F = true;
        }
    }

    /* renamed from: f */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.I = new ArrayList<>();
            transition.x = new ra();
            transition.y = new ra();
            transition.A = null;
            transition.B = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void f(View view) {
        if (this.F) {
            if (!this.G) {
                dp g2 = g();
                int size = g2.size();
                rr a2 = rj.a(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    a aVar = (a) g2.c(i2);
                    if (aVar.a != null && a2.equals(aVar.d)) {
                        Animator animator = (Animator) g2.b(i2);
                        if (VERSION.SDK_INT >= 19) {
                            animator.resume();
                        } else {
                            ArrayList listeners = animator.getListeners();
                            if (listeners != null) {
                                int size2 = listeners.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    AnimatorListener animatorListener = (AnimatorListener) listeners.get(i3);
                                    if (animatorListener instanceof defpackage.qf.a) {
                                        ((defpackage.qf.a) animatorListener).onAnimationResume(animator);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList<c> arrayList = this.H;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.H.clone();
                    int size3 = arrayList2.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        ((c) arrayList2.get(i4)).b();
                    }
                }
            }
            this.F = false;
        }
    }

    public String toString() {
        return a("");
    }
}
