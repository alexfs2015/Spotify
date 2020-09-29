package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: avd reason: default package */
final class avd extends ave {
    private static final int a = ben.g("Opus");
    private static final byte[] d = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean e;

    avd() {
    }

    private static void a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    public static boolean a(bea bea) {
        if (bea.b() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        bea.a(bArr, 0, 8);
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
    public final boolean a(bea bea, long j, a aVar) {
        boolean z = true;
        if (!this.e) {
            byte[] copyOf = Arrays.copyOf(bea.a, bea.c);
            byte b = copyOf[9] & 255;
            byte b2 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            a(arrayList, b2);
            a(arrayList, 3840);
            aVar.a = aqv.a((String) null, "audio/opus", (String) null, -1, -1, (int) b, 48000, (List<byte[]>) arrayList, (ast) null, 0, (String) null);
            this.e = true;
            return true;
        }
        if (bea.i() != a) {
            z = false;
        }
        bea.c(0);
        return z;
    }

    /* access modifiers changed from: protected */
    public final long b(bea bea) {
        byte[] bArr = bea.a;
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
}
