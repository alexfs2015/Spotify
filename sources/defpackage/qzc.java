package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: qzc reason: default package */
final class qzc implements qzd {
    static final ImmutableMap<String, qzd> a;
    private final String b;

    static {
        String str = "com.example.android.mediacontroller";
        a = ImmutableMap.g().b(str, new qzc(str)).b();
    }

    private qzc(String str) {
        this.b = str;
    }

    public final rzt a() {
        return new a("AssistantOther").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
