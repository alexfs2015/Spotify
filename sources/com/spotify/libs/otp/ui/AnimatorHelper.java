package com.spotify.libs.otp.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;
import android.view.ViewParent;
import com.spotify.libs.otp.ui.AnimatorHelper.a.CC;

public final class AnimatorHelper {

    /* renamed from: com.spotify.libs.otp.ui.AnimatorHelper$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Position.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.libs.otp.ui.AnimatorHelper$Position[] r0 = com.spotify.libs.otp.ui.AnimatorHelper.Position.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.libs.otp.ui.AnimatorHelper$Position r1 = com.spotify.libs.otp.ui.AnimatorHelper.Position.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.libs.otp.ui.AnimatorHelper$Position r1 = com.spotify.libs.otp.ui.AnimatorHelper.Position.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.otp.ui.AnimatorHelper.AnonymousClass1.<clinit>():void");
        }
    }

    enum Position {
        LEFT,
        RIGHT
    }

    @FunctionalInterface
    public interface a extends AnimatorListener {

        /* renamed from: com.spotify.libs.otp.ui.AnimatorHelper$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onAnimationCancel(a aVar, Animator animator) {
            }

            public static void $default$onAnimationEnd(a aVar, Animator animator) {
                aVar.onAnimationEnd();
            }

            public static void $default$onAnimationEnd(a aVar, Animator animator, boolean z) {
                aVar.onAnimationEnd();
            }

            public static void $default$onAnimationRepeat(a aVar, Animator animator) {
            }

            public static void $default$onAnimationStart(a aVar, Animator animator) {
            }

            public static void $default$onAnimationStart(a aVar, Animator animator, boolean z) {
            }
        }

        void onAnimationCancel(Animator animator);

        void onAnimationEnd();

        void onAnimationEnd(Animator animator);

        void onAnimationEnd(Animator animator, boolean z);

        void onAnimationRepeat(Animator animator);

        void onAnimationStart(Animator animator);

        void onAnimationStart(Animator animator, boolean z);
    }

    private static float a(View view, Position position) {
        ViewParent parent = view.getParent();
        fbp.b(parent instanceof View);
        int width = ((View) parent).getWidth();
        int i = AnonymousClass1.a[position.ordinal()];
        if (i == 1) {
            return (float) (-width);
        }
        if (i == 2) {
            return (float) width;
        }
        throw new AssertionError("Unsupported position");
    }

    private static Position a(boolean z) {
        return z ? Position.RIGHT : Position.LEFT;
    }

    public static void a(View view, boolean z) {
        fbp.a(view);
        if (view.getVisibility() == 0) {
            float a2 = a(view, a(!z));
            view.animate().alpha(0.0f).translationX(a2).setDuration(500).setListener(new a(view) {
                private final /* synthetic */ View f$0;

                {
                    this.f$0 = r1;
                }

                public /* synthetic */ void onAnimationCancel(Animator animator) {
                    CC.$default$onAnimationCancel(this, animator);
                }

                public final void onAnimationEnd() {
                    this.f$0.setVisibility(8);
                }

                public /* synthetic */ void onAnimationEnd(Animator animator) {
                    CC.$default$onAnimationEnd(this, animator);
                }

                public /* synthetic */ void onAnimationEnd(Animator animator, boolean z) {
                    CC.$default$onAnimationEnd(this, animator, z);
                }

                public /* synthetic */ void onAnimationRepeat(Animator animator) {
                    CC.$default$onAnimationRepeat(this, animator);
                }

                public /* synthetic */ void onAnimationStart(Animator animator) {
                    CC.$default$onAnimationStart(this, animator);
                }

                public /* synthetic */ void onAnimationStart(Animator animator, boolean z) {
                    CC.$default$onAnimationStart(this, animator, z);
                }
            }).start();
        }
    }

    public static void a(View view, boolean z, a aVar) {
        fbp.a(view);
        if (view.getVisibility() != 0) {
            float a2 = a(view, a(z));
            view.setAlpha(0.0f);
            view.setTranslationX(a2);
            view.setVisibility(0);
            view.animate().alpha(1.0f).translationX(0.0f).setDuration(500).setListener(aVar).start();
        }
    }
}
