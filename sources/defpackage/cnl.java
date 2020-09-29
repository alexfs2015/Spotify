package defpackage;

import android.content.Context;
import android.media.AudioManager;

@cfp
/* renamed from: cnl reason: default package */
public final class cnl {
    private boolean a = false;
    private float b = 1.0f;

    public static float a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) streamVolume) / ((float) streamMaxVolume);
    }

    private final synchronized boolean c() {
        return this.b >= 0.0f;
    }

    public final synchronized float a() {
        if (!c()) {
            return 1.0f;
        }
        return this.b;
    }

    public final synchronized void a(float f) {
        this.b = f;
    }

    public final synchronized void a(boolean z) {
        this.a = z;
    }

    public final synchronized boolean b() {
        return this.a;
    }
}
