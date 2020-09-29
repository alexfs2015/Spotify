package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;

/* renamed from: qza reason: default package */
final class qza implements qzd {
    static final ImmutableMap<String, qzd> a;
    private final String b;

    static {
        String str = "com.microsoft.cortana";
        a b2 = ImmutableMap.g().b(str, new qza(str));
        String str2 = "com.microsoft.cortana.wip";
        a b3 = b2.b(str2, new qza(str2));
        String str3 = "com.microsoft.cortana.daily";
        a = b3.b(str3, new qza(str3)).b();
    }

    private qza(String str) {
        this.b = str;
    }

    public final rzt a() {
        return new a("Cortana").d("microsoft").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
