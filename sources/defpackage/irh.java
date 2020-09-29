package defpackage;

import android.content.Context;
import com.spotify.libs.connect.ConnectStates.State;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.music.features.connect.picker.ui.DevicePickerActivity;
import java.util.EnumSet;

/* renamed from: irh reason: default package */
public final class irh implements men {
    private final gse a;
    private final gqw b;
    private final klz c;
    private final fpt d;
    private final uav e;
    private final ron f;
    private Boolean g;
    private State h = State.NONE;
    private Tech i;
    private EnumSet<Tech> j;
    private String k;

    /* renamed from: irh$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.irh.AnonymousClass1.<clinit>():void");
        }
    }

    public irh(gse gse, gqw gqw, klz klz, fpt fpt, uav uav, ron ron) {
        this.a = gse;
        this.b = gqw;
        this.c = klz;
        this.a.a((a) this);
        this.d = fpt;
        this.e = uav;
        this.f = ron;
    }

    public final void a(ConnectState connectState, GaiaDevice gaiaDevice, GaiaDevice gaiaDevice2, EnumSet<Tech> enumSet, uax uax) {
        if (uav.a(gaiaDevice, uax)) {
            a(uav.a(this.e.a, gaiaDevice, uax), Tech.of(gaiaDevice));
        } else if (connectState == ConnectState.CONNECTING) {
            Tech of = Tech.of(gaiaDevice2);
            this.h = State.CONNECTING;
            this.i = of;
            c();
        } else if (connectState != ConnectState.ACTIVE && connectState != ConnectState.DETECTED) {
            this.h = State.NO_DEVICES;
            c();
        } else if (gaiaDevice == null || gaiaDevice.isSelf()) {
            this.h = State.DEVICES_AVAILABLE;
            this.j = enumSet;
            c();
        } else {
            a(gaiaDevice.getName(), Tech.of(gaiaDevice));
        }
    }

    public final void a(boolean z) {
        this.g = Boolean.valueOf(z);
        c();
    }

    public final boolean b() {
        Boolean bool = this.g;
        return bool != null && bool.booleanValue() && this.h != State.NO_DEVICES && !this.f.a();
    }

    private void a(String str, Tech tech) {
        this.h = State.PLAYING_FROM;
        this.i = tech;
        this.k = str;
        c();
    }

    private void c() {
        Boolean bool = this.g;
        if (bool != null) {
            if (!bool.booleanValue()) {
                this.a.b();
                return;
            }
            int i2 = AnonymousClass1.a[this.h.ordinal()];
            if (i2 == 1) {
                this.a.a(this.i);
            } else if (i2 == 2) {
                this.a.a(this.i, this.k);
            } else if (i2 != 3) {
                if (i2 == 4) {
                    this.a.a();
                }
            } else {
                this.a.a(this.j);
            }
        }
    }

    public final void a() {
        this.b.logConnectButtonClicked(this.h);
        klz klz = this.c;
        klz.a.startActivity(DevicePickerActivity.a((Context) klz.a, this.d));
    }
}
