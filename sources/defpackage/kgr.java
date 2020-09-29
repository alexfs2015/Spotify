package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: kgr reason: default package */
public class kgr extends kfs {
    public Observable<StoriesPlaybackState> T;
    public Picasso U;
    private TextView V;
    private TextView W;
    private TextView Y;
    private ConstraintLayout Z;
    private TextView aa;
    private TextView ab;
    private ImageView ac;
    private ImageView ad;
    private ImageView ae;
    private View af;
    private final AnimatorSet ag = new AnimatorSet();
    private Disposable ah = Disposables.b();
    private View ai;
    public kfn b;

    /* renamed from: kgr$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kgr.AnonymousClass1.<clinit>():void");
        }
    }

    public static kgr a(d dVar) {
        Bundle a = a(dVar);
        kgr kgr = new kgr();
        kgr.g(a);
        a.putParcelable("GLOBAL_CITIZEN", dVar.a);
        return kgr;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.Z = (ConstraintLayout) layoutInflater.inflate(R.layout.story_global_citizen_fragment_intro, viewGroup, false);
        this.V = (TextView) ip.c((View) this.Z, (int) R.id.global_citizen_title);
        this.W = (TextView) ip.c((View) this.Z, (int) R.id.global_citizen_caption);
        this.Y = (TextView) ip.c((View) this.Z, (int) R.id.global_citizen_stats);
        this.aa = (TextView) ip.c((View) this.Z, (int) R.id.global_citizen_artist_name);
        this.ab = (TextView) ip.c((View) this.Z, (int) R.id.global_citizen_country_name);
        this.ae = (ImageView) ip.c((View) this.Z, (int) R.id.global_citizen_image_1);
        this.ad = (ImageView) ip.c((View) this.Z, (int) R.id.global_citizen_image_2);
        this.ac = (ImageView) ip.c((View) this.Z, (int) R.id.global_citizen_image_3);
        this.af = ip.c((View) this.Z, (int) R.id.global_citizen_earth);
        this.ai = ip.c((View) this.Z, (int) R.id.global_citizen_earth_bottom_guide);
        return this.Z;
    }

    public final void g() {
        super.g();
        khb khb = (khb) fay.a(l().getParcelable("GLOBAL_CITIZEN"));
        this.V.setText(khb.c());
        this.W.setText(khb.b());
        TextView textView = this.Y;
        Context o = o();
        khc d = khb.d();
        textView.setText(StoryParagraphDecorator.a(d.a().text(), d.a().valuesArray(), fr.c(o, R.color.wrapped_citric)));
        this.Z.post(new $$Lambda$kgr$baWEIYZzKAYE0nCUUMYgkYb8(this, khb));
        this.ah = this.T.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$kgr$d0nJQ1wHMQTTwn_5PxZB7FnNvg<Object>(this), (Consumer<? super Throwable>) $$Lambda$kgr$ff2CFM64pFQeKNzEmP24MQ8wnSQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(khb khb) {
        List a = khb.a();
        kgx kgx = (kgx) fay.a(a.get(0));
        this.b.a(kgx.d());
        this.aa.setText(kgx.c());
        this.ab.setText(kgx.a());
        this.U.a(kgx.b()).a(this.ae);
        this.U.a(kgx.b()).a(this.ad);
        this.U.a(kgx.b()).a(this.ac);
        int dimension = (int) o().getResources().getDimension(R.dimen.global_citizen_earth_final_size_side_length);
        this.ag.setStartDelay(4500);
        AnimatorSet animatorSet = this.ag;
        View view = this.af;
        View view2 = this.ai;
        ConstraintLayout constraintLayout = this.Z;
        et etVar = new et();
        etVar.a(this.Z.getContext(), (int) R.layout.story_global_citizen_fragment_country_detail);
        animatorSet.playSequentially(new Animator[]{kgp.a(view, view2, constraintLayout, etVar, dimension), ValueAnimator.ofInt(new int[]{0, 1}).setDuration(6000), kgp.a(this.U, this.b, this.aa, this.ab, a.subList(1, a.size()), (List<ImageView>) ImmutableList.a(this.ae, this.ad, this.ac))});
        this.ag.start();
    }

    public final void h() {
        super.h();
        this.ah.bf_();
        this.ag.cancel();
    }

    /* access modifiers changed from: private */
    public void a(StoriesPlaybackState storiesPlaybackState) {
        if (VERSION.SDK_INT < 19) {
            Logger.e("TODO: figure out animation pausing for lower APIs", new Object[0]);
            return;
        }
        int i = AnonymousClass1.a[storiesPlaybackState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.ag.resume();
                this.b.d();
            }
            return;
        }
        this.ag.pause();
        this.b.c();
    }
}
