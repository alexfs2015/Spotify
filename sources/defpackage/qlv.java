package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout.LayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.google.common.base.Optional;
import com.spotify.music.R;
import com.spotify.music.libs.search.transition.FindSearchFieldView;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.search.podcasts.tabs.SearchTab;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: qlv reason: default package */
public final class qlv extends gwh implements qej, qlt {
    final Activity a;
    final RecyclerView b;
    final qls c;
    private final defpackage.sso.a d;
    private final a e;
    private final skp f;
    private final Picasso g;
    private final qkk h;
    private final ViewGroup i;
    private final RecyclerView j;
    private final qlr k;
    private ImageButton l;
    private final int m;
    private int n = 0;
    private vgo o;
    private ValueAnimator p;
    private String q;
    private final srr r;
    private defpackage.srr.a s = srr.g;
    private qek t;
    private uxj u;
    private final OnPreDrawListener v = new OnPreDrawListener() {
        public final boolean onPreDraw() {
            qlv.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            qlv.this.l();
            return true;
        }
    };
    private final vhh<View> w = new vhh<>(new defpackage.vhh.b() {
        public final void a() {
            qlv qlv = qlv.this;
            qlv.a(fr.c(qlv.a, R.color.cat_grayscale_15), false);
        }

        public final void a(int i) {
            qlv.this.a(i, false);
        }
    });
    private final qhr x;

    /* renamed from: qlv$a */
    public interface a {
        View getFocusedView();
    }

