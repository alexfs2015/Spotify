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

/* renamed from: udw reason: default package */
public class udw extends jpm {
    private static long V = TimeUnit.DAYS.toMillis(14);
    private static b<Object, Boolean> W = b.b("key_rater_shown");
    private static b<Object, Long> X = b.b("key_date_first_launch");
    private static b<Object, Integer> aa = b.b("key_rater_plays_amount");
    public jrp T;
    public SpSharedPreferences<Object> U;
    public jro a;
    private boolean ab;
    private Disposable ac = Disposables.b();
    private boolean ad;
    private int ae;
    public Flowable<PlayerState> b;

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
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

    public final void g() {
        super.g();
        if (this.ad) {
            long a2 = this.U.a(X, 0);
            if (a2 == 0) {
                a2 = this.T.a();
                this.U.a().a(X, a2).a();
            }
            this.ac = RxJavaPlugins.a((Completable) new FlowableIgnoreElementsCompletable(this.b.c((Function<? super T, ? extends R>) $$Lambda$udw$fD27XUzuK9Wh6zMB0hL4psRdXY.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$udw$np6h4LQQxQnltYFc5a30BuDeBV8<Object>(this)).a((Predicate<? super T>) new $$Lambda$udw$dIti5NS2_UJDWwJ154reEFmqHI0<Object>(this, a2 + V)).c(1))).a((Action) new $$Lambda$udw$tlOGEWeInYcQOefJF4R0qejt664(this), (Consumer<? super Throwable>) $$Lambda$udw$mClc2mDUPBppSJOGJsmq0PCaN6w.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(PlayerState playerState) {
        PlayerTrack track = playerState.track();
        if (track == null) {
            return "";
        }
        return track.uri();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.ae++;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(long j, String str) {
        return this.ae > 20 && this.T.a() > j;
    }

    public final void h() {
        super.h();
        if (this.ad) {
            if (!this.ac.b()) {
                this.ac.bf_();
            }
            this.U.a().a(aa, this.ae).a();
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("extra_queued", this.ab);
        bundle.putInt("extra_plays", this.ae);
    }

    public final void c() {
        super.c();
        if (!this.U.a(W, false)) {
            this.U.a().a(W, true).a();
            a(AppRaterActivity.a((Context) p()));
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        if (this.a.h() == null) {
            Logger.c("The app is sideloaded, skipping the AppRater Dialog", new Object[0]);
            return;
        }
        if (this.Y != null && !this.ab) {
            this.Y.a((jpm) this);
            this.ab = true;
        }
    }
}
