package com.spotify.mobile.android.video.tracking;

public enum VideoSurfaceState {
    BACKGROUND,
    FOREGROUND_NON_FULLSCREEN_PORTRAIT,
    FOREGROUND_NON_FULLSCREEN_LANDSCAPE,
    FOREGROUND_NON_FULLSCREEN_UNKNOWN_ORIENTATION,
    FOREGROUND_FULLSCREEN_PORTRAIT,
    FOREGROUND_FULLSCREEN_LANDSCAPE,
    FOREGROUND_FULLSCREEN_UNKNOWN_ORIENTATION;

    /* renamed from: com.spotify.mobile.android.video.tracking.VideoSurfaceState$1 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.video.tracking.VideoSurfaceState[] r0 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.video.tracking.VideoSurfaceState r1 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.FOREGROUND_FULLSCREEN_LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.video.tracking.VideoSurfaceState r1 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.FOREGROUND_NON_FULLSCREEN_LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.video.tracking.VideoSurfaceState r1 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.FOREGROUND_FULLSCREEN_PORTRAIT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.video.tracking.VideoSurfaceState r1 = com.spotify.mobile.android.video.tracking.VideoSurfaceState.FOREGROUND_NON_FULLSCREEN_PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.tracking.VideoSurfaceState.AnonymousClass1.<clinit>():void");
        }
    }

    public static VideoSurfaceState a(boolean z, boolean z2, int i) {
        if (z) {
            return BACKGROUND;
        }
        if (z2 && i == 0) {
            return FOREGROUND_FULLSCREEN_PORTRAIT;
        }
        if (z2 && i == 1) {
            return FOREGROUND_FULLSCREEN_LANDSCAPE;
        }
        if (!z2 && i == 0) {
            return FOREGROUND_NON_FULLSCREEN_PORTRAIT;
        }
        if (!z2 && i == 1) {
            return FOREGROUND_NON_FULLSCREEN_LANDSCAPE;
        }
        if (z2) {
            return FOREGROUND_FULLSCREEN_UNKNOWN_ORIENTATION;
        }
        return FOREGROUND_NON_FULLSCREEN_UNKNOWN_ORIENTATION;
    }
}
