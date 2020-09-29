package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation;

/* renamed from: vzx reason: default package */
public final class vzx {

    /* renamed from: vzx$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vzx.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vzy vzy, a aVar) {
        String str = aVar.a;
        if (!(!vzy.e().equals(str))) {
            int i = AnonymousClass1.a[aVar.b.ordinal()];
            if (i == 1) {
                return kng.b(vzy.a(true).a(vzz.c(str)));
            }
            if (i == 2) {
                return kng.b(vzy.a(vzz.f(str)));
            }
            if (i == 3) {
                return kng.b(vzy.a(true).a(vzz.e(str)));
            }
            if (i == 4) {
                return kng.b(vzy.a((vzz) new b()));
            }
            if (i == 5) {
                return kng.b(vzy.a(vzz.a(str)));
            }
        }
        return kng.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vzy vzy, b bVar) {
        String str = bVar.a;
        if (fbo.a(str)) {
            return kng.b(vzy.a((vzz) new b()));
        }
        return kng.a(vzy.a(vzz.a(str)), kmt.a(new a(str)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vzy vzy, c cVar) {
        if (vzy.a() instanceof g) {
            return kng.a(kmt.a(new b()));
        } else if (!(vzy.a() instanceof e) && !(vzy.a() instanceof a)) {
            return kng.b(vzy.a(true));
        } else {
            return kng.a(vzy.a(vzz.b(vzy.e())), kmt.a(new c(vzy.e())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(vzy vzy, d dVar) {
        if (!dVar.b.a) {
            return dVar.b.b ? kng.b(vzy.a(vzz.g(dVar.a))) : kng.b(vzy.a(vzz.a(dVar.a, dVar.b.c)));
        }
        return kng.a(vzy.a(vzz.d(dVar.a)), kmt.a(new b()));
    }

    public static kng<vzy, vzv> a(vzy vzy, vzw vzw) {
        return (kng) vzw.a((gee<b, R_>) new $$Lambda$vzx$5O9PAzlz3VeIjg4CXyX54JsvQ4o<b,R_>(vzy), (gee<a, R_>) new $$Lambda$vzx$a4zqhN3MxclJDbvlHTuhPcCfkY<a,R_>(vzy), (gee<d, R_>) new $$Lambda$vzx$TtAYVIoD74QsVvT8wcmjVeJ6G8<d,R_>(vzy), (gee<c, R_>) new $$Lambda$vzx$eY5ec2D3NCzWXWufYyIyAfjnA5c<c,R_>(vzy));
    }
}
