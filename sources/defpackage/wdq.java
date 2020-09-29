package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: wdq reason: default package */
public final class wdq extends wdk implements weo {
    private final wea b;
    private final boolean c;

    /* renamed from: wdq$a */
    static final class a extends wdl {
        private static final c<CharSequence> b = new c<CharSequence>() {
            public final /* synthetic */ void a(Object obj) {
                CharSequence charSequence = (CharSequence) obj;
                wdl.a.a(charSequence);
                if (wdy.b.a(charSequence) || wdy.k.a(charSequence) || wdy.j.a(charSequence)) {
                    StringBuilder sb = new StringBuilder("prohibited trailing header: ");
                    sb.append(charSequence);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        };

        a(boolean z) {
            super(z, z ? b : c.a);
        }
    }

    public wdq() {
        this(vzw.a(0));
    }

    public wdq(vyv vyv) {
        this(vyv, true);
    }

    public wdq(vyv vyv, boolean z) {
        super(vyv);
        this.b = new a(z);
        this.c = z;
    }

    public final wea c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(wjn.a);
        a(sb);
        sb.setLength(sb.length() - wjn.a.length());
        return sb.toString();
    }

    private void a(StringBuilder sb) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append(wjn.a);
        }
    }

    public final /* bridge */ /* synthetic */ wdw a(Object obj) {
        super.b(obj);
        return this;
    }

    public final /* synthetic */ whi b(Object obj) {
        super.b(obj);
        return this;
    }
}
