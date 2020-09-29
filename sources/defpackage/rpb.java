package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Flowable;
import io.reactivex.functions.Predicate;

/* renamed from: rpb reason: default package */
public final class rpb {
    private final Flowable<PlayerState> a;
    private final vlp b;

    /* renamed from: rpb$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.TOPLIST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PLAYLIST_V2     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PLAYLIST_AUTOPLAY     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rpb.AnonymousClass1.<clinit>():void");
        }
    }

    public rpb(Flowable<PlayerState> flowable, vlp vlp) {
        this.a = flowable;
        this.b = vlp;
    }

    /* access modifiers changed from: private */
    public static boolean a(PlayerState playerState) {
        int i = AnonymousClass1.a[jva.a(playerState.contextUri()).b.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    /* access modifiers changed from: private */
    public boolean b(PlayerState playerState) {
        return !((Boolean) this.b.b(playerState.contextUri()).a(Boolean.FALSE)).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    public final Flowable<PlayerState> a() {
        return this.a.c(1).a((Predicate<? super T>) $$Lambda$rpb$8Nk9UKF1q3srKKlSyss8Sd92Y_8.INSTANCE).a((Predicate<? super T>) new $$Lambda$rpb$PbuAK9vfLBuQLhVxMPrBLZUROeU<Object>(this));
    }
}
