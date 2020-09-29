package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.spotify.music.R;
import com.spotify.music.features.signup.agegender.view.AgeGenderView;
import com.spotify.music.features.signup.agegender.view.AgeGenderView.Position;

/* renamed from: oax reason: default package */
public final class oax implements b {
    private final AgeGenderView a;

    public final int a() {
        return R.id.age_gender;
    }

    public oax(AgeGenderView ageGenderView) {
        this.a = (AgeGenderView) fay.a(ageGenderView);
    }

    public final void a(ViewGroup viewGroup) {
        fay.b(viewGroup == this.a);
    }

    public final void a(boolean z) {
        Animation animation;
        AgeGenderView ageGenderView = this.a;
        if (ageGenderView.b == Position.RIGHT) {
            animation = AnimationUtils.loadAnimation(ageGenderView.getContext(), R.anim.anim_in_right_with_fade);
        } else {
            animation = AnimationUtils.loadAnimation(ageGenderView.getContext(), R.anim.anim_in_left_with_fade);
        }
        animation.setFillAfter(true);
        animation.setDuration(500);
        ageGenderView.setVisibility(0);
        ageGenderView.c.setVisibility(0);
        ageGenderView.d.startAnimation(animation);
        ageGenderView.b = Position.CENTER;
        ageGenderView.c.animate().alpha(1.0f).setDuration(500).start();
    }

    public final void b(boolean z) {
        Animation animation;
        AgeGenderView ageGenderView = this.a;
        if (!z) {
            animation = AnimationUtils.loadAnimation(ageGenderView.getContext(), R.anim.anim_out_right_with_fade);
        } else {
            animation = AnimationUtils.loadAnimation(ageGenderView.getContext(), R.anim.anim_out_left_with_fade);
        }
        animation.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                AgeGenderView.this.setVisibility(8);
                AgeGenderView.this.c.setVisibility(8);
            }
        });
        animation.setFillAfter(true);
        animation.setDuration(500);
        ageGenderView.d.startAnimation(animation);
        ageGenderView.b = Position.RIGHT;
        ageGenderView.c.animate().alpha(0.0f).setDuration(500).start();
    }
}
