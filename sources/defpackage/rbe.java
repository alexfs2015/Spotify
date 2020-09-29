package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import com.spotify.music.feedback.FeedbackContextType;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Map;

/* renamed from: rbe reason: default package */
public final class rbe {
    final CompositeDisposable a = new CompositeDisposable();
    private final rao b;
    private final Map<FeedbackContextType, rbd> c;
    private final Scheduler d;
    private final Scheduler e;
    private final rbk f;
    private final ras g;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    public rbe(rao rao, Map<FeedbackContextType, rbd> map, rbk rbk, ras ras, Scheduler scheduler, Scheduler scheduler2, a aVar) {
        this.b = rao;
        this.c = map;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = rbk;
        this.g = ras;
        aVar.a(new c() {
            public final void aP_() {
                rbe.this.a.c();
            }
        });
    }

    public final void a(String str, String str2, String str3, boolean z) {
        a(((rbd) this.c.get(this.b.a(str2, ""))).a(str, str2, str3));
        if (z) {
            rbk rbk = this.f;
            rbk.b.a();
            rbk.b.a(uos.a(rbk.a.getString(R.string.feedback_positive_toastie), 4000).a());
        }
    }

    public final void a(String str, String str2, boolean z) {
        a(((rbd) this.c.get(this.b.a(str2, ""))).a(str, str2));
        if (z) {
            this.f.a();
        }
    }

    public final void a(PlayerTrack playerTrack, String str, String str2, sih sih, String str3, boolean z) {
        String str4 = str;
        String str5 = str3;
        FeedbackContextType a2 = this.b.a(str, str5);
        if (a2 == FeedbackContextType.RADIO || a2 == FeedbackContextType.COLLECTION) {
            g(playerTrack.uri(), str, str5, z);
            return;
        }
        String uri = playerTrack.uri();
        String str6 = (String) playerTrack.metadata().get("artist_uri");
        ras ras = this.g;
        String str7 = str;
        boolean z2 = z;
        $$Lambda$rbe$oN73egjJjV9jHTMFjq3qpQSkZs r0 = new $$Lambda$rbe$oN73egjJjV9jHTMFjq3qpQSkZs(this, uri, str7, str3, z2);
        $$Lambda$rbe$Cxxs7qkFmxWyGQQyQzAOCYsf7yM r02 = new $$Lambda$rbe$Cxxs7qkFmxWyGQQyQzAOCYsf7yM(this, str6, str7, uri, z2);
        ras.a(playerTrack, str2, sih, (b) r0, (a) r02);
    }

    /* renamed from: b */
    public final void g(String str, String str2, String str3, boolean z) {
        a(((rbd) this.c.get(this.b.a(str2, str3))).b(str, str2));
        if (z) {
            rbk rbk = this.f;
            $$Lambda$rbe$d_j3xnodAkHHH4p8FjPYnyo304 r1 = new $$Lambda$rbe$d_j3xnodAkHHH4p8FjPYnyo304(this, str, str2, str3, z);
            rbk.a(r1);
        }
    }

    /* renamed from: c */
    public final void e(String str, String str2, String str3, boolean z) {
        a(((rbd) this.c.get(this.b.a(str2, str3))).c(str, str2));
        if (z) {
            this.f.a();
        }
    }

    private void a(Completable completable) {
        this.a.a(completable.b(this.e).a(this.d).a((Action) $$Lambda$rbe$8oft4SVVplxdL19umWDsH_3tpXA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$rbe$NPozvq0di3lIXduQGuGFiuGo7rU.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2, String str3, boolean z) {
        a(((rbd) this.c.get(this.b.a(str2, ""))).c(str, str2, str3));
        if (z) {
            this.f.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(String str, String str2, String str3, boolean z) {
        a(((rbd) this.c.get(this.b.a(str2, ""))).b(str, str2, str3));
        if (z) {
            rbk rbk = this.f;
            $$Lambda$rbe$nNSbAByf3W4KWxVWBmjYomGCpE r1 = new $$Lambda$rbe$nNSbAByf3W4KWxVWBmjYomGCpE(this, str, str2, str3, z);
            rbk.b(r1);
        }
    }
}
