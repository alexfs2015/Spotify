package defpackage;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: gku reason: default package */
public final class gku implements gkw {
    private final AudioManager a;

    public gku(Context context) {
        this.a = (AudioManager) context.getSystemService("audio");
    }

    public final boolean a() {
        this.a.adjustStreamVolume(3, 1, 0);
        return true;
    }

    public final boolean b() {
        this.a.adjustStreamVolume(3, -1, 0);
        return true;
    }

    public final boolean a(Float f) {
        this.a.setStreamVolume(3, Math.round(((float) d()) * f.floatValue()), 0);
        return true;
    }

    public final float c() {
        return ((float) this.a.getStreamVolume(3)) / ((float) d());
    }

    private int d() {
        return this.a.getStreamMaxVolume(3);
    }
}
