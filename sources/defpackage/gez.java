package defpackage;

import android.util.Pair;
import com.google.protobuf.ByteString;

/* renamed from: gez reason: default package */
final class gez extends gff {
    private final long a;
    private final String b;
    private final ByteString c;
    private final long d;
    private final Iterable<Pair<String, ByteString>> e;

    /* renamed from: gez$a */
    static final class a extends defpackage.gff.a {
        private Long a;
        private String b;
        private ByteString c;
        private Long d;
        private Iterable<Pair<String, ByteString>> e;

        a() {
        }

        public final defpackage.gff.a a(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public final defpackage.gff.a a(ByteString byteString) {
            if (byteString != null) {
                this.c = byteString;
                return this;
            }
            throw new NullPointerException("Null sequenceId");
        }

        public final defpackage.gff.a a(Iterable<Pair<String, ByteString>> iterable) {
            if (iterable != null) {
                this.e = iterable;
                return this;
            }
            throw new NullPointerException("Null fragments");
        }

        public final defpackage.gff.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null eventName");
        }

        public final gff a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" internalId");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" eventName");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" sequenceId");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" sequenceNumber");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" fragments");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                gez gez = new gez(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e, 0);
                return gez;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.gff.a b(long j) {
            this.d = Long.valueOf(j);
            return this;
        }
    }

    private gez(long j, String str, ByteString byteString, long j2, Iterable<Pair<String, ByteString>> iterable) {
        this.a = j;
        this.b = str;
        this.c = byteString;
        this.d = j2;
        this.e = iterable;
    }

    /* synthetic */ gez(long j, String str, ByteString byteString, long j2, Iterable iterable, byte b2) {
        this(j, str, byteString, j2, iterable);
    }

    public final long a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final ByteString c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final Iterable<Pair<String, ByteString>> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gff) {
            gff gff = (gff) obj;
            return this.a == gff.a() && this.b.equals(gff.b()) && this.c.equals(gff.c()) && this.d == gff.d() && this.e.equals(gff.e());
        }
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j2 = this.d;
        return this.e.hashCode() ^ ((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{internalId=");
        sb.append(this.a);
        sb.append(", eventName=");
        sb.append(this.b);
        sb.append(", sequenceId=");
        sb.append(this.c);
        sb.append(", sequenceNumber=");
        sb.append(this.d);
        sb.append(", fragments=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
