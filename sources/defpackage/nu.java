package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nu reason: default package */
public final class nu extends ol {
    private static TimeInterpolator l;
    ArrayList<ArrayList<u>> a = new ArrayList<>();
    ArrayList<ArrayList<b>> b = new ArrayList<>();
    ArrayList<ArrayList<a>> c = new ArrayList<>();
    ArrayList<u> d = new ArrayList<>();
    ArrayList<u> e = new ArrayList<>();
    ArrayList<u> f = new ArrayList<>();
    ArrayList<u> g = new ArrayList<>();
    private ArrayList<u> m = new ArrayList<>();
    private ArrayList<u> n = new ArrayList<>();
    private ArrayList<b> o = new ArrayList<>();
    private ArrayList<a> p = new ArrayList<>();

    /* renamed from: nu$a */
    static class a {
        public u a;
        public u b;
        public int c;
        public int d;
        public int e;
        public int f;

        private a(u uVar, u uVar2) {
            this.a = uVar;
            this.b = uVar2;
        }

        a(u uVar, u uVar2, int i, int i2, int i3, int i4) {
            this(uVar, uVar2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            sb.append(this.f);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: nu$b */
    static class b {
        public u a;
        public int b;
        public int c;
        public int d;
        public int e;

        b(u uVar, int i, int i2, int i3, int i4) {
            this.a = uVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public final void a() {
        long j;
        long j2;
        boolean z = !this.m.isEmpty();
        boolean z2 = !this.o.isEmpty();
        boolean z3 = !this.p.isEmpty();
        boolean z4 = !this.n.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                final u uVar = (u) it.next();
                final View view = uVar.o;
                final ViewPropertyAnimator animate = view.animate();
                this.f.add(uVar);
                animate.setDuration(f()).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animate.setListener(null);
                        view.setAlpha(1.0f);
                        nu.this.f(uVar);
                        nu.this.f.remove(uVar);
                        nu.this.c();
                    }
                }).start();
            }
            this.m.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.o);
                this.b.add(arrayList);
                this.o.clear();
                AnonymousClass1 r6 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b bVar = (b) it.next();
                            nu nuVar = nu.this;
                            u uVar = bVar.a;
                            int i = bVar.b;
                            int i2 = bVar.c;
                            int i3 = bVar.d;
                            int i4 = bVar.e;
                            View view = uVar.o;
                            int i5 = i3 - i;
                            int i6 = i4 - i2;
                            if (i5 != 0) {
                                view.animate().translationX(0.0f);
                            }
                            if (i6 != 0) {
                                view.animate().translationY(0.0f);
                            }
                            ViewPropertyAnimator animate = view.animate();
                            nuVar.e.add(uVar);
                            ViewPropertyAnimator duration = animate.setDuration(nuVar.i);
                            AnonymousClass6 r2 = new AnimatorListenerAdapter(uVar, i5, view, i6, animate) {
                                private /* synthetic */ u a;
                                private /* synthetic */ int b;
                                private /* synthetic */ View c;
                                private /* synthetic */ int d;
                                private /* synthetic */ ViewPropertyAnimator e;

                                public final void onAnimationStart(Animator animator) {
                                }

                                {
                                    this.a = r2;
                                    this.b = r3;
                                    this.c = r4;
                                    this.d = r5;
                                    this.e = r6;
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    if (this.b != 0) {
                                        this.c.setTranslationX(0.0f);
                                    }
                                    if (this.d != 0) {
                                        this.c.setTranslationY(0.0f);
                                    }
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.e.setListener(null);
                                    nu.this.f(this.a);
                                    nu.this.e.remove(this.a);
                                    nu.this.c();
                                }
                            };
                            duration.setListener(r2).start();
                        }
                        arrayList.clear();
                        nu.this.b.remove(arrayList);
                    }
                };
                if (z) {
                    ip.a(((b) arrayList.get(0)).a.o, (Runnable) r6, f());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.p);
                this.c.add(arrayList2);
                this.p.clear();
                AnonymousClass2 r62 = new Runnable() {
                    public final void run() {
                        View view;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            a aVar = (a) it.next();
                            nu nuVar = nu.this;
                            u uVar = aVar.a;
                            View view2 = null;
                            if (uVar == null) {
                                view = null;
                            } else {
                                view = uVar.o;
                            }
                            u uVar2 = aVar.b;
                            if (uVar2 != null) {
                                view2 = uVar2.o;
                            }
                            if (view != null) {
                                ViewPropertyAnimator duration = view.animate().setDuration(nuVar.j);
                                nuVar.g.add(aVar.a);
                                duration.translationX((float) (aVar.e - aVar.c));
                                duration.translationY((float) (aVar.f - aVar.d));
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(aVar, duration, view) {
                                    private /* synthetic */ a a;
                                    private /* synthetic */ ViewPropertyAnimator b;
                                    private /* synthetic */ View c;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    {
                                        this.a = r2;
                                        this.b = r3;
                                        this.c = r4;
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.b.setListener(null);
                                        this.c.setAlpha(1.0f);
                                        this.c.setTranslationX(0.0f);
                                        this.c.setTranslationY(0.0f);
                                        nu.this.f(this.a.a);
                                        nu.this.g.remove(this.a.a);
                                        nu.this.c();
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                nuVar.g.add(aVar.b);
                                animate.translationX(0.0f).translationY(0.0f).setDuration(nuVar.j).alpha(1.0f).setListener(new AnimatorListenerAdapter(aVar, animate, view2) {
                                    private /* synthetic */ a a;
                                    private /* synthetic */ ViewPropertyAnimator b;
                                    private /* synthetic */ View c;

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    {
                                        this.a = r2;
                                        this.b = r3;
                                        this.c = r4;
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.b.setListener(null);
                                        this.c.setAlpha(1.0f);
                                        this.c.setTranslationX(0.0f);
                                        this.c.setTranslationY(0.0f);
                                        nu.this.f(this.a.b);
                                        nu.this.g.remove(this.a.b);
                                        nu.this.c();
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        nu.this.c.remove(arrayList2);
                    }
                };
                if (z) {
                    ip.a(((a) arrayList2.get(0)).a.o, (Runnable) r62, f());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.n);
                this.a.add(arrayList3);
                this.n.clear();
                AnonymousClass3 r5 = new Runnable() {
                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            u uVar = (u) it.next();
                            nu nuVar = nu.this;
                            View view = uVar.o;
                            ViewPropertyAnimator animate = view.animate();
                            nuVar.d.add(uVar);
                            animate.alpha(1.0f).setDuration(nuVar.e()).setListener(new AnimatorListenerAdapter(uVar, view, animate) {
                                private /* synthetic */ u a;
                                private /* synthetic */ View b;
                                private /* synthetic */ ViewPropertyAnimator c;

                                public final void onAnimationStart(Animator animator) {
                                }

                                {
                                    this.a = r2;
                                    this.b = r3;
                                    this.c = r4;
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    this.b.setAlpha(1.0f);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.c.setListener(null);
                                    nu.this.f(this.a);
                                    nu.this.d.remove(this.a);
                                    nu.this.c();
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        nu.this.a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = f();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.i;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = this.j;
                    }
                    ip.a(((u) arrayList3.get(0)).o, (Runnable) r5, j + Math.max(j2, j3));
                } else {
                    r5.run();
                }
            }
        }
    }

    public final boolean a(u uVar) {
        h(uVar);
        this.m.add(uVar);
        return true;
    }

    public final boolean b(u uVar) {
        h(uVar);
        uVar.o.setAlpha(0.0f);
        this.n.add(uVar);
        return true;
    }

    public final boolean a(u uVar, int i, int i2, int i3, int i4) {
        View view = uVar.o;
        int translationX = i + ((int) uVar.o.getTranslationX());
        int translationY = i2 + ((int) uVar.o.getTranslationY());
        h(uVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            f(uVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<b> arrayList = this.o;
        b bVar = new b(uVar, translationX, translationY, i3, i4);
        arrayList.add(bVar);
        return true;
    }

    public final boolean a(u uVar, u uVar2, int i, int i2, int i3, int i4) {
        if (uVar == uVar2) {
            return a(uVar, i, i2, i3, i4);
        }
        float translationX = uVar.o.getTranslationX();
        float translationY = uVar.o.getTranslationY();
        float alpha = uVar.o.getAlpha();
        h(uVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        uVar.o.setTranslationX(translationX);
        uVar.o.setTranslationY(translationY);
        uVar.o.setAlpha(alpha);
        if (uVar2 != null) {
            h(uVar2);
            uVar2.o.setTranslationX((float) (-i5));
            uVar2.o.setTranslationY((float) (-i6));
            uVar2.o.setAlpha(0.0f);
        }
        ArrayList<a> arrayList = this.p;
        a aVar = new a(uVar, uVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }

    private void a(List<a> list, u uVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = (a) list.get(size);
            if (a(aVar, uVar) && aVar.a == null && aVar.b == null) {
                list.remove(aVar);
            }
        }
    }

    private void a(a aVar) {
        if (aVar.a != null) {
            a(aVar, aVar.a);
        }
        if (aVar.b != null) {
            a(aVar, aVar.b);
        }
    }

    private boolean a(a aVar, u uVar) {
        if (aVar.b == uVar) {
            aVar.b = null;
        } else if (aVar.a != uVar) {
            return false;
        } else {
            aVar.a = null;
        }
        uVar.o.setAlpha(1.0f);
        uVar.o.setTranslationX(0.0f);
        uVar.o.setTranslationY(0.0f);
        f(uVar);
        return true;
    }

    public final void c(u uVar) {
        View view = uVar.o;
        view.animate().cancel();
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((b) this.o.get(size)).a == uVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                f(uVar);
                this.o.remove(size);
            }
        }
        a((List<a>) this.p, uVar);
        if (this.m.remove(uVar)) {
            view.setAlpha(1.0f);
            f(uVar);
        }
        if (this.n.remove(uVar)) {
            view.setAlpha(1.0f);
            f(uVar);
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.c.get(size2);
            a((List<a>) arrayList, uVar);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        for (int size3 = this.b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).a == uVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    f(uVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.a.get(size5);
            if (arrayList3.remove(uVar)) {
                view.setAlpha(1.0f);
                f(uVar);
                if (arrayList3.isEmpty()) {
                    this.a.remove(size5);
                }
            }
        }
        this.f.remove(uVar);
        this.d.remove(uVar);
        this.g.remove(uVar);
        this.e.remove(uVar);
        c();
    }

    private void h(u uVar) {
        if (l == null) {
            l = new ValueAnimator().getInterpolator();
        }
        uVar.o.animate().setInterpolator(l);
        c(uVar);
    }

    public final boolean b() {
        return !this.n.isEmpty() || !this.p.isEmpty() || !this.o.isEmpty() || !this.m.isEmpty() || !this.e.isEmpty() || !this.f.isEmpty() || !this.d.isEmpty() || !this.g.isEmpty() || !this.b.isEmpty() || !this.a.isEmpty() || !this.c.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        if (!b()) {
            g();
        }
    }

    public final void d() {
        int size = this.o.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = (b) this.o.get(size);
            View view = bVar.a.o;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            f(bVar.a);
            this.o.remove(size);
        }
        for (int size2 = this.m.size() - 1; size2 >= 0; size2--) {
            f((u) this.m.get(size2));
            this.m.remove(size2);
        }
        int size3 = this.n.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            u uVar = (u) this.n.get(size3);
            uVar.o.setAlpha(1.0f);
            f(uVar);
            this.n.remove(size3);
        }
        for (int size4 = this.p.size() - 1; size4 >= 0; size4--) {
            a((a) this.p.get(size4));
        }
        this.p.clear();
        if (b()) {
            for (int size5 = this.b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = (b) arrayList.get(size6);
                    View view2 = bVar2.a.o;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    f(bVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    u uVar2 = (u) arrayList2.get(size8);
                    uVar2.o.setAlpha(1.0f);
                    f(uVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a((a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.c.remove(arrayList3);
                    }
                }
            }
            a((List<u>) this.f);
            a((List<u>) this.e);
            a((List<u>) this.d);
            a((List<u>) this.g);
            g();
        }
    }

    private static void a(List<u> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((u) list.get(size)).o.animate().cancel();
        }
    }

    public final boolean a(u uVar, List<Object> list) {
        return !list.isEmpty() || super.a(uVar, list);
    }
}
