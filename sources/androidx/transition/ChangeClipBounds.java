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

    public final String[] a() {
        return a;
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void d(qu quVar) {
        View view = quVar.b;
        if (view.getVisibility() != 8) {
            Rect D = ip.D(view);
            quVar.a.put("android:clipBounds:clip", D);
            if (D == null) {
                quVar.a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public final void a(qu quVar) {
        d(quVar);
    }

    public final void b(qu quVar) {
        d(quVar);
    }

    public final Animator a(ViewGroup viewGroup, qu quVar, qu quVar2) {
        ObjectAnimator objectAnimator = null;
        if (!(quVar == null || quVar2 == null)) {
            String str = "android:clipBounds:clip";
            if (quVar.a.containsKey(str) && quVar2.a.containsKey(str)) {
                Rect rect = (Rect) quVar.a.get(str);
                Rect rect2 = (Rect) quVar2.a.get(str);
                boolean z = rect2 == null;
                if (rect == null && rect2 == null) {
                    return null;
                }
                String str2 = "android:clipBounds:bounds";
                if (rect == null) {
                    rect = (Rect) quVar.a.get(str2);
                } else if (rect2 == null) {
                    rect2 = (Rect) quVar2.a.get(str2);
                }
                if (rect.equals(rect2)) {
                    return null;
                }
                ip.a(quVar2.b, rect);
                objectAnimator = ObjectAnimator.ofObject(quVar2.b, re.b, new qm(new Rect()), new Rect[]{rect, rect2});
                if (z) {
                    final View view = quVar2.b;
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
}
