package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.spotify.music.R;
import com.spotify.music.features.signup.displayname.DisplayNameView;
import com.spotify.music.features.signup.displayname.DisplayNameView.Position;

/* renamed from: obz reason: default package */
public final class obz implements b {
    private final DisplayNameView a;

    public final int a() {
        return R.id.display_name;
    }

    public final void b(boolean z) {
    }

    public obz(DisplayNameView displayNameView) {
        this.a = (DisplayNameView) fay.a(displayNameView);
    }

    public final void a(ViewGroup viewGroup) {
        fay.b(viewGroup == this.a);
    }

    public final void a(boolean z) {
        Animation animation;
        DisplayNameView displayNameView = this.a;
        displayNameView.animate().alpha(1.0f).setDuration(500).start();
        if (displayNameView.d == Position.RIGHT) {
            animation = AnimationUtils.loadAnimation(displayNameView.getContext(), R.anim.anim_in_right_with_fade);
        } else {
            animation = AnimationUtils.loadAnimation(displayNameView.getContext(), R.anim.anim_in_left_with_fade);
        }
        animation.setDuration(500);
        animation.setFillAfter(true);
        displayNameView.setVisibility(0);
        displayNameView.e.setVisibility(0);
        displayNameView.e.startAnimation(animation);
        displayNameView.d = Position.CENTER;
        displayNameView.c.setVisibility(0);
        displayNameView.c.setAlpha(0.0f);
        displayNameView.c.animate().alpha(1.0f).setDuration(500).start();
    }
}
