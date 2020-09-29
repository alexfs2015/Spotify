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

/* renamed from: rka reason: default package */
public final class rka {
    final CompositeDisposable a = new CompositeDisposable();
    private final rjk b;
    private final Map<FeedbackContextType, rjz> c;
    private final Scheduler d;
    private final Scheduler e;
    private final rkg f;
    private final rjo g;

    public rka(rjk rjk, Map<FeedbackContextType, rjz> map, rkg rkg, rjo rjo, Scheduler scheduler, Scheduler scheduler2, a aVar) {
        this.b = rjk;
        this.c = map;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = rkg;
        this.g = rjo;
        aVar.a(new c() {
            public final void aN_() {
                rka.this.a.c();
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a() {
    }

    private void a(Completable completable) {
        this.a.a(completable.b(this.e).a(this.d).a((Action) $$Lambda$rka$EYKHcenb1royiZgyuZfDF3sVQro.INSTANCE, (Consumer<? super Throwable>) $$Lambda$rka$JlRDi0hGmPwJXVizA0sELrC_34.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str, String str2, String str3, boolean z) {
        a(((rjz) this.c.get(this.b.a(str2, ""))).c(str, str2, str3));
        if (z) {
            this.f.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(String str, String str2, String str3, boolean z) {
        a(((rjz) this.c.get(this.b.a(str2, ""))).b(str, str2, str3));
        if (z) {
            rkg rkg = this.f;
            $$Lambda$rka$js6jgGCy5AF3j5LLmn3o0BvNUjw r1 = new $$Lambda$rka$js6jgGCy5AF3j5LLmn3o0BvNUjw(this, str, str2, str3, z);
            rkg.b(r1);
        }
    }

    public final void a(PlayerTrack playerTrack, String str, String str2, sso sso, String str3, boolean z) {
        String str4 = str;
        String str5 = str3;
        FeedbackContextType a2 = this.b.a(str, str5);
        if (a2 == FeedbackContextType.RADIO || a2 == FeedbackContextType.COLLECTION) {
            g(playerTrack.uri(), str, str5, z);
            return;
        }
        String uri = playerTrack.uri();
        String str6 = (String) playerTrack.metadata().get("artist_uri");
        rjo rjo = this.g;
        String str7 = str;
        boolean z2 = z;
        $$Lambda$rka$3Th5WELnTdOtpYJn556abtAVW8 r0 = new $$Lambda$rka$3Th5WELnTdOtpYJn556abtAVW8(this, uri, str7, str3, z2);
        $$Lambda$rka$ng2FTkQzmD8LaUKJfP_I2GlEjTo r02 = new $$Lambda$rka$ng2FTkQzmD8LaUKJfP_I2GlEjTo(this, str6, str7, uri, z2);
        rjo.a(playerTrack, str2, sso, (b) r0, (a) r02);
    }

    public final void a(String str, String str2, String str3, boolean z) {
        a(((rjz) this.c.get(this.b.a(str2, ""))).a(str, str2, str3));
        if (z) {
            rkg rkg = this.f;
            rkg.b.a();
            rkg.b.a(uzy.a(rkg.a.getString(R.string.feedback_positive_toastie), 4000).a());
        }
    }

    public final void a(String str, String str2, boolean z) {
        a(((rjz) this.c.get(this.b.a(str2, ""))).a(str, str2));
        if (z) {
            this.f.a();
        }
    }

    /* renamed from: b */
    public final void g(String str, String str2, String str3, boolean z) {
        a(((rjz) this.c.get(this.b.a(str2, str3))).b(str, str2));
        if (z) {
            rkg rkg = this.f;
            $$Lambda$rka$jusyTJniCcf1GWxDq_B_hhnaqd0 r1 = new $$Lambda$rka$jusyTJniCcf1GWxDq_B_hhnaqd0(this, str, str2, str3, z);
            rkg.a(r1);
        }
    }

    /* renamed from: c */
    public final void e(String str, String str2, String str3, boolean z) {
        a(((rjz) this.c.get(this.b.a(str2, str3))).c(str, str2));
        if (z) {
            this.f.a();
        }
    }
}
