package defpackage;

import com.spotify.messages.PushAndroidDeviceSettingsV1;
import com.spotify.messages.PushNotificationPayloadErrorV1;
import com.spotify.messages.PushNotificationPayloadRejectedV1;
import com.spotify.messages.PushNotificationsReceivedV1;
import com.spotify.messages.PushTokenRegistrationErrorV1;
import com.spotify.messages.PushTokenRegistrationErrorV1.a;

/* renamed from: ptz reason: default package */
public final class ptz implements vqf {
    private final jtz a;
    private final gfk<fli> b;

    public ptz(jtz jtz, gfk<fli> gfk) {
        this.a = jtz;
        this.b = gfk;
    }

    public final void a(String str) {
        a k = PushTokenRegistrationErrorV1.k();
        if (str != null) {
            k.a(str);
        }
        this.b.a(k.a(this.a.a()).g());
    }

    public final void a(String str, String str2) {
        PushNotificationsReceivedV1.a k = PushNotificationsReceivedV1.k();
        if (str != null) {
            k.a(str);
        }
        if (str2 != null) {
            k.b(str2);
        }
        this.b.a(k.a(this.a.a()).g());
    }

    public final void a(String str, String str2, String str3) {
        PushNotificationPayloadErrorV1.a k = PushNotificationPayloadErrorV1.k();
        if (str != null) {
            k.a(str);
        }
        if (str2 != null) {
            k.b(str2);
        }
        if (str3 != null) {
            k.c(str3);
        }
        this.b.a(k.a(this.a.a()).g());
    }

    public final void a(String str, boolean z, boolean z2) {
        PushAndroidDeviceSettingsV1.a k = PushAndroidDeviceSettingsV1.k();
        if (str != null) {
            k.a(str);
        }
        this.b.a(k.a(z).b(z2).g());
    }

    public final void b(String str, String str2) {
        PushNotificationPayloadRejectedV1.a k = PushNotificationPayloadRejectedV1.k();
        if (str != null) {
            k.a(str);
        }
        if (str2 != null) {
            k.b(str2);
        }
        this.b.a(k.a(this.a.a()).g());
    }
}
