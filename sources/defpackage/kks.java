package defpackage;

/* renamed from: kks reason: default package */
public final class kks {
    public static RuntimeException a(Exception exc) {
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException(exc);
    }
}
