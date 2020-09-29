package defpackage;

import com.spotify.playlist.models.Show.MediaType;
import java.util.Collections;
import java.util.Map;

/* renamed from: okq reason: default package */
public abstract class okq {

    /* renamed from: okq$a */
    public interface a {
        a a(int i);

        a a(MediaType mediaType);

        a a(String str);

        a a(Map<String, String> map);

        a a(boolean z);

        okq a();

        a b(String str);

        a b(boolean z);

        a c(String str);
    }

    public static a i() {
        return new a().a(false).b(true).a(Collections.emptyMap());
    }

    public abstract String a();

    public abstract String b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract String f();

    public abstract MediaType g();

    public abstract Map<String, String> h();
}
