package defpackage;

/* renamed from: ajh reason: default package */
final class ajh implements ajx {
    private final int a = 1024;
    private final ajx[] b;
    private final aji c;

    public ajh(int i, ajx... ajxArr) {
        this.b = ajxArr;
        this.c = new aji(1024);
    }

    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        ajx[] ajxArr;
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (ajx ajx : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = ajx.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.a) {
            stackTraceElementArr2 = this.c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
