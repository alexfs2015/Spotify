package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Locale;

/* renamed from: jur reason: default package */
public final class jur {
    private final RxResolver a;

    public jur(RxResolver rxResolver) {
        this.a = rxResolver;
    }

    public final xii<Response> a(String str, String str2) {
        return wit.a((ObservableSource<T>) this.a.resolve(new Request(Request.PUT, String.format(Locale.ENGLISH, "sp://product-state/v1/values/%s", new Object[]{str}), Collections.emptyMap(), str2.getBytes(Charset.defaultCharset()))), BackpressureStrategy.BUFFER);
    }
}
