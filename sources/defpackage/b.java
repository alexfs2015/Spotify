package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.StateSet;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: b reason: default package */
public final class b implements Cloneable {
    public Animator a;
    private ArrayList<a> b = new ArrayList<>();
    private a c;
    private WeakReference<View> d;
    private AnimatorListenerAdapter e;

    /* renamed from: b$a */
    static class a {
        final int[] a;
        final Animator b;

        /* synthetic */ a(int[] iArr, Animator animator, byte b2) {
            this(iArr, animator);
        }

        private a(int[] iArr, Animator animator) {
            this.a = iArr;
            this.b = animator;
        }
    }

    public b() {
        b();
    }

    private void b() {
        this.e = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                animator.setTarget(null);
                if (b.this.a == animator) {
                    b.this.a = null;
                }
            }
        };
    }

    public final void a(int[] iArr, Animator animator) {
        a aVar = new a(iArr, animator, 0);
        aVar.b.addListener(this.e);
        this.b.add(aVar);
    }

    private View c() {
        WeakReference<View> weakReference = this.d;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final void a(View view) {
        View c2 = c();
        if (c2 != view) {
            if (c2 != null) {
                int size = this.b.size();
                for (int i = 0; i < size; i++) {
                    ((a) this.b.get(i)).b.setTarget(null);
                }
                this.d = null;
                this.c = null;
                this.a = null;
            }
            if (view != null) {
                this.d = new WeakReference<>(view);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.b = new ArrayList<>(this.b.size());
            bVar.c = null;
            bVar.a = null;
            bVar.d = null;
            bVar.e = null;
            bVar.b();
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                a aVar = (a) this.b.get(i);
                Animator clone = aVar.b.clone();
                clone.removeListener(this.e);
                bVar.a(aVar.a, clone);
            }
            return bVar;
        } catch (CloneNotSupportedException e2) {
            AssertionError assertionError = new AssertionError("cannot clone state list animator");
            assertionError.initCause(e2);
            throw assertionError;
        }
    }

    public final void a(int[] iArr) {
        a aVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (a) this.b.get(i);
            if (StateSet.stateSetMatches(aVar.a, iArr)) {
                break;
            }
            i++;
        }
        a aVar2 = this.c;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                Animator animator = this.a;
                if (animator != null) {
                    animator.cancel();
                    this.a = null;
                }
            }
            this.c = aVar;
            if (aVar != null) {
                aVar.b.setTarget(c());
                this.a = aVar.b;
                this.a.start();
            }
        }
    }

    public final void a() {
        Animator animator = this.a;
        if (animator != null) {
            animator.end();
        }
    }
}
