package defpackage;

import android.os.Process;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: aii reason: default package */
final class aii {
    private static final AtomicLong a = new AtomicLong(0);
    private static String b;

    public aii(IdManager idManager) {
        long time = new Date().getTime();
        long j = time / 1000;
        long j2 = time % 1000;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a2 = a(j2);
        byte[] a3 = a(a.incrementAndGet());
        byte[] a4 = a((long) Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a2[0], a2[1], a3[0], a3[1], a4[0], a4[1]};
        String a5 = CommonUtils.a(idManager.a());
        String a6 = CommonUtils.a(bArr);
        b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{a6.substring(0, 12), a6.substring(12, 16), a6.subSequence(16, 20), a5.substring(0, 12)}).toUpperCase(Locale.US);
    }

    private static byte[] a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return b;
    }
}
