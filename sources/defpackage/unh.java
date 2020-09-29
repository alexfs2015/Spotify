package defpackage;

import android.os.Bundle;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: unh reason: default package */
public final class unh {
    public static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, Boolean> a = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.b("voice_consent_accepted");
    /* access modifiers changed from: private */
    public boolean A;
    /* access modifiers changed from: private */
    public boolean B;
    /* access modifiers changed from: private */
    public vri C;
    private final wue<vri> D;
    /* access modifiers changed from: private */
    public final wue<Float> E;
    public final Player b;
    public final rda c;
    public final ulk d;
    String e;
    public volatile boolean f;
    public xag g;
    public uni h;
    public boolean i;
    private final wud<vri> j;
    private final wud<PlayerState> k;
    /* access modifiers changed from: private */
    public final snp l;
    /* access modifiers changed from: private */
    public final fpt m;
    /* access modifiers changed from: private */
    public final ula n;
    /* access modifiers changed from: private */
    public final uks o;
    /* access modifiers changed from: private */
    public final SpSharedPreferences<Object> p;
    /* access modifiers changed from: private */
    public final jrp q;
    private final wut<vri, wud<Long>> r;
    /* access modifiers changed from: private */
    public final heg s;
    private final ulq t;
    /* access modifiers changed from: private */
    public final umz u;
    /* access modifiers changed from: private */
    public final ObjectMapper v;
    /* access modifiers changed from: private */
    public boolean w;
    /* access modifiers changed from: private */
    public boolean x;
    /* access modifiers changed from: private */
    public String y = "NOT_SET";
    /* access modifiers changed from: private */
    public String z;

    /* renamed from: unh$3 reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[Intent.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent[] r0 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.NO_INTENT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.PLAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.SHUFFLE_ON     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.NEXT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.PREVIOUS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.SEARCH     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r1 = com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent.SHOW     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.unh.AnonymousClass3.<clinit>():void");
        }
    }

    /* renamed from: unh$a */
    static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract PlayerContext a();

        /* access modifiers changed from: 0000 */
        public abstract boolean b();

        a() {
        }

