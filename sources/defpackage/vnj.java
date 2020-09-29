package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewAnimator;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;

/* renamed from: vnj reason: default package */
public final class vnj implements kjd<vlf, vld>, vkd, vnh {
    public final vls a;
    public final View b;
    public final vko c;
    public final vml d;
    private final vmv e;
    private final vmc f;
    private final vng g;
    /* access modifiers changed from: private */
    public final StateListAnimatorImageButton h;
    private final ViewAnimator i;
    /* access modifiers changed from: private */
    public vlb j;
    private final PublishSubject<vld> k = PublishSubject.a();
    private final vof l;

    public vnj(int i2, vlw vlw, LayoutInflater layoutInflater, ViewGroup viewGroup, vof vof, vng vng, final gao gao) {
        this.b = layoutInflater.inflate(R.layout.sthlm_blk_signup, null, true);
        this.i = (ViewAnimator) this.b.findViewById(R.id.view_animator);
        this.a = new vls(this.b.findViewById(R.id.email_view));
        this.e = new vmv(this.b.findViewById(R.id.password_view));
        this.c = new vko(this.b.findViewById(R.id.age_view));
        this.f = new vmc(vlw, this.b.findViewById(R.id.gender_view));
        this.d = new vml(this.b.findViewById(R.id.name_view), gao);
        this.g = vng;
        this.l = vof;
        this.i.setDisplayedChild(i2);
        b(this.i.getDisplayedChild()).a();
        fse a2 = fsi.a((GlueToolbarLayout) this.b.findViewById(R.id.toolbar));
        Context context = this.b.getContext();
        this.h = new StateListAnimatorImageButton(context);
        ip.a((View) this.h, (Drawable) null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_LEFT, (float) this.b.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(context, R.color.white));
        this.h.setImageDrawable(spotifyIconDrawable);
        this.h.setContentDescription(this.b.getContext().getString(R.string.signup_generic_content_description_close));
        a2.a(ToolbarSide.START, this.h, R.id.toolbar_up_button);
        vof vof2 = this.l;
        vof2.d.a((voe) new voe() {
            public final void a() {
                gao.a(gaq.a((gaw) new e(), (gat) new c()));
            }

            public final void b() {
                gao.a(gaq.a((gaw) new e(), (gat) new b()));
            }
        });
    }

    public final kje<vlf> connect(final kkn<vld> kkn) {
        final kje connect = this.a.connect(new $$Lambda$vnj$4JGd7oECnUiC3G4f9gSFnbeDaa8(kkn));
        final kje connect2 = this.e.connect(new $$Lambda$vnj$ukN1SNJJXWxoOF2M4uGJYNzOjZk(kkn));
        final kje connect3 = this.c.connect(new $$Lambda$vnj$i0QP5Xn6NXoWGradNr0KoGGaYKE(kkn));
        final kje connect4 = this.f.connect(new $$Lambda$vnj$9pv143mV8ra6qkmDQ8tDtijF6aw(kkn));
        final kje connect5 = this.d.connect(new $$Lambda$vnj$l32LXWYYVxN0SgV3kc72E5_pfAw(kkn));
        PublishSubject<vld> publishSubject = this.g.a;
        kkn.getClass();
        final Disposable d2 = publishSubject.d((Consumer<? super T>) new $$Lambda$HSMuX0lcih5OnB_TX8RWv2kLc1I<Object>(kkn));
        PublishSubject<vld> publishSubject2 = this.k;
        kkn.getClass();
        final Disposable d3 = publishSubject2.d((Consumer<? super T>) new $$Lambda$HSMuX0lcih5OnB_TX8RWv2kLc1I<Object>(kkn));
        this.h.setOnClickListener(new $$Lambda$vnj$8BYWor02U8E7JbC_ho5x1Rs22Rc(kkn));
        this.l.e = new vod() {
            public final void a() {
                kkn.accept(new l());
            }
        };
        vml vml = this.d;
        vml.a.setOnClickListener(new $$Lambda$vnj$g3QonIlhi8XcXw_hwBCZ_0GqMHE(kkn));
        AnonymousClass3 r2 = new kje<vlf>() {
            public final /* synthetic */ void accept(Object obj) {
                vlf vlf = (vlf) obj;
                connect.accept(vlf.b());
                connect2.accept(vlf.c());
                connect3.accept(vlf.d());
                connect4.accept(vlf.e());
                connect5.accept(vlf.f());
                vnj.this.a(vlf.h());
                if (vnj.this.j == null && (vlf.a() instanceof b)) {
                    vnj.this.j = vlf.a();
                }
            }

            public final void dispose() {
                d3.bf_();
                connect.dispose();
                connect2.dispose();
                connect3.dispose();
                connect4.dispose();
                connect5.dispose();
                d2.bf_();
                vnj.this.h.setOnClickListener(null);
            }
        };
        return r2;
    }

    public final void a(voi voi) {
        vof vof = this.l;
        vof.a(voi, vof.e);
    }

    public final vmw a() {
        return this.e;
    }

    public final void b() {
        this.k.onNext(new j());
    }

    /* access modifiers changed from: private */
    public synchronized void a(int i2) {
        if (this.i.getDisplayedChild() != i2) {
            boolean z = true;
            if (ip.f(this.b) != 1) {
                z = false;
            }
            int displayedChild = this.i.getDisplayedChild();
            int i3 = R.anim.splitflow_slide_out_right;
            int i4 = R.anim.splitflow_slide_in_left;
            if (i2 < displayedChild) {
                ViewAnimator viewAnimator = this.i;
                Context context = this.i.getContext();
                if (z) {
                    i4 = R.anim.splitflow_slide_in_right;
                }
                viewAnimator.setInAnimation(context, i4);
                ViewAnimator viewAnimator2 = this.i;
                Context context2 = this.i.getContext();
                if (z) {
                    i3 = R.anim.splitflow_slide_out_left;
                }
                viewAnimator2.setOutAnimation(context2, i3);
            } else {
                ViewAnimator viewAnimator3 = this.i;
                Context context3 = this.i.getContext();
                if (!z) {
                    i4 = R.anim.splitflow_slide_in_right;
                }
                viewAnimator3.setInAnimation(context3, i4);
                ViewAnimator viewAnimator4 = this.i;
                Context context4 = this.i.getContext();
                if (!z) {
                    i3 = R.anim.splitflow_slide_out_left;
                }
                viewAnimator4.setOutAnimation(context4, i3);
            }
            this.i.setDisplayedChild(i2);
            b(this.i.getDisplayedChild()).a();
        }
    }

    private vnf b(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.e;
        }
        if (i2 == 2) {
            return this.c;
        }
        if (i2 == 3) {
            return this.f;
        }
        if (i2 == 4) {
            return this.d;
        }
        throw new RuntimeException("ViewAnimator does not have more than 5 views");
    }
}
