package defpackage;

import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: vvi reason: default package */
public abstract class vvi {
    private static final Pattern c = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final String a;
    protected final vuz b;
    private final vxb d;
    private final HttpMethod e;
    private final String f;

    public vvi(vuz vuz, String str, String str2, vxb vxb, HttpMethod httpMethod) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (vxb != null) {
            this.b = vuz;
            this.f = str;
            if (!CommonUtils.d(this.f)) {
                str2 = c.matcher(str2).replaceFirst(this.f);
            }
            this.a = str2;
            this.d = vxb;
            this.e = httpMethod;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* access modifiers changed from: protected */
    public final HttpRequest a() {
        return a(Collections.emptyMap());
    }

    /* access modifiers changed from: protected */
    public final HttpRequest a(Map<String, String> map) {
        HttpRequest a2 = this.d.a(this.e, this.a, map).a(false).a(10000);
        StringBuilder sb = new StringBuilder("Crashlytics Android SDK/");
        sb.append(this.b.a());
        return a2.a("User-Agent", sb.toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }
}
