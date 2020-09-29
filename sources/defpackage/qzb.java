package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: qzb reason: default package */
final class qzb implements qzd {
    static final ImmutableMap<String, qzd> a;
    private final String b;

    static {
        String str = "com.google.android.googlequicksearchbox";
        a = ImmutableMap.g().b(str, new qzb(str)).b();
    }

    private qzb(String str) {
        this.b = str;
    }

    public final rzt a() {
        return new a("GoogleAssistant").d("google").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
