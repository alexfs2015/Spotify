package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: iqy reason: default package */
public final class iqy {
    public final Context a;
    public final jsy b;

    public iqy(Context context, Handler handler) {
        this.a = context;
        this.b = new jsy(a(), handler);
    }

    public AudioManager a() {
        return (AudioManager) this.a.getApplicationContext().getSystemService("audio");
    }
}
