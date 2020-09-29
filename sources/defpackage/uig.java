package defpackage;

import android.text.TextUtils;

/* renamed from: uig reason: default package */
public final class uig implements uif {
    public int a;
    private final ufy b;
    private String c;
    private boolean d;

    public uig(ufy ufy) {
        this.b = ufy;
    }

    private boolean b(String str, boolean z) {
        return z != this.d || !TextUtils.equals(str, this.c);
    }

    public final int a() {
        return this.a;
    }

    public final void a(int i) {
        this.a = i;
    }

    public final void a(String str, boolean z) {
        if (b(str, z)) {
            this.c = str;
            this.d = z;
        }
    }

    public final boolean a(vkv vkv) {
        return d(vkv);
    }

    public final boolean b(vkv vkv) {
        return (this.b.a() && vkv.i()) || !vkv.k();
    }

    public final boolean c(vkv vkv) {
        return this.d && d(vkv);
    }

    public boolean d(vkv vkv) {
        return TextUtils.equals(this.c, vkv.getUri());
    }
}
