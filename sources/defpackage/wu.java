package defpackage;

import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.TrackingState;
import org.json.JSONObject;

/* renamed from: wu reason: default package */
public class wu {
    private ActivityKind a;
    public boolean b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public JSONObject g;
    public TrackingState h;
    public AdjustAttribution i;

    /* renamed from: wu$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ActivityKind.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.adjust.sdk.ActivityKind[] r0 = com.adjust.sdk.ActivityKind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.SESSION     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.CLICK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.ATTRIBUTION     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.adjust.sdk.ActivityKind r1 = com.adjust.sdk.ActivityKind.EVENT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wu.AnonymousClass1.<clinit>():void");
        }
    }

    protected wu() {
    }

    public static wu a(ActivityPackage activityPackage) {
        wu wuVar;
        wu wuVar2;
        ActivityKind activityKind = activityPackage.activityKind;
        int i2 = AnonymousClass1.a[activityKind.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                wuVar = new ww();
            } else if (i2 == 3) {
                wuVar = new vz();
            } else if (i2 != 4) {
                wuVar = new wu();
            } else {
                wuVar2 = new wb(activityPackage);
            }
            wuVar.a = activityKind;
            return wuVar;
        }
        wuVar2 = new wy(activityPackage);
        wuVar = wuVar2;
        wuVar.a = activityKind;
        return wuVar;
    }

    public String toString() {
        return xa.a("message:%s timestamp:%s json:%s", this.e, this.f, this.g);
    }
}
