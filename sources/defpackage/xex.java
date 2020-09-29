package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.msgpack.core.MessageStringCodingException;

/* renamed from: xex reason: default package */
public abstract class xex extends xey implements xem {
    private static final char[] d = "0123456789ABCDEF".toCharArray();
    protected final byte[] a;
    private volatile String b;
    private volatile CharacterCodingException c;

    public xex(byte[] bArr) {
        this.a = bArr;
    }

    private ByteBuffer I() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    private static void a(StringBuilder sb, int i) {
        sb.append("\\u");
        sb.append(d[(i >> 12) & 15]);
        sb.append(d[(i >> 8) & 15]);
        sb.append(d[(i >> 4) & 15]);
        sb.append(d[i & 15]);
    }

    static void a(StringBuilder sb, String str) {
        String str2 = "\"";
        sb.append(str2);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ') {
                switch (charAt) {
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        a(sb, (int) charAt);
                        break;
                }
            } else if (charAt <= 127) {
                if (charAt == '\"') {
                    sb.append("\\\"");
                } else if (charAt != '\\') {
                    sb.append(charAt);
                } else {
                    sb.append("\\\\");
                }
            } else if (charAt < 55296 || charAt > 57343) {
                sb.append(charAt);
            } else {
                a(sb, (int) charAt);
            }
        }
        sb.append(str2);
    }

    public final String D() {
        StringBuilder sb = new StringBuilder();
        a(sb, toString());
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ xeh E() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ xei F() {
        return super.v();
    }

    public final /* bridge */ /* synthetic */ xel G() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ xef H() {
        return super.t();
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final xem b() {
        return this;
    }

    public final /* bridge */ /* synthetic */ xeg c() {
        return super.C();
    }

    public final /* bridge */ /* synthetic */ xej d() {
        return super.B();
    }

    public final /* bridge */ /* synthetic */ xed e() {
        return super.A();
    }

    public /* bridge */ /* synthetic */ xen f() {
        return super.z();
    }

    public /* bridge */ /* synthetic */ xee g() {
        return super.y();
    }

    public final /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ boolean q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ boolean r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ boolean s() {
        return super.s();
    }

    public String toString() {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    try {
                        this.b = xdr.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(I()).toString();
                    } catch (CharacterCodingException e) {
                        throw new MessageStringCodingException(e);
                    } catch (CharacterCodingException e2) {
                        this.b = xdr.a.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(I()).toString();
                        this.c = e2;
                    }
                }
            }
        }
        return this.b;
    }

    public final /* bridge */ /* synthetic */ xet x() {
        return this;
    }
}
