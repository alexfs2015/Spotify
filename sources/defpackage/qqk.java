package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: qqk reason: default package */
final class qqk implements qqo {
    static final ImmutableMap<String, qqo> a;
    private final String b;

    static {
        String str = "com.samsung.android.bixby.service";
        a = ImmutableMap.g().b(str, new qqk(str)).b();
    }

    private qqk(String str) {
        this.b = str;
    }

    public final rqi a() {
        return new a("Bixby").d("samsung").a(this.b).b("android_media_session").c("voice_assistant").a();
    }
}
