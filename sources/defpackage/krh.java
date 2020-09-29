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
import com.spotify.voice.api.model.VoiceViewResponse;
import com.spotify.voice.api.model.VoiceViewResponse.Custom;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: krh reason: default package */
public final class krh {

    /* renamed from: krh$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.krh.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: krh$a */
    static class a {
        final weq a;
        final long b;

        a(weq weq, long j) {
            this.a = weq;
            this.b = j;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(wca wca, Flowable flowable, ObjectMapper objectMapper, h hVar) {
        return AnonymousClass1.a[hVar.a.ordinal()] != 1 ? Observable.c() : wca.a().j().a((Predicate<? super T>) $$Lambda$krh$hnrYJbM3V1vKvI6Oldz3PPCBeLk.INSTANCE).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$krh$CsStvZZJbyayPIjFGRnER9JUaS4<Object,Object>(flowable), false).c((Function<? super T, ? extends R>) new $$Lambda$krh$KRD177pRXa459xfQArCmjfLP05Q<Object,Object>(objectMapper, hVar)).e((Function<? super Throwable, ? extends T>) $$Lambda$krh$k2hzfK2IrQxaJpEN5sbLOXo01Ms.INSTANCE);
    }

    public static ObservableTransformer<defpackage.krb.a, krc> a(SlotApi slotApi) {
        return new $$Lambda$krh$b0b23DFGtVIWzw6MJIxwDPPMbtg(slotApi);
    }

    public static ObservableTransformer<i, krc> a(Scheduler scheduler) {
        return new $$Lambda$krh$4v87jolfoP8In_FMeZkYlZ0mqDI(scheduler);
    }

    public static ObservableTransformer<c, krc> a(krk krk) {
        return new $$Lambda$krh$WIvmQJRLUlg3Bh_QucVR3VKEEFU(krk);
    }

    public static ObservableTransformer<h, krc> a(wca wca, Flowable<PlayerState> flowable, ObjectMapper objectMapper) {
        return new $$Lambda$krh$XAf4wmPZnNRhHSgGwwqw6EGqutI(wca, flowable, objectMapper);
    }

    public static Function<b, krc> a(Player player) {
        return new $$Lambda$krh$kXzv2iNPWP1T0zNoVYv0TGOuXRs(player);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ krc a(ObjectMapper objectMapper, h hVar, a aVar) {
        weq weq = aVar.a;
        long j = aVar.b;
        Intent intent = hVar.b;
        if (weq instanceof c) {
            return new m(((c) weq).a);
        }
        if (!weq.b()) {
            return new l(j);
        }
        Custom custom = ((VoiceViewResponse) objectMapper.convertValue(((e) weq).a, VoiceViewResponse.class)).custom();
        Intent intent2 = custom == null ? null : custom.intent();
        if (intent2 == null) {
            return krc.a(SpeechRecognitionErrorType.NULL);
        }
        boolean z = true;
        Logger.b("[VoiceAd] Query: %s", custom.query());
        if (intent2 != intent) {
            z = false;
        }
        return new j(z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ krc a(Player player, b bVar) {
        if (!jva.h(bVar.a)) {
            return new f();
        }
        String str = bVar.a;
        StringBuilder sb = new StringBuilder("context://");
        sb.append(str);
        PlayerContext createFromContextUrl = PlayerContext.createFromContextUrl(str, sb.toString());
        player.play((PlayerContext) fbp.a(createFromContextUrl), new Builder().build());
        player.skipToNextTrack(true);
        return new c(true);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a a(weq weq, PlayerState playerState) {
        return new a(weq, playerState.currentPlaybackPosition());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(weq weq) {
        return !(weq instanceof d);
    }

    public static Action b(Player player) {
        return new $$Lambda$krh$_bfKE6JX01E_rn_ropBtDksMEe4(player);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ krc b(Throwable th) {
        return new b();
    }
}
