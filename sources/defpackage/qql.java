package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;

/* renamed from: qql reason: default package */
final class qql implements qqo {
    static final ImmutableMap<String, qqo> a;
    private final String b;

    static {
        String str = "com.microsoft.cortana";
        a b2 = ImmutableMap.g().b(str, new qql(str));
        String str2 = "com.microsoft.cortana.wip";
        a b3 = b2.b(str2, new qql(str2));
        String str3 = "com.microsoft.cortana.daily";
        a = b3.b(str3, new qql(str3)).b();
    }

    private qql(String str) {
        this.b = str;
    }

    public final rqi a() {
        return new a("Cortana").d("microsoft").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
