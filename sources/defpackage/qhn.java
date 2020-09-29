package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.genie.Wish;
import com.spotify.music.genie.Wish.Action;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: qhn reason: default package */
public final class qhn implements defpackage.hhe.a<hne> {
    public String a;
    public String b;
    public a c;
    public final hnj d;
    private hne e;
    private hop f;
    private hod g;
    private final CompositeDisposable h = new CompositeDisposable();
    private final Scheduler i;
    private final Scheduler j;
    private final rhd k;

    /* renamed from: qhn$3 reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[Action.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.genie.Wish$Action[] r0 = com.spotify.music.genie.Wish.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.genie.Wish$Action r1 = com.spotify.music.genie.Wish.Action.PLAY_URI     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.genie.Wish$Action r1 = com.spotify.music.genie.Wish.Action.PLAY_CURRENT_SESSION     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.genie.Wish$Action r1 = com.spotify.music.genie.Wish.Action.DO_NOTHING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qhn.AnonymousClass3.<clinit>():void");
        }
    }

    /* renamed from: qhn$a */
    public interface a {
        void a();
    }

    public final /* synthetic */ void a(Object obj) {
        this.e = (hne) obj;
        rqi a2 = new defpackage.rqi.a("SpotOn").b("bluetooth").c("headphones").a(this.b).a();
        this.g = this.e.d();
        this.f = this.e.a(a2);
        this.f.b();
        this.h.a(this.e.g().a.a(0).f($$Lambda$1EPZUnfQUWJRLeicK6xhTbdyhac.INSTANCE).e($$Lambda$qhn$LNMj0tnUqgM3Of_2KYXL5OM3laQ.INSTANCE).a((io.reactivex.functions.Action) new $$Lambda$qhn$za45n0JosSagZ7rZh3__bVyMTkQ(this), (Consumer<? super Throwable>) new $$Lambda$qhn$2RXiLWcJJfAv3R7XkLTpPNKoDhs<Object>(this)));
    }

    public qhn(hnj hnj, rhd rhd, Scheduler scheduler, Scheduler scheduler2) {
        this.d = hnj;
        this.k = rhd;
        this.i = scheduler;
        this.j = scheduler2;
    }

    public final void a() {
        if (this.d.d()) {
            this.f.c();
            this.d.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        Logger.b("User logged in", new Object[0]);
        if ("com.spotify.music.features.spoton.ACTION_PLAY_SPOTIFY".equals(this.a)) {
            Single a2 = vun.b(this.g.a()).a(0);
            rhd rhd = this.k;
            rhd.getClass();
            this.h.a(a2.a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$Dalx93nOuvqpbU5c6xv3oLMpbd8<Object,Object>(rhd)).a((Consumer<? super T>) new $$Lambda$qhn$de8nICX6IpLOGT6r0Y6s8UO7k<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qhn$SpYyoydhMXbDu0UIB01_fbcG0vQ<Object>(this)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Logger.e("User not logged in", new Object[0]);
        a();
    }

    public final void e() {
        this.h.bf_();
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Wish wish) {
        int i2 = AnonymousClass3.a[wish.b().ordinal()];
        if (i2 == 1) {
            a((Runnable) new $$Lambda$qhn$e4Hb8hDZrgnv5QMSIDOcKUOefE(this, wish));
        } else if (i2 == 2) {
            a((Runnable) new $$Lambda$qhn$EcOYguiYJ_AHJerRLn1pJ72HXzI(this));
        } else if (i2 != 3) {
            StringBuilder sb = new StringBuilder("Element not handled ");
            sb.append(wish.b());
            Assertion.b(sb.toString());
        } else {
            a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Wish wish) {
        this.g.a((String) fay.a(wish.a()), (PlayOptions) null, this.f.d(), (ActionCallback) new ActionCallback() {
            public final void onActionSuccess() {
                Logger.c("Uri playback started.", new Object[0]);
                qhn.this.h.a(Completable.a((Runnable) new $$Lambda$vANSxOXoVXDQLMMJ7PHfdZzv6ZM(qhn.this)).b(qhn.this.j).a((io.reactivex.functions.Action) $$Lambda$qhn$Hwbq4aZnKYabzmkXki5deS9kA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qhn$rPWlyrvmu9cgZ5eWxAcupXeF7yc.INSTANCE));
            }

            public final void onActionForbidden(List<String> list) {
                Logger.e("Uri playback could not be started. reasons: %s", list.toString());
                qhn.this.h.a(Completable.a((Runnable) new $$Lambda$vANSxOXoVXDQLMMJ7PHfdZzv6ZM(qhn.this)).b(qhn.this.j).a((io.reactivex.functions.Action) $$Lambda$qhn$Hwbq4aZnKYabzmkXki5deS9kA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qhn$rPWlyrvmu9cgZ5eWxAcupXeF7yc.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e("Playback error", new Object[0]);
        a();
    }

    private void a(Runnable runnable) {
        this.h.a(Completable.a(runnable).b(this.i).a((io.reactivex.functions.Action) $$Lambda$qhn$qvrVHdEt6XHC0CvfXMrELqYldjU.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qhn$aV3il_JIyG2kOkpBb3oIne9p9kI.INSTANCE));
    }

    /* access modifiers changed from: private */
    public void b() {
        this.g.a(this.f.d(), (ActionCallback) new ActionCallback() {
            public final void onActionSuccess() {
                Logger.c("Current playback started.", new Object[0]);
                qhn.this.h.a(Completable.a((Runnable) new $$Lambda$vANSxOXoVXDQLMMJ7PHfdZzv6ZM(qhn.this)).b(qhn.this.j).a((io.reactivex.functions.Action) $$Lambda$qhn$Hwbq4aZnKYabzmkXki5deS9kA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qhn$rPWlyrvmu9cgZ5eWxAcupXeF7yc.INSTANCE));
            }

            public final void onActionForbidden(List<String> list) {
                Logger.e("Current playback could not be started. reasons: %s", list.toString());
                qhn.this.h.a(Completable.a((Runnable) new $$Lambda$vANSxOXoVXDQLMMJ7PHfdZzv6ZM(qhn.this)).b(qhn.this.j).a((io.reactivex.functions.Action) $$Lambda$qhn$Hwbq4aZnKYabzmkXki5deS9kA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qhn$rPWlyrvmu9cgZ5eWxAcupXeF7yc.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(Boolean bool) {
        if (bool.booleanValue()) {
            return Completable.a();
        }
        return Completable.a(new Throwable("User is not logged in"));
    }
}
