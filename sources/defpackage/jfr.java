package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;
import java.util.Set;

/* renamed from: jfr reason: default package */
public final class jfr {

    /* renamed from: jfr$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ProtocolVersion.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.sso.protocol.ProtocolVersion[] r0 = com.spotify.mobile.android.sso.protocol.ProtocolVersion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.sso.protocol.ProtocolVersion r1 = com.spotify.mobile.android.sso.protocol.ProtocolVersion.URI_V1     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.sso.protocol.ProtocolVersion r1 = com.spotify.mobile.android.sso.protocol.ProtocolVersion.SONOS_V1     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.sso.protocol.ProtocolVersion r1 = com.spotify.mobile.android.sso.protocol.ProtocolVersion.GOOGLE_V1     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jfr.AnonymousClass1.<clinit>():void");
        }
    }

    jfr() {
    }

    public final jfq a(Intent intent) {
        int i = AnonymousClass1.a[b(intent).ordinal()];
        if (i == 1) {
            return new jft(((Uri) fay.a(intent.getData())).toString());
        }
        if (i == 2) {
            return new jfp(new jfn(intent), intent);
        }
        if (i != 3) {
            return new jfn(intent);
        }
        return new jfo(new jfn(intent), intent);
    }

    public static ProtocolVersion b(Intent intent) {
        if (e(intent)) {
            return ProtocolVersion.SONOS_V1;
        }
        if ("com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction())) {
            return ProtocolVersion.GOOGLE_V1;
        }
        if (a(intent.getDataString())) {
            return ProtocolVersion.URI_V1;
        }
        if (d(intent)) {
            return ProtocolVersion.V1;
        }
        return ProtocolVersion.UNRESOLVED;
    }

    private static boolean d(Intent intent) {
        return "1".equals(c(intent));
    }

    private static boolean e(Intent intent) {
        return "sonos-v1".equals(c(intent));
    }

    public static boolean a(String str) {
        if (str != null && !str.isEmpty()) {
            Uri parse = Uri.parse(str);
            Set queryParameterNames = parse.getQueryParameterNames();
            if (parse.isHierarchical() && queryParameterNames.contains("client_id") && queryParameterNames.contains("scope")) {
                return true;
            }
        }
        return false;
    }

    public static String c(Intent intent) {
        String str = "VERSION";
        if (f(intent)) {
            return String.valueOf(intent.getIntExtra(str, 0));
        }
        return intent.getStringExtra(str);
    }

    private static boolean f(Intent intent) {
        return intent.getSerializableExtra("VERSION") instanceof Integer;
    }
}
