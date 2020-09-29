package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: wrw reason: default package */
public final class wrw extends wrq implements wsu {
    private final wsg b;
    private final boolean c;

    /* renamed from: wrw$a */
    static final class a extends wrr {
        private static final c<CharSequence> b = new c<CharSequence>() {
            public final /* synthetic */ void a(Object obj) {
                CharSequence charSequence = (CharSequence) obj;
                wrr.a.a(charSequence);
                if (wse.b.a(charSequence) || wse.k.a(charSequence) || wse.j.a(charSequence)) {
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

    public wrw() {
        this(woc.a(0));
    }

    public wrw(wnb wnb) {
        this(wnb, true);
    }

    public wrw(wnb wnb, boolean z) {
        super(wnb);
        this.b = new a(z);
        this.c = z;
    }

    private void a(StringBuilder sb) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append(wxt.a);
        }
    }

    public final /* bridge */ /* synthetic */ wsc a(Object obj) {
        super.b(obj);
        return this;
    }

    public final /* synthetic */ wvo b(Object obj) {
        super.b(obj);
        return this;
    }

    public final wsg c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(wxt.a);
        a(sb);
        sb.setLength(sb.length() - wxt.a.length());
        return sb.toString();
    }
}
