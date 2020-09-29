package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: awh reason: default package */
public final class awh implements awb {
    public final awa a(awd awd) {
        ByteBuffer byteBuffer = awd.c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        bdj bdj = new bdj(array, limit);
        String str = (String) bcu.a(bdj.q());
        String str2 = (String) bcu.a(bdj.q());
        long g = bdj.g();
        long b = bdw.b(bdj.g(), 1000000, g);
        awg awg = new awg(str, str2, bdw.b(bdj.g(), 1000, g), bdj.g(), Arrays.copyOfRange(array, bdj.b, limit), b);
        return new awa(awg);
    }
}
