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

/* renamed from: usg reason: default package */
public final class usg {
    final usj a;
    final xok b = new xok();
    final uso c;
    final usq d;
    final uss e;
    final usu f;
    final xii<PlayerState> g;
    final xii<PlayerState> h;
    final uta i;
    final utc j;
    final c k;
    final a l;
    final jvf m;
    final xil n;
    final urk o;

    /* renamed from: usg$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.usg.AnonymousClass1.<clinit>():void");
        }
    }

    usg(usj usj, uso uso, usq usq, uss uss, usu usu, RxPlayerState rxPlayerState, uta uta, utc utc, c cVar, a aVar, jvf jvf, xil xil, urk urk) {
        this.a = usj;
        this.c = uso;
        this.d = usq;
        this.e = uss;
        this.f = usu;
        this.n = xil;
        this.g = wit.a((ObservableSource<T>) rxPlayerState.getPlayerState(10, 39), BackpressureStrategy.LATEST).a(1);
        this.h = wit.a((ObservableSource<T>) rxPlayerState.getPlayerState(10, 39), BackpressureStrategy.BUFFER);
        this.i = uta;
        this.j = utc;
        this.k = cVar;
        this.l = aVar;
        this.m = jvf;
        this.o = urk;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ RadioStationTracksModel a(String str, Response response) {
        return new RadioStationTracksModel(new PlayerTrack[]{PlayerTrack.create(str)}, null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(String str, Player player, RadioStationTracksModel radioStationTracksModel, PlayerState playerState) {
        return new ho(new $$Lambda$usg$PxM6D9mYNX1hKWsgdS8a1Bm_g4(playerState, str, player), radioStationTracksModel);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(usi usi, Optional optional) {
        return (!optional.b() || usi.a == null) ? EmptyObservableHolder.a() : this.e.a(usi.a, (RadioStationTracksModel) optional.c());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(usi usi, String str, PlayerState playerState) {
        RadioStationModel radioStationModel = usi.a;
        if (radioStationModel == null) {
            return EmptyObservableHolder.a();
        }
        PlayerTrack[] a2 = uss.a(playerState);
        RadioStationTracksModel radioStationTracksModel = new RadioStationTracksModel(a2, ute.a(radioStationModel.nextPageUrl, a2));
        return wit.a((ObservableSource<T>) wit.b(this.f.b.resolve(RequestBuilder.postBytes(usu.a(str, radioStationModel.uri, "hm://dailymix/v3/mixes/ban/artist/%s/%s"), usu.a(radioStationTracksModel)).build())), BackpressureStrategy.BUFFER);
    }

    static xis<PlayerContext> a(Player player) {
        return new $$Lambda$usg$v6NH8bD1iMDP7sw6K_FNoFQ8w(player);
    }

    static xiz<RadioStationTracksModel, PlayerState, ho<xir, RadioStationTracksModel>> a(String str, Player player) {
        return new $$Lambda$usg$_MHCBpxejpI1M9zoeCYra3Z6I(str, player);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(PlayerState playerState, String str, Player player) {
        PlayerTrack track = playerState.track();
        if (track != null && fbn.a(str, track.uri())) {
            player.skipToNextTrack();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RadioStationModel radioStationModel, Response response) {
        usj usj = this.a;
        usj.a(radioStationModel, true);
        usj.a(Collections.singletonList(radioStationModel));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RadioStationsModel radioStationsModel) {
        usj usj = this.a;
        if (radioStationsModel != null && !usj.c.equals(radioStationsModel)) {
            usj.c = radioStationsModel;
            usj.b();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.m.a((int) R.string.toast_station_unfollow_error, 0, new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list, Response response) {
        this.a.a(list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii b(usi usi, String str, PlayerState playerState) {
        Logger.b("(dm) applyNegativeFeedbackForTrack", new Object[0]);
        RadioStationModel radioStationModel = usi.a;
        if (radioStationModel == null) {
            return EmptyObservableHolder.a();
        }
        PlayerTrack[] a2 = uss.a(playerState);
        RadioStationTracksModel radioStationTracksModel = new RadioStationTracksModel(a2, ute.a(radioStationModel.nextPageUrl, a2));
        return wit.a((ObservableSource<T>) wit.b(this.f.b.resolve(RequestBuilder.postBytes(usu.a(str, radioStationModel.uri, "hm://dailymix/v3/mixes/ban/song/%s/%s"), usu.a(radioStationTracksModel)).build())), BackpressureStrategy.BUFFER);
    }

    static xis<? super Response> b(Player player) {
        return new $$Lambda$usg$fU54XfAuyEe0YbWaPzTp7hURA7s(player);
    }

    static xiy<ho<xir, RadioStationTracksModel>, xii<RadioStationTracksModel>> b() {
        return $$Lambda$usg$I08d3zDwhXoqSk3OvyAJ2bgnT_Q.INSTANCE;
    }

    static xiy<Response, RadioStationTracksModel> b(String str) {
        return new $$Lambda$usg$ATO7iv8mjz7BE0J4H3FVjQ23WY(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, Response response) {
        usj usj = this.a;
        RadioStationModel a2 = usj.a(str);
        if (a2 != null) {
            ArrayList arrayList = new ArrayList(usj.c.savedStations().size());
            for (RadioStationModel radioStationModel : usj.c.savedStations()) {
                if (!radioStationModel.equals(a2)) {
                    arrayList.add(radioStationModel);
                }
            }
            usj.c = RadioStationsModel.create(usj.c.userStations(), usj.c.recommendedStations(), usj.c.genreStations(), (List<RadioStationModel>) arrayList, usj.c.clusterStations());
            usj.a(a2, false);
            usj.b();
            usj.a(a2.stationUri, false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.m.a((int) R.string.toast_station_follow_error, 0, new Object[0]);
        this.a.a((FailureState) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Throwable th) {
        this.m.a((int) R.string.toast_station_follow_error, 0, new Object[0]);
        this.a.a((FailureState) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(Throwable th) {
        this.a.a((FailureState) null);
    }

    /* access modifiers changed from: 0000 */
    public xiy<Optional<RadioStationTracksModel>, xii<PlayerContext>> a(usi usi) {
        return new $$Lambda$usg$4Hkhrb1nesH5M8CczQdrgHrj64(this, usi);
    }

