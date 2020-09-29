package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

@Deprecated
/* renamed from: vzc reason: default package */
public class vzc extends vyo {
    private final vyv e;

    public vzc(vyv vyv) {
        this(vyv, vyv.c(), vyv.d());
    }

    private vzc(vyv vyv, int i, int i2) {
        super(vyv.b());
        if (vyv instanceof vzc) {
            this.e = ((vzc) vyv).e;
        } else if (vyv instanceof vyp) {
            this.e = vyv.K();
        } else {
            this.e = vyv;
        }
        a(i, i2);
        i();
        k();
    }

    public vyv K() {
        return this.e;
    }

    public final vyw D() {
        return K().D();
    }

    @Deprecated
    public final ByteOrder E() {
        return K().E();
    }

    public final boolean F() {
        return K().F();
    }

    public final int P() {
        return K().P();
    }

    public final vyv C(int i) {
        K().C(i);
        return this;
    }

    public final boolean G() {
        return K().G();
    }

    public final byte[] H() {
        return K().H();
    }

    public final int C() {
        return K().C();
    }

    public final boolean I() {
        return K().I();
    }

    public final long L() {
        return K().L();
    }

    public final byte e(int i) {
        return K().e(i);
    }

    /* access modifiers changed from: protected */
    public byte f(int i) {
        return K().e(i);
    }

    public final short h(int i) {
        return K().h(i);
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

    public final long s(int i) {
        return K().s(i);
    }

    /* access modifiers changed from: protected */
    public long t(int i) {
        return K().s(i);
    }

    public final vyv i(int i, int i2) {
        return K().i(i, i2);
    }

    public final vyv a(int i, vyv vyv, int i2, int i3) {
        K().a(i, vyv, i2, i3);
        return this;
    }

    public final vyv a(int i, byte[] bArr, int i2, int i3) {
        K().a(i, bArr, i2, i3);
        return this;
    }

    public final vyv a(int i, ByteBuffer byteBuffer) {
        K().a(i, byteBuffer);
        return this;
    }

    public final vyv b(int i, int i2) {
        K().b(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void c(int i, int i2) {
        K().b(i, i2);
    }

    public final vyv d(int i, int i2) {
        K().d(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void e(int i, int i2) {
        K().d(i, i2);
    }

    public final vyv f(int i, int i2) {
        K().f(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void g(int i, int i2) {
        K().f(i, i2);
    }

    public final vyv a(int i, long j) {
        K().a(i, j);
        return this;
    }

    /* access modifiers changed from: protected */
    public void b(int i, long j) {
        K().a(i, j);
    }

    public final vyv b(int i, byte[] bArr, int i2, int i3) {
        K().b(i, bArr, i2, i3);
        return this;
    }

    public final vyv b(int i, vyv vyv, int i2, int i3) {
        K().b(i, vyv, i2, i3);
        return this;
    }

    public final vyv b(int i, ByteBuffer byteBuffer) {
        K().b(i, byteBuffer);
        return this;
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return K().a(i, gatheringByteChannel, i2);
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        return K().a(i, scatteringByteChannel, i2);
    }

    public final int J() {
        return K().J();
    }

    public final ByteBuffer[] p(int i, int i2) {
        return K().p(i, i2);
    }
}
