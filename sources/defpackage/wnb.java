package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* renamed from: wnb reason: default package */
public abstract class wnb implements Comparable<wnb>, wvo {
    public abstract wnb A();

    public abstract int C();

    public abstract wnb C(int i);

    public abstract wnc D();

    @Deprecated
    public abstract ByteOrder E();

    public abstract boolean F();

    public abstract boolean G();

    public abstract byte[] H();

    public abstract boolean I();

    public abstract int J();

    public abstract wnb K();

    public abstract long L();

    public abstract int P();

    public abstract int a(int i, GatheringByteChannel gatheringByteChannel, int i2);

    public abstract int a(int i, ScatteringByteChannel scatteringByteChannel, int i2);

    public abstract int a(GatheringByteChannel gatheringByteChannel, int i);

    public abstract int a(ScatteringByteChannel scatteringByteChannel, int i);

    public abstract int a(wvg wvg);

    public abstract String a(Charset charset);

    public abstract wnb a(int i);

    public abstract wnb a(int i, int i2);

    public abstract wnb a(int i, long j);

    public abstract wnb a(int i, ByteBuffer byteBuffer);

    public abstract wnb a(int i, wnb wnb, int i2, int i3);

    public abstract wnb a(int i, byte[] bArr, int i2, int i3);

    public abstract wnb a(long j);

    /* renamed from: a */
    public abstract wnb b(Object obj);

    @Deprecated
    public abstract wnb a(ByteOrder byteOrder);

    public abstract wnb a(wnb wnb);

    public abstract wnb a(wnb wnb, int i, int i2);

    public abstract wnb a(byte[] bArr);

    public abstract wnb a(byte[] bArr, int i, int i2);

    public abstract boolean a();

    public abstract int b();

    /* renamed from: b */
    public abstract int compareTo(wnb wnb);

    public abstract wnb b(int i);

    public abstract wnb b(int i, int i2);

    public abstract wnb b(int i, ByteBuffer byteBuffer);

    public abstract wnb b(int i, wnb wnb, int i2, int i3);

    public abstract wnb b(int i, byte[] bArr, int i2, int i3);

    public abstract wnb b(byte[] bArr);

    public abstract wnb b(byte[] bArr, int i, int i2);

    public abstract int c();

    public abstract int d();

    public abstract wnb d(int i);

    public abstract wnb d(int i, int i2);

    public abstract byte e(int i);

    public abstract boolean equals(Object obj);

    public abstract wnb f(int i, int i2);

    public abstract boolean f();

    public abstract int g();

    public abstract short g(int i);

    public abstract int h();

    public abstract wnb h(int i, int i2);

    public abstract short h(int i);

    public abstract int hashCode();

    public abstract wnb i();

    public abstract wnb i(int i, int i2);

    public abstract wnb j();

    public abstract wnb j(int i, int i2);

    public abstract short j(int i);

    public abstract int l(int i);

    public abstract wnb l();

    public abstract int m(int i);

    public abstract byte n();

    public abstract ByteBuffer n(int i, int i2);

    public abstract int o(int i);

    public abstract ByteBuffer o(int i, int i2);

    public abstract short o();

    public abstract short p();

    public abstract ByteBuffer[] p(int i, int i2);

    public abstract int q();

    public abstract long q(int i);

    public abstract long r();

    public abstract long r(int i);

    public abstract long s(int i);

    public abstract wnb s();

    public abstract wnb t();

    public abstract String toString();

    public abstract wnb u();

    public abstract wnb u(int i);

    public abstract ByteBuffer v();

    public abstract wnb v(int i);

    public abstract wnb w(int i);

    public abstract ByteBuffer[] w();

    public abstract wnb x(int i);

    public abstract wnb y(int i);

    public abstract wnb z(int i);
}
