package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.spotlets.apprater.AppRaterActivity;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* renamed from: uqr reason: default package */
public class uqr extends jry {
    private static long V = TimeUnit.DAYS.toMillis(14);
    private static b<Object, Boolean> W = b.b("key_rater_shown");
    private static b<Object, Long> X = b.b("key_date_first_launch");
    private static b<Object, Integer> aa = b.b("key_rater_plays_amount");
    public jtz T;
    public SpSharedPreferences<Object> U;
    public jty a;
    private boolean ab;
    private Disposable ac = Disposables.b();
    private boolean ad;
    private int ae;
    public Flowable<PlayerState> b;

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        return track == null ? "" : track.uri();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(long j, String str) {
        return this.ae > 20 && this.T.a() > j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.ae++;
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.a.h() == null) {
            Logger.c("The app is sideloaded, skipping the AppRater Dialog", new Object[0]);
            return;
        }
        if (this.Y != null && !this.ab) {
            this.Y.a((jry) this);
            this.ab = true;
        }
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void aP_() {
        super.aP_();
        if (this.ad) {
            long a2 = this.U.a(X, 0);
            if (a2 == 0) {
                a2 = this.T.a();
                this.U.a().a(X, a2).a();
            }
            this.ac = RxJavaPlugins.a((Completable) new FlowableIgnoreElementsCompletable(this.b.c((Function<? super T, ? extends R>) $$Lambda$uqr$JQ7xAZolDtIVJnlkxu5L8ydttg4.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$uqr$YjxZjA3Ke7TQYRKdjbEHcUe2B5E<Object>(this)).a((Predicate<? super T>) new $$Lambda$uqr$En22nXnaUsTGD8qfViQ4nGJfAI<Object>(this, a2 + V)).c(1))).a((Action) new $$Lambda$uqr$qIow7KgUyvvueZApr8FmzWxp4Y(this), (Consumer<? super Throwable>) $$Lambda$uqr$USsMsEdCBmBlO7iGPypkQQE8.INSTANCE);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (this.U.a(W, false)) {
            this.ad = false;
            return;
        }
        this.ad = true;
        if (bundle != null) {
            this.ab = bundle.getBoolean("extra_queued", false);
            this.ae = bundle.getInt("extra_plays", 0);
            return;
        }
        this.ae = this.U.a(aa, 0);
    }

    public final void c() {
        super.c();
        if (!this.U.a(W, false)) {
            this.U.a().a(W, true).a();
            a(AppRaterActivity.a((Context) p()));
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("extra_queued", this.ab);
        bundle.putInt("extra_plays", this.ae);
    }

    public final void h() {
        super.h();
        if (this.ad) {
            if (!this.ac.b()) {
                this.ac.bd_();
            }
            this.U.a().a(aa, this.ae).a();
        }
    }
}
