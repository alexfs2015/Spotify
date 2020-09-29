package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.spotify.mobile.android.core.internal.AudioDriver.SoundDriverListener;
import com.spotify.mobile.android.core.internal.AudioDriver.SoundDriverVolumeController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hfa reason: default package */
public final class hfa {
    final Context a;
    public final SoundDriverVolumeController b;
    public int c;
    final boolean d;
    public final List<a> e;
    public final SoundDriverListener f;

    /* renamed from: hfa$a */
    public interface a {
        void a(boolean z);
    }

    public hfa(Context context, SoundDriverVolumeController soundDriverVolumeController) {
        this(context, context.getPackageManager(), soundDriverVolumeController);
    }

    private hfa(Context context, PackageManager packageManager, SoundDriverVolumeController soundDriverVolumeController) {
        this.e = new ArrayList();
        this.f = new SoundDriverListener() {
            public final void onAudioTrackCreated(int i) {
                hfa hfa = hfa.this;
                hfa.c = i;
                if (hfa.d) {
                    hfa.a(i);
                }
            }

            public final void onAudioTrackDestroyed(int i) {
                hfa hfa = hfa.this;
                Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
                intent.putExtra("android.media.extra.PACKAGE_NAME", hfa.a.getPackageName());
                intent.putExtra("android.media.extra.AUDIO_SESSION", i);
                hfa.a.sendBroadcast(intent);
                hfa.c = 0;
            }

            public final void onEqualizerShouldBeEnabled(int i) {
                if (!hfa.this.d) {
                    hfa.this.a(i);
                }
            }

            public final void onPaused(boolean z) {
                for (a a2 : hfa.this.e) {
                    a2.a(z);
                }
            }
        };
        this.a = context;
        this.b = soundDriverVolumeController;
        String[] systemSharedLibraryNames = packageManager.getSystemSharedLibraryNames();
        int length = systemSharedLibraryNames.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if ("com.sony.device".equals(systemSharedLibraryNames[i])) {
                z = true;
                break;
            }
            i++;
        }
        this.d = z;
    }

    /* access modifiers changed from: 0000 */
    public void a(int i) {
        Intent intent = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        intent.putExtra("android.media.extra.PACKAGE_NAME", this.a.getPackageName());
        intent.putExtra("android.media.extra.CONTENT_TYPE", 0);
        intent.putExtra("android.media.extra.AUDIO_SESSION", i);
        this.a.sendBroadcast(intent);
    }
}
