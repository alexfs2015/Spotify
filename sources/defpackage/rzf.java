package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: rzf reason: default package */
public final class rzf {
    public final Context a;
    public final ryx b;

    public rzf(Context context, Handler handler) {
        this.a = context;
        this.b = new ryx(a(), handler);
    }

    public AudioManager a() {
        return (AudioManager) this.a.getApplicationContext().getSystemService("audio");
    }
}
