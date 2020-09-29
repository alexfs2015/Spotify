package defpackage;

import defpackage.ahs;

/* renamed from: ahs reason: default package */
public abstract class ahs<T extends ahs> extends ahc<T> {
    private ahb a;

    /* access modifiers changed from: 0000 */
    public abstract String a();

    public String toString() {
        StringBuilder sb = new StringBuilder("{type:\"");
        sb.append(a());
        sb.append('\"');
        sb.append(", predefinedAttributes:");
        sb.append(this.a);
        sb.append(", customAttributes:");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
