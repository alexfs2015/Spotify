package defpackage;

/* renamed from: vvj reason: default package */
public final class vvj {
    public final String a;
    private final StackTraceElement[] b;
    private final StackTraceElement[] c;

    private vvj(String str, StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        this.a = str;
        this.b = stackTraceElementArr;
        this.c = stackTraceElementArr2;
    }

    public static vvj a(String str, StackTraceElement[] stackTraceElementArr) {
        return new vvj(str, stackTraceElementArr, vvi.a());
    }

    public final Throwable a(String str, String str2) {
        RuntimeException runtimeException = new RuntimeException(str2);
        runtimeException.setStackTrace(this.b);
        RuntimeException runtimeException2 = new RuntimeException(str, runtimeException);
        runtimeException2.setStackTrace(this.c);
        return runtimeException2;
    }
}
