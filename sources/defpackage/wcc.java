package defpackage;

import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.qualifiers.VoiceConsumer;
import io.reactivex.Flowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: wcc reason: default package */
final class wcc implements wca {
    private final Flowable<weq> a;

    /* renamed from: wcc$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[VoiceConsumer.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.voice.api.qualifiers.VoiceConsumer[] r0 = com.spotify.voice.api.qualifiers.VoiceConsumer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.voice.api.qualifiers.VoiceConsumer r1 = com.spotify.voice.api.qualifiers.VoiceConsumer.VOICE_FEATURE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.voice.api.qualifiers.VoiceConsumer r1 = com.spotify.voice.api.qualifiers.VoiceConsumer.DEBUG     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.voice.api.qualifiers.VoiceConsumer r1 = com.spotify.voice.api.qualifiers.VoiceConsumer.VOICE_ADS_FEATURE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.voice.api.qualifiers.VoiceConsumer r1 = com.spotify.voice.api.qualifiers.VoiceConsumer.CAR_VIEW_FEATURE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wcc.AnonymousClass1.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if ("/v2/voice-ad/".equals(r1.b()) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if ("/v2/android/".equals(r1.b()) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if ("/v2/android-car-view/".equals(r1.b()) != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    wcc(java.lang.String r8, defpackage.xii<defpackage.weq> r9, defpackage.xii<?> r10, defpackage.wdx r11, defpackage.wep r12, io.reactivex.Observable<defpackage.lbg> r13, defpackage.jvq r14, defpackage.gcr<java.lang.Void, java.lang.Boolean> r15) {
        /*
            r7 = this;
            r7.<init>()
            com.spotify.voice.api.qualifiers.VoiceConsumer r0 = r12.b()
            wen r1 = r12.a()
            int[] r2 = defpackage.wcc.AnonymousClass1.a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L_0x0039
            r2 = 2
            if (r0 == r2) goto L_0x0039
            r2 = 3
            if (r0 == r2) goto L_0x002c
            r2 = 4
            if (r0 != r2) goto L_0x006d
            java.lang.String r0 = r1.b()
            java.lang.String r1 = "/v2/android-car-view/"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0045
        L_0x002c:
            java.lang.String r0 = r1.b()
            java.lang.String r1 = "/v2/voice-ad/"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
            goto L_0x0045
        L_0x0039:
            java.lang.String r0 = r1.b()
            java.lang.String r1 = "/v2/android/"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
        L_0x0045:
            r0 = 0
            io.reactivex.Single r13 = r13.a(r0)
            -$$Lambda$wcc$0uyH9dNCHbWoSffmLCY7PLIEqus r6 = new -$$Lambda$wcc$0uyH9dNCHbWoSffmLCY7PLIEqus
            r0 = r6
            r1 = r12
            r2 = r11
            r3 = r8
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            io.reactivex.Single r13 = r13.b(r6)
            -$$Lambda$wcc$4vRCf1iTcZ4Ru_oOLyDN6pynBFk r14 = new -$$Lambda$wcc$4vRCf1iTcZ4Ru_oOLyDN6pynBFk
            r0 = r14
            r1 = r15
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            io.reactivex.Flowable r8 = r13.b(r14)
            r7.a = r8
            return
        L_0x006d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Wrong endpoint for consumer, check with #quepasa & #rollsvoice"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcc.<init>(java.lang.String, xii, xii, wdx, wep, io.reactivex.Observable, jvq, gcr):void");
    }

    /* access modifiers changed from: private */
    public static Flowable<weq> a(String str, xii<weq> xii, xii<?> xii2, wdx wdx, wep wep) {
        Flowable a2 = Flowable.a((xfk<? extends T>) wit.a(xii2.a((b<? extends R, ? super T>) xkg.a())).a(weq.class), (xfk<? extends T>) wit.a(xii)).b((Predicate<? super T>) $$Lambda$XXM_YrPcyPKJmWoFOWATd8BdfNc.INSTANCE).c(weq.a(str)).a(Functions.b(), Functions.b(), (Action) new $$Lambda$wcc$jJ0VSP0OZQK_ZagYsL3rmQhmXhc(wep, wdx, str), Functions.b);
        $$Lambda$wcc$infxQgYGjSaXKZ1v3ACr_lQ6aM r5 = new $$Lambda$wcc$infxQgYGjSaXKZ1v3ACr_lQ6aM(wep, wdx, str);
        Consumer b = Functions.b();
        Action action = Functions.b;
        return a2.a(b, (Consumer<? super Throwable>) r5, action, action);
    }

    private static String a(Throwable th) {
        return th.getMessage() == null ? wel.a.toString() : th.getMessage();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xfk a(gcr gcr, String str, xii xii, xii xii2, wdx wdx, wep wep, lbg lbg) {
        if (!a(gcr)) {
            return Flowable.a((Throwable) new VoiceSessionException(ErrorDomain.MIC_PERMISSION, wel.l, new IllegalArgumentException("No mic permissions")));
        }
        $$Lambda$wcc$RrdvcfqmwJKPRfxnu8V12dnBY r0 = new $$Lambda$wcc$RrdvcfqmwJKPRfxnu8V12dnBY(str, xii, xii2, wdx, wep);
        $$Lambda$wcc$IzcURpB1GrdFoBbXN0Te1jBcbQ r02 = $$Lambda$wcc$IzcURpB1GrdFoBbXN0Te1jBcbQ.INSTANCE;
        $$Lambda$wcc$TyvlUYLx2NVnsWZrROEZsQSwJY r1 = new $$Lambda$wcc$TyvlUYLx2NVnsWZrROEZsQSwJY(str, xii, xii2, wdx, wep);
        return (xfk) lbg.a((gee<c, R_>) r0, (gee<b, R_>) r02, (gee<a, R_>) r1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(wep wep, wdx wdx, String str) {
        if (!wep.a().e()) {
            wdx.a(new a().a(str).b(wep.b().name()).a());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(wep wep, wdx wdx, String str, Throwable th) {
        if (!wep.a().e()) {
            if (th instanceof VoiceSessionException) {
                VoiceSessionException voiceSessionException = (VoiceSessionException) th;
                wdx.a(new a().a(str).b(wep.b().name()).a(voiceSessionException.mDomain).a(wel.a(voiceSessionException.mErrorType)).c(a(th)).a());
                return;
            }
            wdx.a(new a().a(str).b(wep.b().name()).a(ErrorDomain.UNKNOWN).a(wel.a).c(a(th)).a());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(wep wep, wdx wdx, String str, jvq jvq, gcr gcr, lbg lbg) {
        if (!wep.a().e()) {
            wdx.a(new a().a(str).b(wep.b().name()).c(jvq.b().a()).a(a(gcr)).b(lbg instanceof b).a());
        }
    }

    private static boolean a(gcr<Void, Boolean> gcr) {
        return ((Boolean) gcr.apply(null)).booleanValue();
    }

    public final Flowable<weq> a() {
        return this.a;
    }
}
