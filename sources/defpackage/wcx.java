package defpackage;

/* renamed from: wcx reason: default package */
public class wcx implements wdg<CharSequence> {
    static {
        new wcx();
    }

    /* renamed from: a */
    public CharSequence b(Object obj) {
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }
}
