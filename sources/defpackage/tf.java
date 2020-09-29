package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: tf reason: default package */
final class tf {
    private final ComponentName a;

    /* renamed from: tf$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[NetworkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.work.NetworkType[] r0 = androidx.work.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.UNMETERED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.work.NetworkType r1 = androidx.work.NetworkType.METERED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.tf.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        sg.a("SystemJobInfoConverter");
    }

    tf(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.job.JobInfo a(defpackage.uj r11, int r12) {
        /*
            r10 = this;
            sc r0 = r11.j
            androidx.work.NetworkType r1 = r0.b
            int[] r2 = defpackage.tf.AnonymousClass1.a
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 26
            r4 = 24
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x003c
            if (r2 == r7) goto L_0x0038
            if (r2 == r6) goto L_0x003a
            if (r2 == r5) goto L_0x0026
            r6 = 5
            if (r2 == r6) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x002c
            goto L_0x003d
        L_0x0026:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L_0x002c
            r5 = 3
            goto L_0x003d
        L_0x002c:
            defpackage.sg.a()
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r8] = r1
            java.lang.String r1 = "API version too low. Cannot convert network type value %s"
            java.lang.String.format(r1, r2)
        L_0x0038:
            r5 = 1
            goto L_0x003d
        L_0x003a:
            r5 = 2
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            android.os.PersistableBundle r1 = new android.os.PersistableBundle
            r1.<init>()
            java.lang.String r2 = r11.a
            java.lang.String r6 = "EXTRA_WORK_SPEC_ID"
            r1.putString(r6, r2)
            boolean r2 = r11.a()
            java.lang.String r6 = "EXTRA_IS_PERIODIC"
            r1.putBoolean(r6, r2)
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r6 = r10.a
            r2.<init>(r12, r6)
            android.app.job.JobInfo$Builder r12 = r2.setRequiredNetworkType(r5)
            boolean r2 = r0.c
            android.app.job.JobInfo$Builder r12 = r12.setRequiresCharging(r2)
            boolean r2 = r0.d
            android.app.job.JobInfo$Builder r12 = r12.setRequiresDeviceIdle(r2)
            android.app.job.JobInfo$Builder r12 = r12.setExtras(r1)
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x007d
            androidx.work.BackoffPolicy r1 = r11.l
            androidx.work.BackoffPolicy r2 = androidx.work.BackoffPolicy.LINEAR
            if (r1 != r2) goto L_0x0078
            r9 = 0
        L_0x0078:
            long r1 = r11.m
            r12.setBackoffCriteria(r1, r9)
        L_0x007d:
            long r1 = r11.c()
            long r5 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r5
            r5 = 0
            long r1 = java.lang.Math.max(r1, r5)
            r12.setMinimumLatency(r1)
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r4) goto L_0x00c4
            boolean r11 = r0.a()
            if (r11 == 0) goto L_0x00c4
            sd r11 = r0.i
            java.util.Set<sd$a> r11 = r11.a
            java.util.Iterator r11 = r11.iterator()
        L_0x00a1:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = r11.next()
            sd$a r1 = (defpackage.sd.a) r1
            boolean r2 = r1.b
            android.app.job.JobInfo$TriggerContentUri r4 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r1 = r1.a
            r4.<init>(r1, r2)
            r12.addTriggerContentUri(r4)
            goto L_0x00a1
        L_0x00ba:
            long r1 = r0.g
            r12.setTriggerContentUpdateDelay(r1)
            long r1 = r0.h
            r12.setTriggerContentMaxDelay(r1)
        L_0x00c4:
            r12.setPersisted(r8)
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r3) goto L_0x00d5
            boolean r11 = r0.e
            r12.setRequiresBatteryNotLow(r11)
            boolean r11 = r0.f
            r12.setRequiresStorageNotLow(r11)
        L_0x00d5:
            android.app.job.JobInfo r11 = r12.build()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf.a(uj, int):android.app.job.JobInfo");
    }
}
