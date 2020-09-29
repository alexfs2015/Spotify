package defpackage;

import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder;
import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder.Type;
import com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder.a;

/* renamed from: toq reason: default package */
public final class toq implements a {
    private final tor a;
    private final tnr b;
    private tqs c;

    /* renamed from: toq$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder$Type[] r0 = com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder$Type r1 = com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder.Type.NOW_PLAYING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder$Type r1 = com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder.Type.HOME_FEED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder$Type r1 = com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton.DrivingShowVoiceViewButtonViewBinder.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.toq.AnonymousClass1.<clinit>():void");
        }
    }

    public toq(tor tor, tnr tnr) {
        this.a = tor;
        this.b = tnr;
    }

    public final void a(Type type) {
        int i = AnonymousClass1.a[type.ordinal()];
        if (i == 1) {
            this.b.a();
        } else if (i == 2) {
            this.b.b();
        }
        this.c.e();
    }

    public final void a(DrivingShowVoiceViewButtonViewBinder drivingShowVoiceViewButtonViewBinder, tqs tqs) {
        this.c = tqs;
        drivingShowVoiceViewButtonViewBinder.a(this);
        if (this.a.a()) {
            drivingShowVoiceViewButtonViewBinder.e();
        } else {
            drivingShowVoiceViewButtonViewBinder.f();
        }
    }
}
