package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;

/* renamed from: qqj reason: default package */
final class qqj implements qqo {
    static final ImmutableMap<String, qqo> a;
    private final String b;

    static {
        String str = "com.amazon.dee.app";
        a b2 = ImmutableMap.g().b(str, new qqj(str));
        String str2 = "com.amazon.aca";
        a b3 = b2.b(str2, new qqj(str2));
        String str3 = "com.amazon.alexa.multimodal.lyra";
        a b4 = b3.b(str3, new qqj(str3));
        String str4 = "amazon.speech.sim";
        a = b4.b(str4, new qqj(str4)).b();
    }

    private qqj(String str) {
        this.b = str;
    }

    public final rqi a() {
        return new a("Alexa").d("amazon").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
