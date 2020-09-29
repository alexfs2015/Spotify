package defpackage;

import java.util.List;

/* renamed from: azz reason: default package */
public final class azz extends azj {
    private final baa c;

    public azz(List<byte[]> list) {
        super("DvbDecoder");
        bdj bdj = new bdj((byte[]) list.get(0));
        this.c = new baa(bdj.d(), bdj.d());
    }

    public final /* synthetic */ azl a(byte[] bArr, int i, boolean z) {
        if (z) {
            h hVar = this.c.a;
            hVar.c.clear();
            hVar.d.clear();
            hVar.e.clear();
            hVar.f.clear();
            hVar.g.clear();
            hVar.h = null;
            hVar.i = null;
        }
        return new bab(this.c.a(bArr, i));
    }
}
