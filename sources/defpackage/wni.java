package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

@Deprecated
/* renamed from: wni reason: default package */
public class wni extends wmu {
    private final wnb e;

    public wni(wnb wnb) {
        this(wnb, wnb.c(), wnb.d());
    }

    private wni(wnb wnb, int i, int i2) {
        super(wnb.b());
        if (wnb instanceof wni) {
            this.e = ((wni) wnb).e;
        } else if (wnb instanceof wmv) {
            this.e = wnb.K();
        } else {
            this.e = wnb;
        }
        a(i, i2);
        i();
        k();
    }

    public final int C() {
        return K().C();
    }

    public final wnb C(int i) {
        K().C(i);
        return this;
    }

    public final wnc D() {
        return K().D();
    }

    @Deprecated
    public final ByteOrder E() {
        return K().E();
    }

    public final boolean F() {
        return K().F();
    }

    public final boolean G() {
        return K().G();
    }

    public final byte[] H() {
        return K().H();
    }

    public final boolean I() {
        return K().I();
    }

    public final int J() {
        return K().J();
    }

    public wnb K() {
        return this.e;
    }

    public final long L() {
        return K().L();
    }

    public final int P() {
        return K().P();
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return K().a(i, gatheringByteChannel, i2);
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        return K().a(i, scatteringByteChannel, i2);
    }

    public final wnb a(int i, long j) {
        K().a(i, j);
        return this;
    }

    public final wnb a(int i, ByteBuffer byteBuffer) {
        K().a(i, byteBuffer);
        return this;
    }

    public final wnb a(int i, wnb wnb, int i2, int i3) {
        K().a(i, wnb, i2, i3);
        return this;
    }

    public final wnb a(int i, byte[] bArr, int i2, int i3) {
        K().a(i, bArr, i2, i3);
        return this;
    }

    public final wnb b(int i, int i2) {
        K().b(i, i2);
        return this;
    }

    public final wnb b(int i, ByteBuffer byteBuffer) {
        K().b(i, byteBuffer);
        return this;
    }

    public final wnb b(int i, wnb wnb, int i2, int i3) {
        K().b(i, wnb, i2, i3);
        return this;
    }

    public final wnb b(int i, byte[] bArr, int i2, int i3) {
        K().b(i, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    public void b(int i, long j) {
        K().a(i, j);
    }

    /* access modifiers changed from: protected */
    public void c(int i, int i2) {
        K().b(i, i2);
    }

    public final wnb d(int i, int i2) {
        K().d(i, i2);
        return this;
    }

    public final byte e(int i) {
        return K().e(i);
    }

    /* access modifiers changed from: protected */
    public void e(int i, int i2) {
        K().d(i, i2);
    }

    /* access modifiers changed from: protected */
    public byte f(int i) {
        return K().e(i);
    }

    public final wnb f(int i, int i2) {
        K().f(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void g(int i, int i2) {
        K().f(i, i2);
    }

    public final short h(int i) {
        return K().h(i);
    }

    public final wnb i(int i, int i2) {
        return K().i(i, i2);
    }

    /* access modifiers changed from: protected */
    public short i(int i) {
        return K().h(i);
    }

    public final short j(int i) {
        return K().j(i);
    }

    /* access modifiers changed from: protected */
    public short k(int i) {
        return K().j(i);
    }

    public final int m(int i) {
        return K().m(i);
    }

    /* access modifiers changed from: protected */
    public int n(int i) {
        return K().m(i);
    }

    public final int o(int i) {
        return K().o(i);
    }

    /* access modifiers changed from: protected */
    public int p(int i) {
        return K().o(i);
    }

    public final ByteBuffer[] p(int i, int i2) {
        return K().p(i, i2);
    }

    public final long s(int i) {
        return K().s(i);
    }

    /* access modifiers changed from: protected */
    public long t(int i) {
        return K().s(i);
    }
}
