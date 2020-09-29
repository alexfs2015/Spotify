package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bbn reason: default package */
public interface bbn {

    /* renamed from: bbn$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Map $default$b(bbn _this) {
            return Collections.emptyMap();
        }
    }

    /* renamed from: bbn$a */
    public interface a {
        bbn a();
    }

    int a(byte[] bArr, int i, int i2);

    long a(bbp bbp);

    Uri a();

    void a(bcd bcd);

    Map<String, List<String>> b();

    void c();
}
