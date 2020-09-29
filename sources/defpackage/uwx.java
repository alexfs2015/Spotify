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

/* renamed from: uwx reason: default package */
public final class uwx {
    public uwz a;
    private final xil b;
    private jxz c;
    private final lbi d;
    private final uwo e;
    private final sxw f;
    private final uyd g;

    /* renamed from: uwx$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uwx.AnonymousClass1.<clinit>():void");
        }
    }

    public uwx(jxz jxz, xil xil, lbi lbi, uwo uwo, sxw sxw, uyd uyd) {
        this.c = jxz;
        this.b = xil;
        this.d = lbi;
        this.e = uwo;
        this.f = sxw;
        this.g = uyd;
    }

    private void a(Activity activity) {
        String str = "android.permission.RECORD_AUDIO";
        if (!this.c.a((Context) activity, str)) {
            this.c.a(activity, str);
            return;
        }
        a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(VoiceInteractionViewState voiceInteractionViewState, Activity activity, Throwable th) {
        Logger.e(th, "Unable to retrieve session state, assuming online.", new Object[0]);
        if (voiceInteractionViewState != VoiceInteractionViewState.ASSISTANT) {
            a(activity);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(VoiceInteractionViewState voiceInteractionViewState, Activity activity, lbg lbg) {
        if (voiceInteractionViewState != VoiceInteractionViewState.ASSISTANT) {
            if (!lbg.a()) {
                uwz uwz = this.a;
                if (uwz != null) {
                    uwz.k();
                }
            } else {
                a(activity);
            }
        }
    }

    private void a(String str, String str2, InteractionIntent interactionIntent) {
        this.e.a(this.g.a, str, ViewUris.bU.toString(), str2, 0, interactionIntent, InteractionType.TAP);
    }

    private String b() {
        VoiceInteractionViewState b2 = this.f.b();
        if (b2 != null) {
            int i = AnonymousClass1.a[b2.ordinal()];
            return i != 1 ? i != 2 ? ViewUris.bY.toString() : ViewUris.bV.toString() : ViewUris.bU.toString();
        }
        Logger.e("Invalid view state; can't log interaction.", new Object[0]);
        return null;
    }

    public void a() {
        uwz uwz = this.a;
        if (uwz != null) {
            uwz.m();
        }
    }

    public void a(String str, InteractionIntent interactionIntent) {
        String b2 = b();
        if (b2 != null) {
            a(b2, str, interactionIntent);
        }
    }

    public final void a(uwz uwz, Activity activity, xok xok) {
        VoiceInteractionViewState b2 = this.f.b();
        this.a = uwz;
        xok.a(wit.a((ObservableSource<T>) this.d.a, BackpressureStrategy.BUFFER).b().a(this.b).a((xis<? super T>) new $$Lambda$uwx$AopNwSOUWHsvDGsh5UGU0_wBXU4<Object>(this, b2, activity), (xis<Throwable>) new $$Lambda$uwx$3TwIeFYCU6JV8GE1AZnDlbHNvE<Throwable>(this, b2, activity)));
    }
}
