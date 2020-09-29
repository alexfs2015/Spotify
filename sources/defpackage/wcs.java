package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRecord;
import android.media.AudioRecord.OnRoutingChangedListener;
import android.media.AudioRouting;

/* renamed from: wcs reason: default package */
final class wcs implements OnRoutingChangedListener {
    AudioDeviceInfo a;

    wcs() {
    }

    private void a(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null && !audioDeviceInfo.equals(this.a)) {
            this.a = audioDeviceInfo;
        }
    }

    public final void onRoutingChanged(AudioRecord audioRecord) {
        if (audioRecord != null) {
            a(audioRecord.getRoutedDevice());
        }
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        if (audioRouting != null) {
            a(audioRouting.getRoutedDevice());
        }
    }
}
