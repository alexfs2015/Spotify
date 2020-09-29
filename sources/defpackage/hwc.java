package defpackage;

import com.spotify.mobile.android.service.media.search.ClientCredentialsResponse;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.observers.BlockingMultiObserver;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import okio.ByteString;

/* renamed from: hwc reason: default package */
final class hwc {
    final xah a;

    /* renamed from: hwc$a */
    static class a implements a {
        private final b a;
        private final String b;

        a(gix gix, String str, String str2) {
            this(str, str2, (b) gix.a(b.class, new defpackage.xad.a().a("https").b("accounts.spotify.com").b()));
        }

        private a(String str, String str2, b bVar) {
            this.a = bVar;
            Charset charset = xaq.e;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            String b2 = ByteString.a(sb.toString(), charset).b();
            StringBuilder sb2 = new StringBuilder("Basic ");
            sb2.append(b2);
            this.b = sb2.toString();
        }

        public final ClientCredentialsResponse a(long j, TimeUnit timeUnit) {
            try {
                Single a2 = this.a.a(this.b, "client_credentials").a(15, timeUnit);
                BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
                a2.b((SingleObserver<? super T>) blockingMultiObserver);
                return (ClientCredentialsResponse) blockingMultiObserver.a();
            } catch (RuntimeException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: hwc$b */
    interface b {
        @xhm
        @xhw(a = "/api/token")
        Single<ClientCredentialsResponse> a(@xhq(a = "Authorization") String str, @xhk(a = "grant_type") String str2);
    }

    public hwc(xah xah) {
        this.a = xah;
    }

    private static defpackage.xad.a a() {
        return new defpackage.xad.a().a("https").b("api.spotify.com");
    }

    /* access modifiers changed from: 0000 */
    public xaj a(String str, Map<String, String> map) {
        defpackage.xad.a c = a().c(str);
        for (Entry entry : map.entrySet()) {
            c.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new defpackage.xaj.a().a(c.b()).a();
    }
}
