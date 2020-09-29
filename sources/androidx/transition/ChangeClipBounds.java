package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeClipBounds extends Transition {
    private static final String[] a = {"android:clipBounds:clip"};

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void d(qz qzVar) {
        View view = qzVar.b;
        if (view.getVisibility() != 8) {
            Rect D = ip.D(view);
            qzVar.a.put("android:clipBounds:clip", D);
            if (D == null) {
                qzVar.a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public final Animator a(ViewGroup viewGroup, qz qzVar, qz qzVar2) {
        ObjectAnimator objectAnimator = null;
        if (!(qzVar == null || qzVar2 == null)) {
            String str = "android:clipBounds:clip";
            if (qzVar.a.containsKey(str) && qzVar2.a.containsKey(str)) {
                Rect rect = (Rect) qzVar.a.get(str);
                Rect rect2 = (Rect) qzVar2.a.get(str);
                boolean z = rect2 == null;
                if (rect == null && rect2 == null) {
                    return null;
                }
                String str2 = "android:clipBounds:bounds";
                if (rect == null) {
                    rect = (Rect) qzVar.a.get(str2);
                } else if (rect2 == null) {
                    rect2 = (Rect) qzVar2.a.get(str2);
                }
                if (rect.equals(rect2)) {
                    return null;
                }
                ip.a(qzVar2.b, rect);
                objectAnimator = ObjectAnimator.ofObject(qzVar2.b, rj.b, new qr(new Rect()), new Rect[]{rect, rect2});
                if (z) {
                    final View view = qzVar2.b;
                    objectAnimator.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            ip.a(view, (Rect) null);
                        }
                    });
                }
            }
        }
        return objectAnimator;
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
