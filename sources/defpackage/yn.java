package defpackage;

import java.util.List;

/* renamed from: yn reason: default package */
public final class yn extends yi<aca> {
    public yn(List<abx<aca>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(abx abx, float f) {
        if (abx.b == null || abx.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        aca aca = (aca) abx.b;
        aca aca2 = (aca) abx.c;
        if (this.d != null) {
            aca aca3 = (aca) this.d.a(abx.e, abx.f.floatValue(), aca, aca2, f, b(), this.c);
            if (aca3 != null) {
                return aca3;
            }
        }
        float f2 = aca.a;
        float f3 = f2 + ((aca2.a - f2) * f);
        float f4 = aca.b;
        return new aca(f3, f4 + (f * (aca2.b - f4)));
    }
}
