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

/* renamed from: uyl reason: default package */
public final class uyl {
    public static final com.spotify.mobile.android.util.prefs.SpSharedPreferences.b<Object, Boolean> a = com.spotify.mobile.android.util.prefs.SpSharedPreferences.b.b("voice_consent_accepted");
    /* access modifiers changed from: private */
    public boolean A;
    /* access modifiers changed from: private */
    public boolean B;
    /* access modifiers changed from: private */
    public weq C;
    private final xij<weq> D;
    /* access modifiers changed from: private */
    public final xij<Float> E;
    public final Player b;
    public final rly c;
    public final uwo d;
    String e;
    public volatile boolean f;
    public xok g;
    public uym h;
    public boolean i;
    private final xii<weq> j;
    private final xii<PlayerState> k;
    /* access modifiers changed from: private */
    public final sxw l;
    /* access modifiers changed from: private */
    public final fqn m;
    /* access modifiers changed from: private */
    public final uwe n;
    /* access modifiers changed from: private */
    public final uvy o;
    /* access modifiers changed from: private */
    public final SpSharedPreferences<Object> p;
    /* access modifiers changed from: private */
    public final jtz q;
    private final xiy<weq, xii<Long>> r;
    /* access modifiers changed from: private */
    public final hhc s;
    private final uwu t;
    /* access modifiers changed from: private */
    public final uyd u;
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

    /* renamed from: uyl$3 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uyl.AnonymousClass3.<clinit>():void");
        }
    }

    /* renamed from: uyl$a */
    static abstract class a {
        a() {
        }

        static a a(PlayerContext playerContext, boolean z) {
            return new uyc(playerContext, z);
        }

        /* access modifiers changed from: 0000 */
        public abstract PlayerContext a();

        /* access modifiers changed from: 0000 */
        public abstract boolean b();
    }

    /* renamed from: uyl$b */
    public static class b {
        boolean a;
        a b;

        public b(boolean z) {
            this.a = z;
        }
    }

