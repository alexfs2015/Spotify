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

/* renamed from: srr reason: default package */
public final class srr {
    public static final a g = $$Lambda$srr$7l_DOGBERUaiU5NAXOceT_0Pg.INSTANCE;
    public final Context a;
    public final srq b;
    public final ViewGroup c;
    public final sry d;
    public boolean e;
    public FindSearchFieldView f;
    private final RecyclerView h;
    private final a i;

    /* renamed from: srr$a */
    public interface a {
        void onIntroAnimationComplete();
    }

    public srr(Context context, srq srq, ViewGroup viewGroup, RecyclerView recyclerView, sry sry, a aVar) {
        this.a = (Context) fbp.a(context);
        this.b = srq;
        this.c = (ViewGroup) fbp.a(viewGroup);
        this.h = (RecyclerView) fbp.a(recyclerView);
        this.d = (sry) fbp.a(sry);
        this.i = (a) fbp.a(aVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    static /* synthetic */ void b(srr srr) {
        srr srr2 = srr;
        if (srr2.e) {
            srr2.e = false;
            srr2.d.b(true);
            int b2 = vfj.b(72.0f, srr2.a.getResources());
            int round = Math.round((srr2.f.getTranslationY() + ((float) gau.a(srr2.a.getResources()))) / ((float) vfj.b(1.5f, srr2.a.getResources())));
            if (round < 0) {
                round = 0;
            }
            int width = srr2.f.getWidth();
            int width2 = srr2.c.getWidth();
            float f2 = 1.0f;
            if (width > 0) {
                f2 = ((float) width2) / ((float) width);
            } else {
                Assertion.b(String.format(Locale.US, "Error during search transition with invalid button width: mTransitionParameters=%s, finalScaleX=%f, widthNow=%d, widthFinal=%d", new Object[]{srr2.b, Float.valueOf(1.0f), Integer.valueOf(width), Integer.valueOf(width2)}));
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(srr2.h, View.ALPHA, new float[]{0.0f, 1.0f});
            long j = (long) round;
            ofFloat.setDuration(j);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(srr2.h, View.TRANSLATION_Y, new float[]{(float) b2, 0.0f});
            ofFloat2.setDuration(j);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(srr2.f, View.TRANSLATION_Y, new float[]{(float) gau.a(srr2.a.getResources())});
            ofFloat3.setInterpolator(fuh.b);
            ofFloat3.setDuration(j);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(srr2.f, FindSearchFieldView.e, new float[]{0.0f, 1.0f});
            ofFloat4.setDuration(j);
            float scaleX = srr2.f.getScaleX();
            int i2 = width2;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(srr2.f, View.SCALE_X, new float[]{scaleX, f2});
            ofFloat5.setDuration(j);
            AnimatorSet animatorSet = new AnimatorSet();
            int i3 = width;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(srr2.f, View.ALPHA, new float[]{0.0f});
            ofFloat6.setDuration(j);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(srr2.d, sry.c, new float[]{0.0f, 1.0f});
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
                    srr.d(srr.this);
                }
            });
            try {
                animatorSet5.start();
            } catch (IllegalArgumentException e2) {
                IllegalArgumentException illegalArgumentException = e2;
                throw new IllegalArgumentException(String.format(Locale.US, "Error during search transition: mTransitionParameters=%s, buttonScaleX=%f, finalScaleX=%f, widthNow=%d, widthFinal=%d, originMessage=%s", new Object[]{srr2.b, Float.valueOf(f3), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i2), illegalArgumentException.getMessage()}), illegalArgumentException);
            }
        }
    }

    static /* synthetic */ void c(srr srr) {
        int[] iArr = new int[2];
        srr.c.getLocationInWindow(iArr);
        srr.f.setTranslationY(srr.f.getTranslationY() - ((float) iArr[1]));
    }

    static /* synthetic */ void d(srr srr) {
        srr.c.removeView(srr.f);
        srr.f = null;
        srr.i.onIntroAnimationComplete();
    }
}
