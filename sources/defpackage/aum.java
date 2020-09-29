package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aum reason: default package */
final class aum extends aun {
    private static final int a = bdw.g("Opus");
    private static final byte[] d = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean e;

    aum() {
    }

    public static boolean a(bdj bdj) {
        if (bdj.b() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        bdj.a(bArr, 0, 8);
        return Arrays.equals(bArr, d);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.e = false;
        }
    }

    /* access modifiers changed from: protected */
    public final long b(bdj bdj) {
        byte[] bArr = bdj.a;
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        int i3 = i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2;
        return b(((long) b3) * ((long) i3));
    }

    /* access modifiers changed from: protected */
    public final boolean a(bdj bdj, long j, a aVar) {
        boolean z = true;
        if (!this.e) {
            byte[] copyOf = Arrays.copyOf(bdj.a, bdj.c);
            byte b = copyOf[9] & 255;
            byte b2 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            a(arrayList, b2);
            a(arrayList, 3840);
            aVar.a = aqe.a((String) null, "audio/opus", (String) null, -1, -1, (int) b, 48000, (List<byte[]>) arrayList, (asc) null, 0, (String) null);
            this.e = true;
            return true;
        }
        if (bdj.i() != a) {
            z = false;
        }
        bdj.c(0);
        return z;
    }

    private static void a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
