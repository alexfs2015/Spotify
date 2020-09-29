package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: ult reason: default package */
public final class ult {
    public ulv a;
    private final wug b;
    private jvr c;
    private final kxz d;
    private final ulk e;
    private final snp f;
    private final umz g;

    /* renamed from: ult$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[VoiceInteractionViewState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState[] r0 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r1 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.INTERACTION     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState r1 = com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState.ASSISTANT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ult.AnonymousClass1.<clinit>():void");
        }
    }

    public ult(jvr jvr, wug wug, kxz kxz, ulk ulk, snp snp, umz umz) {
        this.c = jvr;
        this.b = wug;
        this.d = kxz;
        this.e = ulk;
        this.f = snp;
        this.g = umz;
    }

    public final void a(ulv ulv, Activity activity, xag xag) {
        VoiceInteractionViewState b2 = this.f.b();
        this.a = ulv;
        xag.a(vun.a((ObservableSource<T>) this.d.a, BackpressureStrategy.BUFFER).b().a(this.b).a((wun<? super T>) new $$Lambda$ult$07cQ1IO8w2Ih4JhO2AlnKp566S8<Object>(this, b2, activity), (wun<Throwable>) new $$Lambda$ult$SOMJIP7rdDGynTwa4ViBNwq6Qw<Throwable>(this, b2, activity)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(VoiceInteractionViewState voiceInteractionViewState, Activity activity, kxx kxx) {
        if (voiceInteractionViewState != VoiceInteractionViewState.ASSISTANT) {
            if (!kxx.a()) {
                ulv ulv = this.a;
                if (ulv != null) {
                    ulv.k();
                }
            } else {
                a(activity);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(VoiceInteractionViewState voiceInteractionViewState, Activity activity, Throwable th) {
        Logger.e(th, "Unable to retrieve session state, assuming online.", new Object[0]);
        if (voiceInteractionViewState != VoiceInteractionViewState.ASSISTANT) {
            a(activity);
        }
    }

    private void a(Activity activity) {
        String str = "android.permission.RECORD_AUDIO";
        if (!this.c.a((Context) activity, str)) {
            this.c.a(activity, str);
            return;
        }
        a();
    }

    public void a() {
        ulv ulv = this.a;
        if (ulv != null) {
            ulv.m();
        }
    }

    private String b() {
        VoiceInteractionViewState b2 = this.f.b();
        if (b2 != null) {
            int i = AnonymousClass1.a[b2.ordinal()];
            if (i == 1) {
                return ViewUris.bV.toString();
            }
            if (i != 2) {
                return ViewUris.bZ.toString();
            }
            return ViewUris.bW.toString();
        }
        Logger.e("Invalid view state; can't log interaction.", new Object[0]);
        return null;
    }

    public void a(String str, InteractionIntent interactionIntent) {
        String b2 = b();
        if (b2 != null) {
            a(b2, str, interactionIntent);
        }
    }

    private void a(String str, String str2, InteractionIntent interactionIntent) {
        this.e.a(this.g.a, str, ViewUris.bV.toString(), str2, 0, interactionIntent, InteractionType.TAP);
    }
}
