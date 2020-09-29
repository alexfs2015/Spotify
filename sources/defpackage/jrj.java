package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.LinkedList;

/* renamed from: jrj reason: default package */
public final class jrj {
    LinkedList<a> a = new LinkedList<>();

    /* renamed from: jrj$a */
    static class a {
        View a;
        Animator b;
        boolean c;

        public a(View view, Animator animator, boolean z) {
            this.a = view;
            this.b = animator;
            this.c = z;
        }
    }

    public final void a(View view, Animator animator, boolean z) {
        this.a.add(new a(view, animator, z));
        if (this.a.size() == 1) {
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        final a aVar = (a) this.a.element();
        aVar.a.setVisibility(0);
        aVar.b.setTarget(aVar.a);
        aVar.b.cancel();
        aVar.b.start();
        aVar.b.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                aVar.b.removeListener(this);
                if (aVar.c) {
                    aVar.a.setVisibility(8);
                }
                jrj.this.a.remove();
                if (jrj.this.a.size() > 0) {
                    jrj.this.a();
                }
            }
        });
    }
}
