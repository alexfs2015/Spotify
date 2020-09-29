package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.CreateRadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.model.TracksAndRadioStationModel;
import com.spotify.music.spotlets.radio.service.RadioStateObserver.FailureState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: usa reason: default package */
public final class usa {
    private static final Set<String> e = new HashSet(Collections.singletonList("disallow-mft-radio"));
    private static final Set<String> f = new HashSet(Collections.singletonList("disallow-radio"));
    public final xok a = new xok();
    public final usg b;
    public final usj c;
    public boolean d;
    private final PlayerFactory g;
    private final usu h;
    private final hhc i;
    private Player j;
    private final jvf k;
    private final uss l;
    private final lok m;
    private boolean n;
    private xip o;

    /* renamed from: usa$a */
    public static class a {
        public final sso a;
        public final uqm b;
        public final gkm c;

        public a(sso sso, uqm uqm, gkm gkm) {
            this.a = (sso) fbp.a(sso);
            this.b = (uqm) fbp.a(uqm);
            this.c = (gkm) fbp.a(gkm);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }
    }

    usa(usu usu, usj usj, uss uss, usg usg, PlayerFactory playerFactory, jvf jvf, lok lok, hhc hhc) {
        this.h = usu;
        this.c = usj;
        this.l = uss;
        this.b = usg;
        this.g = playerFactory;
        this.k = jvf;
        this.m = lok;
        this.i = hhc;
    }

    private static PlayOptions a(Integer num, Long l2) {
        Builder builder = new Builder();
        if (num != null) {
            builder = builder.skipToIndex(0, num.intValue());
        }
        if (l2 != null) {
            builder = builder.seekTo(l2);
        }
        return builder.playerOptionsOverride(Boolean.FALSE, null, null).suppressions(PlayerProviders.MFT_INJECT_FILLER_TRACKS, PlayerProviders.MFT_INJECT_RANDOM_TRACKS, "mft/force_shuffle").build();
    }

    private Player a(String str, uqm uqm, gkm gkm) {
        this.j = this.g.create(str, uqm, gkm);
        return this.j;
    }

    private PlayerContext a(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel) {
        PlayerContextPage playerContextPage = new PlayerContextPage(null, g(radioStationTracksModel.nextPageUrl), radioStationTracksModel.tracks, null);
        HashMap hashMap = new HashMap(2);
        String str = "";
        hashMap.put("context_description", jvi.a(radioStationModel.title, str));
        hashMap.put("image_url", jvi.a(radioStationModel.imageUri, str));
        PlayerContext playerContext = new PlayerContext(radioStationModel.getPlayerContextUri(), hashMap, f(), new PlayerContextPage[]{playerContextPage}, null, null);
        return playerContext;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
    }

