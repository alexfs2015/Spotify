package defpackage;

import java.util.List;

/* renamed from: eoa reason: default package */
abstract class eoa {
    private static final eoa a = new eob(0);
    private static final eoa b = new eoc(0);

    private eoa() {
    }

    /* synthetic */ eoa(byte b2) {
        this();
    }

    static eoa a() {
        return a;
    }

    static eoa b() {
        return b;
    }

    /* access modifiers changed from: 0000 */
    public abstract <L> List<L> a(Object obj, long j);

    /* access modifiers changed from: 0000 */
    public abstract <L> void a(Object obj, Object obj2, long j);

    /* access modifiers changed from: 0000 */
    public abstract void b(Object obj, long j);
}
