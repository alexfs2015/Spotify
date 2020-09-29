package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;

/* renamed from: gdu reason: default package */
public abstract class gdu {

    /* renamed from: gdu$a */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(ByteString byteString);

        public abstract a a(Iterable<Pair<String, ByteString>> iterable);

        public abstract a a(String str);

        public abstract gdu a();

        public abstract a b(long j);
    }

    public abstract long a();

    public abstract String b();

    public abstract ByteString c();

    public abstract long d();

    public abstract Iterable<Pair<String, ByteString>> e();
}
