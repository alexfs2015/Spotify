package defpackage;

/* renamed from: tjg reason: default package */
final class tjg extends tjl {
    private final c a;
    private final b b;

    /* renamed from: tjg$a */
    static final class a extends defpackage.tjl.a {
        private c a;
        private b b;

        a() {
        }

        public final defpackage.tjl.a a(b bVar) {
            if (bVar != null) {
                this.b = bVar;
                return this;
            }
            throw new NullPointerException("Null forShow");
        }

        public final defpackage.tjl.a a(c cVar) {
            if (cVar != null) {
                this.a = cVar;
                return this;
            }
            throw new NullPointerException("Null forTrack");
        }

        public final tjl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" forTrack");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" forShow");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new tjg(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private tjg(c cVar, b bVar) {
        this.a = cVar;
        this.b = bVar;
    }

    /* synthetic */ tjg(c cVar, b bVar, byte b2) {
        this(cVar, bVar);
    }

    /* access modifiers changed from: 0000 */
    public final c a() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final b b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tjl) {
            tjl tjl = (tjl) obj;
            return this.a.equals(tjl.a()) && this.b.equals(tjl.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuConfiguration{forTrack=");
        sb.append(this.a);
        sb.append(", forShow=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
