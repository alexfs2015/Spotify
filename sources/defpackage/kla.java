package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.e;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: kla reason: default package */
public class kla extends wib {
    public Picasso T;
    private ViewPager2 U;
    /* access modifiers changed from: private */
    public LinearLayout V;
    private TextView X;
    private kky Y;
    private Disposable Z = Disposables.b();
    public khp a;
    public Observable<StoriesPlaybackState> b;

    /* renamed from: kla$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[StoriesPlaybackState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState[] r0 = com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState r1 = com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState.PAUSED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState r1 = com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState.RESUMED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kla.AnonymousClass2.<clinit>():void");
        }
    }

    public static kla a(j jVar) {
        kla kla = new kla();
        Bundle bundle = new Bundle();
        bundle.putParcelable("summary_card", jVar.a);
        kla.g(bundle);
        return kla;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, int i2, View view, float f) {
        float f2 = f * ((float) (-((i * 2) + i2)));
        if (this.U.d() != 0) {
            view.setTranslationY(f2);
        } else if (ip.f(this.U) == 1) {
            view.setTranslationX(-f2);
        } else {
            view.setTranslationX(f2);
        }
    }

    /* access modifiers changed from: private */
    public void a(LinearLayout linearLayout, int i, int i2) {
        int dimensionPixelOffset = o().getResources().getDimensionPixelOffset(R.dimen.pageIndicatorLayoutMargin);
        int dimensionPixelOffset2 = o().getResources().getDimensionPixelOffset(R.dimen.pageIndicatorDotMargin);
        ImageView[] imageViewArr = new ImageView[i];
        linearLayout.removeAllViews();
        for (int i3 = 0; i3 < imageViewArr.length; i3++) {
            imageViewArr[i3] = new ImageView(linearLayout.getContext());
            if (i3 == i2) {
                imageViewArr[i3].setImageResource(R.drawable.selected_dot);
            } else {
                imageViewArr[i3].setImageResource(R.drawable.default_dot);
            }
            LayoutParams layoutParams = new LayoutParams(new ViewGroup.LayoutParams(dimensionPixelOffset, dimensionPixelOffset));
            layoutParams.setMargins(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
            linearLayout.addView(imageViewArr[i3], layoutParams);
        }
    }

    /* access modifiers changed from: private */
    public void a(StoriesPlaybackState storiesPlaybackState) {
        int i = AnonymousClass2.a[storiesPlaybackState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.a.d();
            }
            return;
        }
        this.a.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(this.V, 2, 0);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.summary_card_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        this.Y = (kky) fbp.a((kky) l().getParcelable("summary_card"));
        this.X = (TextView) ip.d(view, (int) R.id.summary_caption);
        this.U = (ViewPager2) ip.d(view, (int) R.id.summary_card_rv);
        this.V = (LinearLayout) ip.d(view, (int) R.id.dots_layout);
    }

    public final void aP_() {
        super.aP_();
        this.X.setText(this.Y.a());
        this.Z = this.b.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kla$KfBJzCYlKlcoFXw7Y1PDshD1LPo<Object>(this), (Consumer<? super Throwable>) $$Lambda$kla$UbyaDXWLLq5NKwHPi9tsgvW5xU.INSTANCE);
        y().post(new $$Lambda$kla$_cQNbPkJTFa4R_kKzu08Vv28(this));
        final kld kld = new kld(this.Y.b(), this.T);
        ViewPager2 viewPager2 = this.U;
        a c = viewPager2.e.c();
        viewPager2.m.b(c);
        if (c != null) {
            c.b(viewPager2.d);
        }
        viewPager2.e.a((a) kld);
        viewPager2.b = 0;
        viewPager2.a();
        viewPager2.m.a((a<?>) kld);
        kld.a(viewPager2.d);
        ViewPager2 viewPager22 = this.U;
        viewPager22.l = 2;
        viewPager22.e.requestLayout();
        this.U.setClipToPadding(false);
        this.U.setClipChildren(false);
        int dimensionPixelOffset = o().getResources().getDimensionPixelOffset(R.dimen.pageMargin);
        int dimensionPixelOffset2 = o().getResources().getDimensionPixelOffset(R.dimen.offset);
        ViewPager2 viewPager23 = this.U;
        $$Lambda$kla$78GNspbwxuAMPbn4Sy81cp6rO0E r5 = new $$Lambda$kla$78GNspbwxuAMPbn4Sy81cp6rO0E(this, dimensionPixelOffset2, dimensionPixelOffset);
        if (r5 != null) {
            if (!viewPager23.j) {
                viewPager23.i = viewPager23.e.x;
                viewPager23.j = true;
            }
            viewPager23.e.a((f) null);
        } else if (viewPager23.j) {
            viewPager23.e.a(viewPager23.i);
            viewPager23.i = null;
            viewPager23.j = false;
        }
        if (r5 != viewPager23.h.a) {
            viewPager23.h.a = r5;
            if (viewPager23.h.a != null) {
                double b2 = viewPager23.f.b();
                int i = (int) b2;
                double d = (double) i;
                Double.isNaN(d);
                float f = (float) (b2 - d);
                viewPager23.h.a(i, f, Math.round(((float) viewPager23.c()) * f));
            }
        }
        ViewPager2 viewPager24 = this.U;
        viewPager24.a.a((e) new e() {
            public final void a(int i) {
                super.a(i);
                kla kla = kla.this;
                kla.a(kla.V, kld.b(), i);
            }
        });
    }

    public final void h() {
        this.Z.bd_();
        super.h();
    }
}