    private void a(final RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, Integer num, Long l2, boolean z, a aVar) {
        fbp.a(radioStationModel);
        fbp.a(radioStationTracksModel);
        fbp.a(aVar);
        this.c.a(radioStationModel, radioStationTracksModel, aVar.a);
        PlayerContext a2 = a(radioStationModel, radioStationTracksModel);
        PlayOptions a3 = a(num, l2);
        final String arrays = Arrays.toString(radioStationModel.seeds);
        a(aVar.a.toString(), aVar.b, aVar.c).playWithViewUri(a2, a3, radioStationModel.getPlayerContextUri(), new ActionCallback() {
            public final void onActionForbidden(List<String> list) {
                Logger.d("Play Forbidden when starting Radio station %s with seed %s. Reasons: %s", radioStationModel.uri, arrays, TextUtils.join(",", list));
            }

            public final void onActionSuccess() {
            }
        });
        if (z) {
            this.a.a(wit.a((ObservableSource<T>) this.h.a(CreateRadioStationModel.create(radioStationModel)), BackpressureStrategy.BUFFER).a(wit.a(this.i.c())).a((xis<? super T>) xiv.a(), (xis<Throwable>) new $$Lambda$usa$W0yXyyGydY39aWJl4AtlccHbzaI<Throwable>(arrays)));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RadioStationModel radioStationModel, Throwable th) {
        this.k.a((int) R.string.toast_unable_to_start_radio, 1, new Object[0]);
        Logger.d("Failed to load tracks from the backend for %s", radioStationModel.uri);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RadioStationModel radioStationModel, boolean z, a aVar, RadioStationTracksModel radioStationTracksModel) {
        a(radioStationModel, radioStationTracksModel, (Integer) null, (Long) null, z, aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.n = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.b.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, boolean z, RadioStationModel radioStationModel) {
        a(radioStationModel, new RadioStationTracksModel(radioStationModel.tracks, radioStationModel.nextPageUrl), (Integer) null, (Long) null, false, aVar);
        if (z) {
            a(radioStationModel);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String[] strArr, Throwable th) {
        Logger.d("Failed to create station with seeds %s", Arrays.toString(strArr));
        this.k.a((int) R.string.toast_unable_to_start_radio, 1, new Object[0]);
        this.c.a((FailureState) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String[] strArr, a aVar, boolean z, TracksAndRadioStationModel tracksAndRadioStationModel) {
        RadioStationModel radioStationModel = tracksAndRadioStationModel.station;
        Logger.b("Created station %s from seeds %s. Have %d tracks with next-page-url %s", radioStationModel.uri, Arrays.toString(strArr), Integer.valueOf(tracksAndRadioStationModel.tracks.length), tracksAndRadioStationModel.nextPageUrl);
        this.c.a(radioStationModel);
        a(radioStationModel, (RadioStationTracksModel) tracksAndRadioStationModel, (Integer) null, (Long) null, false, aVar);
        if (z) {
            a(radioStationModel);
        }
    }

    private Player e() {
        if (this.j == null) {
            this.j = a(ViewUris.c.toString(), uqo.aI, rta.v);
        }
        return this.j;
    }

    private PlayerRestrictions f() {
        if (this.d) {
            Set emptySet = Collections.emptySet();
            Set emptySet2 = Collections.emptySet();
            Set emptySet3 = Collections.emptySet();
            Set emptySet4 = Collections.emptySet();
            Set emptySet5 = Collections.emptySet();
            Set emptySet6 = Collections.emptySet();
            Set<String> set = f;
            PlayerRestrictions playerRestrictions = new PlayerRestrictions(emptySet, emptySet2, emptySet3, emptySet4, emptySet5, emptySet6, set, set, set, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
            return playerRestrictions;
        }
        Set<String> set2 = e;
        Set emptySet7 = Collections.emptySet();
        Set<String> set3 = e;
        Set emptySet8 = Collections.emptySet();
        Set emptySet9 = Collections.emptySet();
        Set emptySet10 = Collections.emptySet();
        Set<String> set4 = f;
        PlayerRestrictions playerRestrictions2 = new PlayerRestrictions(set2, emptySet7, set3, emptySet8, emptySet9, emptySet10, set4, set4, set4, e, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
        return playerRestrictions2;
    }

    private String g(String str) {
        Uri parse = Uri.parse(str);
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        HashSet<String> hashSet = new HashSet<>(parse.getQueryParameterNames());
        String str2 = "filter-explicit";
        hashSet.add(str2);
        for (String str3 : hashSet) {
            if (str3.equals(str2)) {
                if (this.n) {
                    clearQuery.appendQueryParameter(str2, "1");
                }
            } else if (parse.getQueryParameterNames().contains(str3)) {
                clearQuery.appendQueryParameter(str3, parse.getQueryParameter(str3));
            }
        }
        return clearQuery.toString();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean h(String str) {
        return ViewUris.aj.b(str) || ViewUris.ai.b(str);
    }

    public final xii<RadioStationModel> a(String str) {
        return wit.a((ObservableSource<T>) this.h.a(str, 40, null, this.n, false), BackpressureStrategy.BUFFER);
    }

    public final void a() {
        this.c.a();
        this.b.a();
        xip xip = this.o;
        if (xip == null || xip.isUnsubscribed()) {
            this.o = this.m.a().a((xis<? super T>) new $$Lambda$usa$b3dhEOggjuBqBACkVOESsIR6AA<Object>(this), (xis<Throwable>) $$Lambda$usa$fGddOCmHz6DhzFQJ8npVM7jmrGg.INSTANCE);
        }
    }

    public final void a(RadioStationModel radioStationModel) {
        this.b.a(radioStationModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r10.intValue() < 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.spotify.music.spotlets.radio.model.RadioStationModel r9, int r10, long r11, boolean r13, java.lang.String[] r14, defpackage.usa.a r15) {
        /*
            r8 = this;
            defpackage.fbp.a(r9)
            defpackage.fbp.a(r15)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            int r12 = r10.intValue()
            r0 = 0
            if (r12 >= 0) goto L_0x0048
            boolean r12 = r8.n
            if (r12 == 0) goto L_0x001c
        L_0x0019:
            r4 = r0
            r5 = r4
            goto L_0x004a
        L_0x001c:
            usj r12 = r8.c
            sso r1 = r9.stationUri
            com.spotify.music.spotlets.radio.model.StationEntitySession r12 = r12.a(r1)
            if (r12 == 0) goto L_0x003f
            com.spotify.music.spotlets.radio.model.RadioStationModel r9 = r12.getRadioStationModel()
            int r10 = r12.getIndex()
            int r10 = r10 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r12 = r10.intValue()
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r1 = r9.tracks
            int r1 = r1.length
            if (r12 < r1) goto L_0x003f
            r10 = r0
            r11 = r10
        L_0x003f:
            if (r10 == 0) goto L_0x0048
            int r12 = r10.intValue()
            if (r12 >= 0) goto L_0x0048
            goto L_0x0019
        L_0x0048:
            r4 = r10
            r5 = r11
        L_0x004a:
            usj r10 = r8.c
            r10.a(r9)
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r10 = r9.tracks
            int r10 = r10.length
            if (r10 == 0) goto L_0x00b1
            java.lang.String r10 = r9.nextPageUrl
            boolean r10 = defpackage.fbo.a(r10)
            if (r10 == 0) goto L_0x005d
            goto L_0x00b1
        L_0x005d:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r10 = r9.tracks
            if (r14 == 0) goto L_0x006a
            int r11 = r14.length
            if (r11 <= 0) goto L_0x006a
            boolean r11 = r8.n
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r10 = defpackage.uss.a(r14, r11, r10)
        L_0x006a:
            com.spotify.music.spotlets.radio.model.RadioStationTracksModel r3 = new com.spotify.music.spotlets.radio.model.RadioStationTracksModel
            java.lang.String r11 = r9.nextPageUrl
            r3.<init>(r10, r11)
            r6 = 0
            r1 = r8
            r2 = r9
            r7 = r15
            r1.a(r2, r3, r4, r5, r6, r7)
            if (r13 == 0) goto L_0x00b0
            xok r10 = r8.a
            usu r11 = r8.h
            com.spotify.music.spotlets.radio.model.CreateRadioStationModel r12 = com.spotify.music.spotlets.radio.model.CreateRadioStationModel.create(r9)
            io.reactivex.Observable r11 = r11.a(r12)
            io.reactivex.BackpressureStrategy r12 = io.reactivex.BackpressureStrategy.BUFFER
            xii r11 = defpackage.wit.a(r11, r12)
            hhc r12 = r8.i
            io.reactivex.Scheduler r12 = r12.c()
            xil r12 = defpackage.wit.a(r12)
            xii r11 = r11.a(r12)
            xiv$b r12 = defpackage.xiv.a()
            java.lang.String[] r9 = r9.seeds
            java.lang.String r9 = java.util.Arrays.toString(r9)
            -$$Lambda$usa$W0yXyyGydY39aWJl4AtlccHbzaI r13 = new -$$Lambda$usa$W0yXyyGydY39aWJl4AtlccHbzaI
            r13.<init>(r9)
            xip r9 = r11.a(r12, r13)
            r10.a(r9)
        L_0x00b0:
            return
        L_0x00b1:
            xok r10 = r8.a
            usu r11 = r8.h
            java.lang.String r12 = r9.uri
            boolean r0 = r8.n
            io.reactivex.Observable r11 = r11.a(r12, r14, r0)
            io.reactivex.BackpressureStrategy r12 = io.reactivex.BackpressureStrategy.BUFFER
            xii r11 = defpackage.wit.a(r11, r12)
            hhc r12 = r8.i
            io.reactivex.Scheduler r12 = r12.c()
            xil r12 = defpackage.wit.a(r12)
            xii r11 = r11.a(r12)
            -$$Lambda$usa$3uIpNIsFIgHIR90go2q_7Os9Sqs r12 = new -$$Lambda$usa$3uIpNIsFIgHIR90go2q_7Os9Sqs
            r12.<init>(r8, r9, r13, r15)
            -$$Lambda$usa$Kjz6KkCTRjqvoy782paJbQ37zSE r13 = new -$$Lambda$usa$Kjz6KkCTRjqvoy782paJbQ37zSE
            r13.<init>(r8, r9)
            xip r9 = r11.a(r12, r13)
            r10.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usa.a(com.spotify.music.spotlets.radio.model.RadioStationModel, int, long, boolean, java.lang.String[], usa$a):void");
    }

    public final void a(ThumbState thumbState) {
        usg usg = this.b;
        Player e2 = e();
        if (!usg.d()) {
            usg.m.a((int) R.string.toast_unable_to_thumb_radio, 1, new Object[0]);
            return;
        }
        usg.a.b(thumbState);
        usg.a.a(thumbState);
        if (usg.c()) {
            usg.a.c();
            return;
        }
        int i2 = AnonymousClass1.a[thumbState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                usi usi = usg.a.d;
                RadioStationModel radioStationModel = usi.a;
                if (radioStationModel != null) {
                    String a2 = usi.a();
                    xok xok = usg.b;
                    xii e3 = wit.a((ObservableSource<T>) usg.f.a(usi, ThumbState.DOWN, radioStationModel), BackpressureStrategy.BUFFER).b(usg.b(e2)).e(usg.b(a2));
                    usz usz = new usz(usi, a2, usg.e, usg.l, usg.h);
                    xok.a(e3.d((xiy<? super T, ? extends xii<? extends R>>) usz).b(usg.n).a(usg.n).b((xis<? super T>) usg.j).b((xis<? super T>) usg.i).h(usg.a(usi)).a(usg.a(e2), (xis<Throwable>) usg.d));
                }
            }
            return;
        }
        usi usi2 = usg.a.d;
        RadioStationModel radioStationModel2 = usi2.a;
        if (radioStationModel2 != null) {
            usg.b.a(wit.a((ObservableSource<T>) usg.f.a(usi2, ThumbState.UP, radioStationModel2), BackpressureStrategy.BUFFER).b(usg.g, (xiz<? super T, ? super T2, ? extends R>) new usn<Object,Object,Object>(usi2, usi2.a(), usg.e, ThumbState.UP)).b(usg.n).a(usg.n).b((xis<? super T>) usg.j).b((xis<? super T>) usg.i).h(usg.a(usi2)).a(usg.a(e2), (xis<Throwable>) usg.d));
        }
    }

    public final void a(String[] strArr, boolean z, boolean z2, int i2, long j2, String[] strArr2, a aVar) {
        boolean z3 = z;
        int i3 = i2;
        a aVar2 = aVar;
        fbp.a(strArr);
        fbp.a(aVar);
        String[] strArr3 = (String[]) fcp.a((E[]) strArr).a((fbq<? super E>) $$Lambda$usa$eXmHYpctv7YM8qpZQXqID7uHJK4.INSTANCE).a(String.class);
        boolean z4 = true;
        if (xdo.a((Object[]) strArr3)) {
            this.k.a((int) R.string.toast_unable_to_start_radio, 1, new Object[0]);
            Logger.d("Invalid seeds for station, should be either artist, album, track, genre or playlist uri. %s", Arrays.toString(strArr));
            return;
        }
        StationEntitySession a2 = this.c.a(ViewUris.ai.a((String) fbp.a(ute.b(strArr3[0]))));
        if (a2 != null) {
            RadioStationModel radioStationModel = a2.getRadioStationModel();
            a(radioStationModel, (i3 < -1 || i3 >= radioStationModel.tracks.length) ? -1 : i3, j2, z2, strArr2, aVar);
            if (z3 && !radioStationModel.explicitSave) {
                a(radioStationModel);
            }
        } else if ((z2 || strArr3.length > 1) && !ViewUris.am.b(strArr3[0])) {
            fbp.a(strArr3);
            if (strArr3.length <= 0) {
                z4 = false;
            }
            fbp.b(z4);
            fbp.a(aVar);
            this.a.a(wit.a((ObservableSource<T>) this.h.a(CreateRadioStationModel.create(strArr3), strArr2), BackpressureStrategy.BUFFER).a(wit.a(this.i.c())).a((xis<? super T>) new $$Lambda$usa$THb5tS1zNszovWCVi4Y591Rdoj8<Object>(this, strArr3, aVar2, z3), (xis<Throwable>) new $$Lambda$usa$R96xUrUK3rKwkY7lrdZXf8nm7s<Throwable>(this, strArr3)));
        } else {
            String[] strArr4 = strArr2;
            String str = strArr3[0];
            fbp.a(str);
            fbp.a(aVar);
            this.a.a(wit.a((ObservableSource<T>) this.h.a(str, 40, strArr2, this.n, aVar2.c.equals(rta.m)), BackpressureStrategy.BUFFER).a(wit.a(this.i.c())).a((xis<? super T>) new $$Lambda$usa$hDP57zv6uIyFKZaXMDpxksXoreA<Object>(this, aVar2, z3), (xis<Throwable>) new $$Lambda$usa$lS3TM7lCzpQCkH7r9LpeuiivPTQ<Throwable>(str)));
        }
    }

    public final void b() {
        this.c.b.a();
        this.b.b.a();
        xip xip = this.o;
        if (xip != null && !xip.isUnsubscribed()) {
            this.o.unsubscribe();
        }
    }

    public final void b(String str) {
        RadioStationModel radioStationModel;
        usj usj = this.c;
        Iterator it = usj.c.userStations().iterator();
        while (true) {
            if (!it.hasNext()) {
                radioStationModel = null;
                break;
            }
            radioStationModel = (RadioStationModel) it.next();
            if (radioStationModel.uri.equals(str)) {
                break;
            }
        }
        if (radioStationModel != null) {
            ArrayList arrayList = new ArrayList(usj.c.userStations().size());
            for (RadioStationModel radioStationModel2 : usj.c.userStations()) {
                if (!radioStationModel2.equals(radioStationModel)) {
                    arrayList.add(radioStationModel2);
                }
            }
            usj.c = RadioStationsModel.create((List<RadioStationModel>) arrayList, usj.c.recommendedStations(), usj.c.genreStations(), usj.c.savedStations(), usj.c.clusterStations());
            usj.b();
        }
        xok xok = this.a;
        usu usu = this.h;
        String a2 = usu.a(str, "stations/%s");
        xok.a(wit.a((ObservableSource<T>) usu.a.resolve(RequestBuilder.delete(String.format(Locale.US, a2, new Object[]{str})).build()), BackpressureStrategy.BUFFER).a(wit.a(this.i.c())).a((xis<? super T>) $$Lambda$usa$8AxRnCCqYSukpNeFFtRtq9hxBc8.INSTANCE, (xis<Throwable>) new $$Lambda$usa$9fmjIxPRb2U0DyMLQSn1s9iMYaU<Throwable>(this)));
    }

    public final void c() {
        usg usg = this.b;
        Player e2 = e();
        if (!usg.d()) {
            usg.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        usg.a.b(ThumbState.UP);
        if (!usg.c()) {
            usi usi = usg.a.d;
            RadioStationModel radioStationModel = usi.a;
            if (radioStationModel != null) {
                usg.o.a(usi.d, radioStationModel.uri, e2.getViewUri());
                usg.b.a(wit.a((ObservableSource<T>) usg.f.a.resolve(RequestBuilder.post(usu.a(usi.a(), radioStationModel.uri, "hm://dailymix/v3/mixes/like/song/%s/%s")).build()), BackpressureStrategy.BUFFER).b(usg.g, (xiz<? super T, ? super T2, ? extends R>) new usn<Object,Object,Object>(usi, usi.a(), usg.e, ThumbState.UP)).h(usg.a(usi)).a(usg.n).a(usg.a(e2), (xis<Throwable>) usg.c));
            }
        }
    }

    public final void c(String str) {
        usg usg = this.b;
        Player e2 = e();
        if (!usg.d()) {
            usg.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        usg.a.b(ThumbState.DOWN);
        if (!usg.c()) {
            usi usi = usg.a.d;
            xii h2 = usg.h.a(1).h(usg.a(usi, str));
            xok xok = usg.b;
            xii d2 = xii.a(h2, usg.h, usg.a(str, e2)).a(1).d(usg.b());
            usz usz = new usz(usi, str, usg.e, usg.k, usg.h);
            xok.a(d2.d((xiy<? super T, ? extends xii<? extends R>>) usz).a(usg.n).b((xis<? super T>) usg.i).h(usg.a(usi)).a(usg.a(e2), (xis<Throwable>) usg.c));
        }
    }

    public final void d() {
        usg usg = this.b;
        Player e2 = e();
        if (!usg.d()) {
            usg.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        usg.a.b(ThumbState.NONE);
        if (!usg.c()) {
            usi usi = usg.a.d;
            RadioStationModel radioStationModel = usi.a;
            if (radioStationModel != null) {
                usg.o.b(usi.d, radioStationModel.uri, e2.getViewUri());
                usg.b.a(wit.a((ObservableSource<T>) usg.f.a.resolve(RequestBuilder.delete(usu.a(usi.a(), radioStationModel.uri, "hm://dailymix/v3/mixes/like/song/%s/%s")).build()), BackpressureStrategy.BUFFER).b(usg.g, (xiz<? super T, ? super T2, ? extends R>) new usn<Object,Object,Object>(usi, usi.a(), usg.e, ThumbState.NONE)).h(usg.a(usi)).a(usg.a(e2), (xis<Throwable>) usg.c));
            }
        }
    }

    public final void d(String str) {
        usg usg = this.b;
        Player e2 = e();
        if (!usg.d()) {
            usg.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        usg.a.b(ThumbState.NONE);
        if (!usg.c()) {
            usi usi = usg.a.d;
            RadioStationModel radioStationModel = usi.a;
            if (radioStationModel != null) {
                usg.b.a(wit.a((ObservableSource<T>) usg.f.a.resolve(RequestBuilder.delete(usu.a(str, radioStationModel.uri, "hm://dailymix/v3/mixes/ban/song/%s/%s")).build()), BackpressureStrategy.BUFFER).b(usg.g, (xiz<? super T, ? super T2, ? extends R>) new usn<Object,Object,Object>(usi, str, usg.e, ThumbState.NONE)).h(usg.a(usi)).a(usg.a(e2), (xis<Throwable>) usg.c));
            }
        }
    }

    public final void e(String str) {
        usg usg = this.b;
        Player e2 = e();
        if (!usg.d()) {
            usg.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        if (!usg.c()) {
            usi usi = usg.a.d;
            xii h2 = usg.h.a(1).h(usg.b(usi, str));
            xok xok = usg.b;
            xii d2 = xii.a(h2, usg.h, usg.a(str, e2)).a(1).d(usg.b());
            usz usz = new usz(usi, str, usg.e, usg.k, usg.h);
            xok.a(d2.d((xiy<? super T, ? extends xii<? extends R>>) usz).a(usg.n).b((xis<? super T>) usg.i).h(usg.a(usi)).a(usg.a(e2), (xis<Throwable>) usg.c));
        }
    }

    public final void f(String str) {
        usg usg = this.b;
        Player e2 = e();
        if (!usg.d()) {
            usg.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        if (!usg.c()) {
            usi usi = usg.a.d;
            RadioStationModel radioStationModel = usi.a;
            if (radioStationModel != null) {
                usg.b.a(wit.a((ObservableSource<T>) usg.f.a.resolve(RequestBuilder.delete(usu.a(str, radioStationModel.uri, "hm://dailymix/v3/mixes/ban/artist/%s/%s")).build()), BackpressureStrategy.BUFFER).b(usg.g, (xiz<? super T, ? super T2, ? extends R>) new usn<Object,Object,Object>(usi, str, usg.e, ThumbState.NONE)).h(usg.a(usi)).a(usg.a(e2), (xis<Throwable>) usg.c));
            }
        }
    }
}
