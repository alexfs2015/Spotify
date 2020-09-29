package defpackage;

import com.google.android.gms.cast.CastDevice;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice.a;

/* renamed from: mes reason: default package */
final class mes {
    static DiscoveredDevice a(CastDevice castDevice) {
        if (castDevice == null) {
            return DiscoveredDevice.errorStatusDevice("null", DiscoveredDevice.DEVICE_FAILURE_UNKNOWN);
        }
        a aVar = new a(castDevice.a(), castDevice.c, "Google", castDevice.d);
        boolean z = true;
        if (!castDevice.a(4) || castDevice.a(1)) {
            z = false;
        }
        if (z) {
            aVar.a.mAccountReq = "PREMIUM";
            aVar.a.mDeviceType = "CASTAUDIO";
        }
        aVar.a.mIpAddress = castDevice.b.getHostAddress();
        aVar.a.mIsAudioGroup = castDevice.a(32);
        aVar.a.mDeviceClass = DiscoveredDevice.CLASS_JS_CAST;
        return aVar.a;
    }
}
