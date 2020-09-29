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

/* renamed from: wap reason: default package */
public final class wap implements kmm<vyl, vyj>, vxj, wan {
    public final vyy a;
    public final View b;
    public final vxu c;
    public final vzr d;
    private final wab e;
    private final vzi f;
    private final wam g;
    /* access modifiers changed from: private */
    public final StateListAnimatorImageButton h;
    private final ViewAnimator i;
    /* access modifiers changed from: private */
    public vyh j;
    private final PublishSubject<vyj> k = PublishSubject.a();
    private final wbn l;

    public wap(int i2, vzc vzc, LayoutInflater layoutInflater, ViewGroup viewGroup, wbn wbn, wam wam, final gbp gbp) {
        this.b = layoutInflater.inflate(R.layout.sthlm_blk_signup, null, true);
        this.i = (ViewAnimator) this.b.findViewById(R.id.view_animator);
        this.a = new vyy(this.b.findViewById(R.id.email_view));
        this.e = new wab(this.b.findViewById(R.id.password_view));
        this.c = new vxu(this.b.findViewById(R.id.age_view));
        this.f = new vzi(vzc, this.b.findViewById(R.id.gender_view));
        this.d = new vzr(this.b.findViewById(R.id.name_view), gbp);
        this.g = wam;
        this.l = wbn;
        this.i.setDisplayedChild(i2);
        b(this.i.getDisplayedChild()).a();
        fsy a2 = ftc.a((GlueToolbarLayout) this.b.findViewById(R.id.toolbar));
        Context context = this.b.getContext();
        this.h = new StateListAnimatorImageButton(context);
        ip.a((View) this.h, (Drawable) null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_LEFT, (float) this.b.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(context, R.color.white));
        this.h.setImageDrawable(spotifyIconDrawable);
        this.h.setContentDescription(this.b.getContext().getString(R.string.signup_generic_content_description_close));
        a2.a(ToolbarSide.START, this.h, R.id.toolbar_up_button);
        wbn wbn2 = this.l;
        wbn2.d.a((wbm) new wbm() {
            public final void a() {
                gbp.a(gbr.a((gbo) new f(), (gbj) new g()));
            }

            public final void b() {
                gbp.a(gbr.a((gbo) new f(), (gbj) new f()));
            }
        });
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

    private wal b(int i2) {
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

    public final wac a() {
        return this.e;
    }

    public final void a(wbq wbq) {
        wbn wbn = this.l;
        wbn.a(wbq, wbn.e);
    }

    public final void b() {
        this.k.onNext(new j());
    }

    public final kmn<vyl> connect(final knw<vyj> knw) {
        final kmn connect = this.a.connect(new $$Lambda$wap$LincTHMXGMaTwal6rQPJ73V4YE(knw));
        final kmn connect2 = this.e.connect(new $$Lambda$wap$DGskqDQvbISIGSixAVIjDFlUGaQ(knw));
        final kmn connect3 = this.c.connect(new $$Lambda$wap$wnLGZGH_6WRggTviU3zMDOTe7HI(knw));
        final kmn connect4 = this.f.connect(new $$Lambda$wap$YHYxlMEH1IIeCoKRRT4hH1TcOa4(knw));
        final kmn connect5 = this.d.connect(new $$Lambda$wap$CyCs8EBOK2ZsBvOepnof_GUOUY(knw));
        PublishSubject<vyj> publishSubject = this.g.a;
        knw.getClass();
        final Disposable d2 = publishSubject.d((Consumer<? super T>) new $$Lambda$UpeTvtxdsD7wKdjCBSMda7B715I<Object>(knw));
        PublishSubject<vyj> publishSubject2 = this.k;
        knw.getClass();
        final Disposable d3 = publishSubject2.d((Consumer<? super T>) new $$Lambda$UpeTvtxdsD7wKdjCBSMda7B715I<Object>(knw));
        this.h.setOnClickListener(new $$Lambda$wap$qOGe_R0HAv7QAxBTmGcKbQavmRI(knw));
        this.l.e = new wbl() {
            public final void a() {
                knw.accept(new l());
            }
        };
        vzr vzr = this.d;
        vzr.a.setOnClickListener(new $$Lambda$wap$wLCW31EZgXQj3CjwbfZ4bbmoJcE(knw));
        AnonymousClass3 r2 = new kmn<vyl>() {
            public final /* synthetic */ void accept(Object obj) {
                vyl vyl = (vyl) obj;
                connect.accept(vyl.b());
                connect2.accept(vyl.c());
                connect3.accept(vyl.d());
                connect4.accept(vyl.e());
                connect5.accept(vyl.f());
                wap.this.a(vyl.h());
                if (wap.this.j == null && (vyl.a() instanceof b)) {
                    wap.this.j = vyl.a();
                }
            }

            public final void dispose() {
                d3.bd_();
                connect.dispose();
                connect2.dispose();
                connect3.dispose();
                connect4.dispose();
                connect5.dispose();
                d2.bd_();
                wap.this.h.setOnClickListener(null);
            }
        };
        return r2;
    }
}
