package defpackage;

import java.util.UUID;

/* renamed from: hqu reason: default package */
public final class hqu {
    private final jtz a;

    protected hqu(jtz jtz) {
        this.a = jtz;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(this.a.a()));
        sb.append(UUID.randomUUID());
        return sb.toString();
    }
}
