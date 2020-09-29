package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: awy reason: default package */
public final class awy implements aws {
    public final awr a(awu awu) {
        ByteBuffer byteBuffer = awu.c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        bea bea = new bea(array, limit);
        String str = (String) bdl.a(bea.q());
        String str2 = (String) bdl.a(bea.q());
        long g = bea.g();
        long b = ben.b(bea.g(), 1000000, g);
        awx awx = new awx(str, str2, ben.b(bea.g(), 1000, g), bea.g(), Arrays.copyOfRange(array, bea.b, limit), b);
        return new awr(awx);
    }
}
