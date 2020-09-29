package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;
import com.spotify.music.libs.connect.access.view.PressableConnectCardView;

/* renamed from: rot reason: default package */
public final class rot {
    public final ConnectAccessButton a;
    final AnimatorSet b;
    Integer c;
    int d = 0;
    private Runnable e;

    private static boolean c(int i) {
        return 5 == i || 4 == i;
    }

    public rot(ConnectAccessButton connectAccessButton) {
        this.a = connectAccessButton;
        final ConnectAccessButton connectAccessButton2 = this.a;
        PressableConnectCardView pressableConnectCardView = connectAccessButton2.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pressableConnectCardView, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pressableConnectCardView, "scaleY", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setStartDelay(750);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                connectAccessButton2.setVisibility(4);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                connectAccessButton2.setVisibility(0);
            }
        });
        this.b = animatorSet;
    }

    public final void a(int i) {
        if (this.b.isStarted()) {
            this.c = Integer.valueOf(i);
        } else {
            int i2 = this.d;
            if (i2 == 0 && i != i2) {
                b(i);
            } else if (c(i)) {
                a();
            }
        }
        this.d = i;
    }

    public final void a() {
        this.a.post(new $$Lambda$rot$EOMaTbUcXDdM0xuYhCSAanv6J0(this, 5000));
    }

    public Runnable a(long j) {
        return new $$Lambda$rot$EOMaTbUcXDdM0xuYhCSAanv6J0(this, j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(long j) {
        this.a.b.setVisibility(0);
        this.a.removeCallbacks(this.e);
        ConnectAccessButton connectAccessButton = this.a;
        connectAccessButton.getClass();
        this.e = new $$Lambda$xv3ZG0zREuX3oswrpHvN2n68IiE(connectAccessButton);
        this.a.postDelayed(this.e, j);
    }

    private void b(int i) {
        this.d = i;
        this.b.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                int i;
                if (rot.this.c == null) {
                    i = rot.this.d;
                } else {
                    i = rot.this.c.intValue();
                    rot.this.c = null;
                }
                rot.this.b.removeListener(this);
                rot.this.a.post(new $$Lambda$rot$1$qOrjJkhoYnEYTRw45qZkFYDw0Y(this, i));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(int i) {
                rot.this.a(i);
            }
        });
        this.b.start();
    }
}