    /* renamed from: qlv$b */
    static class b extends defpackage.gwr.a {
        public static final Creator<b> CREATOR = new Creator<b>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new b(parcel.readParcelable(defpackage.gwr.a.class.getClassLoader()), parcel.readParcelable(defpackage.gwr.a.class.getClassLoader()), parcel.readParcelable(defpackage.gwr.a.class.getClassLoader()), parcel.readInt());
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }
        };
        /* access modifiers changed from: private */
        public final Parcelable c;
        /* access modifiers changed from: private */
        public final int d;

        b(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, int i) {
            super(parcelable, parcelable2);
            this.c = parcelable3;
            this.d = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeInt(this.d);
        }
    }

    public qlv(Activity activity, defpackage.sso.a aVar, String str, boolean z, uxj uxj, boolean z2, srq srq, a aVar2, defpackage.sry.b bVar, qhr qhr, skp skp, Picasso picasso, qkk qkk, boolean z3, ViewGroup viewGroup) {
        uxj uxj2 = uxj;
        this.a = (Activity) fbp.a(activity);
        this.d = (defpackage.sso.a) fbp.a(aVar);
        this.e = (a) fbp.a(aVar2);
        this.x = (qhr) fbp.a(qhr);
        this.f = (skp) fbp.a(skp);
        this.g = picasso;
        this.h = qkk;
        this.i = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.fragment_search_hub, viewGroup, false);
        Activity activity2 = this.a;
        AnonymousClass4 r1 = new RecyclerView(activity2) {
            /* access modifiers changed from: protected */
            public final boolean verifyDrawable(Drawable drawable) {
                if (!super.verifyDrawable(drawable)) {
                    return drawable == qlv.this.c.a;
                }
            }
        };
        r1.a((i) new LinearLayoutManager(activity2));
        r1.q = true;
        r1.setId(R.id.search_body);
        this.b = r1;
        this.j = b((Context) this.a);
        this.m = fr.c(this.a, R.color.cat_grayscale_15);
        this.c = new qls(this.a, this.b, this.m);
        this.b.a((h) this.c, -1);
        this.b.a((f) null);
        qlr qlr = new qlr(this.a, (ToolbarSearchFieldView) ip.d((View) this.i, (int) R.id.search_toolbar), z2, this, z3);
        this.k = qlr;
        String str2 = str;
        this.k.b(str);
        this.k.a(bVar);
        this.o = vgp.a(this.m);
        this.h.a(this.i);
        Optional a2 = this.h.a();
        if (a2.b()) {
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.addRule(3, R.id.search_toolbar);
            this.i.addView((View) a2.c(), layoutParams);
            LayoutParams layoutParams2 = new LayoutParams(-1, -1);
            layoutParams2.addRule(3, R.id.tab_layout);
            LayoutParams layoutParams3 = new LayoutParams(-1, -1);
            layoutParams3.addRule(3, R.id.search_toolbar);
            this.i.addView(this.b, layoutParams2);
            this.i.addView(this.j, layoutParams3);
        } else {
            LayoutParams layoutParams4 = new LayoutParams(-1, -1);
            layoutParams4.addRule(3, R.id.search_toolbar);
            this.i.addView(this.b, layoutParams4);
            this.i.addView(this.j, layoutParams4);
        }
        if (z) {
            this.u = uxj2;
            defpackage.sso.a aVar3 = aVar;
            this.l = uxj2.a(this.a, this.i, aVar);
        }
        this.b.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    qlv.this.q();
                }
            }

            public final void a(RecyclerView recyclerView, int i, int i2) {
                qlv.a(qlv.this, recyclerView);
            }
        });
        srr srr = new srr(this.a, srq, this.i, this.b, this.k, new $$Lambda$qlv$BJZoeA2KLPbKwrkykRctHXycAn0(this));
        this.r = srr;
        srr srr2 = this.r;
        if (srr2.b != null) {
            srr2.e = true;
            srr2.d.a(0.0f);
            Rect rect = srr2.b.a.a;
            defpackage.srq.a aVar4 = srr2.b.a;
            Rect rect2 = aVar4.a;
            srr2.f = new FindSearchFieldView(srr2.a);
            srr2.f.setTranslationX((float) rect2.left);
            srr2.f.setTranslationY((float) rect2.top);
            srr2.f.a(aVar4.b);
            srr2.f.b(aVar4.c);
            srr2.c.addView(srr2.f, new LayoutParams(rect.width(), rect.height()));
            srr2.c.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    srr.this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                    srr.c(srr.this);
                    return true;
                }
            });
        }
    }

    static /* synthetic */ void a(qlv qlv, int i2, boolean z) {
        ColorDrawable s2 = qlv.s();
        int b2 = vgl.b(qlv.a, 16842836);
        vgo a2 = vgp.a(s2.getColor(), i2);
        qlv.r();
        qlv.p = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        qlv.p.setDuration(z ? 0 : 250);
        qlv.p.addUpdateListener(new $$Lambda$qlv$2rL4sQHRlvOVQmJM7SkBFkfZlE(qlv, a2, s2, b2));
        qlv.p.start();
    }

    static /* synthetic */ void a(qlv qlv, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() != 0) {
            boolean z = false;
            View childAt = recyclerView.getChildAt(0);
            if (recyclerView.b(childAt).e() == 0) {
                z = true;
            }
            float f2 = 1.0f;
            if (z) {
                f2 = vge.a(0.0f, 1.0f, ((float) Math.abs(childAt.getTop())) / ((float) childAt.getMeasuredHeight()));
            }
            qlv.s().setColor(qlv.o.interpolate(f2));
            qlv.h.a(f2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vgo vgo, ColorDrawable colorDrawable, int i2, ValueAnimator valueAnimator) {
        int interpolate = vgo.interpolate(valueAnimator.getAnimatedFraction());
        colorDrawable.setColor(interpolate);
        this.h.a(interpolate);
        this.c.a(interpolate, i2);
    }

    private void r() {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.p.cancel();
            this.p = null;
        }
    }

    private ColorDrawable s() {
        ToolbarSearchFieldView toolbarSearchFieldView = this.k.a;
        if (!(toolbarSearchFieldView.getBackground() instanceof ColorDrawable)) {
            ip.a((View) toolbarSearchFieldView, (Drawable) new ColorDrawable(this.m));
        }
        return (ColorDrawable) toolbarSearchFieldView.getBackground();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.s.onIntroAnimationComplete();
        this.i.post(new $$Lambda$SsCohXGYrAZb2jPc8cxD75I6CLM(this));
    }

    public final void a(int i2) {
        this.k.a(200);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, final boolean z) {
        this.n = i2;
        final int a2 = vgp.a(i2, 0.4f);
        this.o = vgp.a(a2, this.m);
        this.h.b(a2);
        this.b.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                qlv.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                qlv.a(qlv.this, a2, z);
                return true;
            }
        });
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof b) {
            b bVar = (b) parcelable;
            ((i) fbp.a(this.b.d())).a(bVar.a);
            ((i) fbp.a(this.j.d())).a(bVar.b);
            this.k.a(bVar.c);
            if (bVar.d != 0) {
                this.n = bVar.d;
                final int a2 = vgp.a(this.n, 0.4f);
                this.o = vgp.a(a2, this.m);
                this.b.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        qlv.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                        qlv.this.c.a(a2, vgl.b(qlv.this.a, 16842836));
                        qlv qlv = qlv.this;
                        qlv.a(qlv, qlv.b);
                        return true;
                    }
                });
            }
        }
    }

    public final void a(String str) {
        String str2 = this.q;
        if (str2 != null && !str.equals(str2)) {
            this.g.d(this.w);
        }
        if (!fbo.a(str) && !str.equals(this.q)) {
            this.g.a(str).a((Object) str).a((wgz) vhb.a).a((wgx) this.w);
        } else if (fbo.a(str)) {
            r();
            this.b.getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        this.q = str;
    }

    public final void a(List<SearchTab> list) {
        this.h.a(list);
    }

    public final void a(qek qek) {
        this.t = (qek) fbp.a(qek);
    }

    public final void a(defpackage.srr.a aVar) {
        this.s = (defpackage.srr.a) fbp.a(aVar);
    }

    public final void aD_() {
        qhr qhr = this.x;
        sso ae_ = this.d.ae_();
        jlr jlr = qhr.a;
        bf bfVar = r4;
        bf bfVar2 = new bf(null, uqo.aM.a(), ae_.toString(), 0, 0, ViewUris.ca.toString(), "tap-camera-button", "navigate-forward", (double) qhr.b.a());
        jlr.a(bfVar);
        qek qek = this.t;
        if (qek != null) {
            qek.onClick();
        }
    }

    public final Parcelable b() {
        Parcelable d2 = ((i) fbp.a(this.b.d())).d();
        Parcelable d3 = ((i) fbp.a(this.j.d())).d();
        qlr qlr = this.k;
        return new b(d2, d3, new defpackage.qlr.a(qlr.h(), qlr.f()), this.n);
    }

    public final RecyclerView c() {
        return this.b;
    }

    public final RecyclerView d() {
        return this.j;
    }

    public final View e() {
        return this.i;
    }

    public final void f() {
        qhr qhr = this.x;
        sso ae_ = this.d.ae_();
        jlr jlr = qhr.a;
        bd bdVar = r4;
        bd bdVar2 = new bd(null, uqo.aM.a(), ae_.toString(), 0, 0, ViewUris.ca.toString(), "camera-button", null, (double) qhr.b.a());
        jlr.a(bdVar);
    }

    public final sry g() {
        return this.k;
    }

    public final ukb h() {
        return this.h;
    }

    public final void i() {
        srr srr = this.r;
        if (srr.e) {
            srr.c.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    srr.this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                    srr.b(srr.this);
                    return true;
                }
            });
        }
    }

    public final void j() {
        this.f.a(this.d.ae_().toString());
    }

    public final void k() {
        this.u.a(this.u.a(this.a, this.i), this.i, this.d, true);
    }

    public final void l() {
        this.n = 0;
        a(fr.c(this.a, R.color.cat_grayscale_15), true);
        this.c.a(0, 0);
    }

    public final boolean m() {
        ImageButton imageButton = this.l;
        return imageButton != null && imageButton.getVisibility() == 0;
    }

    public final void n() {
        if (this.b.getChildCount() != 0) {
            View childAt = this.b.getChildAt(0);
            if (childAt instanceof RecyclerView) {
                f fVar = ((RecyclerView) childAt).x;
                if (fVar != null) {
                    fVar.d();
                }
            }
        }
    }

    public final boolean o() {
        i d2 = this.b.d();
        if (d2 == null) {
            return false;
        }
        View c2 = d2.c(0);
        return c2 != null && c2.getTop() < 0;
    }

    public final void p() {
        this.k.a();
    }

    public final void q() {
        View focusedView = this.e.getFocusedView();
        if (focusedView instanceof EditText) {
            this.k.b();
            gbx.b((EditText) focusedView);
        }
    }
}
