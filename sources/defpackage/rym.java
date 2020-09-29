package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.ConnectStates.State;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: rym reason: default package */
public final class rym {
    public final jlr a;
    public final jtp b;

    /* renamed from: rym$1 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[State.values().length];
        public static final /* synthetic */ int[] b = new int[ConnectState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0067 */
        static {
            /*
                com.spotify.mobile.android.connect.ConnectManager$ConnectState[] r0 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r2 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.DETECTED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r3 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.NORMAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r4 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r5 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.CONNECTING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.mobile.android.connect.ConnectManager$ConnectState r5 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                com.spotify.libs.connect.ConnectStates$State[] r4 = com.spotify.libs.connect.ConnectStates.State.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x0053 }
                com.spotify.libs.connect.ConnectStates$State r5 = com.spotify.libs.connect.ConnectStates.State.CONNECTING     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005d }
                com.spotify.libs.connect.ConnectStates$State r4 = com.spotify.libs.connect.ConnectStates.State.PLAYING_FROM     // Catch:{ NoSuchFieldError -> 0x005d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.spotify.libs.connect.ConnectStates$State r1 = com.spotify.libs.connect.ConnectStates.State.DEVICES_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0071 }
                com.spotify.libs.connect.ConnectStates$State r1 = com.spotify.libs.connect.ConnectStates.State.NO_DEVICES     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rym.AnonymousClass1.<clinit>():void");
        }
    }

    public rym(jlr jlr, jtp jtp) {
        this.a = jlr;
        this.b = jtp;
    }

    private static String a(State state) {
        int i = AnonymousClass1.a[state.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "unavailable" : "available" : "connected" : "connecting";
    }

    public final void a() {
        be beVar = new be(null, "com.spotify.service.connectui", "spotify:connect-access-button", null, 0, null, "connect-access-button-visible", null, (double) this.b.a());
        this.a.a(beVar);
        Logger.b(beVar.a(), new Object[0]);
    }

    public final void a(int i) {
        ah ahVar = new ah(null, i == 1 ? "connect-volume-hardware-button/volume-up" : "connect-volume-hardware-button/volume-down", null, "update-volume", PageIdentifiers.CONNECT_DEVICEPICKER.mPageIdentifier, ViewUris.bo.toString());
        this.a.a(ahVar);
        Logger.b(ahVar.a(), new Object[0]);
    }

    public final void a(State state, String str, String str2) {
        StringBuilder sb = new StringBuilder("connect-device-picker/");
        sb.append(a(state));
        ah ahVar = new ah(null, sb.toString(), null, InteractionIntent.NAVIGATE.mInteractionIntent, str, str2);
        this.a.a(ahVar);
        Logger.b(ahVar.a(), new Object[0]);
    }
}
