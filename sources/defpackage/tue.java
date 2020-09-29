package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;
import com.spotify.music.pageloader.PageLoaderView$1;
import com.spotify.pageloader.NetworkErrorReason;

/* renamed from: tue reason: default package */
public final class tue<T> extends ConstraintLayout {
    private final b<T> b;
    private final tuh c;
    private vez<T> d;
    /* access modifiers changed from: private */
    public tua e;
    /* access modifiers changed from: private */
    public View f;
    private final ViewGroup g;
    private final View h;
    private final TextView i;
    private final TextView j;
    private Runnable k;
    private final le l;

    /* renamed from: tue$a */
    public static class a<T> {
        public final b<T> a = new b<>(0);
    }

    /* renamed from: tue$b */
    public static class b<T> {
        public gcs<tuh> a;
        public gcr<T, tua> b;
        public gcs<tua> c;
        public gco<Context, NetworkErrorReason, String> d;
        public gcr<Context, String> e;

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    private tue(Context context, b<T> bVar) {
        super((Context) fbp.a(context));
        this.l = new PageLoaderView$1(this);
        LayoutInflater.from(context).inflate(R.layout.pageloader, this);
        this.g = (ViewGroup) findViewById(R.id.content);
        this.h = findViewById(R.id.toast);
        this.i = (TextView) findViewById(R.id.toast_text);
        this.j = (TextView) findViewById(R.id.debug_error_text);
        ((Button) findViewById(R.id.toast_button)).setOnClickListener(new $$Lambda$tue$5e_gn87xFqWdsX3v0KfRikULhE(this));
        this.b = (b) fbp.a(bVar);
        fbp.a(bVar.b);
        fbp.a(bVar.a);
        fbp.a(bVar.c);
        fbp.a(bVar.d);
        fbp.a(bVar.e);
        this.c = (tuh) bVar.a.get();
    }

    public /* synthetic */ tue(Context context, b bVar, byte b2) {
        this(context, bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tua a(defpackage.vez.a aVar) {
        return (tua) this.b.b.apply(aVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tua a(defpackage.vez.b bVar) {
        return this.c;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tua a(c cVar) {
        return this.c;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tua a(d dVar) {
        return (tua) this.b.c.get();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ tua a(e eVar) {
        return this.c;
    }

    /* access modifiers changed from: private */
    public void a(vez<T> vez) {
        fbp.a(vez);
        if (this.d == null || vez.getClass() != this.d.getClass()) {
            tua tua = (tua) vez.a(new $$Lambda$tue$TPI0zLkLLBrX9HAdaDSvOXIksUs(this), new $$Lambda$tue$8lvssSPVlgIYUvRroCfUdh46c(this), new $$Lambda$tue$YVzOEbKMM2HAa2yBQWxz9iqU_b8(this), new $$Lambda$tue$MHgKGkAjZOahJ9IJcgf2WE6SN0(this), new $$Lambda$tue$dyF5r0PNBmCpnNYpSSGA1KtIyKQ(this));
            tua tua2 = this.e;
            if (tua != tua2) {
                if (tua2 != null) {
                    tua2.a();
                    this.e = null;
                    this.g.removeView(this.f);
                    this.f = null;
                }
                this.e = tua;
                View a2 = this.e.a(getContext(), this.g, LayoutInflater.from(getContext()));
                this.g.addView(a2);
                this.e.a(a2);
                this.f = a2;
            }
            tua tua3 = this.e;
            tuh tuh = this.c;
            if (tua3 == tuh) {
                tuh.a(vez instanceof defpackage.vez.b);
            }
            if (vez.c()) {
                this.i.setText((CharSequence) this.b.d.apply(getContext(), ((c) vez).a));
                tug.a(this.h);
            } else if (vez instanceof e) {
                this.i.setText((CharSequence) this.b.e.apply(getContext()));
                tug.a(this.h);
            } else {
                View view = this.h;
                if (view.getVisibility() != 4) {
                    view.setTranslationY(0.0f);
                    view.setAlpha(1.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{0.0f, (float) view.getMeasuredHeight()});
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f});
                    ofFloat.setInterpolator(fuh.b);
                    ofFloat2.setInterpolator(fuh.b);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                    animatorSet.setDuration(300);
                    animatorSet.addListener(new AnimatorListenerAdapter(view) {
                        private /* synthetic */ View a;

                        {
                            this.a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            this.a.setVisibility(4);
                        }
                    });
                    animatorSet.start();
                }
            }
            this.d = vez;
        }
    }

    public static <T> a<T> b() {
        a<T> aVar = new a<>();
        aVar.a.a = $$Lambda$vPWbSqPGbzfZNISel0qinQw28.INSTANCE;
        aVar.a.c = $$Lambda$niHbVQkf92ENhcTkIw1Ym4B3_U.INSTANCE;
        aVar.a.d = $$Lambda$duAqt42NICKNkPlts9_wjUZ6ms.INSTANCE;
        aVar.a.e = $$Lambda$wFHkloyAbayo8zyqLXddWonDlE.INSTANCE;
        return aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        Runnable runnable = this.k;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void a(lm lmVar, vfa<T> vfa) {
        fbp.a(vfa);
        vfa.getClass();
        this.k = new $$Lambda$vNlQzkQPlCzJtmtEXo6CfJbwO0E(vfa);
        vfa.d().a(lmVar, new $$Lambda$tue$QJajcfLj5ks2vo4fuxA2JJfVX1o(this));
        lmVar.Y_().a(this.l);
    }
}
