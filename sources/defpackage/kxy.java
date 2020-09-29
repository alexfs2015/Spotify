package defpackage;

import com.spotify.music.connection.OfflineReason;
import com.spotify.music.connection.OfflineState.State;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;

/* renamed from: kxy reason: default package */
public final class kxy {

    /* renamed from: kxy$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.connection.OfflineState$State[] r0 = com.spotify.music.connection.OfflineState.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.connection.OfflineState$State r1 = com.spotify.music.connection.OfflineState.State.OFFLINE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.connection.OfflineState$State r1 = com.spotify.music.connection.OfflineState.State.ONLINE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.connection.OfflineState$State r1 = com.spotify.music.connection.OfflineState.State.RECONNECTING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kxy.AnonymousClass1.<clinit>():void");
        }
    }

    public static Observable<kxx> a(Observable<State> observable, Observable<Boolean> observable2) {
        return Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) observable2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$kxy$mljsejcK50w3Cg1tNlRaM9Oeatw.INSTANCE).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static kxx a(State state, boolean z) {
        if (state == State.FORCED_OFFLINE) {
            return kxx.a(OfflineReason.FORCED_OFFLINE);
        }
        if (!z) {
            return kxx.a(OfflineReason.NO_INTERNET);
        }
        int i = AnonymousClass1.a[state.ordinal()];
        if (i == 1) {
            return kxx.a(OfflineReason.AP_CONNECTION_PROBLEM);
        }
        if (i != 2) {
            return new a();
        }
        return new c();
    }
}
