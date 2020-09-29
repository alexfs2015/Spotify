package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.DisallowReasons;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.AudioStream;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.service.media.browser.RootListType;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.IapException;
import com.spotify.mobile.android.spotlets.appprotocol.image.ImageFormat;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Capabilities;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChildrenPageRequest;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Empty;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.HelloDetails;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Image;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ImageIdentifier;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItem;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ListItems;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Message;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackPosition;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Repeat;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.RootListOptions;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.SearchQuery;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackElapsed;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Uri;
import com.spotify.mobile.android.spotlets.appprotocol.util.OptionExtrasUtil.Streamtype;
import com.spotify.mobile.android.spotlets.appprotocol.util.OptionExtrasUtil.UriOptionExtras;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: iii reason: default package */
public final class iii {
    final Context a;
    final hne b;
    final ijd c;
    final Scheduler d;
    final Scheduler e;
    final ksw f;
    final AtomicInteger g = new AtomicInteger();
    final iid h;
    HelloDetails i;
    String j;
    boolean k;
    ikg l;
    hop m;
    hnf n;
    hod o;
    hol p;
    iij q;
    private final SpeedControlInteractor r;
    private final iix s;
    private final ueb t;
    private final htw u;
    private Disposable v;

    /* renamed from: iii$a */
    static class a implements defpackage.iix.a {
        private final SingleEmitter<Image> a;
        private final int b;
        private final int c;

        public a(SingleEmitter<Image> singleEmitter, int i, int i2) {
            this.a = singleEmitter;
            this.b = i;
            this.c = i2;
        }

        public final void a(byte[] bArr) {
            this.a.a(new Image(bArr, this.b, this.c));
        }

        public final void a() {
            this.a.a((Throwable) new IapException(new Message("Failed to load image."), "wamp.error"));
        }

        public final void b() {
            this.a.a((Throwable) new IapException(new Message("Image was cancelled due to throttling."), "wamp.error"));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerTrack playerTrack) {
        return playerTrack != null;
    }

    public iii(Context context, hne hne, iif iif, iix iix, SpeedControlInteractor speedControlInteractor, Scheduler scheduler, Scheduler scheduler2, ksw ksw, ueb ueb) {
        this.a = context;
        this.h = new iid(iif);
        this.b = hne;
        this.r = speedControlInteractor;
        this.s = iix;
        this.t = ueb;
        this.c = new ijd();
        this.u = new htw();
        this.e = scheduler;
        this.d = scheduler2;
        this.f = ksw;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Flowable<SessionState> flowable = this.b.g().a;
        iid iid = this.h;
        iid.getClass();
        this.v = flowable.a((Consumer<? super T>) new $$Lambda$N1j8bNyyN42cVPpJCFJuuTvbnw<Object>(iid), (Consumer<? super Throwable>) $$Lambda$iii$JAuTGEkTyYUBu55RhT8mn7Z94Ms.INSTANCE);
    }

    private void r() {
        Disposable disposable = this.v;
        if (disposable != null) {
            if (!disposable.b()) {
                this.v.bf_();
            }
            this.v = null;
        }
    }

    public final void b() {
        r();
        hop hop = this.m;
        if (hop != null) {
            hop.c();
        }
        this.s.a();
        ikg ikg = this.l;
        if (ikg != null) {
            ikg.b();
        }
    }

