package defpackage;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: igd reason: default package */
public final class igd extends ContentObserver {
    private final AudioManager a;
    private final iga b;
    private boolean c;
    private String d;
    private String e;
    private int f = this.a.getStreamVolume(3);

    public final boolean deliverSelfNotifications() {
        return false;
    }

    public igd(Handler handler, AudioManager audioManager, iga iga) {
        super(handler);
        this.a = audioManager;
        this.b = iga;
        this.c = this.f == 0;
    }

    public final void onChange(boolean z) {
        if (!fax.a(this.d)) {
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

    public final void a(String str, String str2) {
        this.d = str;
        this.e = str2;
    }
}
