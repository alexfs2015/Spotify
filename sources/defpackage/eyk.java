package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: eyk reason: default package */
public final class eyk {
    private final dv<String, eyl> a = new dv<>();

    private void a(String str, eyl eyl) {
        this.a.put(str, eyl);
    }

    public final long a() {
        int size = this.a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            eyl eyl = (eyl) this.a.c(i);
            j = Math.max(j, eyl.a + eyl.b);
        }
        return j;
    }

    public static eyk a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return a(context, resourceId);
            }
        }
        return null;
    }

    public static eyk a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return a((List<Animator>) arrayList);
        } catch (Exception unused) {
            new StringBuilder("Can't load animation resource ID #0x").append(Integer.toHexString(i));
            return null;
        }
    }

    private static eyk a(List<Animator> list) {
        eyk eyk = new eyk();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(eyk, (Animator) list.get(i));
        }
        return eyk;
    }

    private static void a(eyk eyk, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            eyk.a(objectAnimator.getPropertyName(), eyl.a((ValueAnimator) objectAnimator));
            return;
        }
        StringBuilder sb = new StringBuilder("Animator must be an ObjectAnimator: ");
        sb.append(animator);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((eyk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.a);
        sb.append("}\n");
        return sb.toString();
    }

    public final eyl a(String str) {
        if (this.a.get(str) != null) {
            return (eyl) this.a.get(str);
        }
        throw new IllegalArgumentException();
    }
}
