package defpackage;

import android.os.Build.VERSION;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;

/* renamed from: tmc reason: default package */
public final class tmc {
    private final tln a;

    /* renamed from: tmc$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ImmersiveMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.nowplaying.core.immersive.ImmersiveMode[] r0 = com.spotify.music.nowplaying.core.immersive.ImmersiveMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.nowplaying.core.immersive.ImmersiveMode r1 = com.spotify.music.nowplaying.core.immersive.ImmersiveMode.NO_IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.nowplaying.core.immersive.ImmersiveMode r1 = com.spotify.music.nowplaying.core.immersive.ImmersiveMode.SEMI_IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.nowplaying.core.immersive.ImmersiveMode r1 = com.spotify.music.nowplaying.core.immersive.ImmersiveMode.FULL_IMMERSIVE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tmc.AnonymousClass1.<clinit>():void");
        }
    }

    public tmc(tln tln) {
        this.a = tln;
    }

    /* access modifiers changed from: private */
    public void a(ImmersiveMode immersiveMode) {
        int i = AnonymousClass1.a[immersiveMode.ordinal()];
        if (i == 1) {
            tln tln = this.a;
            Logger.b("Exiting full screen", new Object[0]);
            tln.a.getDecorView().setSystemUiVisibility(1792);
        } else if (i == 2) {
            tln tln2 = this.a;
            Logger.b("Hiding status bar", new Object[0]);
            tln2.a.getDecorView().setSystemUiVisibility(1796);
        } else if (i == 3) {
            tln tln3 = this.a;
            Logger.b("Entering full screen", new Object[0]);
            tln3.a.getDecorView().setSystemUiVisibility(3846);
        } else {
            throw new IllegalArgumentException("Unknown immersive mode.");
        }
    }

    public final void a(vcz<ImmersiveMode> vcz) {
        if (VERSION.SDK_INT >= 19) {
            vcz.a((a<T>) new $$Lambda$tmc$TcVHhEK3R90h2LC8gJmnKZ3UCSs<T>(this));
        }
    }
}
