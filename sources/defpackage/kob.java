package defpackage;

/* renamed from: kob reason: default package */
public final class kob {
    public static RuntimeException a(Exception exc) {
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException(exc);
    }
}
