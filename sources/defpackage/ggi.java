package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;

/* renamed from: ggi reason: default package */
public interface ggi {

    /* renamed from: ggi$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Pair $default$c(ggi ggi) {
            return Pair.create(ggi.a(), ggi.b().a());
        }
    }

    String a();

    fli b();

    Pair<String, ByteString> c();
}
