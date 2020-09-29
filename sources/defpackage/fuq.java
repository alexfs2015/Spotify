package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.common.collect.Lists;
import com.spotify.android.glue.patterns.contextmenu.glue.FadingEdgeScrollView;
import com.spotify.android.glue.patterns.contextmenu.glue.GlueContextMenuLayout;
import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.List;

/* renamed from: fuq reason: default package */
public final class fuq {
    private final fuu A;
    private final Animator B;
    private final Animator C;
    private final Animator D;
    final fui a;
    final CoordinatorLayout b;
    final LinearLayout c;
    final View d;
    final GlueContextMenuLayout e;
    View f;
    int g;
    final List<View> h = Lists.a();
    final List<View> i = Lists.a();
    boolean j;
    boolean k;
    final fuv l;
    final fuw m;
    final Animator n;
    final Animator o;
    Animator p;
    final Animator q;
    final FadingEdgeScrollView r;
    final View s;
    private final Runnable t = new Runnable() {
        public final void run() {
            if (fuq.this.j) {
                fuq.this.e.a(0);
                fuq.this.n.start();
            }
        }
    };
    private final fut u = new fut() {
        public final StretchingGradientDrawable a() {
            return (StretchingGradientDrawable) fuq.this.e.getBackground();
        }

        public final float b() {
            return (float) fuq.this.r.getMeasuredHeight();
        }

        public final void c() {
            ip.d(fuq.this.e);
        }

        public final int d() {
            return fuq.this.m.b();
        }

        public final View e() {
            return fuq.this.r;
        }

        public final List<View> f() {
            return fuq.this.h;
        }

        public final View g() {
            return fuq.this.s;
        }
    };
    private final Handler v = new Handler();
    private final fur w;
    private final fus x;
    private final fux y;
    private final fuy z;

    public fuq(Context context, fui fui) {
        this.a = fui;
        this.b = (CoordinatorLayout) LayoutInflater.from(context).inflate(R.layout.glue_context_menu, null);
        this.c = (LinearLayout) this.b.findViewById(R.id.top_bar_menu_layout);
        this.d = this.b.findViewById(R.id.top_gradient_background_view);
        this.e = (GlueContextMenuLayout) this.b.findViewById(R.id.panel);
        this.r = (FadingEdgeScrollView) this.b.findViewById(R.id.scroll);
        this.s = this.b.findViewById(R.id.progress_bar);
        GlueContextMenuLayout glueContextMenuLayout = this.e;
        glueContextMenuLayout.a = (ProgressBar) this.s;
        glueContextMenuLayout.setOnClickListener(new $$Lambda$fuq$CMqwu7DR2oeQCupJHpGghgKLazc(this));
        this.c.setOnClickListener(new $$Lambda$fuq$bcpoShDRcf0iuL3hqCTOZzbJzbU(this));
        ip.a((View) this.c, (il) $$Lambda$fuq$ploBgi7y2FPNlonpWe_iytpEBg4.INSTANCE);
        this.w = new fur(this.u);
        this.x = new fus(this.u);
        this.y = new fux(this.u);
        this.z = new fuy(this.u);
        this.l = new fuv(this.u);
        this.m = new fuw(this.u);
        this.A = new fuu(this.u);
        this.B = vfq.a(this.w);
        this.C = vfq.a(this.x);
        this.n = vfq.a(this.y);
        this.o = vfq.a(this.z);
        this.D = vfq.a(this.m);
        this.q = vfq.a(this.A);
        LinearLayout linearLayout = this.c;
        linearLayout.setBackgroundColor(fr.c(linearLayout.getContext(), R.color.black));
        this.c.getBackground().setAlpha(0);
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a();
    }

    /* access modifiers changed from: private */
    public void e() {
        float f2;
        int height = this.g - this.c.getHeight();
        if (height != 0) {
            f2 = (float) (255 - ((Math.max(0, height - this.r.getScrollY()) * 255) / height));
        } else {
            Assertion.b(String.format("Too small to update alpha? headerInitialPos [%s] - TopBarHeight [%s] - screenHeight[%s]", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.c.getHeight()), Integer.valueOf(this.c.getContext().getResources().getDisplayMetrics().heightPixels)}));
            f2 = 255.0f;
        }
        this.c.getBackground().setAlpha((int) f2);
    }

    public final void a() {
        this.k = true;
        AnonymousClass4 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                fuq.this.a.a();
            }
        };
        Animator animator = this.p;
        if (animator != null && animator.isRunning()) {
            this.p.cancel();
        }
        if (this.q.isRunning()) {
            this.q.cancel();
        }
        this.D.start();
        if (this.n.isRunning()) {
            this.n.cancel();
        }
        if (this.j) {
            this.o.start();
        }
        if (this.B.isRunning()) {
            this.B.cancel();
        }
        this.C.start();
        this.C.addListener(r0);
    }

    /* access modifiers changed from: 0000 */
    public void a(fuk fuk) {
        if (fuk != null) {
            for (int i2 = 0; i2 < fuk.a(); i2++) {
                View a2 = fuk.a(i2, this.e);
                this.e.a(a2);
                this.h.add(a2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
        this.e.a(4);
        this.v.postDelayed(this.t, 1000);
        this.B.start();
        this.j = true;
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.r.getViewTreeObserver().addOnScrollChangedListener(new $$Lambda$fuq$33yPIYPR56yTFE7kX5ArdRM5F9E(this));
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.e.a();
        this.h.clear();
        View view = this.f;
        if (view != null) {
            this.h.add(view);
        }
    }
}
