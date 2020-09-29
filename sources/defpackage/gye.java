package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize;
import com.spotify.mobile.android.util.ui.BadgesFactory.BadgeSize;

/* renamed from: gye reason: default package */
public final class gye {

    /* renamed from: gye$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ImageSize.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$ImageSize[] r0 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$ImageSize r1 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize.SMALL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$ImageSize r1 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize.MEDIUM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate$ImageConfig$ImageSize r1 = com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig.ImageSize.LARGE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gye.AnonymousClass1.<clinit>():void");
        }
    }

    public static BadgeSize a(ImageSize imageSize) {
        int i = AnonymousClass1.a[imageSize.ordinal()];
        return i != 1 ? i != 2 ? BadgeSize.LARGE : BadgeSize.MEDIUM : BadgeSize.SMALL;
    }
}