    public uyl(wca wca, Player player, xii<PlayerState> xii, sxw sxw, fqn fqn, uwe uwe, rly rly, uwo uwo, uvy uvy, SpSharedPreferences<Object> spSharedPreferences, jtz jtz, uwu uwu, xiy<weq, xii<Long>> xiy, hhc hhc, uyd uyd, ObjectMapper objectMapper) {
        String str = "";
        this.e = str;
        this.z = str;
        this.D = new xij<weq>() {
            public final void onCompleted() {
                uyl.this.w = false;
                Logger.b("onCompleted() QUERY: %s", uyl.this.e);
            }

            public final void onError(Throwable th) {
                Logger.e(th, "onError() last state=%s", uyl.this.C);
                if (th instanceof TimeoutException) {
                    uyl.this.w = false;
                    Logger.b(th, "Timed out waiting for next state, last state=%s", uyl.this.C);
                    if (uyl.this.C != null && (uyl.this.C instanceof d)) {
                        uyl.b(uyl.this);
                        uyl uyl = uyl.this;
                        uyl.f = true;
                        uyl.l.a(VoiceInteractionViewState.TOO_MUCH_SILENCE, uyl.this.m, null, uxm.a(defpackage.uwq.a.a, uyl.this.i, uyl.this.x ? null : "NoAudioDataSentError", null, null, null));
                    } else if (!uyl.this.f) {
                        uyl uyl2 = uyl.this;
                        uyl2.f = true;
                        uyl.this.l.a((uyl2.C == null || !uyl.this.C.a()) ? VoiceInteractionViewState.CONNECTION_ERROR : VoiceInteractionViewState.SPEECH_RECOGNITION_FAIL, uyl.this.m, null, uxm.a(defpackage.uwq.a.a, uyl.this.i, null, null, null, null));
                    }
                } else {
                    boolean z = th instanceof IOException;
                    if (!z || uyl.this.w) {
                        uyl.this.w = false;
                        uyl.this.c();
                        uyl.this.f = true;
                        uyl.this.l.a(z ? VoiceInteractionViewState.CONNECTION_ERROR : VoiceInteractionViewState.APP_ERROR, uyl.this.m, null, uxm.a(defpackage.uwq.a.a, uyl.this.i, th.getMessage(), null, null, null));
                    } else {
                        uyl.this.d.a(uyl.this.y, VoiceInteractionViewState.CONNECTION_ERROR.name(), th.getMessage(), false);
                        uyl.this.w = true;
                        uyl.this.a();
                        uyl.this.h.c();
                    }
                }
            }

            public final /* synthetic */ void onNext(Object obj) {
                weq weq = (weq) obj;
                uyl.this.C = weq;
                Logger.b("Voice Session State: %s", uyl.this.C);
                weq.a((ged<c>) new ged<c>() {
                    public final /* synthetic */ void accept(Object obj) {
                        c cVar = (c) obj;
                        uyl.this.n.b();
                        uyl.this.y = cVar.a;
                        uyl.this.u.a = uyl.this.y;
                        if (!uyl.this.p.a(uyl.a, false)) {
                            uwo i = uyl.this.d;
                            String h = uyl.this.y;
                            long a2 = uyl.this.q.a();
                            Logger.a("Logging Voice Consent %s %d true", h, Long.valueOf(a2));
                            i.a.a(new bo(h, a2, true));
                            uyl.this.p.a().a(uyl.a, true).b();
                        }
                        uyl.this.d.a(uyl.this.y, ViewUris.bW.toString(), ViewUris.bU.toString(), uyl.this.z, 0, "page");
                    }
                }, (ged<d>) new ged<d>() {
                    public final /* synthetic */ void accept(Object obj) {
                        uyl.this.g.a(wit.a((xfk<T>) ((d) obj).a.a(uyl.this.s.c())).a(uyl.this.E));
                        uyl uyl = uyl.this;
                        String h = uyl.this.y;
                        sso sso = ViewUris.bU;
                        uyl.d.a(h, sso.toString(), sso.toString(), "listening-screen", 0, "page");
                        uyl.this.e = "";
                        uyl.this.h.ak();
                    }
                }, (ged<defpackage.weq.b>) new ged<defpackage.weq.b>() {
                    public final /* synthetic */ void accept(Object obj) {
                        defpackage.weq.b bVar = (defpackage.weq.b) obj;
                        if (!uyl.this.B) {
                            uyl.this.d.a(uyl.this.y, ViewUris.bU.toString(), "", "intermediate_transcript", 0, "page");
                            uyl.this.B = true;
                        }
                        uyl.a(uyl.this, bVar.a.transcript(), (weq) bVar);
                    }
                }, (ged<defpackage.weq.a>) new ged<defpackage.weq.a>() {
                    public final /* synthetic */ void accept(Object obj) {
                        defpackage.weq.a aVar = (defpackage.weq.a) obj;
                        uyl.a(uyl.this, aVar.a.transcript(), (weq) aVar);
                    }
                }, (ged<e>) new ged<e>() {
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
                            weq$e r1 = (defpackage.weq.e) r1
                            uyl$1 r2 = defpackage.uyl.AnonymousClass1.this
                            uyl r2 = defpackage.uyl.this
                            r3 = 1
                            r2.f = r3
                            uyl$1 r2 = defpackage.uyl.AnonymousClass1.this
                            uyl r2 = defpackage.uyl.this
                            uyl$1 r4 = defpackage.uyl.AnonymousClass1.this
                            uyl r4 = defpackage.uyl.this
                            java.lang.String r4 = r4.y
                            sso r5 = com.spotify.music.libs.viewuri.ViewUris.bU
                            java.lang.String r6 = ""
                            java.lang.String r7 = "nlu-result"
                            r2.d.a(r4, r5.toString(), r6, r7, 0, "page")
                            uyl$1 r2 = defpackage.uyl.AnonymousClass1.this
                            uyl r2 = defpackage.uyl.this
                            com.fasterxml.jackson.databind.ObjectMapper r2 = r2.v
                            com.fasterxml.jackson.databind.JsonNode r4 = r1.a
                            java.lang.Class<com.spotify.voice.api.model.VoiceViewResponse> r5 = com.spotify.voice.api.model.VoiceViewResponse.class
                            java.lang.Object r2 = r2.convertValue(r4, r5)
                            com.spotify.voice.api.model.VoiceViewResponse r2 = (com.spotify.voice.api.model.VoiceViewResponse) r2
                            com.spotify.voice.api.model.VoiceViewResponse$Custom r4 = r2.custom()
                            r5 = 0
                            if (r4 != 0) goto L_0x0063
                            uyl$1 r1 = defpackage.uyl.AnonymousClass1.this
                            uyl r1 = defpackage.uyl.this
                            sxw r1 = r1.l
                            com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r2 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.DID_NOT_UNDERSTAND
                            uyl$1 r3 = defpackage.uyl.AnonymousClass1.this
                            uyl r3 = defpackage.uyl.this
                            fqn r3 = r3.m
                            uwq$a r6 = defpackage.uwq.a.a
                            uyl$1 r4 = defpackage.uyl.AnonymousClass1.this
                            uyl r4 = defpackage.uyl.this
                            boolean r7 = r4.i
                            r8 = 0
                            r9 = 0
                            r10 = 0
                            r11 = 0
                            android.os.Bundle r4 = defpackage.uxm.a(r6, r7, r8, r9, r10, r11)
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
                            com.spotify.voice.api.model.VoiceViewResponse$Body r2 = (com.spotify.voice.api.model.VoiceViewResponse.Body) r2
                            if (r2 != 0) goto L_0x0096
                            uwq$a r2 = defpackage.uwq.a.a
                            goto L_0x00dd
                        L_0x0096:
                            com.spotify.voice.api.model.VoiceViewResponse$Body$Target r7 = r2.target()
                            if (r7 == 0) goto L_0x009e
                            r9 = 1
                            goto L_0x009f
                        L_0x009e:
                            r9 = 0
                        L_0x009f:
                            uwq$a r10 = new uwq$a
                            if (r9 == 0) goto L_0x00ac
                            java.lang.String r7 = r7.uri()
                            jva r7 = defpackage.jva.a(r7)
                            goto L_0x00ad
                        L_0x00ac:
                            r7 = r5
                        L_0x00ad:
                            com.spotify.voice.api.model.VoiceViewResponse$Body$Images r9 = r2.images()
                            if (r9 != 0) goto L_0x00b5
                        L_0x00b3:
                            r9 = r5
                            goto L_0x00c0
                        L_0x00b5:
                            com.spotify.voice.api.model.VoiceViewResponse$Body$Images$Image r9 = r9.main()
                            if (r9 != 0) goto L_0x00bc
                            goto L_0x00b3
                        L_0x00bc:
                            java.lang.String r9 = r9.uri()
                        L_0x00c0:
                            com.spotify.voice.api.model.VoiceViewResponse$Body$Text r11 = r2.text()
                            if (r11 == 0) goto L_0x00cb
                            java.lang.String r11 = r11.title()
                            goto L_0x00cc
                        L_0x00cb:
                            r11 = r6
                        L_0x00cc:
                            com.spotify.voice.api.model.VoiceViewResponse$Body$Text r2 = r2.text()
                            if (r2 == 0) goto L_0x00d6
                            java.lang.String r6 = r2.subtitle()
                        L_0x00d6:
                            r10.<init>(r7, r9, r11, r6)
                            r9 = r10
                            goto L_0x00de
                        L_0x00db:
                            uwq$a r2 = defpackage.uwq.a.a
                        L_0x00dd:
                            r9 = r2
                        L_0x00de:
                            com.spotify.voice.api.model.VoiceViewResponse$Custom$Restriction r2 = r4.restriction()
                            if (r2 == 0) goto L_0x0115
                            uyl$1 r3 = defpackage.uyl.AnonymousClass1.this
                            uyl r3 = defpackage.uyl.this
                            sxw r3 = r3.l
                            java.lang.String r4 = r2.heading()
                            java.lang.String r15 = r2.detail()
                            java.lang.String r16 = r2.detail()
                            uyl$1 r2 = defpackage.uyl.AnonymousClass1.this
                            uyl r2 = defpackage.uyl.this
                            fqn r17 = r2.m
                            uyl$1 r2 = defpackage.uyl.AnonymousClass1.this
                            uyl r2 = defpackage.uyl.this
                            boolean r10 = r2.i
                            r11 = 0
                            r14 = 0
                            r13 = r1
                            android.os.Bundle r18 = defpackage.uxm.a(r9, r10, r11, r12, r13, r14)
                            r13 = r3
                            r14 = r4
                            r13.a(r14, r15, r16, r17, r18)
                            return
                        L_0x0115:
                            java.lang.String r2 = r4.error()
                            java.lang.String r6 = r4.friendlyError()
                            boolean r4 = defpackage.fbo.a(r2)
                            if (r4 != 0) goto L_0x0140
                            boolean r4 = defpackage.fbo.a(r6)
                            if (r4 != 0) goto L_0x0140
                            uyl$1 r1 = defpackage.uyl.AnonymousClass1.this
                            uyl r1 = defpackage.uyl.this
                            sxw r5 = r1.l
                            r7 = 0
                            uyl$1 r1 = defpackage.uyl.AnonymousClass1.this
                            uyl r1 = defpackage.uyl.this
                            fqn r9 = r1.m
                            r10 = 0
                            r8 = r2
                            r5.a(r6, r7, r8, r9, r10)
                            return
                        L_0x0140:
                            uyl$1 r2 = defpackage.uyl.AnonymousClass1.this
                            uyl r2 = defpackage.uyl.this
                            r2.o
                            int[] r2 = defpackage.uvy.AnonymousClass2.a
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
                            uyl$1 r2 = defpackage.uyl.AnonymousClass1.this
                            uyl r2 = defpackage.uyl.this
                            uyl$1 r3 = defpackage.uyl.AnonymousClass1.this
                            uyl r3 = defpackage.uyl.this
                            java.lang.String r3 = r3.y
                            r2.g.a(rx.internal.util.ScalarSynchronousObservable.d(r9).c((defpackage.xiy<? super T, java.lang.Boolean>) new defpackage.$$Lambda$uyl$XNr7OPO1OleMfNNw1tOc3qYrcFk<java.lang.Object,java.lang.Boolean>(r12, r9)).e((defpackage.xiy<? super T, ? extends R>) new defpackage.$$Lambda$uyl$romF1v3XcODGwmccc_ZsLuTsHw4<java.lang.Object,java.lang.Object>(r1)).a(defpackage.wit.a(r2.s.c())).d((defpackage.xiy<? super T, ? extends defpackage.xii<? extends R>>) new defpackage.$$Lambda$uyl$hwhC52WlzmRtzB8Jovg5cP9R7zE<java.lang.Object,java.lang.Object>(r2, r3, r9, r12)).d((defpackage.xiy<? super T, ? extends defpackage.xii<? extends R>>) new defpackage.$$Lambda$uyl$K9TCQmGgJKmEDyQOOPc09KGLWw<java.lang.Object,java.lang.Object>(r2, r3, r12)).d((defpackage.xiy<? super T, ? extends defpackage.xii<? extends R>>) new defpackage.$$Lambda$uyl$Q2wLzOdJSvXxZwW0xkvWy9PhDo<java.lang.Object,java.lang.Object>(r2, r9, r12)).d((defpackage.xiy<? super T, ? extends defpackage.xii<? extends R>>) new defpackage.$$Lambda$uyl$7NTrpKiln5EevxP6pyT0y1w7tCA<java.lang.Object,java.lang.Object>(r2, r3, r9, r12)).d((defpackage.xiy<? super T, ? extends defpackage.xii<? extends R>>) new defpackage.$$Lambda$uyl$vhrGO5JG52rb7B7vaEDoRbHLZFk<java.lang.Object,java.lang.Object>(r2, r9, r12)).a(defpackage.wit.a(r2.s.c())).a((defpackage.xis<? super T>) defpackage.$$Lambda$uyl$uE11qagTcA8uRFj0GXfJCPhSP68.INSTANCE, (defpackage.xis<java.lang.Throwable>) new defpackage.$$Lambda$uyl$dsRwEPOubnm8YKK8rbo9spXvG38<java.lang.Throwable>(r2)))
                            return
                        L_0x0165:
                            uyl$1 r2 = defpackage.uyl.AnonymousClass1.this
                            uyl r2 = defpackage.uyl.this
                            sxw r2 = r2.l
                            com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r3 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.DID_NOT_UNDERSTAND
                            uyl$1 r4 = defpackage.uyl.AnonymousClass1.this
                            uyl r4 = defpackage.uyl.this
                            fqn r4 = r4.m
                            uwq$a r13 = defpackage.uwq.a.a
                            uyl$1 r6 = defpackage.uyl.AnonymousClass1.this
                            uyl r6 = defpackage.uyl.this
                            boolean r14 = r6.i
                            r15 = 0
                            r16 = 0
                            r18 = 0
                            r17 = r1
                            android.os.Bundle r1 = defpackage.uxm.a(r13, r14, r15, r16, r17, r18)
                            r2.a(r3, r4, r5, r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyl.AnonymousClass1.AnonymousClass5.accept(java.lang.Object):void");
                    }
                });
            }
        };
        this.E = new xij<Float>() {
            public final void onCompleted() {
            }

            public final void onError(Throwable th) {
                uyl.this.h.a(0.0f);
            }

            public final /* synthetic */ void onNext(Object obj) {
                Float f = (Float) obj;
                if (!uyl.this.A) {
                    uyl uyl = uyl.this;
                    uyl.d.a(uyl.u.a, ViewUris.bU.toString(), "", "start_audio_capture", 0, "page");
                    uyl.this.A = true;
                }
                if (f.floatValue() != 0.0f) {
                    uyl.this.x = true;
                }
                uyl.this.h.a(f.floatValue());
            }
        };
        this.j = wit.a((xfk<T>) wca.a());
        this.b = player;
        this.k = xii;
        this.l = sxw;
        this.m = fqn;
        this.n = uwe;
        this.c = rly;
        this.d = uwo;
        this.o = uvy;
        this.p = spSharedPreferences;
        this.q = jtz;
        this.t = uwu;
        this.r = xiy;
        this.s = hhc;
        this.u = uyd;
        this.v = objectMapper;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(Intent intent, defpackage.uwq.a aVar, defpackage.uwq.a aVar2) {
        switch (defpackage.uvy.AnonymousClass2.a[intent.ordinal()]) {
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
                if (fbo.a(aVar.c)) {
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

    /* access modifiers changed from: private */
    public static /* synthetic */ b a(PlayerContext playerContext, defpackage.uwq.a aVar) {
        b bVar = new b(false);
        bVar.b = a.a(playerContext, true);
        return bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ b a(Intent intent, b bVar, defpackage.uwq.a aVar, PlayerTrack playerTrack) {
        b bVar2 = bVar;
        if (PlayerTrackUtil.isAd(playerTrack)) {
            Logger.b("Processed ad for Intent %s", intent.name());
            this.l.a();
            return bVar2;
        }
        sxw sxw = this.l;
        VoiceInteractionViewState voiceInteractionViewState = VoiceInteractionViewState.ASSISTANT;
        fqn fqn = this.m;
        boolean z2 = this.i;
        PlayerContext a2 = bVar2.b.a();
        boolean b2 = bVar2.b.b();
        Bundle a3 = uxm.a(aVar, z2, null, intent, a2, null);
        a3.putBoolean("voice_is_qbd", b2);
        sxw.a(voiceInteractionViewState, fqn, null, a3);
        Logger.b("Processed Intent %s", intent.name());
        return bVar2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ b a(b bVar, PlayerContext playerContext) {
        if (bVar.b.a() == null) {
            bVar.b = a.a(playerContext, false);
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Intent intent, jva jva, String str, b bVar) {
        Intent intent2 = intent;
        Logger.b("NLU executing intent=%s, link=%s", intent2, jva);
        Builder builder = new Builder();
        int i2 = AnonymousClass3.a[intent.ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            return ScalarSynchronousObservable.d(bVar);
        }
        if (intent2 == Intent.SHUFFLE_ON) {
            builder.playerOptionsOverride(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE);
        }
        if (jvb.a(jva)) {
            this.o.b.a(new String[]{jva.q()}, ViewUris.bU, false, true, -1, uqo.aI, rta.B, null);
        } else if (jvb.b(jva)) {
            this.o.a();
        } else {
            PlayerContext a2 = bVar.b.a();
            if (a2 == null) {
                return ScalarSynchronousObservable.d(bVar);
            }
            this.b.playWithViewUri(a2, builder.build(), a2.uri());
            this.b.fetchState(new $$Lambda$uyl$GPIIMZKY_4uOJZTKrz5Dvah4CiI(this, str, intent2));
            return ScalarSynchronousObservable.d(bVar);
        }
        b bVar2 = bVar;
        return ScalarSynchronousObservable.d(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(String str, Intent intent, b bVar) {
        int i2 = AnonymousClass3.a[intent.ordinal()];
        if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5)) {
            this.d.a(str, intent, null);
        }
        return ScalarSynchronousObservable.d(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(String str, defpackage.uwq.a aVar, Intent intent, b bVar) {
        if (bVar.a) {
            return ScalarSynchronousObservable.d(bVar);
        }
        jva jva = aVar.b;
        return jva == null ? ScalarSynchronousObservable.d(bVar) : ((gus) this.o.a((jva) fbp.a(jva)).a($$Lambda$uyl$aVEgRJbdBPWB9CDK8R3NL8_ChAE.INSTANCE)).resolve().e((xiy<? super T, ? extends R>) new $$Lambda$uyl$WAK_R0rKzyMOvk6bVz83oYA19k<Object,Object>(bVar)).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$uyl$037RJuiuAJoO5fa5O4Pe81YqRGs<Object,Object>(this, intent, jva, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(defpackage.uwq.a aVar, Intent intent, b bVar) {
        return this.k.a(2).a((defpackage.xii.b<? extends R, ? super T>) new xkn<Object,Object>(1)).e((xiy<? super T, ? extends R>) $$Lambda$CU4HsHLF6o7BOT68dmlohDtLFvQ.INSTANCE).a(wit.a(this.s.c())).e((xiy<? super T, ? extends R>) new $$Lambda$uyl$BS_CosocHKQwxNzWh04ov6KOVAo<Object,Object>(this, intent, bVar, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.i = true;
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
    public /* synthetic */ void a(String str, Intent intent, PlayerState playerState) {
        this.d.a(str, intent, playerState);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e(th.getMessage(), new Object[0]);
        this.l.a(VoiceInteractionViewState.APP_ERROR, this.m, null, uxm.a(defpackage.uwq.a.a, this.i, th.getMessage(), null, null, null));
    }

    static /* synthetic */ void a(uyl uyl, String str, weq weq) {
        uyl.e = str;
        uyl.h.a(uyl.e, weq instanceof defpackage.weq.b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean b(PlayerState playerState) {
        return Boolean.valueOf(playerState.isPlaying() && !playerState.isPaused());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii b(String str, defpackage.uwq.a aVar, Intent intent, b bVar) {
        jva jva = aVar.b;
        if (jva != null && jva.b != LinkType.DUMMY) {
            return ScalarSynchronousObservable.d(bVar);
        }
        this.o.a(str, intent, this.i);
        this.l.a(VoiceInteractionViewState.ASSISTANT, this.m, null, uxm.a(aVar, this.i, null, intent, bVar.b.a(), null));
        Logger.b("Processed intent %s", intent.name());
        bVar.a = true;
        return ScalarSynchronousObservable.d(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii b(defpackage.uwq.a aVar, Intent intent, b bVar) {
        int i2 = AnonymousClass3.a[intent.ordinal()];
        if (i2 == 6 || i2 == 7) {
            jva jva = aVar.b;
            String q2 = jva != null ? jva.q() : null;
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
    public /* synthetic */ void b(Throwable th) {
        Logger.e("Error received: %s", th.getMessage());
        this.h.ah();
    }

    static /* synthetic */ void b(uyl uyl) {
        Logger.b("handling timeout!", new Object[0]);
        uyl.d.a(uyl.y, ViewUris.bU.toString(), "spotify:voice-assistant:listen_timeout", null, 0, InteractionIntent.UNKNOWN, InteractionType.UNKNOWN);
    }

    public void a() {
        this.y = "NOT_SET";
        this.A = false;
        this.B = false;
        if (!this.g.isUnsubscribed()) {
            this.g.a();
            c();
        }
        this.g.a(this.k.a(1).c((xiy<? super T, Boolean>) $$Lambda$uyl$8Nl9Pv15F89WpiaeWxemq3ed0A.INSTANCE).a((xis<? super T>) new $$Lambda$uyl$qXcYAju9qFeTG5YChAxMQYSj5oU<Object>(this), (xis<Throwable>) $$Lambda$uyl$3ikDg8Nqg_vAcko3UltuH_mnfoA.INSTANCE));
        Player player = this.b;
        player.getClass();
        this.g.a(xig.a((xir) new $$Lambda$0TEI13EeHFuODNKX2O1DF5zlIPc(player)).b(this.j).j(this.r).a(wit.a(this.s.c())).a(this.D));
    }

    public void b() {
        this.g.a(this.t.a().a(wit.a(this.s.c())).a((xis<? super T>) new $$Lambda$uyl$5jlFh8hlVXVHkFAhswU9y7zoq8M<Object>(this), (xis<Throwable>) new $$Lambda$uyl$8tMwl8dPnY5Twqyh6ozX8iA8ws<Throwable>(this)));
    }

    public void c() {
        this.h.a(0.0f);
    }
}
