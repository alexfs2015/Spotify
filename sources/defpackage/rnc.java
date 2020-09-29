package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: rnc reason: default package */
public abstract class rnc {
    private final rnf a;
    private rnd b;

    public abstract rnd a(rnd rnd);

    public rnc(rnf rnf) {
        this.a = rnf;
    }

    public final ObjectMapper a() {
        if (this.b == null) {
            this.b = a(this.a.a());
        }
        return this.b.a();
    }
}
