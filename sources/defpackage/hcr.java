package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: hcr reason: default package */
public final class hcr implements vua<ObjectAnimator> {
    private final wlc<SpotifyIconDrawable> a;

    private hcr(wlc<SpotifyIconDrawable> wlc) {
        this.a = wlc;
    }

    public static hcr a(wlc<SpotifyIconDrawable> wlc) {
        return new hcr(wlc);
    }

    public final /* synthetic */ Object get() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((SpotifyIconDrawable) this.a.get(), "rotation", new float[]{0.0f, 360.0f});
        ofFloat.setDuration(500);
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                animator.setStartDelay(300);
                animator.start();
            }
        });
        return (ObjectAnimator) vuf.a(ofFloat, "Cannot return null from a non-@Nullable @Provides method");
    }
}
