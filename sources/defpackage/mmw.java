package defpackage;

import com.spotify.libs.connect.ConnectStates.State;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Tech;
import java.util.EnumSet;

/* renamed from: mmw reason: default package */
public final class mmw implements mix {
    private final gue a;
    private final gsv b;
    private final unq c;
    private final rxt d;
    private Boolean e;
    private State f = State.NONE;
    private Tech g;
    private EnumSet<Tech> h;
    private String i;

    /* renamed from: mmw$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.libs.connect.ConnectStates$State[] r0 = com.spotify.libs.connect.ConnectStates.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.libs.connect.ConnectStates$State r1 = com.spotify.libs.connect.ConnectStates.State.CONNECTING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.libs.connect.ConnectStates$State r1 = com.spotify.libs.connect.ConnectStates.State.PLAYING_FROM     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.libs.connect.ConnectStates$State r1 = com.spotify.libs.connect.ConnectStates.State.DEVICES_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.libs.connect.ConnectStates$State r1 = com.spotify.libs.connect.ConnectStates.State.NO_DEVICES     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mmw.AnonymousClass1.<clinit>():void");
        }
    }

    public mmw(gue gue, gsv gsv, unq unq, rxt rxt) {
        this.a = gue;
        this.b = gsv;
        this.a.a((a) this);
        this.c = unq;
        this.d = rxt;
    }

    private void a(String str, Tech tech) {
        this.f = State.PLAYING_FROM;
        this.g = tech;
        this.i = str;
        c();
    }

    private void c() {
        Boolean bool = this.e;
        if (bool != null) {
            if (!bool.booleanValue()) {
                this.a.b();
                return;
            }
            int i2 = AnonymousClass1.a[this.f.ordinal()];
            if (i2 == 1) {
                this.a.a(this.g);
            } else if (i2 == 2) {
                this.a.a(this.g, this.i);
            } else if (i2 != 3) {
                if (i2 == 4) {
                    this.a.a();
                }
            } else {
                this.a.a(this.h);
            }
        }
    }

    public final void a() {
        this.b.logConnectButtonClicked(this.f);
    }

    public final void a(ConnectState connectState, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2, EnumSet<Tech> enumSet, uns uns) {
        if (unq.a(gaiaDevice, uns)) {
            a(unq.a(this.c.a, gaiaDevice, uns), Tech.of(gaiaDevice));
        } else if (connectState == ConnectState.CONNECTING) {
            Tech of = Tech.of(gaiaDevice2);
            this.f = State.CONNECTING;
            this.g = of;
            c();
        } else if (connectState != ConnectState.ACTIVE && connectState != ConnectState.DETECTED) {
            this.f = State.NO_DEVICES;
            c();
        } else if (gaiaDevice == null || gaiaDevice.isSelf()) {
            this.f = State.DEVICES_AVAILABLE;
            this.h = enumSet;
            c();
        } else {
            a(gaiaDevice.getName(), Tech.of(gaiaDevice));
        }
    }

    public final void a(boolean z) {
        this.e = Boolean.valueOf(z);
        c();
    }

    public final boolean b() {
        Boolean bool = this.e;
        return bool != null && bool.booleanValue() && this.f != State.NO_DEVICES && !this.d.a();
    }
}
