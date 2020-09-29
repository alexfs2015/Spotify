package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;

/* renamed from: tah reason: default package */
public final class tah extends c implements a, a<OverlayDisplayMode> {
    final tbk a;
    tal b;
    private final tak c;
    private final tbk d;
    private final tbk e;
    private final urn f;
    private final a<PlayerTrack> g = new a<PlayerTrack>() {
        public final /* synthetic */ void onChanged(Object obj) {
            if (!tah.this.a.a()) {
                tah.this.b.d(true);
            }
        }
    };

    /* renamed from: tah$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[OverlayDisplayMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode[] r0 = com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode r1 = com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode.AUTO_HIDE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode r1 = com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode.HIDE_DISABLED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode r1 = com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode.HIDE_ENABLED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tah.AnonymousClass2.<clinit>():void");
        }
    }

    public final void d() {
    }

    public final /* synthetic */ void onChanged(Object obj) {
        OverlayDisplayMode overlayDisplayMode = (OverlayDisplayMode) obj;
        int i = AnonymousClass2.a[overlayDisplayMode.ordinal()];
        if (i == 1) {
            this.b.b(true);
            this.b.a(true);
            this.b.d(true);
        } else if (i == 2) {
            this.b.b(false);
            this.b.d(true);
        } else if (i == 3) {
            this.b.b(true);
            this.b.a(false);
            if (!this.e.a()) {
                this.b.d(true);
            }
        } else {
            StringBuilder sb = new StringBuilder("Invalid display mode: ");
            sb.append(overlayDisplayMode);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public tah(tak tak, urn urn, wlc<tbk> wlc) {
        this.c = tak;
        this.f = urn;
        this.a = (tbk) wlc.get();
        this.d = (tbk) wlc.get();
        this.e = (tbk) wlc.get();
    }

    public final void e() {
        if (!this.d.a()) {
            this.b.d(false);
        }
    }

    public final void a(tal tal) {
        this.b = (tal) fay.a(tal);
        this.b.a((a) this);
        this.c.a((a<T>) this);
        this.f.a(this.g);
    }
}
