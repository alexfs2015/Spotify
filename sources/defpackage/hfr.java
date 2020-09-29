package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;

/* renamed from: hfr reason: default package */
public final class hfr {
    public final hgi a;
    final hfa b;
    public final b c = new b() {
        public final void a() {
        }

        public final void b() {
        }

        public final void c() {
            AudioDriver.stopDuckingAudioSession(hfr.this.b.c);
        }

        public final void a(boolean z, boolean z2) {
            if (!z || !z2) {
                AudioDriver.stopDuckingAudioSession(hfr.this.b.c);
            } else {
                AudioDriver.startDuckingAudioSession(hfr.this.b.c);
            }
        }
    };

    public hfr(hgi hgi, hfa hfa) {
        this.a = hgi;
        this.b = hfa;
    }
}
