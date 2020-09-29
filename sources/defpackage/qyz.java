package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: qyz reason: default package */
final class qyz implements qzd {
    static final ImmutableMap<String, qzd> a;
    private final String b;

    static {
        String str = "com.samsung.android.bixby.service";
        a = ImmutableMap.g().b(str, new qyz(str)).b();
    }

    private qyz(String str) {
        this.b = str;
    }

    public final rzt a() {
        return new a("Bixby").d("samsung").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
