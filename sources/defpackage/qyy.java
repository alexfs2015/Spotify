package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;

/* renamed from: qyy reason: default package */
final class qyy implements qzd {
    static final ImmutableMap<String, qzd> a;
    private final String b;

    static {
        String str = "com.amazon.dee.app";
        a b2 = ImmutableMap.g().b(str, new qyy(str));
        String str2 = "com.amazon.aca";
        a b3 = b2.b(str2, new qyy(str2));
        String str3 = "com.amazon.alexa.multimodal.lyra";
        a b4 = b3.b(str3, new qyy(str3));
        String str4 = "amazon.speech.sim";
        a = b4.b(str4, new qyy(str4)).b();
    }

    private qyy(String str) {
        this.b = str;
    }

    public final rzt a() {
        return new a("Alexa").d("amazon").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
