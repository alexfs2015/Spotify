package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.a;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.radio.model.ClusterRadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.StationEntitySession;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;
import com.spotify.music.spotlets.radio.service.RadioStateObserver.FailureState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: usj reason: default package */
public final class usj {
    private static b<Object, String> e = b.b("radio-session-state-station");
    private static b<Object, String> f = b.b("radio-session-state-tracks");
    private static b<Object, String> g = b.b("radio-session-state-entity");
    final List<RadioStateObserver> a = new CopyOnWriteArrayList();
    final xok b = new xok();
    RadioStationsModel c = RadioStationsModel.create(new RadioStationModel[0], new RadioStationModel[0], new RadioStationModel[0], new RadioStationModel[0], new ClusterRadioStationModel[0]);
    public final usi d;
    private final ObjectMapper h;
    private final RxPlayerState i;
    private final hhc j;
    private final xis<PlayerState> k = new xis<PlayerState>() {
        public final /* synthetic */ void call(Object obj) {
            PlayerState playerState = (PlayerState) obj;
            if (ute.f(playerState.entityUri())) {
                usj.a(usj.this, playerState);
            }
            PlayerTrack track = playerState.track();
            PlayerContextIndex index = playerState.index();
            int track2 = (index == null || index.track() < 0) ? 0 : index.track();
            usi a2 = usj.this.d;
            String entityUri = playerState.entityUri();
            boolean z = !fbn.a(entityUri, a2.c);
            String str = "";
            String uid = track == null ? str : track.uid();
            if (a2.d != null) {
                str = a2.d.uid();
            }
            boolean z2 = z | (!fbn.a(uid, str));
            a2.c = entityUri;
            a2.d = track;
            if (z2) {
                usm usm = a2.b;
                if (track != null) {
                    String uri = track.uri();
                    if (uri.length() > 14) {
                        usm.f.add(uri.substring(14));
                    }
                    if (usm.b.tracks.length != 0) {
                        int length = track2 % usm.b.tracks.length;
                        int i = length;
                        boolean z3 = false;
                        while (true) {
                            if (!uri.equals(usm.b.tracks[i].uri())) {
                                if (z3 && length == i) {
                                    break;
                                }
                                i++;
                                if (i == usm.b.tracks.length) {
                                    i = 0;
                                    z3 = true;
                                }
                            } else {
                                usm.a.put(uri, ute.a(track));
                                usm.c = i;
                                double d = (double) usm.c;
                                double length2 = (double) usm.b.tracks.length;
                                Double.isNaN(length2);
                                if (d > length2 * 0.75d) {
                                    usm.d = true;
                                }
                            }
                        }
                    }
                }
                a2.e = false;
            }
            if (ute.f(usj.this.d.c) && !usj.this.d.c()) {
                z2 |= (track == null || fbo.a(track.uri())) ? usj.a(usj.this, true) : usj.a(usj.this, false);
            }
            if (z2) {
                usj.this.e();
            }
        }
    };
    private final Map<String, usm> l = new HashMap();
    private final SpSharedPreferences<Object> m;
    private Map<String, StationEntitySession> n = new HashMap();

