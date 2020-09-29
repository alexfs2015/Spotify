package defpackage;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: iiq reason: default package */
public final class iiq extends ContentObserver {
    private final AudioManager a;
    private final iin b;
    private boolean c;
    private String d;
    private String e;
    private int f = this.a.getStreamVolume(3);

    public iiq(Handler handler, AudioManager audioManager, iin iin) {
        super(handler);
        this.a = audioManager;
        this.b = iin;
        this.c = this.f == 0;
    }

    public final void a(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean deliverSelfNotifications() {
        return false;
    }

    public final void onChange(boolean z) {
        if (!fbo.a(this.d)) {
            int streamVolume = this.a.getStreamVolume(3);
            if (streamVolume != this.f) {
                this.b.a("volume_change", this.d, this.e);
                this.f = streamVolume;
            }
            if (!this.c || streamVolume <= 0) {
                if (!this.c && streamVolume == 0) {
                    this.c = true;
                    this.b.a("muted", this.d, this.e);
                }
                return;
            }
            this.c = false;
            this.b.a("unmuted", this.d, this.e);
        }
    }
}
