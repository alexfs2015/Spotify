package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.spotify.music.R;
import com.spotify.music.features.phonenumbersignup.agegender.view.AgeGenderView;
import com.spotify.music.features.phonenumbersignup.agegender.view.AgeGenderView.Position;

/* renamed from: ohq reason: default package */
public final class ohq implements b {
    private final AgeGenderView a;

    public ohq(AgeGenderView ageGenderView) {
        this.a = (AgeGenderView) fbp.a(ageGenderView);
    }

    public final int a() {
        return R.id.age_gender;
    }

    public final void a(ViewGroup viewGroup) {
        fbp.b(viewGroup == this.a);
    }

    public final void a(boolean z) {
        AgeGenderView ageGenderView = this.a;
        Animation loadAnimation = ageGenderView.b == Position.RIGHT ? AnimationUtils.loadAnimation(ageGenderView.getContext(), R.anim.anim_in_right_with_fade) : AnimationUtils.loadAnimation(ageGenderView.getContext(), R.anim.anim_in_left_with_fade);
        loadAnimation.setFillAfter(true);
        loadAnimation.setDuration(500);
        ageGenderView.setVisibility(0);
        ageGenderView.c.setVisibility(0);
        ageGenderView.d.startAnimation(loadAnimation);
        ageGenderView.b = Position.CENTER;
        ageGenderView.c.animate().alpha(1.0f).setDuration(500).start();
    }

    public final void b(boolean z) {
        AgeGenderView ageGenderView = this.a;
        Animation loadAnimation = z ^ true ? AnimationUtils.loadAnimation(ageGenderView.getContext(), R.anim.anim_out_right_with_fade) : AnimationUtils.loadAnimation(ageGenderView.getContext(), R.anim.anim_out_left_with_fade);
        loadAnimation.setAnimationListener(new AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
                AgeGenderView.this.setVisibility(8);
                AgeGenderView.this.c.setVisibility(8);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        loadAnimation.setFillAfter(true);
        loadAnimation.setDuration(500);
        ageGenderView.d.startAnimation(loadAnimation);
        ageGenderView.b = Position.RIGHT;
        ageGenderView.c.animate().alpha(0.0f).setDuration(500).start();
    }
}
