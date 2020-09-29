package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: hfn reason: default package */
public final class hfn implements wig<ObjectAnimator> {
    private final wzi<SpotifyIconDrawable> a;

    private hfn(wzi<SpotifyIconDrawable> wzi) {
        this.a = wzi;
    }

    public static hfn a(wzi<SpotifyIconDrawable> wzi) {
        return new hfn(wzi);
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
        return (ObjectAnimator) wil.a(ofFloat, "Cannot return null from a non-@Nullable @Provides method");
    }
}
