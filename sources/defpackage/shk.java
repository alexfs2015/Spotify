package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.search.transition.FindSearchFieldView;
import java.util.Locale;

/* renamed from: shk reason: default package */
public final class shk {
    public static final a g = $$Lambda$shk$L9dlyKaYf6HBKg9cxEiLuNfJkTA.INSTANCE;
    public final Context a;
    public final shj b;
    public final ViewGroup c;
    public final shr d;
    public boolean e;
    public FindSearchFieldView f;
    private final RecyclerView h;
    private final a i;

    /* renamed from: shk$a */
    public interface a {
        void onIntroAnimationComplete();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    public shk(Context context, shj shj, ViewGroup viewGroup, RecyclerView recyclerView, shr shr, a aVar) {
        this.a = (Context) fay.a(context);
        this.b = shj;
        this.c = (ViewGroup) fay.a(viewGroup);
        this.h = (RecyclerView) fay.a(recyclerView);
        this.d = (shr) fay.a(shr);
        this.i = (a) fay.a(aVar);
    }

    static /* synthetic */ void b(shk shk) {
        shk shk2 = shk;
        if (shk2.e) {
            shk2.e = false;
            shk2.d.b(true);
            int b2 = uts.b(72.0f, shk2.a.getResources());
            int round = Math.round((shk2.f.getTranslationY() + ((float) gaa.a(shk2.a.getResources()))) / ((float) uts.b(1.5f, shk2.a.getResources())));
            if (round < 0) {
                round = 0;
            }
            int width = shk2.f.getWidth();
            int width2 = shk2.c.getWidth();
            float f2 = 1.0f;
            if (width > 0) {
                f2 = ((float) width2) / ((float) width);
            } else {
                Assertion.b(String.format(Locale.US, "Error during search transition with invalid button width: mTransitionParameters=%s, finalScaleX=%f, widthNow=%d, widthFinal=%d", new Object[]{shk2.b, Float.valueOf(1.0f), Integer.valueOf(width), Integer.valueOf(width2)}));
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(shk2.h, View.ALPHA, new float[]{0.0f, 1.0f});
            long j = (long) round;
            ofFloat.setDuration(j);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(shk2.h, View.TRANSLATION_Y, new float[]{(float) b2, 0.0f});
            ofFloat2.setDuration(j);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(shk2.f, View.TRANSLATION_Y, new float[]{(float) gaa.a(shk2.a.getResources())});
            ofFloat3.setInterpolator(ftn.b);
            ofFloat3.setDuration(j);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(shk2.f, FindSearchFieldView.e, new float[]{0.0f, 1.0f});
            ofFloat4.setDuration(j);
            float scaleX = shk2.f.getScaleX();
            int i2 = width2;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(shk2.f, View.SCALE_X, new float[]{scaleX, f2});
            ofFloat5.setDuration(j);
            AnimatorSet animatorSet = new AnimatorSet();
            int i3 = width;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(shk2.f, View.ALPHA, new float[]{0.0f});
            ofFloat6.setDuration(j);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(shk2.d, shr.c, new float[]{0.0f, 1.0f});
            float f3 = scaleX;
            ofFloat7.setDuration(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4, ofFloat5});
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(new Animator[]{ofFloat6, ofFloat7});
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playSequentially(new Animator[]{animatorSet2, animatorSet3});
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(new Animator[]{ofFloat, ofFloat2, animatorSet, animatorSet4});
            animatorSet5.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    shk.d(shk.this);
                }
            });
            try {
                animatorSet5.start();
            } catch (IllegalArgumentException e2) {
                IllegalArgumentException illegalArgumentException = e2;
                throw new IllegalArgumentException(String.format(Locale.US, "Error during search transition: mTransitionParameters=%s, buttonScaleX=%f, finalScaleX=%f, widthNow=%d, widthFinal=%d, originMessage=%s", new Object[]{shk2.b, Float.valueOf(f3), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i2), illegalArgumentException.getMessage()}), illegalArgumentException);
            }
        }
    }

    static /* synthetic */ void c(shk shk) {
        int[] iArr = new int[2];
        shk.c.getLocationInWindow(iArr);
        shk.f.setTranslationY(shk.f.getTranslationY() - ((float) iArr[1]));
    }

    static /* synthetic */ void d(shk shk) {
        shk.c.removeView(shk.f);
        shk.f = null;
        shk.i.onIntroAnimationComplete();
    }
}
