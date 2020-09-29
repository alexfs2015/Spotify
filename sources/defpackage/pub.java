package defpackage;

import com.spotify.messages.PushNotificationInteractionErrorV1;
import com.spotify.messages.PushNotificationInteractionV1;
import com.spotify.messages.PushNotificationInteractionV1.a;

/* renamed from: pub reason: default package */
public final class pub implements puc {
    private final jtz a;
    private final gfk<fli> b;

    public pub(jtz jtz, gfk<fli> gfk) {
        this.a = jtz;
        this.b = gfk;
    }

    public final void a(String str, String str2, String str3, String str4) {
        a k = PushNotificationInteractionV1.k();
        k.a(str);
        if (str2 != null) {
            k.b(str2);
        }
        if (str3 != null) {
            k.c(str3);
        }
        if (str4 != null) {
            k.d(str4);
        }
        this.b.a(k.a(this.a.a()).g());
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        PushNotificationInteractionErrorV1.a k = PushNotificationInteractionErrorV1.k();
        k.a(str);
        if (str2 != null) {
            k.b(str2);
        }
        if (str3 != null) {
            k.c(str3);
        }
        if (str4 != null) {
            k.d(str4);
        }
        if (str5 != null) {
            k.e(str5);
        }
        this.b.a(k.a(this.a.a()).g());
    }
}
