package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.Behavior.a;
import com.google.android.material.appbar.AppBarLayout.LayoutParams;
import com.google.android.material.appbar.AppBarLayout.b;
import com.spotify.android.glue.gradients.GlueGradients.Style;
import com.spotify.music.R;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;
import com.spotify.music.features.yourlibrary.musicpages.view.LockableBehavior;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;

/* renamed from: rih reason: default package */
public final class rih implements kmm<MusicPagesModel, rey> {
    private final CoordinatorLayout a;
    private final ViewGroup b;
    private final rbg c;
    private final AppBarLayout d = ((AppBarLayout) this.a.findViewById(R.id.header_view));
    private final rif e;
    private final riy f;
    private final Context g;
    private final LockableBehavior h = ((LockableBehavior) ((d) this.d.getLayoutParams()).a);
    private final ViewGroup i;
    private final a j;
    private final int k;
    private final int l;
    private View m;
    private boolean n;
    /* access modifiers changed from: private */
    public View o;
    private rix p;

    public rih(CoordinatorLayout coordinatorLayout, rif rif, riy riy, ViewGroup viewGroup, rbg rbg, a aVar) {
        this.a = coordinatorLayout;
        this.b = viewGroup;
        this.c = rbg;
        this.j = aVar;
        this.h.a(new a() {
        });
        this.e = rif;
        this.f = riy;
        this.i = (ViewGroup) coordinatorLayout.findViewById(R.id.accessory);
        this.g = coordinatorLayout.getContext();
        this.n = false;
        this.k = gau.c(this.g);
        this.l = gav.a(this.g);
    }

    private int a(float f2) {
        return vfj.c(32.0f, this.g.getResources());
    }

