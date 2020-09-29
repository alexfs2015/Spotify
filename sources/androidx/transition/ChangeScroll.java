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

    public final void a(qu quVar) {
        d(quVar);
    }

    public final void b(qu quVar) {
        d(quVar);
    }

    public final String[] a() {
        return a;
    }

    private static void d(qu quVar) {
        quVar.a.put("android:changeScroll:x", Integer.valueOf(quVar.b.getScrollX()));
        quVar.a.put("android:changeScroll:y", Integer.valueOf(quVar.b.getScrollY()));
    }

    public final Animator a(ViewGroup viewGroup, qu quVar, qu quVar2) {
        Animator animator;
        ObjectAnimator objectAnimator = null;
        if (quVar == null || quVar2 == null) {
            return null;
        }
        View view = quVar2.b;
        String str = "android:changeScroll:x";
        int intValue = ((Integer) quVar.a.get(str)).intValue();
        int intValue2 = ((Integer) quVar2.a.get(str)).intValue();
        String str2 = "android:changeScroll:y";
        int intValue3 = ((Integer) quVar.a.get(str2)).intValue();
        int intValue4 = ((Integer) quVar2.a.get(str2)).intValue();
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
        return qt.a(animator, objectAnimator);
    }
}
