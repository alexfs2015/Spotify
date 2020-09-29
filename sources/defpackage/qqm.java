package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: qqm reason: default package */
final class qqm implements qqo {
    static final ImmutableMap<String, qqo> a;
    private final String b;

    static {
        String str = "com.google.android.googlequicksearchbox";
        a = ImmutableMap.g().b(str, new qqm(str)).b();
    }

    private qqm(String str) {
        this.b = str;
    }

    public final rqi a() {
        return new a("GoogleAssistant").d("google").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
