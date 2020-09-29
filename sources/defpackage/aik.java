package defpackage;

import com.crashlytics.android.core.Report.Type;

/* renamed from: aik reason: default package */
final class aik implements aix {
    private final aiz a;
    private final ajj b;

    /* renamed from: aik$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.crashlytics.android.core.Report$Type[] r0 = com.crashlytics.android.core.Report.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.crashlytics.android.core.Report$Type r1 = com.crashlytics.android.core.Report.Type.JAVA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.crashlytics.android.core.Report$Type r1 = com.crashlytics.android.core.Report.Type.NATIVE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aik.AnonymousClass1.<clinit>():void");
        }
    }

    public aik(aiz aiz, ajj ajj) {
        this.a = aiz;
        this.b = ajj;
    }

    public final boolean a(aiw aiw) {
        int i = AnonymousClass1.a[aiw.b.g().ordinal()];
        if (i == 1) {
            this.a.a(aiw);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.b.a(aiw);
            return true;
        }
    }
}
