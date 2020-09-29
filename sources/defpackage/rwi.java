package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: rwi reason: default package */
public abstract class rwi {
    private final rwl a;
    private rwj b;

    public rwi(rwl rwl) {
        this.a = rwl;
    }

    public final ObjectMapper a() {
        if (this.b == null) {
            this.b = a(this.a.a());
        }
        return this.b.a();
    }

    public abstract rwj a(rwj rwj);
}
