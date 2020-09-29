package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation;

/* renamed from: vmr reason: default package */
public final class vmr {

    /* renamed from: vmr$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[PasswordValidation.values().length];

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
                com.spotify.libs.signup.validators.PasswordValidator$PasswordValidation[] r0 = com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.libs.signup.validators.PasswordValidator$PasswordValidation r1 = com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation.VALID     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.libs.signup.validators.PasswordValidator$PasswordValidation r1 = com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation.TOO_SHORT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.libs.signup.validators.PasswordValidator$PasswordValidation r1 = com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation.TOO_WEAK     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.libs.signup.validators.PasswordValidator$PasswordValidation r1 = com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation.NOT_SET     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.libs.signup.validators.PasswordValidator$PasswordValidation r1 = com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation.NOT_VALIDATED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vmr.AnonymousClass1.<clinit>():void");
        }
    }

    public static kjx<vms, vmp> a(vms vms, vmq vmq) {
        return (kjx) vmq.a((gct<b, R_>) new $$Lambda$vmr$FX4Webiqk9SFN1bCyyubSd1zwKA<b,R_>(vms), (gct<a, R_>) new $$Lambda$vmr$rCBUL7ECOWUZw5mliUIZMxBL24E<a,R_>(vms), (gct<d, R_>) new $$Lambda$vmr$x_irDBP77onQLg1hdZQrDsUfBkA<d,R_>(vms), (gct<c, R_>) new $$Lambda$vmr$MVnTpJwnGR00_7_Zv1gd2cIEfIw<c,R_>(vms));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vms vms, c cVar) {
        if (vms.a() instanceof g) {
            return kjx.a(kjk.a(new b()));
        } else if (!(vms.a() instanceof e) && !(vms.a() instanceof a)) {
            return kjx.b(vms.a(true));
        } else {
            return kjx.a(vms.a(vmt.b(vms.e())), kjk.a(new c(vms.e())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vms vms, d dVar) {
        if (dVar.b.a) {
            return kjx.a(vms.a(vmt.d(dVar.a)), kjk.a(new b()));
        } else if (dVar.b.b) {
            return kjx.b(vms.a(vmt.g(dVar.a)));
        } else {
            return kjx.b(vms.a(vmt.a(dVar.a, dVar.b.c)));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vms vms, a aVar) {
        String str = aVar.a;
        if (!(!vms.e().equals(str))) {
            int i = AnonymousClass1.a[aVar.b.ordinal()];
            if (i == 1) {
                return kjx.b(vms.a(true).a(vmt.c(str)));
            }
            if (i == 2) {
                return kjx.b(vms.a(vmt.f(str)));
            }
            if (i == 3) {
                return kjx.b(vms.a(true).a(vmt.e(str)));
            }
            if (i == 4) {
                return kjx.b(vms.a((vmt) new b()));
            }
            if (i == 5) {
                return kjx.b(vms.a(vmt.a(str)));
            }
        }
        return kjx.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(vms vms, b bVar) {
        String str = bVar.a;
        if (fax.a(str)) {
            return kjx.b(vms.a((vmt) new b()));
        }
        return kjx.a(vms.a(vmt.a(str)), kjk.a(new a(str)));
    }
}
