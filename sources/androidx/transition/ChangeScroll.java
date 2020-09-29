package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {
    private static final String[] a = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void d(qz qzVar) {
        qzVar.a.put("android:changeScroll:x", Integer.valueOf(qzVar.b.getScrollX()));
        qzVar.a.put("android:changeScroll:y", Integer.valueOf(qzVar.b.getScrollY()));
    }

    public final Animator a(ViewGroup viewGroup, qz qzVar, qz qzVar2) {
        Animator animator;
        ObjectAnimator objectAnimator = null;
        if (qzVar == null || qzVar2 == null) {
            return null;
        }
        View view = qzVar2.b;
        String str = "android:changeScroll:x";
        int intValue = ((Integer) qzVar.a.get(str)).intValue();
        int intValue2 = ((Integer) qzVar2.a.get(str)).intValue();
        String str2 = "android:changeScroll:y";
        int intValue3 = ((Integer) qzVar.a.get(str2)).intValue();
        int intValue4 = ((Integer) qzVar2.a.get(str2)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            animator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            animator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return qy.a(animator, objectAnimator);
    }

    public final void a(qz qzVar) {
        d(qzVar);
    }

    public final String[] a() {
        return a;
    }

    public final void b(qz qzVar) {
        d(qzVar);
    }
}
