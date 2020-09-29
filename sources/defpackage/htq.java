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

/* renamed from: htq reason: default package */
final class htq {
    final wmb a;

    /* renamed from: htq$a */
    static class a implements a {
        private final b a;
        private final String b;

        a(ghm ghm, String str, String str2) {
            this(str, str2, (b) ghm.a(b.class, new defpackage.wlx.a().a("https").b("accounts.spotify.com").b()));
        }

        private a(String str, String str2, b bVar) {
            this.a = bVar;
            Charset charset = wmk.e;
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

    /* renamed from: htq$b */
    interface b {
        @wtr(a = "/api/token")
        @wth
        Single<ClientCredentialsResponse> a(@wtl(a = "Authorization") String str, @wtf(a = "grant_type") String str2);
    }

    public htq(wmb wmb) {
        this.a = wmb;
    }

    /* access modifiers changed from: 0000 */
    public wmd a(String str, Map<String, String> map) {
        defpackage.wlx.a c = a().c(str);
        for (Entry entry : map.entrySet()) {
            c.a((String) entry.getKey(), (String) entry.getValue());
        }
        return new defpackage.wmd.a().a(c.b()).a();
    }

    private static defpackage.wlx.a a() {
        return new defpackage.wlx.a().a("https").b("api.spotify.com");
    }
}
