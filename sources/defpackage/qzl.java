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
import com.spotify.music.features.yourlibrary.musicpages.pages.PageAction;
import com.spotify.music.features.yourlibrary.musicpages.view.LockableBehavior;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;

/* renamed from: qzl reason: default package */
public final class qzl implements kjd<MusicPagesModel, qwj> {
    private final CoordinatorLayout a;
    private final ViewGroup b;
    private final qsr c;
    private final qwv d;
    private final AppBarLayout e = ((AppBarLayout) this.a.findViewById(R.id.header_view));
    private final qzj f;
    private final rac g;
    private final Context h;
    private final LockableBehavior i = ((LockableBehavior) ((d) this.e.getLayoutParams()).a);
    private final ViewGroup j;
    private boolean k;
    /* access modifiers changed from: private */
    public Button l;
    private rab m;

    public qzl(CoordinatorLayout coordinatorLayout, qzj qzj, rac rac, ViewGroup viewGroup, qsr qsr, qwv qwv) {
        this.a = coordinatorLayout;
        this.b = viewGroup;
        this.c = qsr;
        this.d = qwv;
        this.i.a(new a() {
        });
        this.f = qzj;
        this.g = rac;
        this.j = (ViewGroup) coordinatorLayout.findViewById(R.id.accessory);
        this.h = coordinatorLayout.getContext();
        this.k = false;
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        Context context = this.a.getContext();
        fxn a2 = fsi.a(context);
        final PublishSubject a3 = PublishSubject.a();
        final Disposable a4 = a3.c(1).a((Consumer<? super T>) new $$Lambda$qzl$tcDPiF8GTNkz1Vqe4yUPSSU_Mw<Object>(this, context, a2, kkn), (Consumer<? super Throwable>) $$Lambda$qzl$8NR0ZOYlzJXR4DdrA89ibrUdXE.INSTANCE);
        final Disposable a5 = a3.c((Function<? super T, ? extends R>) $$Lambda$qzl$LgtRUWt0vq4v1Sj90OwCtwus58E.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$qzl$roWYZ0bMiJHDeJsouFSK7DD2vE<Object>(this, a2, kkn), (Consumer<? super Throwable>) $$Lambda$qzl$evElmkBIgupOmlQ7OOYXyO82hpY.INSTANCE);
        final Disposable a6 = a3.c((Function<? super T, ? extends R>) $$Lambda$y4SIvK8HttJyPOVnCQcDyzEzlwk.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$85q5L6JcVDuCfsbOFTRPoCxwQQ.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$qzl$faCHj86E9dwoo105XD0HGuEgSdU<Object>(this, a2), (Consumer<? super Throwable>) $$Lambda$qzl$YPSfRLaLLXolmJvuRMcoEF_wdY.INSTANCE);
        AnonymousClass2 r2 = new kje<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                a3.onNext((MusicPagesModel) obj);
            }

            public final void dispose() {
                a4.bf_();
                a5.bf_();
                a6.bf_();
                if (qzl.this.l != null) {
                    qzl.this.l.setOnClickListener(null);
                }
            }
        };
        return r2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, fxn fxn, kkn kkn, MusicPagesModel musicPagesModel) {
        if (musicPagesModel.a().p() != PageAction.NO_ACTION) {
            AppBarLayout appBarLayout = this.e;
            qyb a2 = musicPagesModel.a();
            ip.a((View) appBarLayout, (Drawable) fwf.a(context, Style.AQUATIC));
            rab rab = new rab((Context) fay.a(context), appBarLayout);
            fqf.a(rab);
            this.m = rab;
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            View view = this.m.getView();
            layoutParams.gravity = 16;
            layoutParams.a = 1;
            this.e.addView(view, layoutParams);
            this.m.a(a2.c());
            fxn.a(0.0f);
            a aVar = new a(LayoutInflater.from(context).inflate(R.layout.your_library_music_button_primary_row, (ViewGroup) appBarLayout.getRootView(), false));
            fqf.a(aVar);
            this.l = aVar.a();
            this.l.setText(a2.q());
            this.l.setOnClickListener(new $$Lambda$qzl$OKz56rRN3b1QnCu4eSSnf1dritA(kkn));
            this.j.addView(aVar.getView());
            this.j.setVisibility(0);
            a(a(64.0f));
        }
        if (musicPagesModel.o()) {
            a(this.c.a(), false);
            this.d.a();
            return;
        }
        boolean z = !musicPagesModel.m().b() || ((Boolean) musicPagesModel.m().c()).booleanValue();
        this.k = true;
        this.e.a(z, false, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fxn fxn, kkn kkn, ho hoVar) {
        boolean a2 = this.c.a();
        boolean booleanValue = ((Boolean) fay.a(hoVar.a)).booleanValue();
        View view = this.m.getView();
        boolean z = false;
        if (!booleanValue || !a2) {
            this.e.setPadding(0, gaa.c(this.h) + gab.a(this.h) + a(32.0f), 0, 0);
        } else {
            this.e.setPadding(0, this.b.getHeight(), 0, 0);
        }
        this.e.setClipToPadding(false);
        LoadingState loadingState = (LoadingState) hoVar.b;
        if (booleanValue || loadingState == LoadingState.LOADED_EMPTY || loadingState == LoadingState.LOADED_EMPTY_WITH_FILTER || loadingState == LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER) {
            a(a2, true);
            fxn.a(1.0f);
        } else if (loadingState == LoadingState.LOADED || loadingState == LoadingState.LOADED_PARTIALLY) {
            if (!(this.e.getVisibility() == 0)) {
                this.e.setVisibility(0);
                this.j.setVisibility(0);
                a(a(64.0f));
                this.e.a(true, true, true);
                this.i.b = false;
            }
            fxn.a(0.0f);
            this.e.a((b) new $$Lambda$qzl$S8fLq6KdwRp2DcFQRSMzwRfSIQ(this, view, fxn, kkn));
            AppBarLayout appBarLayout = this.e;
            ip.a((View) appBarLayout, (Drawable) fwf.a(appBarLayout.getContext(), Style.AQUATIC));
        }
        rac rac = this.g;
        if (booleanValue || this.c.f()) {
            z = true;
        }
        rac.a(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, fxn fxn, kkn kkn, AppBarLayout appBarLayout, int i2) {
        int abs = Math.abs(i2);
        float f2 = (float) abs;
        float height = f2 / ((float) view.getHeight());
        this.m.a(abs, height);
        this.m.getView().setTranslationY(f2);
        fxn.a(height);
        if (this.k) {
            kkn.accept(new e(abs));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fxn fxn, String str) {
        fxn.a(str);
        rab rab = this.m;
        if (rab != null) {
            rab.a(str);
        }
    }

    private void a(boolean z, boolean z2) {
        this.e.setVisibility(4);
        if (z) {
            this.j.setVisibility(8);
            this.e.setMinimumHeight(0);
        } else {
            this.e.setMinimumHeight(this.b.getHeight());
        }
        a(0);
        this.e.a(false, z2, true);
        this.i.b = true;
    }

    private void a(int i2) {
        View view = this.m.getView();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i2);
    }

    private int a(float f2) {
        return uts.c(f2, this.h.getResources());
    }
}
