package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.common.collect.Lists;
import com.spotify.android.glue.patterns.contextmenu.glue.FadingEdgeScrollView;
import com.spotify.android.glue.patterns.contextmenu.glue.GlueContextMenuLayout;
import com.spotify.android.glue.patterns.contextmenu.glue.StretchingGradientDrawable;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.List;

/* renamed from: ftw reason: default package */
public final class ftw {
    private final fua A;
    private final Animator B;
    private final Animator C;
    private final Animator D;
    final fto a;
    final FrameLayout b;
    final LinearLayout c;
    final View d;
    final GlueContextMenuLayout e;
    View f;
    int g;
    final List<View> h = Lists.a();
    final List<View> i = Lists.a();
    boolean j;
    boolean k;
    final fub l;
    final fuc m;
    final Animator n;
    final Animator o;
    Animator p;
    final Animator q;
    final FadingEdgeScrollView r;
    final View s;
    private final Runnable t = new Runnable() {
        public final void run() {
            if (ftw.this.j) {
                ftw.this.e.a(0);
                ftw.this.n.start();
            }
        }
    };
    private final ftz u = new ftz() {
        public final StretchingGradientDrawable a() {
            return (StretchingGradientDrawable) ftw.this.e.getBackground();
        }

        public final float b() {
            return (float) ftw.this.r.getMeasuredHeight();
        }

        public final void c() {
            ip.d(ftw.this.e);
        }

        public final int d() {
            return ftw.this.m.b();
        }

        public final View e() {
            return ftw.this.r;
        }

        public final List<View> f() {
            return ftw.this.h;
        }

        public final View g() {
            return ftw.this.s;
        }
    };
    private final Handler v = new Handler();
    private final ftx w;
    private final fty x;
    private final fud y;
    private final fue z;

    public ftw(Context context, fto fto) {
        this.a = fto;
        this.b = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.glue_context_menu, null);
        this.c = (LinearLayout) this.b.findViewById(R.id.top_bar_menu_layout);
        this.d = this.b.findViewById(R.id.top_gradient_background_view);
        this.e = (GlueContextMenuLayout) this.b.findViewById(R.id.panel);
        this.r = (FadingEdgeScrollView) this.b.findViewById(R.id.scroll);
        this.s = this.b.findViewById(R.id.progress_bar);
        GlueContextMenuLayout glueContextMenuLayout = this.e;
        glueContextMenuLayout.a = (ProgressBar) this.s;
        glueContextMenuLayout.setOnClickListener(new $$Lambda$ftw$0A_Kct2S8zuKXDkGEpwzjzDjxnY(this));
        this.c.setOnClickListener(new $$Lambda$ftw$gxj1P0BO40lmac4pgCn2fa_oaQY(this));
        this.w = new ftx(this.u);
        this.x = new fty(this.u);
        this.y = new fud(this.u);
        this.z = new fue(this.u);
        this.l = new fub(this.u);
        this.m = new fuc(this.u);
        this.A = new fua(this.u);
        this.B = utz.a(this.w);
        this.C = utz.a(this.x);
        this.n = utz.a(this.y);
        this.o = utz.a(this.z);
        this.D = utz.a(this.m);
        this.q = utz.a(this.A);
        LinearLayout linearLayout = this.c;
        linearLayout.setBackgroundColor(fr.c(linearLayout.getContext(), R.color.black));
        this.c.getBackground().setAlpha(0);
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    public final void a() {
        this.k = true;
        AnonymousClass4 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ftw.this.a.a();
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
        this.r.getViewTreeObserver().addOnScrollChangedListener(new $$Lambda$ftw$6TCWTse4CfI2GAqB4CkTstmCqHk(this));
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

    /* access modifiers changed from: 0000 */
    public void d() {
        this.e.a();
        this.h.clear();
        View view = this.f;
        if (view != null) {
            this.h.add(view);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(ftq ftq) {
        if (ftq != null) {
            for (int i2 = 0; i2 < ftq.a(); i2++) {
                View a2 = ftq.a(i2, this.e);
                this.e.a(a2);
                this.h.add(a2);
            }
        }
    }
}
