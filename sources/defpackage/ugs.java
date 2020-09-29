package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioStateObserver.FailureState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.internal.operators.EmptyObservableHolder;

/* renamed from: ugs reason: default package */
public final class ugs {
    final ugv a;
    final xag b = new xag();
    final uha c;
    final uhc d;
    final uhe e;
    final uhg f;
    final wud<PlayerState> g;
    final wud<PlayerState> h;
    final uhm i;
    final uho j;
    final c k;
    final a l;
    final jsz m;
    final wug n;
    final ufw o;

    /* renamed from: ugs$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ThumbState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.spotlets.radio.model.ThumbState[] r0 = com.spotify.music.spotlets.radio.model.ThumbState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.spotlets.radio.model.ThumbState r1 = com.spotify.music.spotlets.radio.model.ThumbState.UP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.spotlets.radio.model.ThumbState r1 = com.spotify.music.spotlets.radio.model.ThumbState.DOWN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ugs.AnonymousClass1.<clinit>():void");
        }
    }

    ugs(ugv ugv, uha uha, uhc uhc, uhe uhe, uhg uhg, RxPlayerState rxPlayerState, uhm uhm, uho uho, c cVar, a aVar, jsz jsz, wug wug, ufw ufw) {
        this.a = ugv;
        this.c = uha;
        this.d = uhc;
        this.e = uhe;
        this.f = uhg;
        this.n = wug;
        this.g = vun.a((ObservableSource<T>) rxPlayerState.getPlayerState(10, 39), BackpressureStrategy.LATEST).a(1);
        this.h = vun.a((ObservableSource<T>) rxPlayerState.getPlayerState(10, 39), BackpressureStrategy.BUFFER);
        this.i = uhm;
        this.j = uho;
        this.k = cVar;
        this.l = aVar;
        this.m = jsz;
        this.o = ufw;
    }

    public final void a() {
        this.b.a(vun.a((ObservableSource<T>) this.f.a(), BackpressureStrategy.BUFFER).a(this.n).a((wun<? super T>) new $$Lambda$ugs$WdHk3Lq4cvJdOMO1hLFSWKAV2R0<Object>(this), (wun<Throwable>) new $$Lambda$ugs$hk68ykR3dJOkZ7bCWR7Nm6AQxVU<Throwable>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RadioStationsModel radioStationsModel) {
        ugv ugv = this.a;
        if (radioStationsModel != null && !ugv.c.equals(radioStationsModel)) {
            ugv.c = radioStationsModel;
            ugv.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Throwable th) {
        this.a.a((FailureState) null);
    }

    public final void a(List<RadioStationModel> list) {
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = ((RadioStationModel) fay.a(list.get(i2))).getStationSeed();
        }
        this.b.a(vun.a((ObservableSource<T>) this.f.a(strArr), BackpressureStrategy.BUFFER).a(this.n).a((wun<? super T>) new $$Lambda$ugs$Jma9RWToI3ejr_geLhLKZu41Mk<Object>(this, list), (wun<Throwable>) new $$Lambda$ugs$F6OI_ufKs2yP6DhaEEVFf8ruMQI<Throwable>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list, Response response) {
        this.a.a(list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        this.m.a((int) R.string.toast_station_follow_error, 0, new Object[0]);
        this.a.a((FailureState) null);
    }

    /* access modifiers changed from: 0000 */
    public final void a(RadioStationModel radioStationModel) {
        this.b.a(vun.a((ObservableSource<T>) this.f.a((String) fay.a(uhq.e(radioStationModel.uri))), BackpressureStrategy.BUFFER).a(this.n).a((wun<? super T>) new $$Lambda$ugs$VHF3pqntfPsdqcCc0n541EvhHts<Object>(this, radioStationModel), (wun<Throwable>) new $$Lambda$ugs$rBV9vJzvLEVfF57Ii1O3m4YRZhY<Throwable>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RadioStationModel radioStationModel, Response response) {
        ugv ugv = this.a;
        ugv.a(radioStationModel, true);
        ugv.a(Collections.singletonList(radioStationModel));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.m.a((int) R.string.toast_station_follow_error, 0, new Object[0]);
        this.a.a((FailureState) null);
    }

    public final void a(String str) {
        this.b.a(vun.a((ObservableSource<T>) this.f.b((String) fay.a(uhq.e(str))), BackpressureStrategy.BUFFER).a(this.n).a((wun<? super T>) new $$Lambda$ugs$75IgZD63gz4DsjiHWpbSHq6_8MI<Object>(this, str), (wun<Throwable>) new $$Lambda$ugs$n4CfgyP9HMiu9Cy09lpNpH9ZXMY<Throwable>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, Response response) {
        ugv ugv = this.a;
        RadioStationModel a2 = ugv.a(str);
        if (a2 != null) {
            ArrayList arrayList = new ArrayList(ugv.c.savedStations().size());
            for (RadioStationModel radioStationModel : ugv.c.savedStations()) {
                if (!radioStationModel.equals(a2)) {
                    arrayList.add(radioStationModel);
                }
            }
            ugv.c = RadioStationsModel.create(ugv.c.userStations(), ugv.c.recommendedStations(), ugv.c.genreStations(), (List<RadioStationModel>) arrayList, ugv.c.clusterStations());
            ugv.a(a2, false);
            ugv.b();
            ugv.a(a2.stationUri, false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.m.a((int) R.string.toast_station_unfollow_error, 0, new Object[0]);
    }

    static wut<ho<wum, RadioStationTracksModel>, wud<RadioStationTracksModel>> b() {
        return $$Lambda$ugs$2rbGDhtLF0A9o1uLZeKzrg_WU.INSTANCE;
    }

    static wuu<RadioStationTracksModel, PlayerState, ho<wum, RadioStationTracksModel>> a(String str, Player player) {
        return new $$Lambda$ugs$MxTPVK193rSZJjcV9YeGI2QTeQ(str, player);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(String str, Player player, RadioStationTracksModel radioStationTracksModel, PlayerState playerState) {
        return new ho(new $$Lambda$ugs$fRjGiJtBo3f8u5WKoPFR_B1cd8o(playerState, str, player), radioStationTracksModel);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(PlayerState playerState, String str, Player player) {
        PlayerTrack track = playerState.track();
        if (track != null && faw.a(str, track.uri())) {
            player.skipToNextTrack();
        }
    }

    /* access modifiers changed from: 0000 */
    public wut<PlayerState, wud<RadioStationTracksModel>> a(ugu ugu, String str) {
        return new $$Lambda$ugs$LSPjtk5N19li6PsgUAXb_wXy7tY(this, ugu, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud b(ugu ugu, String str, PlayerState playerState) {
        Logger.b("(dm) applyNegativeFeedbackForTrack", new Object[0]);
        RadioStationModel radioStationModel = ugu.a;
        if (radioStationModel == null) {
            return EmptyObservableHolder.a();
        }
        PlayerTrack[] a2 = uhe.a(playerState);
        RadioStationTracksModel radioStationTracksModel = new RadioStationTracksModel(a2, uhq.a(radioStationModel.nextPageUrl, a2));
        return vun.a((ObservableSource<T>) vun.b(this.f.b.resolve(RequestBuilder.postBytes(uhg.a(str, radioStationModel.uri, "hm://dailymix/v3/mixes/ban/song/%s/%s"), uhg.a(radioStationTracksModel)).build())), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: 0000 */
    public wut<PlayerState, wud<RadioStationTracksModel>> b(ugu ugu, String str) {
        return new $$Lambda$ugs$qhFp_xbXUDubaY2a3L0eWpQiTA(this, ugu, str);
    }

    static wun<PlayerContext> a(Player player) {
        return new $$Lambda$ugs$GsXzyO0tGnoSwQwp0x2pjJyoZfw(player);
    }

    /* access modifiers changed from: 0000 */
    public wut<Optional<RadioStationTracksModel>, wud<PlayerContext>> a(ugu ugu) {
        return new $$Lambda$ugs$qXaFynlsWODvWJYQ6OnYOPfRNZs(this, ugu);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(ugu ugu, Optional optional) {
        if (!optional.b() || ugu.a == null) {
            return EmptyObservableHolder.a();
        }
        return this.e.a(ugu.a, (RadioStationTracksModel) optional.c());
    }

    static wut<Response, RadioStationTracksModel> b(String str) {
        return new $$Lambda$ugs$QdHSrP3BNxfQoVkjZUkA3ext9kA(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ RadioStationTracksModel a(String str, Response response) {
        return new RadioStationTracksModel(new PlayerTrack[]{PlayerTrack.create(str)}, null);
    }

    static wun<? super Response> b(Player player) {
        return new $$Lambda$ugs$Dt8Vf9iaaby7zxZmclNA0Wv_XeM(player);
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.a.d.c();
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        ugu ugu = this.a.d;
        if (!uhq.g(ugu.c)) {
            Logger.d("Thumb operation could not be executed if we are not playing radio.", new Object[0]);
            return false;
        } else if (!fax.a(ugu.a())) {
            return true;
        } else {
            Logger.d("Thumb operation could not be executed, since the player has not yet started playing.", new Object[0]);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(ugu ugu, String str, PlayerState playerState) {
        RadioStationModel radioStationModel = ugu.a;
        if (radioStationModel == null) {
            return EmptyObservableHolder.a();
        }
        PlayerTrack[] a2 = uhe.a(playerState);
        RadioStationTracksModel radioStationTracksModel = new RadioStationTracksModel(a2, uhq.a(radioStationModel.nextPageUrl, a2));
        return vun.a((ObservableSource<T>) vun.b(this.f.b.resolve(RequestBuilder.postBytes(uhg.a(str, radioStationModel.uri, "hm://dailymix/v3/mixes/ban/artist/%s/%s"), uhg.a(radioStationTracksModel)).build())), BackpressureStrategy.BUFFER);
    }
}
