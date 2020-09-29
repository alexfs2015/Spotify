package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;
import com.spotify.music.libs.connect.access.view.PressableConnectCardView;

/* renamed from: rxz reason: default package */
public final class rxz {
    public final ConnectAccessButton a;
    final AnimatorSet b;
    Integer c;
    int d = 0;
    private Runnable e;

    public rxz(ConnectAccessButton connectAccessButton) {
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

    private void b(int i) {
        this.d = i;
        this.b.addListener(new AnimatorListenerAdapter() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(int i) {
                rxz.this.a(i);
            }

            public final void onAnimationEnd(Animator animator) {
                int i;
                if (rxz.this.c == null) {
                    i = rxz.this.d;
                } else {
                    i = rxz.this.c.intValue();
                    rxz.this.c = null;
                }
                rxz.this.b.removeListener(this);
                rxz.this.a.post(new $$Lambda$rxz$1$Bjw9lqi6zfZUFpbRzyRUyhRopo(this, i));
            }
        });
        this.b.start();
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

    private static boolean c(int i) {
        return 5 == i || 4 == i;
    }

    public Runnable a(long j) {
        return new $$Lambda$rxz$qiImB9tpZgilsX2HzRSaF0SqZTY(this, j);
    }

    public final void a() {
        this.a.post(new $$Lambda$rxz$qiImB9tpZgilsX2HzRSaF0SqZTY(this, 5000));
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
}
