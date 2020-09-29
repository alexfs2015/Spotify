package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition.b;
import androidx.transition.Transition.c;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class TransitionSet extends Transition {
    public ArrayList<Transition> a = new ArrayList<>();
    int m;
    boolean n = false;
    private boolean o = true;
    private int p = 0;

    static class a extends qv {
        private TransitionSet a;

        a(TransitionSet transitionSet) {
            this.a = transitionSet;
        }

        public final void a(Transition transition) {
            this.a.m--;
            if (this.a.m == 0) {
                TransitionSet transitionSet = this.a;
                transitionSet.n = false;
                transitionSet.d();
            }
            transition.b((c) this);
        }

        public final void c() {
            if (!this.a.n) {
                this.a.c();
                this.a.n = true;
            }
        }
    }

    public TransitionSet() {
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qu.g);
        b(gc.a(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    public final /* synthetic */ Transition a(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            ((Transition) this.a.get(i2)).a(i);
        }
        return (TransitionSet) super.a(i);
    }

    public final /* bridge */ /* synthetic */ Transition a(c cVar) {
        return (TransitionSet) super.a(cVar);
    }

    public final TransitionSet a(Transition transition) {
        this.a.add(transition);
        transition.g = this;
        if (this.c >= 0) {
            transition.a(this.c);
        }
        if ((this.p & 1) != 0) {
            transition.a(this.d);
        }
        if ((this.p & 2) != 0) {
            transition.a(this.j);
        }
        if ((this.p & 4) != 0) {
            transition.a(this.l);
        }
        if ((this.p & 8) != 0) {
            transition.a(this.k);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final String a(String str) {
        String a2 = super.a(str);
        for (int i = 0; i < this.a.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("\n");
            Transition transition = (Transition) this.a.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(transition.a(sb2.toString()));
            a2 = sb.toString();
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final void a(ViewGroup viewGroup, ra raVar, ra raVar2, ArrayList<qz> arrayList, ArrayList<qz> arrayList2) {
        long j = this.b;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.a.get(i);
            if (j > 0 && (this.o || i == 0)) {
                long j2 = transition.b;
                if (j2 > 0) {
                    transition.b(j2 + j);
                } else {
                    transition.b(j);
                }
            }
            transition.a(viewGroup, raVar, raVar2, arrayList, arrayList2);
        }
    }

    public final void a(PathMotion pathMotion) {
        super.a(pathMotion);
        this.p |= 4;
        for (int i = 0; i < this.a.size(); i++) {
            ((Transition) this.a.get(i)).a(pathMotion);
        }
    }

    public final void a(b bVar) {
        super.a(bVar);
        this.p |= 8;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.a.get(i)).a(bVar);
        }
    }

    public final void a(qx qxVar) {
        super.a(qxVar);
        this.p |= 2;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.a.get(i)).a(qxVar);
        }
    }

    public final void a(qz qzVar) {
        if (b(qzVar.b)) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.b(qzVar.b)) {
                    transition.a(qzVar);
                    qzVar.c.add(transition);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Transition b(long j) {
        return (TransitionSet) super.b(j);
    }

    public final /* bridge */ /* synthetic */ Transition b(c cVar) {
        return (TransitionSet) super.b(cVar);
    }

    public final TransitionSet b(int i) {
        if (i == 0) {
            this.o = true;
        } else if (i == 1) {
            this.o = false;
        } else {
            StringBuilder sb = new StringBuilder("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    /* renamed from: b */
    public final TransitionSet a(TimeInterpolator timeInterpolator) {
        this.p |= 1;
        ArrayList<Transition> arrayList = this.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.a.get(i)).a(timeInterpolator);
            }
        }
        return (TransitionSet) super.a(timeInterpolator);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.a.isEmpty()) {
            c();
            d();
            return;
        }
        a aVar = new a(this);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).a((c) aVar);
        }
        this.m = this.a.size();
        if (!this.o) {
            for (int i = 1; i < this.a.size(); i++) {
                final Transition transition = (Transition) this.a.get(i);
                ((Transition) this.a.get(i - 1)).a((c) new qv() {
                    public final void a(Transition transition) {
                        transition.b();
                        transition.b((c) this);
                    }
                });
            }
            Transition transition2 = (Transition) this.a.get(0);
            if (transition2 != null) {
                transition2.b();
            }
            return;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((Transition) it2.next()).b();
        }
    }

    public final void b(qz qzVar) {
        if (b(qzVar.b)) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.b(qzVar.b)) {
                    transition.b(qzVar);
                    qzVar.c.add(transition);
                }
            }
        }
    }

    public final Transition c(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return (Transition) this.a.get(i);
    }

    public final /* synthetic */ Transition c(View view) {
        for (int i = 0; i < this.a.size(); i++) {
            ((Transition) this.a.get(i)).c(view);
        }
        return (TransitionSet) super.c(view);
    }

    /* renamed from: c */
    public final TransitionSet a(long j) {
        super.a(j);
        if (this.c >= 0) {
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.a.get(i)).a(j);
            }
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void c(qz qzVar) {
        super.c(qzVar);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.a.get(i)).c(qzVar);
        }
    }

    public final /* synthetic */ Transition d(View view) {
        for (int i = 0; i < this.a.size(); i++) {
            ((Transition) this.a.get(i)).d(view);
        }
        return (TransitionSet) super.d(view);
    }

    public final void e(View view) {
        super.e(view);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.a.get(i)).e(view);
        }
    }

    /* renamed from: f */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.a = new ArrayList<>();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            transitionSet.a(((Transition) this.a.get(i)).clone());
        }
        return transitionSet;
    }

    public final void f(View view) {
        super.f(view);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.a.get(i)).f(view);
        }
    }
}