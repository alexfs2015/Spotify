package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: ard reason: default package */
final class ard {
    final a a;
    int b;
    long c;
    long d;
    long e;
    long f;

    /* renamed from: ard$a */
    static final class a {
        final AudioTrack a;
        final AudioTimestamp b = new AudioTimestamp();
        long c;
        long d;
        long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }

        public final long a() {
            return this.b.nanoTime / 1000;
        }
    }

    public ard(AudioTrack audioTrack) {
        if (bdw.a >= 19) {
            this.a = new a(audioTrack);
            a();
            return;
        }
        this.a = null;
        a(3);
    }

    public final void a() {
        if (this.a != null) {
            a(0);
        }
    }

    public final long b() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.a();
        }
        return -9223372036854775807L;
    }

    public final long c() {
        a aVar = this.a;
        if (aVar != null) {
            return aVar.e;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0;
            this.f = -1;
            this.c = System.nanoTime() / 1000;
            this.d = 5000;
        } else if (i == 1) {
            this.d = 5000;
        } else if (i == 2 || i == 3) {
            this.d = 10000000;
        } else if (i == 4) {
            this.d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
