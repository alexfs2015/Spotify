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

/* renamed from: ugv reason: default package */
public final class ugv {
    private static b<Object, String> e = b.b("radio-session-state-station");
    private static b<Object, String> f = b.b("radio-session-state-tracks");
    private static b<Object, String> g = b.b("radio-session-state-entity");
    final List<RadioStateObserver> a = new CopyOnWriteArrayList();
    final xag b = new xag();
    RadioStationsModel c = RadioStationsModel.create(new RadioStationModel[0], new RadioStationModel[0], new RadioStationModel[0], new RadioStationModel[0], new ClusterRadioStationModel[0]);
    public final ugu d;
    private final ObjectMapper h;
    private final RxPlayerState i;
    private final heg j;
    private final wun<PlayerState> k = new wun<PlayerState>() {
        public final /* synthetic */ void call(Object obj) {
            String str;
            boolean z;
            PlayerState playerState = (PlayerState) obj;
            if (uhq.g(playerState.entityUri())) {
                ugv.a(ugv.this, playerState);
            }
            PlayerTrack track = playerState.track();
            PlayerContextIndex index = playerState.index();
            int track2 = (index == null || index.track() < 0) ? 0 : index.track();
            ugu a2 = ugv.this.d;
            String entityUri = playerState.entityUri();
            boolean z2 = !faw.a(entityUri, a2.c);
            String str2 = "";
            if (track == null) {
                str = str2;
            } else {
                str = track.uid();
            }
            if (a2.d != null) {
                str2 = a2.d.uid();
            }
            boolean z3 = z2 | (!faw.a(str, str2));
            a2.c = entityUri;
            a2.d = track;
            if (z3) {
                ugy ugy = a2.b;
                if (track != null) {
                    String uri = track.uri();
                    if (uri.length() > 14) {
                        ugy.f.add(uri.substring(14));
                    }
                    if (ugy.b.tracks.length != 0) {
                        int length = track2 % ugy.b.tracks.length;
                        int i = length;
                        boolean z4 = false;
                        while (true) {
                            if (!uri.equals(ugy.b.tracks[i].uri())) {
                                if (z4 && length == i) {
                                    break;
                                }
                                i++;
                                if (i == ugy.b.tracks.length) {
                                    i = 0;
                                    z4 = true;
                                }
                            } else {
                                ugy.a.put(uri, uhq.a(track));
                                ugy.c = i;
                                double d = (double) ugy.c;
                                double length2 = (double) ugy.b.tracks.length;
                                Double.isNaN(length2);
                                if (d > length2 * 0.75d) {
                                    ugy.d = true;
                                }
                            }
                        }
                    }
                }
                a2.e = false;
            }
            if (uhq.g(ugv.this.d.c) && !ugv.this.d.c()) {
                if (track == null || fax.a(track.uri())) {
                    z = ugv.a(ugv.this, true);
                } else {
                    z = ugv.a(ugv.this, false);
                }
                z3 |= z;
            }
            if (z3) {
                ugv.this.e();
            }
        }
    };
    private final Map<String, ugy> l = new HashMap();
    private final SpSharedPreferences<Object> m;
    private Map<String, StationEntitySession> n = new HashMap();

    public ugv(ObjectMapper objectMapper, ugu ugu, SpSharedPreferences<Object> spSharedPreferences, RxPlayerState rxPlayerState, heg heg) {
        this.m = spSharedPreferences;
        this.h = objectMapper;
        this.d = ugu;
        this.i = rxPlayerState;
        this.j = heg;
    }

