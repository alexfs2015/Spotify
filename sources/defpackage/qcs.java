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

/* renamed from: qcs reason: default package */
public final class qcs extends guh implements pvn, qcq {
    final Activity a;
    final RecyclerView b;
    final qcp c;
    private final defpackage.sih.a d;
    private final a e;
    private final sai f;
    private final Picasso g;
    private final qbm h;
    private final ViewGroup i;
    private final RecyclerView j;
    private final qco k;
    private ImageButton l;
    private final int m;
    private int n = 0;
    private uux o;
    private ValueAnimator p;
    private String q;
    private final shk r;
    private defpackage.shk.a s = shk.g;
    private pvo t;
    private umf u;
    private final OnPreDrawListener v = new OnPreDrawListener() {
        public final boolean onPreDraw() {
            qcs.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            qcs.this.l();
            return true;
        }
    };
    private final uvq<View> w = new uvq<>(new defpackage.uvq.b() {
        public final void a(int i) {
            qcs.this.a(i, false);
        }

        public final void a() {
            qcs qcs = qcs.this;
            qcs.a(fr.c(qcs.a, R.color.cat_grayscale_15), false);
        }
    });
    private final pyt x;

    /* renamed from: qcs$a */
    public interface a {
        View getFocusedView();
    }

    /* renamed from: qcs$b */
    static class b extends defpackage.gur.a {
        public static final Creator<b> CREATOR = new Creator<b>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new b(parcel.readParcelable(defpackage.gur.a.class.getClassLoader()), parcel.readParcelable(defpackage.gur.a.class.getClassLoader()), parcel.readParcelable(defpackage.gur.a.class.getClassLoader()), parcel.readInt());
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

    public qcs(Activity activity, defpackage.sih.a aVar, String str, boolean z, umf umf, boolean z2, shj shj, a aVar2, defpackage.shr.b bVar, pyt pyt, sai sai, Picasso picasso, qbm qbm, boolean z3, ViewGroup viewGroup) {
        umf umf2 = umf;
        this.a = (Activity) fay.a(activity);
        this.d = (defpackage.sih.a) fay.a(aVar);
        this.e = (a) fay.a(aVar2);
        this.x = (pyt) fay.a(pyt);
        this.f = (sai) fay.a(sai);
        this.g = picasso;
        this.h = qbm;
        this.i = (ViewGroup) LayoutInflater.from(this.a).inflate(R.layout.fragment_search_hub, viewGroup, false);
        Activity activity2 = this.a;
        AnonymousClass4 r1 = new RecyclerView(activity2) {
            /* access modifiers changed from: protected */
            public final boolean verifyDrawable(Drawable drawable) {
                if (!super.verifyDrawable(drawable)) {
                    if (drawable == qcs.this.c.a) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
        };
        r1.a((i) new LinearLayoutManager(activity2));
        r1.q = true;
        r1.setId(R.id.search_body);
        this.b = r1;
        this.j = b((Context) this.a);
        this.m = fr.c(this.a, R.color.cat_grayscale_15);
        this.c = new qcp(this.a, this.b, this.m);
        this.b.a((h) this.c, -1);
        this.b.a((f) null);
        qco qco = new qco(this.a, (ToolbarSearchFieldView) ip.c((View) this.i, (int) R.id.search_toolbar), z2, this, z3);
        this.k = qco;
        String str2 = str;
        this.k.b(str);
        this.k.a(bVar);
        this.o = uuy.a(this.m);
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
            this.u = umf2;
            defpackage.sih.a aVar3 = aVar;
            this.l = umf2.a(this.a, this.i, aVar);
        }
        this.b.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    qcs.this.q();
                }
            }

