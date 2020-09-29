package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

public interface AudioSink {

    public static final class ConfigurationException extends Exception {
        public ConfigurationException(String str) {
            super(str);
        }

        public ConfigurationException(Throwable th) {
            super(th);
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        public InitializationException(int i, int i2, int i3, int i4) {
            StringBuilder sb = new StringBuilder("AudioTrack init failed: ");
            sb.append(i);
            sb.append(", Config(");
            sb.append(i2);
            String str = ", ";
            sb.append(str);
            sb.append(i3);
            sb.append(str);
            sb.append(i4);
            sb.append(")");
            super(sb.toString());
            this.audioTrackState = i;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i) {
            StringBuilder sb = new StringBuilder("AudioTrack write failed: ");
            sb.append(i);
            super(sb.toString());
            this.errorCode = i;
        }
    }

    public interface a {
        void a();

        void a(int i);

        void a(int i, long j, long j2);
    }

    long a(boolean z);

    arc a(arc arc);

    void a();

    void a(float f);

    void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int i6);

    void a(arp arp);

    void a(arw arw);

    void a(a aVar);

    boolean a(int i);

    boolean a(ByteBuffer byteBuffer, long j);

    void b();

    void b(int i);

    void c();

    boolean d();

    boolean e();

    arc f();

    void g();

    void h();

    void i();

    void j();
}
