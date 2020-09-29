package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.spotify.mobile.android.core.internal.AudioDriver.SoundDriverListener;
import com.spotify.mobile.android.core.internal.AudioDriver.SoundDriverVolumeController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hhw reason: default package */
public final class hhw {
    final Context a;
    public final SoundDriverVolumeController b;
    public int c;
    final boolean d;
    public final List<a> e;
    public final SoundDriverListener f;

    /* renamed from: hhw$a */
    public interface a {
        void a(boolean z);
    }

    private hhw(Context context, PackageManager packageManager, SoundDriverVolumeController soundDriverVolumeController) {
        this.e = new ArrayList();
        this.f = new SoundDriverListener() {
            public final void onAudioTrackCreated(int i) {
                hhw hhw = hhw.this;
                hhw.c = i;
                if (hhw.d) {
                    hhw.a(i);
                }
            }

            public final void onAudioTrackDestroyed(int i) {
                hhw hhw = hhw.this;
                Intent intent = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
                intent.putExtra("android.media.extra.PACKAGE_NAME", hhw.a.getPackageName());
                intent.putExtra("android.media.extra.AUDIO_SESSION", i);
                hhw.a.sendBroadcast(intent);
                hhw.c = 0;
            }

            public final void onEqualizerShouldBeEnabled(int i) {
                if (!hhw.this.d) {
                    hhw.this.a(i);
                }
            }

            public final void onPaused(boolean z) {
                for (a a2 : hhw.this.e) {
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

    public hhw(Context context, SoundDriverVolumeController soundDriverVolumeController) {
        this(context, context.getPackageManager(), soundDriverVolumeController);
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
