package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType;
import com.spotify.music.ads.voice.domain.SpeechRecognitionErrorType;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import com.spotify.voice.model.VoiceViewResponse;
import com.spotify.voice.model.VoiceViewResponse.Custom;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: kny reason: default package */
public final class kny {

    /* renamed from: kny$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[SpeechRecognitionCommandType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType[] r0 = com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType r1 = com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType.START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType r1 = com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType.STOP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kny.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: kny$a */
    static class a {
        final vri a;
        final long b;

        a(vri vri, long j) {
            this.a = vri;
            this.b = j;
        }
    }

    public static ObservableTransformer<i, knt> a(Scheduler scheduler) {
        return new $$Lambda$kny$T0fJD310tl4bEsmG3NoKkRSRyKE(scheduler);
    }

    public static ObservableTransformer<h, knt> a(vos vos, Flowable<PlayerState> flowable, ObjectMapper objectMapper) {
        return new $$Lambda$kny$BUA2GNsoezWxJDSKGVGZtlel_A(vos, flowable, objectMapper);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(vos vos, Flowable flowable, ObjectMapper objectMapper, h hVar) {
        if (AnonymousClass1.a[hVar.a.ordinal()] != 1) {
            return Observable.c();
        }
        return vos.a().j().a((Predicate<? super T>) $$Lambda$kny$4IzQZFPW5dpHCgkg5QZyRO6CcU.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$kny$Hf4a3UWuJChRmBUJqjsasA8eSE<Object,Object>(flowable), false).c((Function<? super T, ? extends R>) new $$Lambda$kny$gL1UH99mmyaDYy_Aidm0ZZ0Ws<Object,Object>(objectMapper, hVar)).e((Function<? super Throwable, ? extends T>) $$Lambda$kny$CHUPrvr43QSkgQU1ChD1uAyyd4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(vri vri, PlayerState playerState) {
        return new a(vri, playerState.currentPlaybackPosition());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ knt a(ObjectMapper objectMapper, h hVar, a aVar) {
        Intent intent;
        vri vri = aVar.a;
        long j = aVar.b;
        Intent intent2 = hVar.b;
        if (vri instanceof c) {
            return new m(((c) vri).a);
        }
        if (!vri.b()) {
            return new l(j);
        }
        Custom custom = ((VoiceViewResponse) objectMapper.convertValue(((e) vri).a, VoiceViewResponse.class)).custom();
        if (custom == null) {
            intent = null;
        } else {
            intent = custom.intent();
        }
        if (intent == null) {
            return knt.a(SpeechRecognitionErrorType.NULL);
        }
        boolean z = true;
        Logger.b("[VoiceAd] Query: %s", custom.query());
        if (intent != intent2) {
            z = false;
        }
        return new j(z);
    }

    public static ObservableTransformer<defpackage.kns.a, knt> a(SlotApi slotApi) {
        return new $$Lambda$kny$x6QybLHV49KuIbldVTIpIKoFmY(slotApi);
    }

    public static ObservableTransformer<c, knt> a(kob kob) {
        return new $$Lambda$kny$0k883eu_Wkryqrl6lfPCPWIdVYg(kob);
    }

    public static Function<b, knt> a(Player player) {
        return new $$Lambda$kny$fCyJh05YlJtWRvdaCN47ZUGBFKQ(player);
    }

    public static Action b(Player player) {
        return new $$Lambda$kny$H7nQetKQZIH_yrHzkVzXZWZDHs(player);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ knt a(Player player, b bVar) {
        if (!jst.h(bVar.a)) {
            return new f();
        }
        String str = bVar.a;
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        PlayerContext createFromContextUrl = PlayerContext.createFromContextUrl(str, sb.toString());
        player.play((PlayerContext) fay.a(createFromContextUrl), new Builder().build());
        player.skipToNextTrack(true);
        return new c(true);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ knt b(Throwable th) {
        return new b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(vri vri) {
        return !(vri instanceof d);
    }
}
