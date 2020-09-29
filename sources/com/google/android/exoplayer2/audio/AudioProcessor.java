package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledFormatException extends Exception {
        public UnhandledFormatException(int i, int i2, int i3) {
            StringBuilder sb = new StringBuilder("Unhandled format: ");
            sb.append(i);
            sb.append(" Hz, ");
            sb.append(i2);
            sb.append(" channels in encoding ");
            sb.append(i3);
            super(sb.toString());
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean a();

    boolean a(int i, int i2, int i3);

    int b();

    int c();

    int d();

    void e();

    ByteBuffer f();

    boolean g();

    void h();

    void i();
}