    public usj(ObjectMapper objectMapper, usi usi, SpSharedPreferences<Object> spSharedPreferences, RxPlayerState rxPlayerState, hhc hhc) {
        this.m = spSharedPreferences;
        this.h = objectMapper;
        this.d = usi;
        this.i = rxPlayerState;
        this.j = hhc;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a A[Catch:{ IOException -> 0x010b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a(com.spotify.mobile.android.cosmos.player.v2.PlayerState r14) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            r1 = 0
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r2 = r13.m     // Catch:{ IOException -> 0x010b }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r3 = e     // Catch:{ IOException -> 0x010b }
            java.lang.String r2 = r2.a(r3, r0)     // Catch:{ IOException -> 0x010b }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r3 = r13.m     // Catch:{ IOException -> 0x010b }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r4 = f     // Catch:{ IOException -> 0x010b }
            java.lang.String r3 = r3.a(r4, r0)     // Catch:{ IOException -> 0x010b }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences<java.lang.Object> r4 = r13.m     // Catch:{ IOException -> 0x010b }
            com.spotify.mobile.android.util.prefs.SpSharedPreferences$b<java.lang.Object, java.lang.String> r5 = g     // Catch:{ IOException -> 0x010b }
            java.lang.String r0 = r4.a(r5, r0)     // Catch:{ IOException -> 0x010b }
            boolean r4 = defpackage.fbo.a(r2)     // Catch:{ IOException -> 0x010b }
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x0062
            boolean r4 = defpackage.fbo.a(r3)     // Catch:{ IOException -> 0x010b }
            if (r4 != 0) goto L_0x0062
            com.fasterxml.jackson.databind.ObjectMapper r4 = r13.h     // Catch:{ IOException -> 0x010b }
            java.lang.Class<com.spotify.music.spotlets.radio.model.RadioStationModel> r6 = com.spotify.music.spotlets.radio.model.RadioStationModel.class
            java.lang.Object r2 = r4.readValue(r2, r6)     // Catch:{ IOException -> 0x010b }
            r6 = r2
            com.spotify.music.spotlets.radio.model.RadioStationModel r6 = (com.spotify.music.spotlets.radio.model.RadioStationModel) r6     // Catch:{ IOException -> 0x010b }
            com.fasterxml.jackson.databind.ObjectMapper r2 = r13.h     // Catch:{ IOException -> 0x010b }
            java.lang.Class<com.spotify.music.spotlets.radio.model.RadioStationTracksModel> r4 = com.spotify.music.spotlets.radio.model.RadioStationTracksModel.class
            java.lang.Object r2 = r2.readValue(r3, r4)     // Catch:{ IOException -> 0x010b }
            com.spotify.music.spotlets.radio.model.RadioStationTracksModel r2 = (com.spotify.music.spotlets.radio.model.RadioStationTracksModel) r2     // Catch:{ IOException -> 0x010b }
            if (r6 == 0) goto L_0x0063
            if (r2 == 0) goto L_0x0063
            java.lang.String r3 = r6.uri     // Catch:{ IOException -> 0x010b }
            boolean r3 = defpackage.fbo.a(r3)     // Catch:{ IOException -> 0x010b }
            if (r3 != 0) goto L_0x0063
            java.lang.String[] r3 = r6.seeds     // Catch:{ IOException -> 0x010b }
            int r3 = r3.length     // Catch:{ IOException -> 0x010b }
            if (r3 <= 0) goto L_0x0063
            java.lang.String r3 = r2.nextPageUrl     // Catch:{ IOException -> 0x010b }
            boolean r3 = defpackage.fbo.a(r3)     // Catch:{ IOException -> 0x010b }
            if (r3 != 0) goto L_0x0063
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r3 = r2.tracks     // Catch:{ IOException -> 0x010b }
            if (r3 == 0) goto L_0x0063
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r3 = r2.tracks     // Catch:{ IOException -> 0x010b }
            int r3 = r3.length     // Catch:{ IOException -> 0x010b }
            if (r3 <= 0) goto L_0x0063
            r3 = 1
            goto L_0x0064
        L_0x0062:
            r2 = r6
        L_0x0063:
            r3 = 0
        L_0x0064:
            boolean r4 = defpackage.fbo.a(r0)     // Catch:{ IOException -> 0x010b }
            if (r4 != 0) goto L_0x00e6
            com.fasterxml.jackson.databind.ObjectMapper r4 = r13.h     // Catch:{ IOException -> 0x010b }
            com.fasterxml.jackson.databind.ObjectMapper r7 = r13.h     // Catch:{ IOException -> 0x010b }
            com.fasterxml.jackson.databind.type.TypeFactory r7 = r7.getTypeFactory()     // Catch:{ IOException -> 0x010b }
            java.lang.Class<java.util.HashMap> r8 = java.util.HashMap.class
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.Class<com.spotify.music.spotlets.radio.model.StationEntitySession> r10 = com.spotify.music.spotlets.radio.model.StationEntitySession.class
            com.fasterxml.jackson.databind.type.MapType r7 = r7.constructMapType(r8, r9, r10)     // Catch:{ IOException -> 0x010b }
            java.lang.Object r0 = r4.readValue(r0, r7)     // Catch:{ IOException -> 0x010b }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IOException -> 0x010b }
            r13.n = r0     // Catch:{ IOException -> 0x010b }
            jtz r0 = defpackage.jtp.a     // Catch:{ IOException -> 0x010b }
            long r7 = r0.a()     // Catch:{ IOException -> 0x010b }
            java.util.Map<java.lang.String, com.spotify.music.spotlets.radio.model.StationEntitySession> r0 = r13.n     // Catch:{ IOException -> 0x010b }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x010b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x010b }
        L_0x0094:
            boolean r4 = r0.hasNext()     // Catch:{ IOException -> 0x010b }
            if (r4 == 0) goto L_0x00e6
            java.lang.Object r4 = r0.next()     // Catch:{ IOException -> 0x010b }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x010b }
            java.lang.Object r9 = r4.getValue()     // Catch:{ IOException -> 0x010b }
            com.spotify.music.spotlets.radio.model.StationEntitySession r9 = (com.spotify.music.spotlets.radio.model.StationEntitySession) r9     // Catch:{ IOException -> 0x010b }
            if (r9 == 0) goto L_0x00cc
            com.spotify.music.spotlets.radio.model.RadioStationModel r9 = r9.getRadioStationModel()     // Catch:{ IOException -> 0x010b }
            java.lang.String r10 = r9.uri     // Catch:{ IOException -> 0x010b }
            boolean r10 = defpackage.fbo.a(r10)     // Catch:{ IOException -> 0x010b }
            if (r10 != 0) goto L_0x00cc
            java.lang.String r10 = r9.nextPageUrl     // Catch:{ IOException -> 0x010b }
            boolean r10 = defpackage.fbo.a(r10)     // Catch:{ IOException -> 0x010b }
            if (r10 != 0) goto L_0x00cc
            java.lang.String[] r10 = r9.seeds     // Catch:{ IOException -> 0x010b }
            int r10 = r10.length     // Catch:{ IOException -> 0x010b }
            if (r10 <= 0) goto L_0x00cc
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r10 = r9.tracks     // Catch:{ IOException -> 0x010b }
            if (r10 == 0) goto L_0x00cc
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r9 = r9.tracks     // Catch:{ IOException -> 0x010b }
            int r9 = r9.length     // Catch:{ IOException -> 0x010b }
            if (r9 <= 0) goto L_0x00cc
            r9 = 1
            goto L_0x00cd
        L_0x00cc:
            r9 = 0
        L_0x00cd:
            if (r9 == 0) goto L_0x00e2
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x010b }
            com.spotify.music.spotlets.radio.model.StationEntitySession r4 = (com.spotify.music.spotlets.radio.model.StationEntitySession) r4     // Catch:{ IOException -> 0x010b }
            long r9 = r4.getLastUpdateTime()     // Catch:{ IOException -> 0x010b }
            long r9 = r7 - r9
            r11 = 28800000(0x1b77400, double:1.42290906E-316)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0094
        L_0x00e2:
            r0.remove()     // Catch:{ IOException -> 0x010b }
            goto L_0x0094
        L_0x00e6:
            if (r3 == 0) goto L_0x010a
            java.lang.String r0 = r6.uri     // Catch:{ IOException -> 0x010b }
            java.lang.String r14 = r14.entityUri()     // Catch:{ IOException -> 0x010b }
            boolean r14 = r0.equals(r14)     // Catch:{ IOException -> 0x010b }
            if (r14 == 0) goto L_0x010a
            usm r14 = new usm     // Catch:{ IOException -> 0x010b }
            sso r0 = com.spotify.music.libs.viewuri.ViewUris.c     // Catch:{ IOException -> 0x010b }
            r14.<init>(r2, r0)     // Catch:{ IOException -> 0x010b }
            java.util.Map<java.lang.String, usm> r0 = r13.l     // Catch:{ IOException -> 0x010b }
            java.lang.String r2 = r6.uri     // Catch:{ IOException -> 0x010b }
            r0.put(r2, r14)     // Catch:{ IOException -> 0x010b }
            usi r0 = r13.d     // Catch:{ IOException -> 0x010b }
            r0.a(r6, r14)     // Catch:{ IOException -> 0x010b }
            r13.b(r6)     // Catch:{ IOException -> 0x010b }
        L_0x010a:
            return
        L_0x010b:
            r14 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Failed to restore radio session"
            com.spotify.base.java.logging.Logger.d(r14, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usj.a(com.spotify.mobile.android.cosmos.player.v2.PlayerState):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(StationEntitySession stationEntitySession, PlayerState playerState) {
        stationEntitySession.updateTracks(playerState);
        d();
    }

    static /* synthetic */ void a(usj usj, PlayerState playerState) {
        String str = (String) fbp.a(ute.b(ute.c(playerState.entityUri())));
        if (ViewUris.ai.b(str)) {
            StationEntitySession a2 = usj.a(ViewUris.ai.a(str));
            if (a2 != null) {
                PlayerTrack currentTrack = a2.getCurrentTrack();
                PlayerTrack track = playerState.track();
                if (track != null && !PlayerTrackUtil.isAd(track)) {
                    if (currentTrack == null || !fbn.a(currentTrack.uid(), track.uid())) {
                        usj.b.a(wit.a((ObservableSource<T>) usj.i.getPlayerState(10, 39), BackpressureStrategy.BUFFER).c().a(wit.a(AndroidSchedulers.a())).a((xis<? super T>) new $$Lambda$usj$Bb539WxhXQyN1dGvrusztPp56U<Object>(usj, a2), (xis<Throwable>) $$Lambda$usj$Z9kSdVtfPEcGmQKgRJrGMEMieIQ.INSTANCE));
                    }
                }
            }
        }
    }

    static /* synthetic */ boolean a(usj usj, boolean z) {
        usi usi = usj.d;
        if ((ute.f(usi.c) && usi.f) == z) {
            return false;
        }
        usj.d.f = z;
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(PlayerState playerState) {
        return Boolean.valueOf(playerState != null);
    }

    private void b(RadioStationModel radioStationModel) {
        StationEntitySession a2 = a(radioStationModel.stationUri);
        if (a2 == null) {
            a2 = new StationEntitySession(radioStationModel, 0, jtp.a.a());
        } else {
            a2.updateStationModel(radioStationModel);
        }
        this.n.put(radioStationModel.uri, a2);
    }

    private void b(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, sso sso) {
        RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel, radioStationTracksModel);
        usm usm = (usm) this.l.get(radioStationModel2.uri);
        if (usm == null) {
            usm = new usm(radioStationTracksModel, sso);
        } else {
            usm.a(radioStationTracksModel);
        }
        this.l.put(radioStationModel2.uri, usm);
        b(radioStationModel2);
        a a2 = this.m.a();
        a2.a(e).a(f);
        try {
            String writeValueAsString = this.h.writeValueAsString(radioStationModel2);
            String writeValueAsString2 = radioStationTracksModel == null ? null : this.h.writeValueAsString(radioStationTracksModel);
            if (!fbo.a(writeValueAsString) && !fbo.a(writeValueAsString2)) {
                a2.a(e, writeValueAsString).a(f, writeValueAsString2);
            }
        } catch (JsonProcessingException e2) {
            Logger.d(e2, "Failed to save radio session", new Object[0]);
        }
        a2.b();
        d();
        this.d.a(radioStationModel2, usm);
        e();
    }

    private void c(RadioStationModel radioStationModel) {
        if (!ute.i(radioStationModel.uri)) {
            ArrayList arrayList = new ArrayList(this.c.userStations().size());
            for (RadioStationModel radioStationModel2 : this.c.userStations()) {
                if (radioStationModel2.getStationSeed().equals(radioStationModel.getStationSeed())) {
                    arrayList.add(0, radioStationModel2);
                } else {
                    arrayList.add(radioStationModel2);
                }
            }
            this.c = RadioStationsModel.create((List<RadioStationModel>) arrayList, this.c.recommendedStations(), this.c.genreStations(), this.c.savedStations(), this.c.clusterStations());
            b();
        }
    }

    private void d() {
        a a2 = this.m.a();
        a2.a(g);
        try {
            String writeValueAsString = this.h.writeValueAsString(this.n);
            if (!fbo.a(writeValueAsString)) {
                a2.a(g, writeValueAsString);
            }
        } catch (JsonProcessingException e2) {
            Logger.d(e2, "Failed to save radio station sessions", new Object[0]);
        }
        a2.b();
    }

    /* access modifiers changed from: private */
    public void e() {
        for (RadioStateObserver a2 : this.a) {
            a2.a(this.d);
        }
    }

    public final RadioStationModel a(String str) {
        for (RadioStationModel radioStationModel : this.c.savedStations()) {
            if (radioStationModel.uri.equals(str)) {
                return radioStationModel;
            }
        }
        return null;
    }

    public final StationEntitySession a(sso sso) {
        StationEntitySession stationEntitySession = (StationEntitySession) this.n.get(sso.toString());
        if (stationEntitySession == null || jtp.a.a() - stationEntitySession.getLastUpdateTime() >= 28800000) {
            return null;
        }
        return stationEntitySession;
    }

    public final void a() {
        xii e2 = wit.a((ObservableSource<T>) this.i.getPlayerState(), BackpressureStrategy.BUFFER).c((xiy<? super T, Boolean>) $$Lambda$usj$M6PvNVVX2mHXSmvSpOc09na0dHQ.INSTANCE).d().e();
        this.b.a(xii.a(e2.a(1).b((xis<? super T>) new $$Lambda$usj$vgSVtH3HlWWco73ImPl4KVLPzuA<Object>(this)), e2).b().a(wit.a(this.j.c())).a(this.k, (xis<Throwable>) $$Lambda$usj$AAuBvWPDT2se0SdZuJ5hkclOuLY.INSTANCE));
    }

    public final void a(RadioStationModel radioStationModel) {
        fbp.a(radioStationModel);
        if (!ute.i(radioStationModel.uri)) {
            ArrayList arrayList = new ArrayList(this.c.userStations().size() + 1);
            arrayList.add(radioStationModel);
            for (RadioStationModel radioStationModel2 : this.c.userStations()) {
                if (!radioStationModel2.uri.equals(radioStationModel.uri)) {
                    arrayList.add(radioStationModel2);
                }
            }
            this.c = RadioStationsModel.create((List<RadioStationModel>) arrayList, this.c.recommendedStations(), this.c.genreStations(), this.c.savedStations(), this.c.clusterStations());
            b();
        }
    }

    public final void a(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, sso sso) {
        c(radioStationModel);
        b(radioStationModel, radioStationTracksModel, sso);
    }

    /* access modifiers changed from: 0000 */
    public void a(RadioStationModel radioStationModel, boolean z) {
        ArrayList arrayList = new ArrayList(this.c.userStations().size());
        for (RadioStationModel radioStationModel2 : this.c.userStations()) {
            if (radioStationModel2.getStationSeed().equals(radioStationModel.getStationSeed())) {
                arrayList.add(ute.a(radioStationModel, z));
            } else {
                arrayList.add(radioStationModel2);
            }
        }
        this.c = RadioStationsModel.create((List<RadioStationModel>) arrayList, this.c.recommendedStations(), this.c.genreStations(), this.c.savedStations(), this.c.clusterStations());
    }

    public final void a(ThumbState thumbState) {
        if (this.d.a(thumbState)) {
            e();
        }
    }

    public void a(FailureState failureState) {
        for (RadioStateObserver a2 : this.a) {
            a2.a();
        }
    }

    public final void a(List<RadioStationModel> list) {
        ArrayList arrayList = new ArrayList();
        for (RadioStationModel radioStationModel : (List) fbp.a(list)) {
            if (a(radioStationModel.uri) == null) {
                arrayList.add(radioStationModel);
                a(radioStationModel.stationUri, true);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.addAll(this.c.savedStations());
        this.c = RadioStationsModel.create(this.c.userStations(), this.c.recommendedStations(), this.c.genreStations(), (List<RadioStationModel>) arrayList2, this.c.clusterStations());
        b();
    }

    /* access modifiers changed from: 0000 */
    public void a(sso sso, boolean z) {
        StationEntitySession a2 = a(sso);
        if (a2 != null) {
            a2.updateFollowing(z);
            d();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        for (RadioStateObserver a2 : this.a) {
            a2.a(this.c);
        }
    }

    public final void b(ThumbState thumbState) {
        if (this.d.b(thumbState)) {
            e();
        }
    }

    public final void c() {
        if (this.d.d()) {
            e();
        }
    }
}
