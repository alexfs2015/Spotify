package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.msgpack.core.MessageStringCodingException;

/* renamed from: wqs reason: default package */
public abstract class wqs extends wqt implements wqh {
    private static final char[] d = "0123456789ABCDEF".toCharArray();
    protected final byte[] a;
    private volatile String b;
    private volatile CharacterCodingException c;

    public final wqh b() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqo x() {
        return this;
    }

    public final /* bridge */ /* synthetic */ wqc E() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ wqd F() {
        return super.v();
    }

    public final /* bridge */ /* synthetic */ wqg G() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ wqa H() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ wqb c() {
        return super.C();
    }

    public final /* bridge */ /* synthetic */ wqe d() {
        return super.B();
    }

    public final /* bridge */ /* synthetic */ wpy e() {
        return super.A();
    }

    public /* bridge */ /* synthetic */ wqi f() {
        return super.z();
    }

    public /* bridge */ /* synthetic */ wpz g() {
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

    public wqs(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private ByteBuffer I() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    public final String D() {
        StringBuilder sb = new StringBuilder();
        a(sb, toString());
        return sb.toString();
    }

    public String toString() {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    try {
                        this.b = wpm.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(I()).toString();
                    } catch (CharacterCodingException e) {
                        throw new MessageStringCodingException(e);
                    } catch (CharacterCodingException e2) {
                        this.b = wpm.a.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(I()).toString();
                        this.c = e2;
                    }
                }
            }
        }
        return this.b;
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

    private static void a(StringBuilder sb, int i) {
        sb.append("\\u");
        sb.append(d[(i >> 12) & 15]);
        sb.append(d[(i >> 8) & 15]);
        sb.append(d[(i >> 4) & 15]);
        sb.append(d[i & 15]);
    }
}
