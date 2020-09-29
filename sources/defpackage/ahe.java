package defpackage;

import defpackage.ahe;

/* renamed from: ahe reason: default package */
public abstract class ahe<T extends ahe> extends ago<T> {
    private agn a;

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
