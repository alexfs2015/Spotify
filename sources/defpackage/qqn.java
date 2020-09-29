package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: qqn reason: default package */
final class qqn implements qqo {
    static final ImmutableMap<String, qqo> a;
    private final String b;

    static {
        String str = "com.example.android.mediacontroller";
        a = ImmutableMap.g().b(str, new qqn(str)).b();
    }

    private qqn(String str) {
        this.b = str;
    }

    public final rqi a() {
        return new a("AssistantOther").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
