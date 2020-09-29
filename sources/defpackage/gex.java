package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;

/* renamed from: gex reason: default package */
public interface gex {

    /* renamed from: gex$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Pair $default$c(gex _this) {
            return Pair.create(_this.a(), _this.b().a());
        }
    }

    String a();

    fko b();

    Pair<String, ByteString> c();
}
