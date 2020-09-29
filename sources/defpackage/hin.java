package defpackage;

import com.spotify.mobile.android.core.internal.AudioDriver;

/* renamed from: hin reason: default package */
public final class hin {
    public final hje a;
    final hhw b;
    public final b c = new b() {
        public final void a() {
        }

        public final void a(boolean z, boolean z2) {
            if (!z || !z2) {
                AudioDriver.stopDuckingAudioSession(hin.this.b.c);
            } else {
                AudioDriver.startDuckingAudioSession(hin.this.b.c);
            }
        }

        public final void b() {
        }

        public final void c() {
            AudioDriver.stopDuckingAudioSession(hin.this.b.c);
        }
    };

    public hin(hje hje, hhw hhw) {
        this.a = hje;
        this.b = hhw;
    }
}
