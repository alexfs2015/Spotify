package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: kss reason: default package */
public final class kss {
    public static final e a = new e() {
        public final void call() {
        }
    };

    /* renamed from: kss$a */
    public static class a extends AnimatorListenerAdapter {
        private final wum a;

        public a(wum wum) {
            this.a = wum;
        }

        public final void onAnimationStart(Animator animator) {
            this.a.call();
        }
    }

    /* renamed from: kss$b */
    public static class b extends e {
        private final ImageView a;
        private final ksp b;

        public b(ImageView imageView, ksp ksp) {
            this.a = imageView;
            this.b = ksp;
        }

        public final void call() {
            this.b.a(this.a);
        }
    }

    /* renamed from: kss$c */
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

    /* renamed from: kss$d */
    public static class d extends e {
        private final wum[] a;

        public d(wum... wumArr) {
            this.a = wumArr;
        }

        public final void call() {
            for (wum call : this.a) {
                call.call();
            }
        }
    }

    /* renamed from: kss$e */
    public static abstract class e extends AnimatorListenerAdapter implements wum {
        e() {
        }

        public void onAnimationEnd(Animator animator) {
            call();
        }
    }
}
