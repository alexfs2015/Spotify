package defpackage;

import com.spotify.playlist.models.Show.MediaType;
import java.util.Collections;
import java.util.Map;

/* renamed from: ooa reason: default package */
public abstract class ooa {

    /* renamed from: ooa$a */
    public interface a {
        a a(int i);

        a a(MediaType mediaType);

        a a(String str);

        a a(Map<String, String> map);

        ooa a();

        a b(String str);

        a c(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public abstract MediaType e();

    public abstract Map<String, String> f();

    public static a g() {
        return new a().a(Collections.emptyMap());
    }
}
