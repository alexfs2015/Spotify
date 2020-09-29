package defpackage;

/* renamed from: ufx reason: default package */
public final class ufx {
    final vkv a;
    final String b;
    final int c;

    private ufx(vkv vkv, String str, int i) {
        this.a = vkv;
        this.b = str;
        this.c = i;
    }

    public static ufx a(vkv vkv, String str, int i) {
        return new ufx(vkv, str, i);
    }
}
