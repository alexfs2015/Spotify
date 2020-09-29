package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* renamed from: dbv reason: default package */
abstract class dbv implements cwi {
    private final byte[] a;
    private final dbu b;
    private final dbu c;

    dbv(byte[] bArr) {
        this.a = (byte[]) bArr.clone();
        this.b = a(bArr, 1);
        this.c = a(bArr, 0);
    }

    /* access modifiers changed from: 0000 */
    public abstract dbu a(byte[] bArr, int i);

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
            if (allocate.remaining() >= bArr.length + 12 + 16) {
                int position = allocate.position();
                this.b.a(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[12];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.c.a(bArr3, 0).get(bArr4);
                int length = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(length);
                order.put(allocate);
                order.position(i2);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                byte[] a2 = dbr.a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a2);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
