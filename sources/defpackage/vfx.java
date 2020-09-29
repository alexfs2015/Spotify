package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.List;

/* renamed from: vfx reason: default package */
public final class vfx implements vfy {
    private static final int[] a = {16842919};
    private static final int[] b = new int[0];
    private final float c;
    private final View d;
    private final List<View> e = Lists.a();
    private final List<View> f = Lists.a();

    public vfx(View view, float f2) {
        this.d = view;
        this.c = f2;
    }

    private static b a(Animator animator, Animator animator2) {
        b bVar = new b();
        bVar.a(a, animator);
        bVar.a(b, animator2);
        return bVar;
    }

    private static vfv a(View view) {
        if (view instanceof vfv) {
            return (vfv) view;
        }
        StringBuilder sb = new StringBuilder("PressableMotionSpec requires the target view to implement StateListAnimatorCompatSupport; Class: ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }

    private boolean f() {
        if (!(this.d instanceof vfv)) {
            return true;
        }
        for (View view : this.e) {
            if (!(view instanceof vfv)) {
                return true;
            }
        }
        for (View view2 : this.f) {
            if (!(view2 instanceof vfv)) {
                return true;
            }
        }
        return false;
    }

    public final vfx a(View... viewArr) {
        Collections.addAll(this.e, viewArr);
        return this;
    }

    public final void a() {
        if (f()) {
            Logger.d("Can't apply press state animations to views that don't implement StateListAnimatorCompatSupport", new Object[0]);
            return;
        }
        Animator a2 = vfq.a(new vga(this));
        a(this.d).a(a(vfq.a(new vfw(this)), a2));
    }

    public final View b() {
        return this.d;
    }

    public final vfx b(View... viewArr) {
        Collections.addAll(this.f, viewArr);
        return this;
    }

    public final List<View> c() {
        return this.f;
    }

    public final List<View> d() {
        return this.e;
    }

    public final float e() {
        return this.c;
    }
}
