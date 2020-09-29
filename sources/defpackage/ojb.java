package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.spotify.music.R;
import com.spotify.music.features.phonenumbersignup.displayname.DisplayNameView;
import com.spotify.music.features.phonenumbersignup.displayname.DisplayNameView.Position;

/* renamed from: ojb reason: default package */
public final class ojb implements b {
    private final DisplayNameView a;

    public ojb(DisplayNameView displayNameView) {
        this.a = (DisplayNameView) fbp.a(displayNameView);
    }

    public final int a() {
        return R.id.display_name;
    }

    public final void a(ViewGroup viewGroup) {
        fbp.b(viewGroup == this.a);
    }

    public final void a(boolean z) {
        DisplayNameView displayNameView = this.a;
        displayNameView.animate().alpha(1.0f).setDuration(500).start();
        Animation loadAnimation = displayNameView.d == Position.RIGHT ? AnimationUtils.loadAnimation(displayNameView.getContext(), R.anim.anim_in_right_with_fade) : AnimationUtils.loadAnimation(displayNameView.getContext(), R.anim.anim_in_left_with_fade);
        loadAnimation.setDuration(500);
        loadAnimation.setFillAfter(true);
        displayNameView.setVisibility(0);
        displayNameView.e.setVisibility(0);
        displayNameView.e.startAnimation(loadAnimation);
        displayNameView.d = Position.CENTER;
        displayNameView.c.setVisibility(0);
        displayNameView.c.setAlpha(0.0f);
        displayNameView.c.animate().alpha(1.0f).setDuration(500).start();
    }

    public final void b(boolean z) {
    }
}
