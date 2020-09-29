package defpackage;

/* renamed from: ait reason: default package */
final class ait implements ajj {
    private final int a = 1024;
    private final ajj[] b;
    private final aiu c;

    public ait(int i, ajj... ajjArr) {
        this.b = ajjArr;
        this.c = new aiu(1024);
    }

    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        ajj[] ajjArr;
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (ajj ajj : this.b) {
            if (stackTraceElementArr2.length <= this.a) {
                break;
            }
            stackTraceElementArr2 = ajj.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.a) {
            stackTraceElementArr2 = this.c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
