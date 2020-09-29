package defpackage;

import com.spotify.voice.VoiceSessionException;
import com.spotify.voice.model.ErrorDomain;
import com.spotify.voice.qualifiers.VoiceConsumer;
import io.reactivex.Flowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: vot reason: default package */
final class vot implements vos {
    private final Flowable<vri> a;

    /* renamed from: vot$1 reason: invalid class name */
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
                com.spotify.voice.qualifiers.VoiceConsumer[] r0 = com.spotify.voice.qualifiers.VoiceConsumer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.voice.qualifiers.VoiceConsumer r1 = com.spotify.voice.qualifiers.VoiceConsumer.VOICE_FEATURE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.voice.qualifiers.VoiceConsumer r1 = com.spotify.voice.qualifiers.VoiceConsumer.DEBUG     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.voice.qualifiers.VoiceConsumer r1 = com.spotify.voice.qualifiers.VoiceConsumer.VOICE_ADS_FEATURE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.voice.qualifiers.VoiceConsumer r1 = com.spotify.voice.qualifiers.VoiceConsumer.CAR_VIEW_FEATURE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vot.AnonymousClass1.<clinit>():void");
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
    vot(java.lang.String r8, defpackage.wud<defpackage.vri> r9, defpackage.wud<?> r10, defpackage.vqp r11, defpackage.vrh r12, io.reactivex.Observable<defpackage.kxx> r13, defpackage.jti r14, java.util.concurrent.Callable<java.lang.Boolean> r15) {
        /*
            r7 = this;
            r7.<init>()
            com.spotify.voice.qualifiers.VoiceConsumer r0 = r12.b()
            vrf r1 = r12.a()
            int[] r2 = defpackage.vot.AnonymousClass1.a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L_0x0039
            r2 = 2
            if (r0 == r2) goto L_0x0039
            r2 = 3
            if (r0 == r2) goto L_0x002c
            r2 = 4
            if (r0 != r2) goto L_0x006c
            java.lang.String r0 = r1.b()
            java.lang.String r1 = "/v2/android-car-view/"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            goto L_0x0045
        L_0x002c:
            java.lang.String r0 = r1.b()
            java.lang.String r1 = "/v2/voice-ad/"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
            goto L_0x0045
        L_0x0039:
            java.lang.String r0 = r1.b()
            java.lang.String r1 = "/v2/android/"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006c
        L_0x0045:
            r0 = 0
            io.reactivex.Single r13 = r13.a(r0)
            -$$Lambda$vot$dAffFgHBWPH63MoR13fCQ4ddlbg r6 = new -$$Lambda$vot$dAffFgHBWPH63MoR13fCQ4ddlbg
            r0 = r6
            r1 = r12
            r2 = r11
            r3 = r8
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            io.reactivex.Single r13 = r13.b(r6)
            -$$Lambda$vot$UOBKJxAZbDwJw9z8rhscN3fu4_c r14 = new -$$Lambda$vot$UOBKJxAZbDwJw9z8rhscN3fu4_c
            r0 = r14
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            io.reactivex.Flowable r8 = r13.b(r14)
            r7.a = r8
            return
        L_0x006c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Wrong endpoint for consumer, check with #quepasa & #rollsvoice"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vot.<init>(java.lang.String, wud, wud, vqp, vrh, io.reactivex.Observable, jti, java.util.concurrent.Callable):void");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(vrh vrh, vqp vqp, String str, jti jti, Callable callable, kxx kxx) {
        if (!vrh.a().e()) {
            vqp.a(new a().a(str).b(vrh.b().name()).c(jti.b().a()).a(((Boolean) callable.call()).booleanValue()).b(kxx instanceof b).a());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ wrf a(String str, wud wud, wud wud2, vqp vqp, vrh vrh, kxx kxx) {
        $$Lambda$vot$buuwDqB0k3yzmzNE3dxgdXKD2A r0 = new $$Lambda$vot$buuwDqB0k3yzmzNE3dxgdXKD2A(str, wud, wud2, vqp, vrh);
        $$Lambda$vot$p6N2uC2IY0lofgBvs3_1ylJ6Bmo r02 = $$Lambda$vot$p6N2uC2IY0lofgBvs3_1ylJ6Bmo.INSTANCE;
        $$Lambda$vot$IHTcKLWWAawxmFyn6aqhjeX058 r7 = new $$Lambda$vot$IHTcKLWWAawxmFyn6aqhjeX058(str, wud, wud2, vqp, vrh);
        return (Flowable) kxx.a((gct<c, R_>) r0, (gct<b, R_>) r02, (gct<a, R_>) r7);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(vrh vrh, vqp vqp, String str) {
        if (!vrh.a().e()) {
            vqp.a(new a().a(str).b(vrh.b().name()).a());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(vrh vrh, vqp vqp, String str, Throwable th) {
        if (!vrh.a().e()) {
            if (th instanceof VoiceSessionException) {
                VoiceSessionException voiceSessionException = (VoiceSessionException) th;
                vqp.a(new a().a(str).b(vrh.b().name()).a(voiceSessionException.mDomain).a(vrd.a(voiceSessionException.mErrorType)).c(a(th)).a());
                return;
            }
            vqp.a(new a().a(str).b(vrh.b().name()).a(ErrorDomain.UNKNOWN).a(vrd.a).c(a(th)).a());
        }
    }

    private static String a(Throwable th) {
        if (th.getMessage() == null) {
            return vrd.a.toString();
        }
        return th.getMessage();
    }

    public final Flowable<vri> a() {
        return this.a;
    }

    /* access modifiers changed from: private */
    public static Flowable<vri> a(String str, wud<vri> wud, wud<?> wud2, vqp vqp, vrh vrh) {
        Flowable a2 = Flowable.a((wrf<? extends T>) vun.a(wud2.a((b<? extends R, ? super T>) wwb.a())).a(vri.class), (wrf<? extends T>) vun.a(wud)).b((Predicate<? super T>) $$Lambda$1TjfAwaSQefzic90KKBn8YHRxE.INSTANCE).c(vri.a(str)).a(Functions.b(), Functions.b(), (Action) new $$Lambda$vot$CRSaQ2q7LL1OWqsDsmpcNmU2VW0(vrh, vqp, str), Functions.b);
        $$Lambda$vot$doODWNJKg64jH_OibTuPhAG30 r5 = new $$Lambda$vot$doODWNJKg64jH_OibTuPhAG30(vrh, vqp, str);
        Consumer b = Functions.b();
        Action action = Functions.b;
        return a2.a(b, (Consumer<? super Throwable>) r5, action, action);
    }
}