    private void a() {
        this.i.setVisibility(0);
        this.d.setMinimumHeight(this.b.getHeight());
        b(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, fyh fyh, knw knw, MusicPagesModel musicPagesModel) {
        if (musicPagesModel.a().p() != PageAction.NO_ACTION) {
            AppBarLayout appBarLayout = this.d;
            rgq a2 = musicPagesModel.a();
            ip.a((View) appBarLayout, (Drawable) fwz.a(context, Style.AQUATIC));
            rix rix = new rix((Context) fbp.a(context), appBarLayout);
            fqz.a(rix);
            this.p = rix;
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            View view = this.p.getView();
            layoutParams.gravity = 16;
            layoutParams.a = 1;
            this.d.addView(view, layoutParams);
            this.p.a(a2.c());
            fyh.a(0.0f);
            $$Lambda$rih$Z4PY1useZAc7MY93bhWSnWalbAg r9 = new $$Lambda$rih$Z4PY1useZAc7MY93bhWSnWalbAg(knw);
            if (a2.p() != PageAction.SHUFFLE_PLAY || !this.c.d.a()) {
                a aVar = new a(LayoutInflater.from(context).inflate(R.layout.your_library_music_button_primary_row, (ViewGroup) appBarLayout.getRootView(), false));
                fqz.a(aVar);
                Button a3 = aVar.a();
                a3.setText(a2.q());
                a3.setOnClickListener(r9);
                this.o = a3;
                this.i.addView(aVar.getView());
            } else {
                gmu a4 = this.j.a(context);
                a4.a(!this.c.d.b());
                this.o = a4.a();
                this.o.setOnClickListener(r9);
                this.i.addView(this.o);
            }
            this.i.setVisibility(0);
            if (this.c.f()) {
                a(this.p.getView(), this.l);
            }
            this.m = this.d.findViewById(R.id.title);
        }
        boolean z = musicPagesModel.a().a() == MusicPageId.SONGS && this.c.f();
        if (musicPagesModel.o()) {
            a(false);
            if (this.c.a()) {
                b();
            }
        } else {
            if (z) {
                this.b.setVisibility(0);
            }
            boolean z2 = !musicPagesModel.m().b() || ((Boolean) musicPagesModel.m().c()).booleanValue();
            this.n = true;
            this.d.a(z2, false, true);
        }
    }

    private static void a(View view, int i2) {
        view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), view.getPaddingBottom());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyh fyh, String str) {
        fyh.a(str);
        rix rix = this.p;
        if (rix != null) {
            rix.a(str);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyh fyh, knw knw, AppBarLayout appBarLayout, int i2) {
        int b2 = this.d.b();
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        this.p.a(abs, f2 / ((float) b2));
        this.p.getView().setTranslationY(f2);
        int height = ((View) fbp.a(this.o)).getHeight();
        int height2 = this.m.getHeight();
        int i3 = height / 2;
        fyh.a(((float) Math.max(0, (abs - height2) + i3)) / ((float) ((b2 - height2) + i3)));
        if (this.n) {
            knw.accept(new e(abs));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fyh fyh, knw knw, ho hoVar) {
        boolean a2 = this.c.a();
        boolean booleanValue = ((Boolean) fbp.a(hoVar.a)).booleanValue();
        b(true);
        LoadingState loadingState = (LoadingState) hoVar.b;
        if (loadingState == LoadingState.LOADED_EMPTY) {
            this.b.setVisibility(8);
            b();
            a(false);
            fyh.a(1.0f);
        } else if (loadingState == LoadingState.LOADED_EMPTY_WITH_FILTER || loadingState == LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER) {
            b();
            a(false);
            fyh.a(1.0f);
        } else if (booleanValue) {
            if (a2) {
                b();
            } else {
                a();
            }
            a(true);
        } else if (loadingState == LoadingState.LOADED || loadingState == LoadingState.LOADED_PARTIALLY) {
            if (!(this.d.getVisibility() == 0)) {
                a();
                this.d.setVisibility(0);
                this.d.a(true, true, true);
                this.h.b = false;
                a((View) this.b, this.l);
            }
            fyh.a(0.0f);
            this.d.a((b) new $$Lambda$rih$HSdNKvC6RvNNcetmNNDOsj56rAE(this, fyh, knw));
            AppBarLayout appBarLayout = this.d;
            ip.a((View) appBarLayout, (Drawable) fwz.a(appBarLayout.getContext(), Style.AQUATIC));
        }
        this.f.a(booleanValue);
    }

    private void a(boolean z) {
        a((View) this.b, this.k);
        this.d.setVisibility(4);
        this.d.a(false, z, true);
        this.h.b = true;
    }

    private void b() {
        this.i.setVisibility(8);
        this.d.setMinimumHeight(0);
        b(false);
    }

    private void b(boolean z) {
        a((View) this.d, !z ? (this.k + this.b.getHeight()) - this.b.getPaddingTop() : a(32.0f) + this.k + this.l);
        this.d.setClipToPadding(false);
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        Context context = this.a.getContext();
        fyh a2 = ftc.a(context);
        final PublishSubject a3 = PublishSubject.a();
        final Disposable d2 = a3.c(1).d((Consumer<? super T>) new $$Lambda$rih$kvMwnX23DlSxWGebwkMprvirc<Object>(this, context, a2, knw));
        final Disposable d3 = a3.c((Function<? super T, ? extends R>) $$Lambda$rih$Kw2LXjvQBFxWoMeo9Gx0pmWQer8.INSTANCE).a(Functions.a()).d((Consumer<? super T>) new $$Lambda$rih$NbmEmxAAZCW_my_Z7rI0CiidogI<Object>(this, a2, knw));
        final Disposable a4 = a3.c((Function<? super T, ? extends R>) $$Lambda$bAdsXTI5aaiSGxVxFvZviZHO3Tc.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$7w40ht8Mkbu5xTcbRBrh5Lg3Uw.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$rih$zyy5KgH841QUomPmThS17Aw5pO4<Object>(this, a2), (Consumer<? super Throwable>) $$Lambda$rih$XvE3IhrGcUNhSeuvosWVvGAJETg.INSTANCE);
        AnonymousClass2 r2 = new kmn<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                a3.onNext((MusicPagesModel) obj);
            }

            public final void dispose() {
                d2.bd_();
                d3.bd_();
                a4.bd_();
                if (rih.this.o != null) {
                    rih.this.o.setOnClickListener(null);
                }
            }
        };
        return r2;
    }
}
