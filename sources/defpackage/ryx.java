package defpackage;

import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings.System;

/* renamed from: ryx reason: default package */
public final class ryx extends ContentObserver {
    public static final Uri a = System.CONTENT_URI;
    public a b;
    private final AudioManager c;
    private int d = this.c.getStreamVolume(3);

    /* renamed from: ryx$a */
    public interface a {
        void onVolumeChanged(float f);
    }

    public ryx(AudioManager audioManager, Handler handler) {
        super(handler);
        this.c = audioManager;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        int streamVolume = this.c.getStreamVolume(3);
        if (this.d - streamVolume != 0) {
            this.d = streamVolume;
            a aVar = this.b;
            if (aVar != null) {
                aVar.onVolumeChanged(((float) streamVolume) / ((float) this.c.getStreamMaxVolume(3)));
            }
        }
    }
}
