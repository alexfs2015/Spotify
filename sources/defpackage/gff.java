package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;

/* renamed from: gff reason: default package */
public abstract class gff {

    /* renamed from: gff$a */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(ByteString byteString);

        public abstract a a(Iterable<Pair<String, ByteString>> iterable);

        public abstract a a(String str);

        public abstract gff a();

        public abstract a b(long j);
    }

    public abstract long a();

    public abstract String b();

    public abstract ByteString c();

    public abstract long d();

    public abstract Iterable<Pair<String, ByteString>> e();
}