            public final void a(RecyclerView recyclerView, int i, int i2) {
                qcs.a(qcs.this, recyclerView);
            }
        });
        shk shk = new shk(this.a, shj, this.i, this.b, this.k, new $$Lambda$qcs$DXbpMgyAoQHRTCtmHTNJN8SNGAc(this));
        this.r = shk;
        shk shk2 = this.r;
        if (shk2.b != null) {
            shk2.e = true;
            shk2.d.a(0.0f);
            Rect rect = shk2.b.a.a;
            defpackage.shj.a aVar4 = shk2.b.a;
            Rect rect2 = aVar4.a;
            shk2.f = new FindSearchFieldView(shk2.a);
            shk2.f.setTranslationX((float) rect2.left);
            shk2.f.setTranslationY((float) rect2.top);
            shk2.f.a(aVar4.b);
            shk2.f.b(aVar4.c);
            shk2.c.addView(shk2.f, new LayoutParams(rect.width(), rect.height()));
            shk2.c.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    shk.this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                    shk.c(shk.this);
                    return true;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.s.onIntroAnimationComplete();
        this.i.post(new $$Lambda$_zGiezTz2dUSN0iYl4El_eUk5M(this));
    }

    public final View e() {
        return this.i;
    }

    public final void a(String str) {
        String str2 = this.q;
        if (str2 != null && !str.equals(str2)) {
            this.g.d(this.w);
        }
        if (!fax.a(str) && !str.equals(this.q)) {
            this.g.a(str).a((Object) str).a((vst) uvk.a).a((vsr) this.w);
        } else if (fax.a(str)) {
            r();
            this.b.getViewTreeObserver().addOnPreDrawListener(this.v);
        }
        this.q = str;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, final boolean z) {
        this.n = i2;
        final int a2 = uuy.a(i2, 0.4f);
        this.o = uuy.a(a2, this.m);
        this.h.b(a2);
        this.b.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public final boolean onPreDraw() {
                qcs.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                qcs.a(qcs.this, a2, z);
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uux uux, ColorDrawable colorDrawable, int i2, ValueAnimator valueAnimator) {
        int interpolate = uux.interpolate(valueAnimator.getAnimatedFraction());
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

    public final void l() {
        this.n = 0;
        a(fr.c(this.a, R.color.cat_grayscale_15), true);
        this.c.a(0, 0);
    }

    public final void a(List<SearchTab> list) {
        this.h.a(list);
    }

    public final shr g() {
        return this.k;
    }

    public final txs h() {
        return this.h;
    }

    public final void p() {
        this.k.a();
    }

    public final void a(int i2) {
        this.k.a(200);
    }

    public final void q() {
        View focusedView = this.e.getFocusedView();
        if (focusedView instanceof EditText) {
            this.k.b();
            gba.b((EditText) focusedView);
        }
    }

    public final void a(defpackage.shk.a aVar) {
        this.s = (defpackage.shk.a) fay.a(aVar);
    }

    public final void a(pvo pvo) {
        this.t = (pvo) fay.a(pvo);
    }

    public final void k() {
        this.u.a(this.u.a(this.a, this.i), this.i, this.d, true);
    }

    public final void i() {
        shk shk = this.r;
        if (shk.e) {
            shk.c.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    shk.this.c.getViewTreeObserver().removeOnPreDrawListener(this);
                    shk.b(shk.this);
                    return true;
                }
            });
        }
    }

    public final void j() {
        this.f.a(this.d.ae_().toString());
    }

    public final RecyclerView c() {
        return this.b;
    }

    public final RecyclerView d() {
        return this.j;
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
        if (c2 == null || c2.getTop() >= 0) {
            return false;
        }
        return true;
    }

    public final Parcelable b() {
        Parcelable d2 = ((i) fay.a(this.b.d())).d();
        Parcelable d3 = ((i) fay.a(this.j.d())).d();
        qco qco = this.k;
        return new b(d2, d3, new defpackage.qco.a(qco.h(), qco.f()), this.n);
    }

    public final void a(Parcelable parcelable) {
        if (parcelable instanceof b) {
            b bVar = (b) parcelable;
            ((i) fay.a(this.b.d())).a(bVar.a);
            ((i) fay.a(this.j.d())).a(bVar.b);
            this.k.a(bVar.c);
            if (bVar.d != 0) {
                this.n = bVar.d;
                final int a2 = uuy.a(this.n, 0.4f);
                this.o = uuy.a(a2, this.m);
                this.b.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        qcs.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                        qcs.this.c.a(a2, uuu.b(qcs.this.a, 16842836));
                        qcs qcs = qcs.this;
                        qcs.a(qcs, qcs.b);
                        return true;
                    }
                });
            }
        }
    }

    public final void aF_() {
        pyt pyt = this.x;
        sih ae_ = this.d.ae_();
        jjf jjf = pyt.a;
        bg bgVar = r4;
        bg bgVar2 = new bg(null, udt.aM.a(), ae_.toString(), 0, 0, ViewUris.cb.toString(), "tap-camera-button", "navigate-forward", (double) pyt.b.a());
        jjf.a(bgVar);
        pvo pvo = this.t;
        if (pvo != null) {
            pvo.onClick();
        }
    }

    public final void f() {
        pyt pyt = this.x;
        sih ae_ = this.d.ae_();
        jjf jjf = pyt.a;
        be beVar = r4;
        be beVar2 = new be(null, udt.aM.a(), ae_.toString(), 0, 0, ViewUris.cb.toString(), "camera-button", null, (double) pyt.b.a());
        jjf.a(beVar);
    }

    static /* synthetic */ void a(qcs qcs, RecyclerView recyclerView) {
        if (recyclerView.getChildCount() != 0) {
            boolean z = false;
            View childAt = recyclerView.getChildAt(0);
            if (recyclerView.b(childAt).e() == 0) {
                z = true;
            }
            float f2 = 1.0f;
            if (z) {
                f2 = uun.a(0.0f, 1.0f, ((float) Math.abs(childAt.getTop())) / ((float) childAt.getMeasuredHeight()));
            }
            qcs.s().setColor(qcs.o.interpolate(f2));
            qcs.h.a(f2);
        }
    }

    static /* synthetic */ void a(qcs qcs, int i2, boolean z) {
        ColorDrawable s2 = qcs.s();
        int b2 = uuu.b(qcs.a, 16842836);
        uux a2 = uuy.a(s2.getColor(), i2);
        qcs.r();
        qcs.p = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        qcs.p.setDuration(z ? 0 : 250);
        qcs.p.addUpdateListener(new $$Lambda$qcs$5IjKpTopQS0tN4ED1MvYVDgTGLQ(qcs, a2, s2, b2));
        qcs.p.start();
    }
}
