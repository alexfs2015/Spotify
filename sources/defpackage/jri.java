package defpackage;

import android.view.View;
import android.view.animation.Animation;
import java.util.LinkedList;

/* renamed from: jri reason: default package */
public final class jri {
    LinkedList<a> a = new LinkedList<>();

    /* renamed from: jri$a */
    static class a {
        View a;
        Animation b;
        boolean c;

        public a(View view, Animation animation, boolean z) {
            this.a = view;
            this.b = animation;
            this.c = z;
        }
    }

    public final void a(View view, Animation animation, boolean z) {
        this.a.add(new a(view, animation, false));
        if (this.a.size() == 1) {
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        final a aVar = (a) this.a.element();
        aVar.a.setVisibility(0);
        aVar.a.startAnimation(aVar.b);
        aVar.b.setAnimationListener(new jxf() {
            public final void onAnimationEnd(Animation animation) {
                if (aVar.c) {
                    aVar.a.setVisibility(8);
                }
                jri.this.a.remove();
                if (jri.this.a.size() > 0) {
                    jri.this.a();
                }
            }
        });
    }
}