    public final void a() {
        wud e2 = vun.a((ObservableSource<T>) this.i.getPlayerState(), BackpressureStrategy.BUFFER).c((wut<? super T, Boolean>) $$Lambda$ugv$heZK9TtIiGN_sHqPwq4sSNjbuqc.INSTANCE).d().e();
        this.b.a(wud.a(e2.a(1).b((wun<? super T>) new $$Lambda$ugv$3GOQK7VHH8a8apcR70iejo9kxaQ<Object>(this)), e2).b().a(vun.a(this.j.c())).a(this.k, (wun<Throwable>) $$Lambda$ugv$ZVdq9CKHWIaL0ivvrwNiNQ6JRbA.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(PlayerState playerState) {
        return Boolean.valueOf(playerState != null);
    }

    private void b(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, sih sih) {
        String str;
        RadioStationModel radioStationModel2 = new RadioStationModel(radioStationModel, radioStationTracksModel);
        ugy ugy = (ugy) this.l.get(radioStationModel2.uri);
        if (ugy == null) {
            ugy = new ugy(radioStationTracksModel, sih);
        } else {
            ugy.a(radioStationTracksModel);
        }
        this.l.put(radioStationModel2.uri, ugy);
        b(radioStationModel2);
        a a2 = this.m.a();
        a2.a(e).a(f);
        try {
            String writeValueAsString = this.h.writeValueAsString(radioStationModel2);
            if (radioStationTracksModel == null) {
                str = null;
            } else {
                str = this.h.writeValueAsString(radioStationTracksModel);
            }
            if (!fax.a(writeValueAsString) && !fax.a(str)) {
                a2.a(e, writeValueAsString).a(f, str);
            }
        } catch (JsonProcessingException e2) {
            Logger.d(e2, "Failed to save radio session", new Object[0]);
        }
        a2.b();
        d();
        this.d.a(radioStationModel2, ugy);
        e();
    }

    /* access modifiers changed from: 0000 */
    public void a(sih sih, boolean z) {
        StationEntitySession a2 = a(sih);
        if (a2 != null) {
            a2.updateFollowing(z);
            d();
        }
    }

    public final StationEntitySession a(sih sih) {
        StationEntitySession stationEntitySession = (StationEntitySession) this.n.get(sih.toString());
        if (stationEntitySession == null || jrf.a.a() - stationEntitySession.getLastUpdateTime() >= 28800000) {
            return null;
        }
        return stationEntitySession;
    }

    private void b(RadioStationModel radioStationModel) {
        StationEntitySession a2 = a(radioStationModel.stationUri);
        if (a2 == null) {
            a2 = new StationEntitySession(radioStationModel, 0, jrf.a.a());
        } else {
            a2.updateStationModel(radioStationModel);
        }
        this.n.put(radioStationModel.uri, a2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(StationEntitySession stationEntitySession, PlayerState playerState) {
        stationEntitySession.updateTracks(playerState);
        d();
    }

    private void d() {
        a a2 = this.m.a();
        a2.a(g);
        try {
            String writeValueAsString = this.h.writeValueAsString(this.n);
            if (!fax.a(writeValueAsString)) {
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

    /* access modifiers changed from: 0000 */
    public void b() {
        for (RadioStateObserver a2 : this.a) {
            a2.a(this.c);
        }
    }

    public void a(FailureState failureState) {
        for (RadioStateObserver a2 : this.a) {
            a2.a();
        }
    }

    public final void a(List<RadioStationModel> list) {
        ArrayList arrayList = new ArrayList();
        for (RadioStationModel radioStationModel : (List) fay.a(list)) {
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

    public final RadioStationModel a(String str) {
        for (RadioStationModel radioStationModel : this.c.savedStations()) {
            if (radioStationModel.uri.equals(str)) {
                return radioStationModel;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a(RadioStationModel radioStationModel, boolean z) {
        ArrayList arrayList = new ArrayList(this.c.userStations().size());
        for (RadioStationModel radioStationModel2 : this.c.userStations()) {
            if (radioStationModel2.getStationSeed().equals(radioStationModel.getStationSeed())) {
                arrayList.add(uhq.a(radioStationModel, z));
            } else {
                arrayList.add(radioStationModel2);
            }
        }
        this.c = RadioStationsModel.create((List<RadioStationModel>) arrayList, this.c.recommendedStations(), this.c.genreStations(), this.c.savedStations(), this.c.clusterStations());
    }

    private void c(RadioStationModel radioStationModel) {
        if (!uhq.j(radioStationModel.uri)) {
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

    public final void a(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, sih sih) {
        c(radioStationModel);
        b(radioStationModel, radioStationTracksModel, sih);
    }

    public final void a(RadioStationModel radioStationModel) {
        fay.a(radioStationModel);
        if (!uhq.j(radioStationModel.uri)) {
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

    public final void a(ThumbState thumbState) {
        if (this.d.a(thumbState)) {
            e();
        }
    }

    public final void c() {
        if (this.d.d()) {
            e();
        }
    }

    public final void b(ThumbState thumbState) {
        if (this.d.b(thumbState)) {
            e();
        }
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
            boolean r4 = defpackage.fax.a(r2)     // Catch:{ IOException -> 0x010b }
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x0062
            boolean r4 = defpackage.fax.a(r3)     // Catch:{ IOException -> 0x010b }
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
            boolean r3 = defpackage.fax.a(r3)     // Catch:{ IOException -> 0x010b }
            if (r3 != 0) goto L_0x0063
            java.lang.String[] r3 = r6.seeds     // Catch:{ IOException -> 0x010b }
            int r3 = r3.length     // Catch:{ IOException -> 0x010b }
            if (r3 <= 0) goto L_0x0063
            java.lang.String r3 = r2.nextPageUrl     // Catch:{ IOException -> 0x010b }
            boolean r3 = defpackage.fax.a(r3)     // Catch:{ IOException -> 0x010b }
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
            boolean r4 = defpackage.fax.a(r0)     // Catch:{ IOException -> 0x010b }
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
            jrp r0 = defpackage.jrf.a     // Catch:{ IOException -> 0x010b }
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
            boolean r10 = defpackage.fax.a(r10)     // Catch:{ IOException -> 0x010b }
            if (r10 != 0) goto L_0x00cc
            java.lang.String r10 = r9.nextPageUrl     // Catch:{ IOException -> 0x010b }
            boolean r10 = defpackage.fax.a(r10)     // Catch:{ IOException -> 0x010b }
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
            ugy r14 = new ugy     // Catch:{ IOException -> 0x010b }
            sih r0 = com.spotify.music.libs.viewuri.ViewUris.d     // Catch:{ IOException -> 0x010b }
            r14.<init>(r2, r0)     // Catch:{ IOException -> 0x010b }
            java.util.Map<java.lang.String, ugy> r0 = r13.l     // Catch:{ IOException -> 0x010b }
            java.lang.String r2 = r6.uri     // Catch:{ IOException -> 0x010b }
            r0.put(r2, r14)     // Catch:{ IOException -> 0x010b }
            ugu r0 = r13.d     // Catch:{ IOException -> 0x010b }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugv.a(com.spotify.mobile.android.cosmos.player.v2.PlayerState):void");
    }

    static /* synthetic */ void a(ugv ugv, PlayerState playerState) {
        String str = (String) fay.a(uhq.c(uhq.d(playerState.entityUri())));
        if (ViewUris.aj.b(str)) {
            StationEntitySession a2 = ugv.a(ViewUris.aj.a(str));
            if (a2 != null) {
                PlayerTrack currentTrack = a2.getCurrentTrack();
                PlayerTrack track = playerState.track();
                if (track != null && !PlayerTrackUtil.isAd(track)) {
                    if (currentTrack == null || !faw.a(currentTrack.uid(), track.uid())) {
                        ugv.b.a(vun.a((ObservableSource<T>) ugv.i.getPlayerState(10, 39), BackpressureStrategy.BUFFER).c().a(vun.a(AndroidSchedulers.a())).a((wun<? super T>) new $$Lambda$ugv$tdvTjhPGnRkOBBKk9JfHbS3ws<Object>(ugv, a2), (wun<Throwable>) $$Lambda$ugv$t11W1IaPFOsjS4jg_88uQEEWH0.INSTANCE));
                    }
                }
            }
        }
    }

    static /* synthetic */ boolean a(ugv ugv, boolean z) {
        ugu ugu = ugv.d;
        if ((uhq.g(ugu.c) && ugu.f) == z) {
            return false;
        }
        ugv.d.f = z;
        return true;
    }
}
