package defpackage;

import java.util.List;

/* renamed from: baq reason: default package */
public final class baq extends baa {
    private final bar c;

    public baq(List<byte[]> list) {
        super("DvbDecoder");
        bea bea = new bea((byte[]) list.get(0));
        this.c = new bar(bea.d(), bea.d());
    }

    public final /* synthetic */ bac a(byte[] bArr, int i, boolean z) {
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
        return new bas(this.c.a(bArr, i));
    }
}
