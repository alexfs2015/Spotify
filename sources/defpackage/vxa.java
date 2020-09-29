package defpackage;

import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: vxa reason: default package */
public final class vxa implements vxb {
    private final vvc a;
    private vxc b;
    private SSLSocketFactory c;
    private boolean d;

    /* renamed from: vxa$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[HttpMethod.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                io.fabric.sdk.android.services.network.HttpMethod[] r0 = io.fabric.sdk.android.services.network.HttpMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.fabric.sdk.android.services.network.HttpMethod r1 = io.fabric.sdk.android.services.network.HttpMethod.GET     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.fabric.sdk.android.services.network.HttpMethod r1 = io.fabric.sdk.android.services.network.HttpMethod.POST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.fabric.sdk.android.services.network.HttpMethod r1 = io.fabric.sdk.android.services.network.HttpMethod.PUT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.fabric.sdk.android.services.network.HttpMethod r1 = io.fabric.sdk.android.services.network.HttpMethod.DELETE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vxa.AnonymousClass1.<clinit>():void");
        }
    }

    public vxa() {
        this(new vut());
    }

    public vxa(vvc vvc) {
        this.a = vvc;
    }

    public final void a(vxc vxc) {
        if (this.b != vxc) {
            this.b = vxc;
            a();
        }
    }

    private synchronized void a() {
        this.d = false;
        this.c = null;
    }

    public final HttpRequest a(HttpMethod httpMethod, String str, Map<String, String> map) {
        HttpRequest httpRequest;
        int i = AnonymousClass1.a[httpMethod.ordinal()];
        boolean z = true;
        if (i == 1) {
            httpRequest = HttpRequest.a((CharSequence) str, map, true);
        } else if (i == 2) {
            httpRequest = HttpRequest.b((CharSequence) str, map, true);
        } else if (i == 3) {
            httpRequest = HttpRequest.a((CharSequence) str);
        } else if (i == 4) {
            httpRequest = HttpRequest.b((CharSequence) str);
        } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (str == null || !str.toLowerCase(Locale.US).startsWith("https")) {
            z = false;
        }
        if (z && this.b != null) {
            SSLSocketFactory b2 = b();
            if (b2 != null) {
                ((HttpsURLConnection) httpRequest.a()).setSSLSocketFactory(b2);
            }
        }
        return httpRequest;
    }

    private synchronized SSLSocketFactory b() {
        if (this.c == null && !this.d) {
            this.c = c();
        }
        return this.c;
    }

    private synchronized SSLSocketFactory c() {
        SSLSocketFactory socketFactory;
        this.d = true;
        try {
            vxc vxc = this.b;
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{new vxd(new vxe(vxc.a(), vxc.b()), vxc)}, null);
            socketFactory = instance.getSocketFactory();
            this.a.a("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.a.c("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return socketFactory;
    }
}
