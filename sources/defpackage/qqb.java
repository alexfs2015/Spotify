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

/* renamed from: qqb reason: default package */
public final class qqb implements defpackage.hjy.a<hpt> {
    public String a;
    public String b;
    public a c;
    public final hpy d;
    private hpt e;
    private hqr f;
    private hqf g;
    private final CompositeDisposable h = new CompositeDisposable();
    private final Scheduler i;
    private final Scheduler j;
    private final rqf k;

    /* renamed from: qqb$3 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qqb.AnonymousClass3.<clinit>():void");
        }
    }

    /* renamed from: qqb$a */
    public interface a {
        void a();
    }

    public qqb(hpy hpy, rqf rqf, Scheduler scheduler, Scheduler scheduler2) {
        this.d = hpy;
        this.k = rqf;
        this.i = scheduler;
        this.j = scheduler2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(Boolean bool) {
        return bool.booleanValue() ? Completable.a() : Completable.a(new Throwable("User is not logged in"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Wish wish) {
        int i2 = AnonymousClass3.a[wish.b().ordinal()];
        if (i2 == 1) {
            a((Runnable) new $$Lambda$qqb$zORLs6_2u14UXZu8XcERb9kpfT4(this, wish));
        } else if (i2 == 2) {
            a((Runnable) new $$Lambda$qqb$pLlw_E43Kexx6EvBd3MBYSxMiqY(this));
        } else if (i2 != 3) {
            StringBuilder sb = new StringBuilder("Element not handled ");
            sb.append(wish.b());
            Assertion.b(sb.toString());
        } else {
            a();
        }
    }

    private void a(Runnable runnable) {
        this.h.a(Completable.a(runnable).b(this.i).a((io.reactivex.functions.Action) $$Lambda$qqb$K2UlIhgLIBDJCh2DUsoTrBy5dTw.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qqb$2Y7bhR4EwbUAan9sFEdRP5hUFho.INSTANCE));
    }

    /* access modifiers changed from: private */
    public void b() {
        this.g.a(this.f.d(), (ActionCallback) new ActionCallback() {
            public final void onActionForbidden(List<String> list) {
                Logger.e("Current playback could not be started. reasons: %s", list.toString());
                qqb.this.h.a(Completable.a((Runnable) new $$Lambda$2SswkddXCHyxIswA7aQDlOxXgQ8(qqb.this)).b(qqb.this.j).a((io.reactivex.functions.Action) $$Lambda$qqb$xXNL2hPAo2olmNeVrGb3pOjBZUc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qqb$ff3EBWBHemIqKEAk1qlIQlHRsc4.INSTANCE));
            }

            public final void onActionSuccess() {
                Logger.c("Current playback started.", new Object[0]);
                qqb.this.h.a(Completable.a((Runnable) new $$Lambda$2SswkddXCHyxIswA7aQDlOxXgQ8(qqb.this)).b(qqb.this.j).a((io.reactivex.functions.Action) $$Lambda$qqb$xXNL2hPAo2olmNeVrGb3pOjBZUc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qqb$ff3EBWBHemIqKEAk1qlIQlHRsc4.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Wish wish) {
        this.g.a((String) fbp.a(wish.a()), (PlayOptions) null, this.f.d(), (ActionCallback) new ActionCallback() {
            public final void onActionForbidden(List<String> list) {
                Logger.e("Uri playback could not be started. reasons: %s", list.toString());
                qqb.this.h.a(Completable.a((Runnable) new $$Lambda$2SswkddXCHyxIswA7aQDlOxXgQ8(qqb.this)).b(qqb.this.j).a((io.reactivex.functions.Action) $$Lambda$qqb$xXNL2hPAo2olmNeVrGb3pOjBZUc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qqb$ff3EBWBHemIqKEAk1qlIQlHRsc4.INSTANCE));
            }

            public final void onActionSuccess() {
                Logger.c("Uri playback started.", new Object[0]);
                qqb.this.h.a(Completable.a((Runnable) new $$Lambda$2SswkddXCHyxIswA7aQDlOxXgQ8(qqb.this)).b(qqb.this.j).a((io.reactivex.functions.Action) $$Lambda$qqb$xXNL2hPAo2olmNeVrGb3pOjBZUc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$qqb$ff3EBWBHemIqKEAk1qlIQlHRsc4.INSTANCE));
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e("Playback error", new Object[0]);
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        Logger.e("User not logged in", new Object[0]);
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        Logger.b("User logged in", new Object[0]);
        if ("com.spotify.music.features.spoton.ACTION_PLAY_SPOTIFY".equals(this.a)) {
            Single a2 = wit.b(this.g.a()).a(0);
            rqf rqf = this.k;
            rqf.getClass();
            this.h.a(a2.a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$aPro7_zJqgRahbptUoB6JnJ00s<Object,Object>(rqf)).a((Consumer<? super T>) new $$Lambda$qqb$bJ0Tx8sr651vNhTvdaUV_AjFSo<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qqb$kmE9E6AnBdVZlkhDFlDHm_6ejN0<Object>(this)));
        }
    }

    public final void a() {
        if (this.d.c()) {
            this.f.c();
            this.d.b();
        }
    }

    public final /* synthetic */ void a(Object obj) {
        this.e = (hpt) obj;
        rzt a2 = new defpackage.rzt.a("SpotOn").b("bluetooth").c("headphones").a(this.b).a();
        this.g = this.e.d();
        this.f = this.e.a(a2);
        this.f.b();
        this.h.a(this.e.g().a.a(0).f($$Lambda$1EPZUnfQUWJRLeicK6xhTbdyhac.INSTANCE).e($$Lambda$qqb$0iUSxIgrMuLG9zofXqM5ZkHObo.INSTANCE).a((io.reactivex.functions.Action) new $$Lambda$qqb$iHwkGWlWFuvaaEfre02Bcz9N2Uk(this), (Consumer<? super Throwable>) new $$Lambda$qqb$L_p3qVfDLnNUtAEKr68Kag1oH70<Object>(this)));
    }

    public final void e() {
        this.h.bd_();
        a aVar = this.c;
        if (aVar != null) {
            aVar.a();
        }
    }
}
