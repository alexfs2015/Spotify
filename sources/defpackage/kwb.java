package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: kwb reason: default package */
public final class kwb {
    public static final e a = new e() {
        public final void call() {
        }
    };

    /* renamed from: kwb$a */
    public static class a extends AnimatorListenerAdapter {
        private final xir a;

        public a(xir xir) {
            this.a = xir;
        }

        public final void onAnimationStart(Animator animator) {
            this.a.call();
        }
    }

    /* renamed from: kwb$b */
    public static class b extends e {
        private final ImageView a;
        private final kvy b;

        public b(ImageView imageView, kvy kvy) {
            this.a = imageView;
            this.b = kvy;
        }

        public final void call() {
            this.b.a(this.a);
        }
    }

    /* renamed from: kwb$c */
    public static class c extends e {
        private final TextView a;
        private final CharSequence b;

        public c(TextView textView, CharSequence charSequence) {
            this.a = textView;
            this.b = charSequence;
        }

        public final void call() {
            this.a.setText(this.b);
        }
    }

    /* renamed from: kwb$d */
    public static class d extends e {
        private final xir[] a;

        public d(xir... xirArr) {
            this.a = xirArr;
        }

        public final void call() {
            for (xir call : this.a) {
                call.call();
            }
        }
    }

    /* renamed from: kwb$e */
    public static abstract class e extends AnimatorListenerAdapter implements xir {
        e() {
        }

        public void onAnimationEnd(Animator animator) {
            call();
        }
    }
}
