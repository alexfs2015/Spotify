package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.sso.protocol.ProtocolVersion;
import java.util.Set;

/* renamed from: jig reason: default package */
public final class jig {

    /* renamed from: jig$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jig.AnonymousClass1.<clinit>():void");
        }
    }

    jig() {
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

    public static ProtocolVersion b(Intent intent) {
        if (e(intent)) {
            return ProtocolVersion.SONOS_V1;
        }
        return "com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction()) ? ProtocolVersion.GOOGLE_V1 : a(intent.getDataString()) ? ProtocolVersion.URI_V1 : d(intent) ? ProtocolVersion.V1 : ProtocolVersion.UNRESOLVED;
    }

    public static String c(Intent intent) {
        String str = "VERSION";
        return f(intent) ? String.valueOf(intent.getIntExtra(str, 0)) : intent.getStringExtra(str);
    }

    private static boolean d(Intent intent) {
        return "1".equals(c(intent));
    }

    private static boolean e(Intent intent) {
        return "sonos-v1".equals(c(intent));
    }

    private static boolean f(Intent intent) {
        return intent.getSerializableExtra("VERSION") instanceof Integer;
    }

    public final jif a(Intent intent) {
        int i = AnonymousClass1.a[b(intent).ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? new jic(intent) : new jid(new jic(intent), intent) : new jie(new jic(intent), intent) : new jii(((Uri) fbp.a(intent.getData())).toString());
    }
}