    /* access modifiers changed from: 0000 */
    public xiy<PlayerState, xii<RadioStationTracksModel>> a(usi usi, String str) {
        return new $$Lambda$usg$T5GI_HjcWP4FPbz9M1cynNaI08(this, usi, str);
    }

    public final void a() {
        this.b.a(wit.a((ObservableSource<T>) this.f.a(), BackpressureStrategy.BUFFER).a(this.n).a((xis<? super T>) new $$Lambda$usg$mHyPOIHmFndpWXBXs59CKuubJ7o<Object>(this), (xis<Throwable>) new $$Lambda$usg$vhTjNXUrVR0EdeckXTwlIWAEek<Throwable>(this)));
    }

    /* access modifiers changed from: 0000 */
    public final void a(RadioStationModel radioStationModel) {
        this.b.a(wit.a((ObservableSource<T>) this.f.a((String) fbp.a(ute.d(radioStationModel.uri))), BackpressureStrategy.BUFFER).a(this.n).a((xis<? super T>) new $$Lambda$usg$Gcuq4kMnhqWsTmOrCVWBKbPTUE<Object>(this, radioStationModel), (xis<Throwable>) new $$Lambda$usg$8lFyOfu_uWAMC9MXm3ouu7sWo<Throwable>(this)));
    }

    public final void a(String str) {
        this.b.a(wit.a((ObservableSource<T>) this.f.b((String) fbp.a(ute.d(str))), BackpressureStrategy.BUFFER).a(this.n).a((xis<? super T>) new $$Lambda$usg$J96YVGHQDlCl12cm1eVaukkVtlk<Object>(this, str), (xis<Throwable>) new $$Lambda$usg$piNCTDKCsogDlaXCqhMV8b8fxCU<Throwable>(this)));
    }

    public final void a(List<RadioStationModel> list) {
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = ((RadioStationModel) fbp.a(list.get(i2))).getStationSeed();
        }
        this.b.a(wit.a((ObservableSource<T>) this.f.a(strArr), BackpressureStrategy.BUFFER).a(this.n).a((xis<? super T>) new $$Lambda$usg$7kgALdrCGRDmHwJeEnaixXFkI<Object>(this, list), (xis<Throwable>) new $$Lambda$usg$6Y7Wo1PLLwfD6PyjgcnzlBcKYHk<Throwable>(this)));
    }

    /* access modifiers changed from: 0000 */
    public xiy<PlayerState, xii<RadioStationTracksModel>> b(usi usi, String str) {
        return new $$Lambda$usg$Rm6KP5wtIBelptHya4jtKEotyYU(this, usi, str);
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.a.d.c();
    }

    /* access modifiers changed from: 0000 */
    public boolean d() {
        usi usi = this.a.d;
        if (!ute.f(usi.c)) {
            Logger.d("Thumb operation could not be executed if we are not playing radio.", new Object[0]);
            return false;
        } else if (!fbo.a(usi.a())) {
            return true;
        } else {
            Logger.d("Thumb operation could not be executed, since the player has not yet started playing.", new Object[0]);
            return false;
        }
    }
}