        static a a(PlayerContext playerContext, boolean z) {
            return new umy(playerContext, z);
        }
    }

    /* renamed from: unh$b */
    public static class b {
        boolean a;
        a b;

        public b(boolean z) {
            this.a = z;
        }
    }

    public unh(vos vos, Player player, wud<PlayerState> wud, snp snp, fpt fpt, ula ula, rda rda, ulk ulk, uks uks, SpSharedPreferences<Object> spSharedPreferences, jrp jrp, ulq ulq, wut<vri, wud<Long>> wut, heg heg, umz umz, ObjectMapper objectMapper) {
        String str = "";
        this.e = str;
        this.z = str;
        this.D = new wue<vri>() {
            public final /* synthetic */ void onNext(Object obj) {
                vri vri = (vri) obj;
                unh.this.C = vri;
                Logger.b("Voice Session State: %s", unh.this.C);
                vri.a((gcs<c>) new gcs<c>() {
                    public final /* synthetic */ void accept(Object obj) {
                        c cVar = (c) obj;
                        unh.this.n.b();
                        unh.this.y = cVar.a;
                        unh.this.u.a = unh.this.y;
                        if (!unh.this.p.a(unh.a, false)) {
                            ulk i = unh.this.d;
                            String h = unh.this.y;
                            long a2 = unh.this.q.a();
                            Logger.a("Logging Voice Consent %s %d true", h, Long.valueOf(a2));
                            i.a.a(new bq(h, a2, true));
                            unh.this.p.a().a(unh.a, true).b();
                        }
                        unh.this.d.a(unh.this.y, ViewUris.bX.toString(), ViewUris.bV.toString(), unh.this.z, 0, "page");
                    }
                }, (gcs<d>) new gcs<d>() {
                    public final /* synthetic */ void accept(Object obj) {
                        unh.this.g.a(vun.a((wrf<T>) ((d) obj).a.a(unh.this.s.c())).a(unh.this.E));
                        unh unh = unh.this;
                        String h = unh.this.y;
                        sih sih = ViewUris.bV;
                        unh.d.a(h, sih.toString(), sih.toString(), "listening-screen", 0, "page");
                        unh.this.e = "";
                        unh.this.h.ak();
                    }
                }, (gcs<defpackage.vri.b>) new gcs<defpackage.vri.b>() {
                    public final /* synthetic */ void accept(Object obj) {
                        defpackage.vri.b bVar = (defpackage.vri.b) obj;
                        if (!unh.this.B) {
                            unh.this.d.a(unh.this.y, ViewUris.bV.toString(), "", "intermediate_transcript", 0, "page");
                            unh.this.B = true;
                        }
                        unh.a(unh.this, bVar.a.transcript(), (vri) bVar);
                    }
                }, (gcs<defpackage.vri.a>) new gcs<defpackage.vri.a>() {
                    public final /* synthetic */ void accept(Object obj) {
                        defpackage.vri.a aVar = (defpackage.vri.a) obj;
                        unh.a(unh.this, aVar.a.transcript(), (vri) aVar);
                    }
                }, (gcs<e>) new gcs<e>() {
                    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6  */
                    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cb  */
                    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d2  */
                    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
                    /* JADX WARNING: Removed duplicated region for block: B:39:0x0115  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ void accept(java.lang.Object r20) {
                        /*
                            r19 = this;
                            r0 = r19
                            r1 = r20
                            vri$e r1 = (defpackage.vri.e) r1
                            unh$1 r2 = defpackage.unh.AnonymousClass1.this
                            unh r2 = defpackage.unh.this
                            r3 = 1
                            r2.f = r3
                            unh$1 r2 = defpackage.unh.AnonymousClass1.this
                            unh r2 = defpackage.unh.this
                            unh$1 r4 = defpackage.unh.AnonymousClass1.this
                            unh r4 = defpackage.unh.this
                            java.lang.String r4 = r4.y
                            sih r5 = com.spotify.music.libs.viewuri.ViewUris.bV
                            java.lang.String r6 = ""
                            java.lang.String r7 = "nlu-result"
                            r2.d.a(r4, r5.toString(), r6, r7, 0, "page")
                            unh$1 r2 = defpackage.unh.AnonymousClass1.this
                            unh r2 = defpackage.unh.this
                            com.fasterxml.jackson.databind.ObjectMapper r2 = r2.v
                            com.fasterxml.jackson.databind.JsonNode r4 = r1.a
                            java.lang.Class<com.spotify.voice.model.VoiceViewResponse> r5 = com.spotify.voice.model.VoiceViewResponse.class
                            java.lang.Object r2 = r2.convertValue(r4, r5)
                            com.spotify.voice.model.VoiceViewResponse r2 = (com.spotify.voice.model.VoiceViewResponse) r2
                            com.spotify.voice.model.VoiceViewResponse$Custom r4 = r2.custom()
                            r5 = 0
                            if (r4 != 0) goto L_0x0063
                            unh$1 r1 = defpackage.unh.AnonymousClass1.this
                            unh r1 = defpackage.unh.this
                            snp r1 = r1.l
                            com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r2 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.DID_NOT_UNDERSTAND
                            unh$1 r3 = defpackage.unh.AnonymousClass1.this
                            unh r3 = defpackage.unh.this
                            fpt r3 = r3.m
                            ulm$a r6 = defpackage.ulm.a.a
                            unh$1 r4 = defpackage.unh.AnonymousClass1.this
                            unh r4 = defpackage.unh.this
                            boolean r7 = r4.i
                            r8 = 0
                            r9 = 0
                            r10 = 0
                            r11 = 0
                            android.os.Bundle r4 = defpackage.umi.a(r6, r7, r8, r9, r10, r11)
                            r1.a(r2, r3, r5, r4)
                            return
                        L_0x0063:
                            r7 = 2
                            java.lang.Object[] r7 = new java.lang.Object[r7]
                            r8 = 0
                            r7[r8] = r1
                            com.fasterxml.jackson.databind.JsonNode r1 = r1.a
                            java.lang.String r1 = r1.toString()
                            r7[r3] = r1
                            java.lang.String r1 = "Voice Session State: %s Resolved NLU %s"
                            com.spotify.base.java.logging.Logger.b(r1, r7)
                            com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent r12 = r4.intent()
                            com.spotify.mobile.android.cosmos.player.v2.PlayerContext r1 = r4.playerContext()
                            java.util.List r2 = r2.body()
                            if (r2 == 0) goto L_0x00db
                            boolean r7 = r2.isEmpty()
                            if (r7 == 0) goto L_0x008b
                            goto L_0x00db
                        L_0x008b:
                            java.lang.Object r2 = r2.get(r8)
                            com.spotify.voice.model.VoiceViewResponse$Body r2 = (com.spotify.voice.model.VoiceViewResponse.Body) r2
                            if (r2 != 0) goto L_0x0096
                            ulm$a r2 = defpackage.ulm.a.a
                            goto L_0x00dd
                        L_0x0096:
                            com.spotify.voice.model.VoiceViewResponse$Body$Target r7 = r2.target()
                            if (r7 == 0) goto L_0x009e
                            r9 = 1
                            goto L_0x009f
                        L_0x009e:
                            r9 = 0
                        L_0x009f:
                            ulm$a r10 = new ulm$a
                            if (r9 == 0) goto L_0x00ac
                            java.lang.String r7 = r7.uri()
                            jst r7 = defpackage.jst.a(r7)
                            goto L_0x00ad
                        L_0x00ac:
                            r7 = r5
                        L_0x00ad:
                            com.spotify.voice.model.VoiceViewResponse$Body$Images r9 = r2.images()
                            if (r9 != 0) goto L_0x00b5
                        L_0x00b3:
                            r9 = r5
                            goto L_0x00c0
                        L_0x00b5:
                            com.spotify.voice.model.VoiceViewResponse$Body$Images$Image r9 = r9.main()
                            if (r9 != 0) goto L_0x00bc
                            goto L_0x00b3
                        L_0x00bc:
                            java.lang.String r9 = r9.uri()
                        L_0x00c0:
                            com.spotify.voice.model.VoiceViewResponse$Body$Text r11 = r2.text()
                            if (r11 == 0) goto L_0x00cb
                            java.lang.String r11 = r11.title()
                            goto L_0x00cc
                        L_0x00cb:
                            r11 = r6
                        L_0x00cc:
                            com.spotify.voice.model.VoiceViewResponse$Body$Text r2 = r2.text()
                            if (r2 == 0) goto L_0x00d6
                            java.lang.String r6 = r2.subtitle()
                        L_0x00d6:
                            r10.<init>(r7, r9, r11, r6)
                            r9 = r10
                            goto L_0x00de
                        L_0x00db:
                            ulm$a r2 = defpackage.ulm.a.a
                        L_0x00dd:
                            r9 = r2
                        L_0x00de:
                            com.spotify.voice.model.VoiceViewResponse$Custom$Restriction r2 = r4.restriction()
                            if (r2 == 0) goto L_0x0115
                            unh$1 r3 = defpackage.unh.AnonymousClass1.this
                            unh r3 = defpackage.unh.this
                            snp r3 = r3.l
                            java.lang.String r4 = r2.heading()
                            java.lang.String r15 = r2.detail()
                            java.lang.String r16 = r2.detail()
                            unh$1 r2 = defpackage.unh.AnonymousClass1.this
                            unh r2 = defpackage.unh.this
                            fpt r17 = r2.m
                            unh$1 r2 = defpackage.unh.AnonymousClass1.this
                            unh r2 = defpackage.unh.this
                            boolean r10 = r2.i
                            r11 = 0
                            r14 = 0
                            r13 = r1
                            android.os.Bundle r18 = defpackage.umi.a(r9, r10, r11, r12, r13, r14)
                            r13 = r3
                            r14 = r4
                            r13.a(r14, r15, r16, r17, r18)
                            return
                        L_0x0115:
                            java.lang.String r2 = r4.error()
                            java.lang.String r6 = r4.friendlyError()
                            boolean r4 = defpackage.fax.a(r2)
                            if (r4 != 0) goto L_0x0140
                            boolean r4 = defpackage.fax.a(r6)
                            if (r4 != 0) goto L_0x0140
                            unh$1 r1 = defpackage.unh.AnonymousClass1.this
                            unh r1 = defpackage.unh.this
                            snp r5 = r1.l
                            r7 = 0
                            unh$1 r1 = defpackage.unh.AnonymousClass1.this
                            unh r1 = defpackage.unh.this
                            fpt r9 = r1.m
                            r10 = 0
                            r8 = r2
                            r5.a(r6, r7, r8, r9, r10)
                            return
                        L_0x0140:
                            unh$1 r2 = defpackage.unh.AnonymousClass1.this
                            unh r2 = defpackage.unh.this
                            r2.o
                            int[] r2 = defpackage.uks.AnonymousClass2.a
                            int r4 = r12.ordinal()
                            r2 = r2[r4]
                            switch(r2) {
                                case 1: goto L_0x0153;
                                case 2: goto L_0x0153;
                                case 3: goto L_0x0153;
                                case 4: goto L_0x0153;
                                case 5: goto L_0x0153;
                                case 6: goto L_0x0153;
                                case 7: goto L_0x0153;
                                case 8: goto L_0x0153;
                                case 9: goto L_0x0153;
                                case 10: goto L_0x0153;
                                case 11: goto L_0x0153;
                                case 12: goto L_0x0153;
                                case 13: goto L_0x0153;
                                case 14: goto L_0x0153;
                                case 15: goto L_0x0153;
                                case 16: goto L_0x0153;
                                default: goto L_0x0152;
                            }
                        L_0x0152:
                            r3 = 0
                        L_0x0153:
                            if (r3 == 0) goto L_0x0165
                            unh$1 r2 = defpackage.unh.AnonymousClass1.this
                            unh r2 = defpackage.unh.this
                            unh$1 r3 = defpackage.unh.AnonymousClass1.this
                            unh r3 = defpackage.unh.this
                            java.lang.String r3 = r3.y
                            r2.g.a(rx.internal.util.ScalarSynchronousObservable.d(r9).c((defpackage.wut<? super T, java.lang.Boolean>) new defpackage.$$Lambda$unh$Q2xYw0WqaNTzOzVgu1HjlEtiXfw<java.lang.Object,java.lang.Boolean>(r12, r9)).f(new defpackage.$$Lambda$unh$u6yLo9jERS5_lC9Xst4zZhUvBg(r1)).a(defpackage.vun.a(r2.s.c())).d((defpackage.wut<? super T, ? extends defpackage.wud<? extends R>>) new defpackage.$$Lambda$unh$7mYyJryXwnLI1RdOyj2vUWNKt4<java.lang.Object,java.lang.Object>(r2, r3, r9, r12)).d((defpackage.wut<? super T, ? extends defpackage.wud<? extends R>>) new defpackage.$$Lambda$unh$AyTHviyNu0R0DsH95KpFeNelukI<java.lang.Object,java.lang.Object>(r2, r3, r12)).d((defpackage.wut<? super T, ? extends defpackage.wud<? extends R>>) new defpackage.$$Lambda$unh$70ehpT2jDMEdRTRqV_SFiC4aYBY<java.lang.Object,java.lang.Object>(r2, r9, r12)).d((defpackage.wut<? super T, ? extends defpackage.wud<? extends R>>) new defpackage.$$Lambda$unh$Xgygoxak9XbLrrTmGieGwBLJ8bE<java.lang.Object,java.lang.Object>(r2, r3, r9, r12)).d((defpackage.wut<? super T, ? extends defpackage.wud<? extends R>>) new defpackage.$$Lambda$unh$7PD_byDJatZcQ7Xavd403AYMAo8<java.lang.Object,java.lang.Object>(r2, r9, r12)).a(defpackage.vun.a(r2.s.c())).a((defpackage.wun<? super T>) defpackage.$$Lambda$unh$tiO4wJSz44LftxeCHuz7EUx7M.INSTANCE, (defpackage.wun<java.lang.Throwable>) new defpackage.$$Lambda$unh$11XM8YeAFmxsowGSp_dDVbPiBdM<java.lang.Throwable>(r2)))
                            return
                        L_0x0165:
                            unh$1 r2 = defpackage.unh.AnonymousClass1.this
                            unh r2 = defpackage.unh.this
                            snp r2 = r2.l
                            com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r3 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.DID_NOT_UNDERSTAND
                            unh$1 r4 = defpackage.unh.AnonymousClass1.this
                            unh r4 = defpackage.unh.this
                            fpt r4 = r4.m
                            ulm$a r13 = defpackage.ulm.a.a
                            unh$1 r6 = defpackage.unh.AnonymousClass1.this
                            unh r6 = defpackage.unh.this
                            boolean r14 = r6.i
                            r15 = 0
                            r16 = 0
                            r18 = 0
                            r17 = r1
                            android.os.Bundle r1 = defpackage.umi.a(r13, r14, r15, r16, r17, r18)
                            r2.a(r3, r4, r5, r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.unh.AnonymousClass1.AnonymousClass5.accept(java.lang.Object):void");
                    }
                });
            }

            public final void onCompleted() {
                unh.this.w = false;
                Logger.b("onCompleted() QUERY: %s", unh.this.e);
            }

            public final void onError(Throwable th) {
                VoiceInteractionViewState voiceInteractionViewState;
                Logger.e(th, "onError() last state=%s", unh.this.C);
                if (th instanceof TimeoutException) {
                    unh.this.w = false;
                    Logger.b(th, "Timed out waiting for next state, last state=%s", unh.this.C);
                    if (unh.this.C != null && (unh.this.C instanceof d)) {
                        unh.b(unh.this);
                        unh unh = unh.this;
                        unh.f = true;
                        unh.l.a(VoiceInteractionViewState.TOO_MUCH_SILENCE, unh.this.m, null, umi.a(defpackage.ulm.a.a, unh.this.i, unh.this.x ? null : "NoAudioDataSentError", null, null, null));
                    } else if (!unh.this.f) {
                        unh unh2 = unh.this;
                        unh2.f = true;
                        unh.this.l.a((unh2.C == null || !unh.this.C.a()) ? VoiceInteractionViewState.CONNECTION_ERROR : VoiceInteractionViewState.SPEECH_RECOGNITION_FAIL, unh.this.m, null, umi.a(defpackage.ulm.a.a, unh.this.i, null, null, null, null));
                    }
                } else {
                    boolean z = th instanceof IOException;
                    if (!z || unh.this.w) {
                        unh.this.w = false;
                        unh.this.c();
                        unh.this.f = true;
                        if (z) {
                            voiceInteractionViewState = VoiceInteractionViewState.CONNECTION_ERROR;
                        } else {
                            voiceInteractionViewState = VoiceInteractionViewState.APP_ERROR;
                        }
                        unh.this.l.a(voiceInteractionViewState, unh.this.m, null, umi.a(defpackage.ulm.a.a, unh.this.i, th.getMessage(), null, null, null));
                    } else {
                        unh.this.d.a(unh.this.y, VoiceInteractionViewState.CONNECTION_ERROR.name(), th.getMessage(), false);
                        unh.this.w = true;
                        unh.this.a();
                        unh.this.h.c();
                    }
                }
            }
        };
        this.E = new wue<Float>() {
            public final void onCompleted() {
            }

            public final /* synthetic */ void onNext(Object obj) {
                Float f = (Float) obj;
                if (!unh.this.A) {
                    unh unh = unh.this;
                    unh.d.a(unh.u.a, ViewUris.bV.toString(), "", "start_audio_capture", 0, "page");
                    unh.this.A = true;
                }
                if (f.floatValue() != 0.0f) {
                    unh.this.x = true;
                }
                unh.this.h.a(f.floatValue());
            }

            public final void onError(Throwable th) {
                unh.this.h.a(0.0f);
            }
        };
        this.j = vun.a((wrf<T>) vos.a());
        this.b = player;
        this.k = wud;
        this.l = snp;
        this.m = fpt;
        this.n = ula;
        this.c = rda;
        this.d = ulk;
        this.o = uks;
        this.p = spSharedPreferences;
        this.q = jrp;
        this.t = ulq;
        this.r = wut;
        this.s = heg;
        this.u = umz;
        this.v = objectMapper;
    }

    public void a() {
        this.y = "NOT_SET";
        this.A = false;
        this.B = false;
        if (!this.g.isUnsubscribed()) {
            this.g.a();
            c();
        }
        this.g.a(this.k.a(1).c((wut<? super T, Boolean>) $$Lambda$unh$oKL8VrHfpcxENbJj_iDGvLbXrlE.INSTANCE).a((wun<? super T>) new $$Lambda$unh$_vDyeNDfpFmVv7mS90a_0nRqMKU<Object>(this), (wun<Throwable>) $$Lambda$unh$VammMxwelGvIJvF6oS13Kc3A1Rk.INSTANCE));
        Player player = this.b;
        player.getClass();
        this.g.a(wub.a((wum) new $$Lambda$mS98PPQuSOatkScnhz94MwmgXR8(player)).b(this.j).l(this.r).a(vun.a(this.s.c())).a(this.D));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(PlayerState playerState) {
        return Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.i = true;
    }

    public void b() {
        this.g.a(this.t.a().a(vun.a(this.s.c())).a((wun<? super T>) new $$Lambda$unh$IDkWUgQfv0uMKlF7Bg9YagemZpk<Object>(this), (wun<Throwable>) new $$Lambda$unh$A9aJhFaY_rv9rkaWFazfXcBSw<Throwable>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (str != null) {
            this.z = str;
            this.h.b(str);
            return;
        }
        Logger.e("No suggestion found.", new Object[0]);
        this.h.ah();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e("Error received: %s", th.getMessage());
        this.h.ah();
    }

    public void c() {
        this.h.a(0.0f);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        this.l.a(VoiceInteractionViewState.APP_ERROR, this.m, null, umi.a(defpackage.ulm.a.a, this.i, th.getMessage(), null, null, null));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ b a(b bVar, PlayerContext playerContext) {
        if (bVar.b.a() == null) {
            bVar.b = a.a(playerContext, false);
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Intent intent, jst jst, String str, b bVar) {
        Intent intent2 = intent;
        Logger.b("NLU executing intent=%s, link=%s", intent2, jst);
        Builder builder = new Builder();
        int i2 = AnonymousClass3.a[intent.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return ScalarSynchronousObservable.d(bVar);
        }
        if (intent2 == Intent.SHUFFLE_ON) {
            builder.playerOptionsOverride(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE);
        }
        if (jsu.a(jst)) {
            this.o.b.a(new String[]{jst.q()}, ViewUris.bV, false, true, -1, udt.aI, rju.B, null);
        } else if (jsu.b(jst)) {
            this.o.a();
        } else {
            PlayerContext a2 = bVar.b.a();
            if (a2 == null) {
                return ScalarSynchronousObservable.d(bVar);
            }
            this.b.playWithViewUri(a2, builder.build(), a2.uri());
            this.b.fetchState(new $$Lambda$unh$50bWeONhpJOgmiJiyi4A49e0(this, str, intent2));
            return ScalarSynchronousObservable.d(bVar);
        }
        b bVar2 = bVar;
        return ScalarSynchronousObservable.d(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Intent intent, PlayerState playerState) {
        this.d.a(str, intent, playerState);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b a(Intent intent, b bVar, defpackage.ulm.a aVar, PlayerTrack playerTrack) {
        b bVar2 = bVar;
        if (PlayerTrackUtil.isAd(playerTrack)) {
            Logger.b("Processed ad for Intent %s", intent.name());
            this.l.a();
            return bVar2;
        }
        snp snp = this.l;
        VoiceInteractionViewState voiceInteractionViewState = VoiceInteractionViewState.ASSISTANT;
        fpt fpt = this.m;
        boolean z2 = this.i;
        PlayerContext a2 = bVar2.b.a();
        boolean b2 = bVar2.b.b();
        Bundle a3 = umi.a(aVar, z2, null, intent, a2, null);
        a3.putBoolean("voice_is_qbd", b2);
        snp.a(voiceInteractionViewState, fpt, null, a3);
        Logger.b("Processed Intent %s", intent.name());
        return bVar2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(defpackage.ulm.a aVar, Intent intent, b bVar) {
        return this.k.a(2).a((defpackage.wud.b<? extends R, ? super T>) new wwi<Object,Object>(1)).f($$Lambda$s7vez6vRc_C5e28uHCZYajeVDaw.INSTANCE).a(vun.a(this.s.c())).f(new $$Lambda$unh$kr1J0gXzxnKb8mDfIKv0ugO45Y(this, intent, bVar, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(String str, defpackage.ulm.a aVar, Intent intent, b bVar) {
        if (bVar.a) {
            return ScalarSynchronousObservable.d(bVar);
        }
        jst jst = aVar.b;
        if (jst == null) {
            return ScalarSynchronousObservable.d(bVar);
        }
        return ((gst) this.o.a((jst) fay.a(jst)).a($$Lambda$unh$9d3gfRWyB7ItVmi8WXe54L0yJCw.INSTANCE)).resolve().f(new $$Lambda$unh$kWGj0MwALGG59yHaqFIbSJ70AEc(bVar)).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$unh$lzc0E0nLxPNrh7BFL3NciGU74s<Object,Object>(this, intent, jst, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud b(defpackage.ulm.a aVar, Intent intent, b bVar) {
        int i2 = AnonymousClass3.a[intent.ordinal()];
        if (i2 == 6 || i2 == 7) {
            jst jst = aVar.b;
            String q2 = jst != null ? jst.q() : null;
            if (bVar.b.a() != null) {
                this.l.a();
            } else {
                this.l.a(q2);
            }
            Logger.b("Processed Intent %s", intent.name());
            bVar.a = true;
            return ScalarSynchronousObservable.d(bVar);
        }
        bVar.a = false;
        return ScalarSynchronousObservable.d(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(String str, Intent intent, b bVar) {
        int i2 = AnonymousClass3.a[intent.ordinal()];
        if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5)) {
            this.d.a(str, intent, null);
        }
        return ScalarSynchronousObservable.d(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud b(String str, defpackage.ulm.a aVar, Intent intent, b bVar) {
        jst jst = aVar.b;
        if (jst != null && jst.b != LinkType.DUMMY) {
            return ScalarSynchronousObservable.d(bVar);
        }
        this.o.a(str, intent, this.i);
        this.l.a(VoiceInteractionViewState.ASSISTANT, this.m, null, umi.a(aVar, this.i, null, intent, bVar.b.a(), null));
        Logger.b("Processed intent %s", intent.name());
        bVar.a = true;
        return ScalarSynchronousObservable.d(bVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ b a(PlayerContext playerContext, defpackage.ulm.a aVar) {
        b bVar = new b(false);
        bVar.b = a.a(playerContext, true);
        return bVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Intent intent, defpackage.ulm.a aVar, defpackage.ulm.a aVar2) {
        switch (defpackage.uks.AnonymousClass2.a[intent.ordinal()]) {
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 3:
                if (fax.a(aVar.c)) {
                    return Boolean.FALSE;
                }
                break;
            case 4:
            case 5:
                if (aVar.b == null) {
                    return Boolean.FALSE;
                }
                break;
            default:
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    static /* synthetic */ void b(unh unh) {
        Logger.b("handling timeout!", new Object[0]);
        unh.d.a(unh.y, ViewUris.bV.toString(), "spotify:voice-assistant:listen_timeout", null, 0, InteractionIntent.UNKNOWN, InteractionType.UNKNOWN);
    }

    static /* synthetic */ void a(unh unh, String str, vri vri) {
        unh.e = str;
        unh.h.a(unh.e, vri instanceof defpackage.vri.b);
    }
}
