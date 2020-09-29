package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
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

/* renamed from: ugm reason: default package */
public final class ugm {
    private static final Set<String> e = new HashSet(Collections.singletonList("disallow-mft-radio"));
    private static final Set<String> f = new HashSet(Collections.singletonList("disallow-radio"));
    public final xag a = new xag();
    public final ugs b;
    public final ugv c;
    public boolean d;
    private final PlayerFactory g;
    private final uhg h;
    private final heg i;
    private Player j;
    private final jsz k;
    private final uhe l;
    private final lkk m;
    private boolean n;
    private wuk o;

    /* renamed from: ugm$a */
    public static class a {
        public final sih a;
        public final udr b;
        public final gjb c;

        public a(sih sih, udr udr, gjb gjb) {
            this.a = (sih) fay.a(sih);
            this.b = (udr) fay.a(udr);
            this.c = (gjb) fay.a(gjb);
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

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
    }

    ugm(uhg uhg, ugv ugv, uhe uhe, ugs ugs, PlayerFactory playerFactory, jsz jsz, lkk lkk, heg heg) {
        this.h = uhg;
        this.c = ugv;
        this.l = uhe;
        this.b = ugs;
        this.g = playerFactory;
        this.k = jsz;
        this.m = lkk;
        this.i = heg;
    }

    public final void a() {
        this.c.a();
        this.b.a();
        wuk wuk = this.o;
        if (wuk == null || wuk.isUnsubscribed()) {
            this.o = this.m.a().a((wun<? super T>) new $$Lambda$ugm$a0abCJASHj5bBFvy9btBkVGfiQ<Object>(this), (wun<Throwable>) $$Lambda$ugm$xj0Srg_FeiSwZ93wOZ6t_bgrAD4.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.n = bool.booleanValue();
    }

    public final void b() {
        this.c.b.a();
        this.b.b.a();
        wuk wuk = this.o;
        if (wuk != null && !wuk.isUnsubscribed()) {
            this.o.unsubscribe();
        }
    }

    public final wud<RadioStationModel> a(String str) {
        return vun.a((ObservableSource<T>) this.h.a(str, 40, null, this.n, false), BackpressureStrategy.BUFFER);
    }

    public final void b(String str) {
        RadioStationModel radioStationModel;
        ugv ugv = this.c;
        Iterator it = ugv.c.userStations().iterator();
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
            ArrayList arrayList = new ArrayList(ugv.c.userStations().size());
            for (RadioStationModel radioStationModel2 : ugv.c.userStations()) {
                if (!radioStationModel2.equals(radioStationModel)) {
                    arrayList.add(radioStationModel2);
                }
            }
            ugv.c = RadioStationsModel.create((List<RadioStationModel>) arrayList, ugv.c.recommendedStations(), ugv.c.genreStations(), ugv.c.savedStations(), ugv.c.clusterStations());
            ugv.b();
        }
        xag xag = this.a;
        uhg uhg = this.h;
        String a2 = uhg.a(str, "stations/%s");
        xag.a(vun.a((ObservableSource<T>) uhg.a.resolve(RequestBuilder.delete(String.format(Locale.US, a2, new Object[]{str})).build()), BackpressureStrategy.BUFFER).a(vun.a(this.i.c())).a((wun<? super T>) $$Lambda$ugm$oBugy3fLYFK7cJ_6HU_DeFcLu4g.INSTANCE, (wun<Throwable>) new $$Lambda$ugm$519e5PowvMWSOEbQg27UC9oI8yY<Throwable>(this)));
    }

    public final void a(RadioStationModel radioStationModel) {
        this.b.a(radioStationModel);
    }

    public final void a(ThumbState thumbState) {
        ugs ugs = this.b;
        Player e2 = e();
        if (!ugs.d()) {
            ugs.m.a((int) R.string.toast_unable_to_thumb_radio, 1, new Object[0]);
            return;
        }
        ugs.a.b(thumbState);
        ugs.a.a(thumbState);
        if (ugs.c()) {
            ugs.a.c();
            return;
        }
        int i2 = AnonymousClass1.a[thumbState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                ugu ugu = ugs.a.d;
                RadioStationModel radioStationModel = ugu.a;
                if (radioStationModel != null) {
                    String a2 = ugu.a();
                    xag xag = ugs.b;
                    wud f2 = vun.a((ObservableSource<T>) ugs.f.a(ugu, ThumbState.DOWN, radioStationModel), BackpressureStrategy.BUFFER).b(ugs.b(e2)).f(ugs.b(a2));
                    uhl uhl = new uhl(ugu, a2, ugs.e, ugs.l, ugs.h);
                    xag.a(f2.d((wut<? super T, ? extends wud<? extends R>>) uhl).b(ugs.n).a(ugs.n).b((wun<? super T>) ugs.j).b((wun<? super T>) ugs.i).i(ugs.a(ugu)).a(ugs.a(e2), (wun<Throwable>) ugs.d));
                }
            }
            return;
        }
        ugu ugu2 = ugs.a.d;
        RadioStationModel radioStationModel2 = ugu2.a;
        if (radioStationModel2 != null) {
            ugs.b.a(vun.a((ObservableSource<T>) ugs.f.a(ugu2, ThumbState.UP, radioStationModel2), BackpressureStrategy.BUFFER).b(ugs.g, (wuu<? super T, ? super T2, ? extends R>) new ugz<Object,Object,Object>(ugu2, ugu2.a(), ugs.e, ThumbState.UP)).b(ugs.n).a(ugs.n).b((wun<? super T>) ugs.j).b((wun<? super T>) ugs.i).i(ugs.a(ugu2)).a(ugs.a(e2), (wun<Throwable>) ugs.d));
        }
    }

