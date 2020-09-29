package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: ieg reason: default package */
public final class ieg {
    public static Animator a(View view) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f});
    }

    public static Animator a(View view, float f) {
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f, 0.0f});
    }

    public static Animator b(View view) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
    }

    public static Animator b(View view, float f) {
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f, f});
    }
}