    public final Observable<TrackData> c() {
        return Observable.a((ObservableSource<? extends T1>) vun.b(this.p.a()), (ObservableSource<? extends T2>) vun.b(this.o.a()), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$iii$8D4K0kSw19fBWy2kUM5dL12mrg<Object,Object,Object>(this)).f((ObservableSource<? extends T>) this.h.a(4).e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TrackData a(ugu ugu, PlayerState playerState) {
        return TrackData.trackDataFor(ugu, playerState, this.b.j());
    }

    public final Observable<TrackElapsed> d() {
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$lAB34NzXpRn8qYrqEfL4wvSzVjg.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    public Observable<Empty> a(int i2) {
        return ((SpeedControlInteractor) fay.a(this.r)).a(i2).c((CompletableSource) this.h.a(2)).b((CompletableSource) t()).b((CompletableSource) s()).e().c((ObservableSource<? extends T>) Observable.b(AppProtocol.a)).c((Function<? super T, ? extends R>) $$Lambda$iii$MeZryciLV5ha4ZWdWLmKaXhHhg.INSTANCE).c(25, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$iii$0UZX1hqUEnq5OczROCXZ0lHh_8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource f(Throwable th) {
        if (th instanceof TimeoutException) {
            return IapException.a("Failed to set Podcast playback speed.");
        }
        return Observable.a(th);
    }

    private Completable s() {
        return n().a(0).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$iii$pm29g230dB5e4FaWsFfhc2qW95E.INSTANCE, false).g();
    }

    private Completable t() {
        return vun.b(this.b.c().d()).a(0).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$iii$_IoJr8dSyycX2KM9l5Q10Q4pA.INSTANCE, false).g();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource b(Boolean bool) {
        if (bool.booleanValue()) {
            return Observable.b(bool);
        }
        return IapException.a("Playback speed can only be set on local device");
    }

    /* access modifiers changed from: 0000 */
    public Observable<Empty> e() {
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(1).e()).f((ObservableSource<? extends T>) Completable.a((Action) new $$Lambda$iii$ZN01Jqpgys2ti4tGF2S0fGoPKbE(this)).e()).c((Predicate<? super T>) $$Lambda$iii$DBsVYfCU6D6TZNmeXP73XVhlxY.INSTANCE).a((Predicate<? super T>) $$Lambda$iii$Xc2Reezq8Xcs4QhJTPMzOYQI.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$iii$7uWhvFFjzWUc_sNU5cFZImOO06M.INSTANCE).c(25, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$iii$L67WxuJdx7y0mVb6irUu8wons3o.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x() {
        this.o.a(this.m.d());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean g(PlayerState playerState) {
        return playerState.isPaused() || !playerState.isPlaying();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean f(PlayerState playerState) {
        return playerState.isPaused() || !playerState.isPlaying();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource e(Throwable th) {
        if (th instanceof TimeoutException) {
            return IapException.a("Failed to pause.");
        }
        return Observable.a(th);
    }

    /* access modifiers changed from: 0000 */
    public Observable<Empty> f() {
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(1).e()).f((ObservableSource<? extends T>) Completable.a((Action) new $$Lambda$iii$tDw3gUygte8o83cgUpbIo0p6l3w(this)).e()).c((Predicate<? super T>) $$Lambda$iii$DHcb8thbdhBH5pEGF0E24Qi2vUE.INSTANCE).a((Predicate<? super T>) $$Lambda$iii$B6lEHYjTKCvKNavzrJYjbmwmfQ0.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$iii$ViDpwIc_S7a9F2mo5fX_f846KY.INSTANCE).c(25, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$iii$n5kWJAuOPVtgIZjRNq3buHjRrE0.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w() {
        this.o.a(this.m.d(), (ActionCallback) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d(PlayerState playerState) {
        return !playerState.isPaused();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(PlayerState playerState) {
        return !playerState.isPaused();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource d(Throwable th) {
        if (th instanceof TimeoutException) {
            return IapException.a("Failed to play.");
        }
        return Observable.a(th);
    }

    public final Observable<PlaybackSpeed> g() {
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$MPeeVt7sIVYIJtx8LR2x7CArjDI.INSTANCE);
    }

    public final Observable<Empty> h() {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$iii$Be37rOVC7b_GYhSzbAvEbGgMn5k<T>(this)).d().f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(SingleEmitter singleEmitter) {
        this.o.b(this.m.d(), a(singleEmitter, "Cannot skip song"));
    }

    public final Observable<Empty> i() {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$iii$DnFiyuYas6iBy0C5OjoQhYsZ1U<T>(this)).d().f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(SingleEmitter singleEmitter) {
        this.o.c(this.m.d(), a(singleEmitter, "Cannot skip song"));
    }

    public final Observable<Shuffle> j() {
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$8Vk5lPW9yJzY3vnAoMg32xhokys.INSTANCE);
    }

    public final Observable<Empty> a(Shuffle shuffle) {
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(1).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$iii$yW3Y7sKPMK2R_uQEmRLNQqxsts<Object,Object>(this, shuffle));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty a(Shuffle shuffle, PlayerState playerState) {
        PlayerRestrictions restrictions = playerState.restrictions();
        if (restrictions.disallowTogglingShuffleReasons().isEmpty()) {
            if (shuffle.shuffle) {
                this.o.b(this.m.d());
            } else {
                this.o.c(this.m.d());
            }
            return AppProtocol.a;
        }
        throw new IapException(new Message(String.format("Cannot set shuffle: [%s]", new Object[]{a(restrictions.disallowTogglingShuffleReasons())})), "wamp.error");
    }

    public final Observable<Repeat> k() {
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$eRq0dBVBr_cUtuIOWKkl2GjaOrU.INSTANCE);
    }

    public final Observable<Empty> a(Repeat repeat) {
        return Observable.b((Callable<? extends T>) new $$Lambda$iii$WDOXWYcSwCSIwUGuAeguiStP4<Object>(this, repeat)).f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty b(Repeat repeat) {
        int i2 = repeat.repeat;
        if (i2 == 0) {
            this.o.d(this.m.d());
        } else if (i2 == 1) {
            this.o.e(this.m.d());
        } else if (i2 != 2) {
            StringBuilder sb = new StringBuilder("Unexpected repeat ");
            sb.append(repeat.repeat);
            Assertion.a(sb.toString());
        } else {
            this.o.f(this.m.d());
        }
        return AppProtocol.a;
    }

    public final Observable<Rating> l() {
        return vun.b(this.p.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$bEdlYK0jguLOp8FPa2eReGzWf0I.INSTANCE);
    }

    public final Observable<Empty> a(Rating rating) {
        return Observable.b((Callable<? extends T>) new $$Lambda$iii$iAbQYRDmLFvPafaBVncdiS6eNGI<Object>(this, rating)).f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty b(Rating rating) {
        int i2 = rating.rating;
        if (i2 == -1) {
            this.p.a(false, this.m.d());
        } else if (i2 != 1) {
            StringBuilder sb = new StringBuilder("Unexpected rating ");
            sb.append(rating.rating);
            Assertion.a(sb.toString());
        } else {
            this.p.a(true, this.m.d());
        }
        return AppProtocol.a;
    }

    public final Observable<Saved> a(Identifier identifier) {
        if (identifier == null || identifier.id == null || identifier.id.isEmpty()) {
            return Observable.b((Callable<? extends T>) new $$Lambda$iii$NROnYC2U8oitil3UulYqhYuq4y0<Object>(this)).f((ObservableSource<? extends T>) this.h.a(1).e());
        }
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(1).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$iii$jssINi55rcozqC6w9iW8ZKMYDrA<Object,Object>(identifier));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Saved v() {
        return new Saved(this.o.b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Saved a(Identifier identifier, PlayerState playerState) {
        PlayerTrack track = playerState != null ? playerState.track() : null;
        if (track == null) {
            return new Saved(playerState);
        }
        if (!Boolean.parseBoolean((String) track.metadata().get("collection.can_add"))) {
            return new Saved(identifier.id, false, false);
        }
        return new Saved(identifier.id, Boolean.parseBoolean((String) track.metadata().get("collection.in_collection")), true);
    }

    public final Observable<Empty> a(Saved saved) {
        return vun.b(this.b.d().a()).f((ObservableSource<? extends T>) this.h.a(1).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$iii$qCIGOQf4407JwULcSYRe8hNL1SM<Object,Object>(this, saved));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty a(Saved saved, PlayerState playerState) {
        PlayerTrack playerTrack = null;
        String contextUri = playerState != null ? playerState.contextUri() : null;
        if (saved.uri != null) {
            a(saved.saved, saved.uri, contextUri);
        } else {
            if (playerState != null) {
                playerTrack = playerState.track();
            }
            if (playerTrack == null) {
                Assertion.a("Track is null");
                return AppProtocol.a;
            }
            a(saved.saved, playerTrack.uri(), contextUri);
        }
        return AppProtocol.a;
    }

    private void a(boolean z, String str, String str2) {
        if (z) {
            this.b.b().a(str, str2, this.m.d());
        } else {
            this.b.b().a(str, this.m.d());
        }
    }

    public final Observable<Empty> b(Identifier identifier) {
        return Observable.b((Callable<? extends T>) new $$Lambda$iii$uzsEHlZG9Lx4aayP0pNVNc4Q7WI<Object>(this, identifier)).f((ObservableSource<? extends T>) this.h.a(8).e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty e(Identifier identifier) {
        this.u.a(identifier.id, this.b, this.m.d(), null, null);
        return AppProtocol.a;
    }

    public final Observable<Empty> a(Uri uri) {
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(2).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$iii$svlkbEPmdazuQhNTcDeJtFU_wdw<Object,Object>(this, uri));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty a(Uri uri, PlayerState playerState) {
        PlayerRestrictions restrictions = playerState.restrictions();
        if (restrictions.disallowInsertingIntoNextTracksReasons().isEmpty()) {
            this.b.h().a(this.a, uri.uri, this.m.d());
            return AppProtocol.a;
        }
        throw new IapException(new Message(String.format("Cannot queue specified uri: [%s]", new Object[]{a(restrictions.disallowInsertingIntoNextTracksReasons())})), "wamp.error");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, SingleEmitter singleEmitter) {
        a(uri.uri, (PlayOptions) null, singleEmitter);
    }

    public final Observable<Empty> b(Uri uri) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$iii$jAU62ZSO7hhGV0Aw5dW0oL14xGw<T>(this, uri)).d().f((ObservableSource<? extends T>) this.h.a(2).e());
    }

    public final Observable<Empty> a(String str, String[] strArr) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$iii$wmekGnS7J1DW5s6LIlsNIXqPwO8<T>(this, strArr, str)).d().f((ObservableSource<? extends T>) this.h.a(2).e());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(SingleEmitter singleEmitter, Throwable th) {
        Logger.e(th, "Couldn't subscribe to flags", new Object[0]);
        singleEmitter.a((Throwable) new IapException(new Message("Cannot play specified uri"), "wamp.error"));
    }

    private static ActionCallback a(final SingleEmitter<Empty> singleEmitter, final String str) {
        return new ActionCallback() {
            public final void onActionSuccess() {
                singleEmitter.a(AppProtocol.a);
            }

            public final void onActionForbidden(List<String> list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(": [%s]");
                singleEmitter.a((Throwable) new IapException(new Message(String.format(sb.toString(), new Object[]{iii.a((Set<String>) ImmutableSet.a((Collection<? extends E>) list))})), "wamp.error"));
            }
        };
    }

    public final Observable<Empty> c(Identifier identifier) {
        return Observable.b(identifier).f((ObservableSource<? extends T>) this.h.a(1).e()).h(new $$Lambda$iii$RTC28loLZHZyT_nbmzTtFNxObF4(this)).c((Function<? super T, ? extends R>) new $$Lambda$iii$lROgfd18EFCSYeJ5o9FHIddj_zg<Object,Object>(this)).a(0).d().c(15, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$iii$MIeiVXQU4H9404CZCU1kT8mozco.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource d(Identifier identifier) {
        if (identifier == null || fax.a(identifier.id)) {
            return vun.b(this.o.a()).a((Predicate<? super T>) $$Lambda$iii$ikN99kLqRGOfxLoM1M_J2cAjU.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$JX4_4YhI7dtnD0j0_yOammEAV4.INSTANCE).a((Predicate<? super T>) $$Lambda$iii$UbGvJDpA8OcZWNp_qbDxuXWuT0M.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg.INSTANCE);
        }
        return Observable.b(identifier.id);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlayerState playerState) {
        return playerState.track() != null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Empty a(String str) {
        this.p.a(str, this.m.d());
        return AppProtocol.a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource c(Throwable th) {
        if (th instanceof TimeoutException) {
            return IapException.a("Unable to start radio");
        }
        return Observable.a(th);
    }

    public final Observable<ListItems> a(RootListOptions rootListOptions) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$iii$Ub40CKkKKIBeKyWg36baHpqZaSA<T>(this, rootListOptions)).d().f((ObservableSource<? extends T>) this.h.a(8).e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RootListOptions rootListOptions, final SingleEmitter singleEmitter) {
        Bundle bundle = new Bundle();
        String str = RootListType.DEFAULT.name;
        if (rootListOptions != null) {
            str = rootListOptions.type.name;
            bundle.putString("_type", str);
        }
        String str2 = this.j;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(":type:");
            sb.append(str);
            str2 = sb.toString();
        }
        this.n.a(hnd.a(str2), bundle, new hpe() {
            public final void a(List<MediaBrowserItem> list) {
                singleEmitter.a(iii.a(list, 0, list.size()));
            }

            public final void a(Throwable th) {
                singleEmitter.a(th);
            }
        }, 0, 20, this.m.d());
    }

    public final Observable<ListItems> a(ChildrenPageRequest childrenPageRequest) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$iii$XfYprx2xaoDK14E0RXExxi8yMrg<T>(this, childrenPageRequest)).d().f((ObservableSource<? extends T>) this.h.a(8).e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final ChildrenPageRequest childrenPageRequest, final SingleEmitter singleEmitter) {
        final int i2;
        if (childrenPageRequest.limit == null) {
            i2 = 20;
        } else {
            i2 = childrenPageRequest.limit.intValue();
        }
        this.n.a(hnd.a(childrenPageRequest.parentId), new Bundle(), new hpe() {
            public final void a(List<MediaBrowserItem> list) {
                singleEmitter.a(iii.a(list, childrenPageRequest.offset, i2));
            }

            public final void a(Throwable th) {
                Logger.e(th, "Could not load %s", childrenPageRequest.parentId);
                singleEmitter.a(th);
            }
        }, (long) childrenPageRequest.offset, (long) i2, this.m.d());
    }

    public final Observable<AppProtocol.Context> m() {
        return new ijh(this.b, this.e).a().f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) new $$Lambda$iii$NM6AnU5aigJlxKpBedrzz5AdecY<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ AppProtocol.Context a(ho hoVar) {
        if (hoVar.b == null) {
            return AppProtocol.Context.EMPTY;
        }
        return new AppProtocol.Context((tcf) fay.a(((ho) hoVar.b).b), (PlayerState) fay.a(((ho) hoVar.b).a), this.a);
    }

    public final Observable<AppProtocol.PlayerState> n() {
        return vun.b(this.o.a()).f((ObservableSource<? extends T>) this.h.a(4).e()).a(0).d().c((Function<? super T, ? extends R>) $$Lambda$utFt1A0qgRe6lnZpkrN_zCxSwzg.INSTANCE);
    }

    public final Observable<AppProtocol.SessionState> o() {
        return this.b.g().a.j().f((ObservableSource<? extends T>) this.h.b(4).e()).c((Function<? super T, ? extends R>) new $$Lambda$iii$dygaPHCTxjXfYaK1xegH2IQooM<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ AppProtocol.SessionState a(SessionState sessionState) {
        return new AppProtocol.SessionState(sessionState, jtl.a(this.a));
    }

    public final Observable<Capabilities> p() {
        return this.b.i().a().e().j().f((ObservableSource<? extends T>) this.h.a().e()).a((Predicate<? super T>) $$Lambda$i33qTocIRf9FcULl8qHblXtgJw.INSTANCE).c(30, TimeUnit.SECONDS).c((Function<? super T, ? extends R>) $$Lambda$kUTHvkaGDRAinCsX08OLbBMRv0Y.INSTANCE).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$iii$xHfE3frCGPle8LQrmLkRPYjeQA.INSTANCE);
    }

    public final Observable<Empty> a(PlaybackPosition playbackPosition) {
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$iii$bJjZ2Z6FDqHK9_9LIsYqz9e1cU<T>(this, playbackPosition)).d().f((ObservableSource<? extends T>) this.h.a(1).e());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlaybackPosition playbackPosition, SingleEmitter singleEmitter) {
        this.o.a(playbackPosition.position, a(singleEmitter, "Cannot seek in song"));
    }

    public final Observable<Empty> b(PlaybackPosition playbackPosition) {
        return vun.b(this.o.a()).a(0).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$iii$qEPKQh4qv5yo83vMlfH2o_cdrFo<Object,Object>(this, playbackPosition), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(PlaybackPosition playbackPosition, PlayerState playerState) {
        return a(new PlaybackPosition(Math.min(Math.max(0, playerState.currentPlaybackPosition() + playbackPosition.position), playerState.duration())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Boolean bool) {
        if (bool.booleanValue()) {
            return Observable.b(AppProtocol.a);
        }
        return Observable.c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Throwable th) {
        if (th instanceof TimeoutException) {
            return IapException.a("Failed to switch to local device.");
        }
        return Observable.a(th);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.b.c().c();
    }

    public final Observable<ListItems> a(SearchQuery searchQuery) {
        return this.b.f().a(searchQuery.query != null ? searchQuery.query.trim() : "", searchQuery.offset, searchQuery.limit, this.m.d(), new Bundle()).d().f((ObservableSource<? extends T>) this.h.a(8).e()).c((Function<? super T, ? extends R>) new $$Lambda$iii$MrswttJ2VvCGEArgWohgWk6ieT0<Object,Object>(searchQuery));
    }

    /* access modifiers changed from: 0000 */
    public Observable<Image> a(ImageIdentifier imageIdentifier, int i2, int i3, boolean z) {
        $$Lambda$iii$I65Y3FpxRxC0C4amvrSSFquJatw r0 = new $$Lambda$iii$I65Y3FpxRxC0C4amvrSSFquJatw(this, imageIdentifier, i2, i3, z);
        return Single.a((SingleOnSubscribe<T>) r0).d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ImageIdentifier imageIdentifier, int i2, int i3, boolean z, SingleEmitter singleEmitter) {
        ImageFormat imageFormat;
        int a2 = a(imageIdentifier.width, i2);
        int a3 = a(imageIdentifier.height, i3);
        String str = imageIdentifier.imageType != null ? imageIdentifier.imageType : this.i.info.imageType;
        if (!this.k) {
            iix iix = this.s;
            if (!iix.c) {
                synchronized (iix.b) {
                    for (b a4 : iix.b) {
                        a4.a();
                    }
                }
            }
        }
        iix iix2 = this.s;
        android.net.Uri parse = android.net.Uri.parse(imageIdentifier.id);
        if ("jpeg".equals(str) || !"png".equals(str)) {
            imageFormat = ImageFormat.JPEG;
        } else {
            imageFormat = ImageFormat.PNG;
        }
        iix2.a(parse, imageFormat, a2, a3, z, new a(singleEmitter, a2, a3));
    }

    private static int a(int i2, int i3) {
        if (i2 > 0) {
            return Math.min(i2, Image.MAX_IMAGE_DIMENSION);
        }
        return Math.min(i3, Image.MAX_IMAGE_DIMENSION);
    }

    public final void b(int i2) {
        this.h.b(i2).c();
    }

    static String a(Set<String> set) {
        if (set.contains(DisallowReasons.MFT) || set.contains("disallow-mft-radio")) {
            return "CANT_PLAY_ON_DEMAND";
        }
        if (set.contains(DisallowReasons.AD) || set.contains("endless_context") || set.contains("disallow-radio")) {
            return "ACTION_NOT_ALLOWED_IN_CONTEXT";
        }
        if (set.contains("invalid_uri")) {
            return "NOT_A_VALID_URI";
        }
        return set.contains(PlayerError.ERROR_IN_OFFLINE_MODE) ? "TRACK_UNAVAILABLE_OFFLINE" : "UNKNOWN";
    }

    /* access modifiers changed from: 0000 */
    public static ListItems a(List<MediaBrowserItem> list, int i2, int i3) {
        int i4 = i2;
        int i5 = i3 == 0 ? Integer.MAX_VALUE : i3;
        if (i5 <= 0 || i4 < 0 || i4 >= list.size()) {
            List<MediaBrowserItem> list2 = list;
            return new ListItems(i5, i4, list.size(), new ListItem[0]);
        }
        ArrayList arrayList = new ArrayList(Math.min(list.size(), i5));
        int i6 = i4;
        while (i6 < i4 + i5 && i6 < list.size()) {
            MediaBrowserItem mediaBrowserItem = (MediaBrowserItem) list.get(i6);
            ListItem listItem = r7;
            ListItem listItem2 = new ListItem(mediaBrowserItem.a, mediaBrowserItem.a, String.valueOf(mediaBrowserItem.e), mediaBrowserItem.c, mediaBrowserItem.d == null ? "" : mediaBrowserItem.d, mediaBrowserItem.b == ActionType.PLAYABLE, mediaBrowserItem.b == ActionType.BROWSABLE, mediaBrowserItem.f);
            arrayList.add(listItem);
            i6++;
        }
        List<MediaBrowserItem> list3 = list;
        return new ListItems(i5, i4, list.size(), (ListItem[]) arrayList.toArray(new ListItem[0]));
    }

    private void a(String str, PlayOptions playOptions, SingleEmitter<Empty> singleEmitter) {
        if (jst.a(str).b == LinkType.PROFILE_PLAYLIST) {
            Assertion.b("Unsupported playlist URI. [https://spoti.fi/2NwLTih]");
            jst a2 = jst.a(str);
            StringBuilder sb = new StringBuilder();
            sb.append("spotify:");
            List pathSegments = a2.a.getPathSegments();
            for (int i2 = 0; i2 < pathSegments.size(); i2++) {
                if (sb.charAt(sb.length() - 1) != ':') {
                    sb.append(':');
                }
                if (i2 == 0) {
                    sb.append("playlist:");
                } else {
                    sb.append(android.net.Uri.encode((String) pathSegments.get(i2)));
                }
            }
            str = jst.a(sb.toString()).a(1, 2);
        }
        this.b.i().a().a(0).d().a((Consumer<? super T>) new $$Lambda$iii$x0JayJxRkqUGltFv0mOpIb5dLw<Object>(this, str, singleEmitter, playOptions), (Consumer<? super Throwable>) new $$Lambda$iii$eJwifmRG50YlZeuey87vcnH_3o4<Object>(singleEmitter));
    }

    public final Observable<Empty> q() {
        return this.h.a(1).a((CompletableSource) Completable.a((Action) new $$Lambda$iii$IycKxC253v39l9N1AeYUOKQwpo(this))).a((ObservableSource<T>) vun.b(this.b.c().d()).c((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$iii$jBVaz7QbCduWFXgigS28XzH30.INSTANCE, false).c(25, TimeUnit.SECONDS).d((Function<? super Throwable, ? extends ObservableSource<? extends T>>) $$Lambda$iii$vkgR7I478CgJP_o4U3Dk8dOezw.INSTANCE));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(java.lang.String r17, io.reactivex.SingleEmitter r18, com.spotify.mobile.android.cosmos.player.v2.PlayOptions r19, defpackage.fpt r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            jst r2 = defpackage.jst.a(r17)
            com.spotify.mobile.android.util.LinkType r2 = r2.b
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.TRACK
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x003f
            boolean r2 = r20.a()
            java.lang.String r3 = "Flags must be loaded if we are here."
            com.spotify.mobile.android.util.Assertion.a(r3, r2)
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Capabilities r2 = new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Capabilities
            fpq r3 = defpackage.guf.a
            r6 = r20
            java.io.Serializable r3 = r6.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.<init>(r3)
            boolean r2 = r2.canPlayOnDemand
            if (r2 != 0) goto L_0x003f
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r3 = "CANT_PLAY_ON_DEMAND"
            r2[r4] = r3
            java.util.HashSet r2 = com.google.common.collect.Sets.a((E[]) r2)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            goto L_0x0043
        L_0x003f:
            java.util.Set r2 = java.util.Collections.emptySet()
        L_0x0043:
            hop r3 = r0.m
            rqi r3 = r3.a()
            java.lang.String r3 = r3.b
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0075
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r5 = ","
            fau r5 = defpackage.fau.a(r5)
            java.lang.String r2 = r5.a(r2)
            r3[r4] = r2
            java.lang.String r2 = "Cannot play specified uri: [%s]"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            com.spotify.mobile.android.spotlets.appprotocol.IapException r3 = new com.spotify.mobile.android.spotlets.appprotocol.IapException
            com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Message r4 = new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol$Message
            r4.<init>(r2)
            java.lang.String r2 = "wamp.error"
            r3.<init>(r4, r2)
            r1.a(r3)
            return
        L_0x0075:
            jst r2 = defpackage.jst.a(r17)
            java.lang.String r6 = "9cc4aaeb43f24b098cff096385f00233"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0088
            com.spotify.mobile.android.util.LinkType r2 = r2.b
            com.spotify.mobile.android.util.LinkType r3 = com.spotify.mobile.android.util.LinkType.TRACK
            if (r2 != r3) goto L_0x0088
            r4 = 1
        L_0x0088:
            java.lang.String r2 = "Cannot play specified uri"
            if (r4 == 0) goto L_0x0143
            iij r3 = r0.q
            com.spotify.mobile.android.cosmos.player.v2.Player$ActionCallback r9 = a(r1, r2)
            hne r1 = r3.a
            hod r4 = r1.d()
            if (r19 != 0) goto L_0x00a4
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r1 = new com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder
            r1.<init>()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r1 = r1.build()
            goto L_0x00a6
        L_0x00a4:
            r1 = r19
        L_0x00a6:
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r2 = r1.suppressions()
            java.util.HashSet r5 = new java.util.HashSet
            if (r2 == 0) goto L_0x00b3
            java.util.Set r2 = r2.providers()
            goto L_0x00b7
        L_0x00b3:
            java.util.Set r2 = java.util.Collections.emptySet()
        L_0x00b7:
            r5.<init>(r2)
            java.lang.String r2 = "mft/inject_random_tracks"
            r5.add(r2)
            com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions r2 = new com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions
            r2.<init>(r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides r5 = com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides.create(r5, r6, r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = new com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder
            r6.<init>()
            boolean r7 = r1.allowSeeking()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.allowSeeking(r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$AudioStream r7 = r1.audioStream()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.audioStream(r7)
            java.util.Map r7 = r1.configurationOverride()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.configurationOverride(r7)
            boolean r7 = r1.initiallyPaused()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.initiallyPaused(r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Operation r7 = r1.operation()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.operation(r7)
            java.lang.String r7 = r1.playbackId()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.playbackId(r7)
            java.lang.Long r7 = r1.seekTo()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.seekTo(r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptionsSkipTo r7 = r1.skipTo()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r6 = r6.skipTo(r7)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r2 = r6.suppressions(r2)
            boolean r6 = r1.systemInitiated()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r2 = r2.systemInitiated(r6)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Trigger r1 = r1.trigger()
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r1 = r2.trigger(r1)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions$Builder r1 = r1.playerOptionsOverride(r5)
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions r6 = r1.build()
            java.lang.String r1 = "autoplay_candidate"
            java.lang.String r2 = "false"
            com.google.common.collect.ImmutableMap r7 = com.google.common.collect.ImmutableMap.b(r1, r2)
            hop r1 = r3.b
            java.lang.String r8 = r1.d()
            r5 = r17
            r4.a(r5, r6, r7, r8, r9)
            return
        L_0x0143:
            htw r10 = r0.u
            hne r12 = r0.b
            hop r3 = r0.m
            java.lang.String r13 = r3.d()
            com.spotify.mobile.android.cosmos.player.v2.Player$ActionCallback r14 = a(r1, r2)
            r11 = r17
            r15 = r19
            r10.a(r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iii.a(java.lang.String, io.reactivex.SingleEmitter, com.spotify.mobile.android.cosmos.player.v2.PlayOptions, fpt):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String[] strArr, String str, SingleEmitter singleEmitter) {
        PlayOptions playOptions = null;
        try {
            if (Arrays.asList(strArr).contains(null) || strArr.length == 0) {
                Logger.d("Attempting to get UriOptionExtras for empty option extras", new Object[0]);
                throw new IllegalArgumentException("Option extras cannot be empty.");
            }
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                Streamtype a2 = Streamtype.a(strArr[i2]);
                if (!hashMap.containsKey(UriOptionExtras.STREAMTYPE)) {
                    if (Streamtype.UNKNOWN_STREAMTYPE != a2) {
                        hashMap.put(UriOptionExtras.STREAMTYPE, a2);
                    }
                    i2++;
                } else {
                    Logger.d("Found duplicate UriOptionExtras", new Object[0]);
                    throw new IllegalArgumentException(String.format("Duplicate use not allowed for value of option extra [%s]", new Object[]{UriOptionExtras.STREAMTYPE.type}));
                }
            }
            if (!hashMap.isEmpty()) {
                if (hashMap.containsKey(UriOptionExtras.STREAMTYPE) && Streamtype.ALARM == ((Streamtype) hashMap.get(UriOptionExtras.STREAMTYPE))) {
                    Logger.b("UriOptionExtra StreamTypeAlarm", new Object[0]);
                    playOptions = new Builder().audioStream(AudioStream.ALARM).build();
                }
                a(str, playOptions, singleEmitter);
                return;
            }
            Logger.d("Unknown UriOptionExtras", new Object[0]);
            throw new IllegalArgumentException("Unknown option extras");
        } catch (Exception e2) {
            singleEmitter.a((Throwable) new IapException(e2.getMessage(), "wamp.error"));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(AppProtocol.PlayerState playerState) {
        if (playerState.track.isEpisode && playerState.track.isPodcast) {
            return Observable.b(playerState);
        }
        return IapException.a("Playback speed is only supported for Podcast playback");
    }
}