    public final void c(String str) {
        ugs ugs = this.b;
        Player e2 = e();
        if (!ugs.d()) {
            ugs.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        ugs.a.b(ThumbState.DOWN);
        if (!ugs.c()) {
            ugu ugu = ugs.a.d;
            wud i2 = ugs.h.a(1).i(ugs.a(ugu, str));
            xag xag = ugs.b;
            wud d2 = wud.a(i2, ugs.h, ugs.a(str, e2)).a(1).d(ugs.b());
            uhl uhl = new uhl(ugu, str, ugs.e, ugs.k, ugs.h);
            xag.a(d2.d((wut<? super T, ? extends wud<? extends R>>) uhl).a(ugs.n).b((wun<? super T>) ugs.i).i(ugs.a(ugu)).a(ugs.a(e2), (wun<Throwable>) ugs.c));
        }
    }

    public final void d(String str) {
        ugs ugs = this.b;
        Player e2 = e();
        if (!ugs.d()) {
            ugs.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        ugs.a.b(ThumbState.NONE);
        if (!ugs.c()) {
            ugu ugu = ugs.a.d;
            RadioStationModel radioStationModel = ugu.a;
            if (radioStationModel != null) {
                ugs.b.a(vun.a((ObservableSource<T>) ugs.f.a.resolve(RequestBuilder.delete(uhg.a(str, radioStationModel.uri, "hm://dailymix/v3/mixes/ban/song/%s/%s")).build()), BackpressureStrategy.BUFFER).b(ugs.g, (wuu<? super T, ? super T2, ? extends R>) new ugz<Object,Object,Object>(ugu, str, ugs.e, ThumbState.NONE)).i(ugs.a(ugu)).a(ugs.a(e2), (wun<Throwable>) ugs.c));
            }
        }
    }

    private Player a(String str, udr udr, gjb gjb) {
        this.j = this.g.create(str, udr, gjb);
        return this.j;
    }

    private Player e() {
        if (this.j == null) {
            this.j = a(ViewUris.d.toString(), udt.aI, rju.v);
        }
        return this.j;
    }

    public final void e(String str) {
        ugs ugs = this.b;
        Player e2 = e();
        if (!ugs.d()) {
            ugs.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        if (!ugs.c()) {
            ugu ugu = ugs.a.d;
            wud i2 = ugs.h.a(1).i(ugs.b(ugu, str));
            xag xag = ugs.b;
            wud d2 = wud.a(i2, ugs.h, ugs.a(str, e2)).a(1).d(ugs.b());
            uhl uhl = new uhl(ugu, str, ugs.e, ugs.k, ugs.h);
            xag.a(d2.d((wut<? super T, ? extends wud<? extends R>>) uhl).a(ugs.n).b((wun<? super T>) ugs.i).i(ugs.a(ugu)).a(ugs.a(e2), (wun<Throwable>) ugs.c));
        }
    }

    public final void f(String str) {
        ugs ugs = this.b;
        Player e2 = e();
        if (!ugs.d()) {
            ugs.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        if (!ugs.c()) {
            ugu ugu = ugs.a.d;
            RadioStationModel radioStationModel = ugu.a;
            if (radioStationModel != null) {
                ugs.b.a(vun.a((ObservableSource<T>) ugs.f.a.resolve(RequestBuilder.delete(uhg.a(str, radioStationModel.uri, "hm://dailymix/v3/mixes/ban/artist/%s/%s")).build()), BackpressureStrategy.BUFFER).b(ugs.g, (wuu<? super T, ? super T2, ? extends R>) new ugz<Object,Object,Object>(ugu, str, ugs.e, ThumbState.NONE)).i(ugs.a(ugu)).a(ugs.a(e2), (wun<Throwable>) ugs.c));
            }
        }
    }

    public final void c() {
        ugs ugs = this.b;
        Player e2 = e();
        if (!ugs.d()) {
            ugs.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        ugs.a.b(ThumbState.UP);
        if (!ugs.c()) {
            ugu ugu = ugs.a.d;
            RadioStationModel radioStationModel = ugu.a;
            if (radioStationModel != null) {
                ugs.o.a(ugu.d, radioStationModel.uri, e2.getViewUri());
                ugs.b.a(vun.a((ObservableSource<T>) ugs.f.a.resolve(RequestBuilder.post(uhg.a(ugu.a(), radioStationModel.uri, "hm://dailymix/v3/mixes/like/song/%s/%s")).build()), BackpressureStrategy.BUFFER).b(ugs.g, (wuu<? super T, ? super T2, ? extends R>) new ugz<Object,Object,Object>(ugu, ugu.a(), ugs.e, ThumbState.UP)).i(ugs.a(ugu)).a(ugs.n).a(ugs.a(e2), (wun<Throwable>) ugs.c));
            }
        }
    }

    public final void d() {
        ugs ugs = this.b;
        Player e2 = e();
        if (!ugs.d()) {
            ugs.a.a(FailureState.CLUSTER_FEEDBACK_FAILURE);
            return;
        }
        ugs.a.b(ThumbState.NONE);
        if (!ugs.c()) {
            ugu ugu = ugs.a.d;
            RadioStationModel radioStationModel = ugu.a;
            if (radioStationModel != null) {
                ugs.o.b(ugu.d, radioStationModel.uri, e2.getViewUri());
                ugs.b.a(vun.a((ObservableSource<T>) ugs.f.a.resolve(RequestBuilder.delete(uhg.a(ugu.a(), radioStationModel.uri, "hm://dailymix/v3/mixes/like/song/%s/%s")).build()), BackpressureStrategy.BUFFER).b(ugs.g, (wuu<? super T, ? super T2, ? extends R>) new ugz<Object,Object,Object>(ugu, ugu.a(), ugs.e, ThumbState.NONE)).i(ugs.a(ugu)).a(ugs.a(e2), (wun<Throwable>) ugs.c));
            }
        }
    }

    public final void a(String[] strArr, boolean z, boolean z2, int i2, long j2, String[] strArr2, a aVar) {
        boolean z3 = z;
        int i3 = i2;
        a aVar2 = aVar;
        fay.a(strArr);
        fay.a(aVar);
        String[] strArr3 = (String[]) fbx.a((E[]) strArr).a((faz<? super E>) $$Lambda$ugm$vZhJPkJxPFxxZtyAiDWbpZAIRxw.INSTANCE).a(String.class);
        boolean z4 = true;
        if (wpi.a((Object[]) strArr3)) {
            this.k.a((int) R.string.toast_unable_to_start_radio, 1, new Object[0]);
            Logger.d("Invalid seeds for station, should be either artist, album, track, genre or playlist uri. %s", Arrays.toString(strArr));
            return;
        }
        StationEntitySession a2 = this.c.a(ViewUris.aj.a((String) fay.a(uhq.c(strArr3[0]))));
        if (a2 != null) {
            RadioStationModel radioStationModel = a2.getRadioStationModel();
            a(radioStationModel, (i3 < -1 || i3 >= radioStationModel.tracks.length) ? -1 : i3, j2, z2, strArr2, aVar);
            if (z3 && !radioStationModel.explicitSave) {
                a(radioStationModel);
            }
        } else if ((z2 || strArr3.length > 1) && !ViewUris.an.b(strArr3[0])) {
            fay.a(strArr3);
            if (strArr3.length <= 0) {
                z4 = false;
            }
            fay.b(z4);
            fay.a(aVar);
            this.a.a(vun.a((ObservableSource<T>) this.h.a(CreateRadioStationModel.create(strArr3), strArr2), BackpressureStrategy.BUFFER).a(vun.a(this.i.c())).a((wun<? super T>) new $$Lambda$ugm$T0IJkUMmquTLystt7bs5sJ03s<Object>(this, strArr3, aVar2, z3), (wun<Throwable>) new $$Lambda$ugm$AV3dVBP68GDrqyjqDAOgModPeg<Throwable>(this, strArr3)));
        } else {
            String[] strArr4 = strArr2;
            String str = strArr3[0];
            fay.a(str);
            fay.a(aVar);
            this.a.a(vun.a((ObservableSource<T>) this.h.a(str, 40, strArr2, this.n, aVar2.c.equals(rju.m)), BackpressureStrategy.BUFFER).a(vun.a(this.i.c())).a((wun<? super T>) new $$Lambda$ugm$b4fnvso2mA1x32pfNJHQj2MQPHk<Object>(this, aVar2, z3), (wun<Throwable>) new $$Lambda$ugm$k6Vc4R3SfpG3TWNu_nWpdYmABNI<Throwable>(str)));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean h(String str) {
        return ViewUris.ak.b(str) || ViewUris.aj.b(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r10.intValue() < 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.spotify.music.spotlets.radio.model.RadioStationModel r9, int r10, long r11, boolean r13, java.lang.String[] r14, defpackage.ugm.a r15) {
        /*
            r8 = this;
            defpackage.fay.a(r9)
            defpackage.fay.a(r15)
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
            ugv r12 = r8.c
            sih r1 = r9.stationUri
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
            ugv r10 = r8.c
            r10.a(r9)
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r10 = r9.tracks
            int r10 = r10.length
            if (r10 == 0) goto L_0x00b1
            java.lang.String r10 = r9.nextPageUrl
            boolean r10 = defpackage.fax.a(r10)
            if (r10 == 0) goto L_0x005d
            goto L_0x00b1
        L_0x005d:
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r10 = r9.tracks
            if (r14 == 0) goto L_0x006a
            int r11 = r14.length
            if (r11 <= 0) goto L_0x006a
            boolean r11 = r8.n
            com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r10 = defpackage.uhe.a(r14, r11, r10)
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
            xag r10 = r8.a
            uhg r11 = r8.h
            com.spotify.music.spotlets.radio.model.CreateRadioStationModel r12 = com.spotify.music.spotlets.radio.model.CreateRadioStationModel.create(r9)
            io.reactivex.Observable r11 = r11.a(r12)
            io.reactivex.BackpressureStrategy r12 = io.reactivex.BackpressureStrategy.BUFFER
            wud r11 = defpackage.vun.a(r11, r12)
            heg r12 = r8.i
            io.reactivex.Scheduler r12 = r12.c()
            wug r12 = defpackage.vun.a(r12)
            wud r11 = r11.a(r12)
            wuq$b r12 = defpackage.wuq.a()
            java.lang.String[] r9 = r9.seeds
            java.lang.String r9 = java.util.Arrays.toString(r9)
            -$$Lambda$ugm$axZ84mCQd1KKgKILtDVJ102MwxY r13 = new -$$Lambda$ugm$axZ84mCQd1KKgKILtDVJ102MwxY
            r13.<init>(r9)
            wuk r9 = r11.a(r12, r13)
            r10.a(r9)
        L_0x00b0:
            return
        L_0x00b1:
            xag r10 = r8.a
            uhg r11 = r8.h
            java.lang.String r12 = r9.uri
            boolean r0 = r8.n
            io.reactivex.Observable r11 = r11.a(r12, r14, r0)
            io.reactivex.BackpressureStrategy r12 = io.reactivex.BackpressureStrategy.BUFFER
            wud r11 = defpackage.vun.a(r11, r12)
            heg r12 = r8.i
            io.reactivex.Scheduler r12 = r12.c()
            wug r12 = defpackage.vun.a(r12)
            wud r11 = r11.a(r12)
            -$$Lambda$ugm$2IbP45bbxED4N4CfI5w7XfcB4XY r12 = new -$$Lambda$ugm$2IbP45bbxED4N4CfI5w7XfcB4XY
            r12.<init>(r8, r9, r13, r15)
            -$$Lambda$ugm$Nel-dbiO9aSqxADY8NZPMRzpcjI r13 = new -$$Lambda$ugm$Nel-dbiO9aSqxADY8NZPMRzpcjI
            r13.<init>(r8, r9)
            wuk r9 = r11.a(r12, r13)
            r10.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugm.a(com.spotify.music.spotlets.radio.model.RadioStationModel, int, long, boolean, java.lang.String[], ugm$a):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RadioStationModel radioStationModel, boolean z, a aVar, RadioStationTracksModel radioStationTracksModel) {
        a(radioStationModel, radioStationTracksModel, (Integer) null, (Long) null, z, aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(RadioStationModel radioStationModel, Throwable th) {
        this.k.a((int) R.string.toast_unable_to_start_radio, 1, new Object[0]);
        Logger.d("Failed to load tracks from the backend for %s", radioStationModel.uri);
    }

    private void a(final RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel, Integer num, Long l2, boolean z, a aVar) {
        fay.a(radioStationModel);
        fay.a(radioStationTracksModel);
        fay.a(aVar);
        this.c.a(radioStationModel, radioStationTracksModel, aVar.a);
        PlayerContext a2 = a(radioStationModel, radioStationTracksModel);
        PlayOptions a3 = a(num, l2);
        final String arrays = Arrays.toString(radioStationModel.seeds);
        a(aVar.a.toString(), aVar.b, aVar.c).playWithViewUri(a2, a3, radioStationModel.getPlayerContextUri(), new ActionCallback() {
            public final void onActionSuccess() {
            }

            public final void onActionForbidden(List<String> list) {
                Logger.d("Play Forbidden when starting Radio station %s with seed %s. Reasons: %s", radioStationModel.uri, arrays, TextUtils.join(",", list));
            }
        });
        if (z) {
            this.a.a(vun.a((ObservableSource<T>) this.h.a(CreateRadioStationModel.create(radioStationModel)), BackpressureStrategy.BUFFER).a(vun.a(this.i.c())).a((wun<? super T>) wuq.a(), (wun<Throwable>) new $$Lambda$ugm$axZ84mCQd1KKgKILtDVJ102MwxY<Throwable>(arrays)));
        }
    }

    private PlayerContext a(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel) {
        PlayerContextPage playerContextPage = new PlayerContextPage(null, g(radioStationTracksModel.nextPageUrl), radioStationTracksModel.tracks, null);
        HashMap hashMap = new HashMap(2);
        String str = "";
        hashMap.put("context_description", jtc.a(radioStationModel.title, str));
        hashMap.put("image_url", jtc.a(radioStationModel.imageUri, str));
        PlayerContext playerContext = new PlayerContext(radioStationModel.getPlayerContextUri(), hashMap, f(), new PlayerContextPage[]{playerContextPage}, null, null);
        return playerContext;
    }

    private String g(String str) {
        Uri parse = Uri.parse(str);
        Builder clearQuery = parse.buildUpon().clearQuery();
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

    private static PlayOptions a(Integer num, Long l2) {
        PlayOptions.Builder builder = new PlayOptions.Builder();
        if (num != null) {
            builder = builder.skipToIndex(0, num.intValue());
        }
        if (l2 != null) {
            builder = builder.seekTo(l2);
        }
        return builder.playerOptionsOverride(Boolean.FALSE, null, null).suppressions(PlayerProviders.MFT_INJECT_FILLER_TRACKS, PlayerProviders.MFT_INJECT_RANDOM_TRACKS, "mft/force_shuffle").build();
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String[] strArr, Throwable th) {
        Logger.d("Failed to create station with seeds %s", Arrays.toString(strArr));
        this.k.a((int) R.string.toast_unable_to_start_radio, 1, new Object[0]);
        this.c.a((FailureState) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, boolean z, RadioStationModel radioStationModel) {
        a(radioStationModel, new RadioStationTracksModel(radioStationModel.tracks, radioStationModel.nextPageUrl), (Integer) null, (Long) null, false, aVar);
        if (z) {
            a(radioStationModel);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.b.a();
    }
}
