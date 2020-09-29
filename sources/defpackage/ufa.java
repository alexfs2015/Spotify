package defpackage;

/* renamed from: ufa reason: default package */
public final class ufa extends a {
    public vkv[] a = new vkv[0];
    public vkv[] b = new vkv[0];
    private final vkw c;

    public ufa(vkw vkw) {
        this.c = vkw;
    }

    public final int a() {
        return this.b.length;
    }

    public final boolean a(int i, int i2) {
        vkv vkv = this.b[i];
        vkv vkv2 = this.a[i2];
        return vkv.isHeader() ? vkv.getHeader().equals(vkv2.getHeader()) : vkv.getUri().equals(vkv2.getUri());
    }

    public final int b() {
        return this.a.length;
    }

    public final boolean b(int i, int i2) {
        vkv vkv = this.b[i];
        vkv vkv2 = this.a[i2];
        return vkv.isHeader() ? vkv.getHeader().equals(vkv2.getHeader()) : this.c.a(vkv, vkv2);
    }
}
