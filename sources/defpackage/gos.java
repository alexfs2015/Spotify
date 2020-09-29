package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation;
import java.util.HashSet;

/* renamed from: gos reason: default package */
public final class gos {

    /* renamed from: gos$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gos.AnonymousClass1.<clinit>():void");
        }
    }

    public static kjn<got, gop> a(got got) {
        return kjn.a(got);
    }

    public static kjx<got, gop> a(got got, goq goq) {
        return (kjx) goq.a((gct<b, R_>) new $$Lambda$gos$vb8ReFT6xcAB7C4Z4iqyv6tqFY<b,R_>(got), (gct<c, R_>) new $$Lambda$gos$7UpmapJQBFHfvORWdIN3AnfjU4I<c,R_>(got), (gct<f, R_>) new $$Lambda$gos$QkuZsFqd4YbOs61peYDasHw4lR4<f,R_>(got), (gct<e, R_>) new $$Lambda$gos$1SSTXEbYYex8AbhkryFtWgknSWk<e,R_>(got), (gct<d, R_>) new $$Lambda$gos$_kVnVi0dJ6lKm3PGzhqHIV5OGQ<d,R_>(got), (gct<a, R_>) $$Lambda$gos$npRvOAbsinXXLZpCofstHJLbI.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(got got, e eVar) {
        return (kjx) eVar.b.a((gct<c, R_>) new $$Lambda$gos$PkR5ScS9MjFApesR72PkfGiQdEM<c,R_>(got, eVar), (gct<a, R_>) new $$Lambda$gos$0YcOdcAtw_IHRx5_cdrqfGAkYoY<a,R_>(got, eVar), (gct<b, R_>) $$Lambda$gos$mHAd2V84faS3oVyNWNkrGlYQWxQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(got got, f fVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(new b(fVar.b, fVar.a));
        return kjx.a(got.a((goo) new e(fVar.a)), hashSet);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(got got, c cVar) {
        int i = AnonymousClass1.a[cVar.b.ordinal()];
        if (i == 1) {
            return kjx.b(got.a(goo.b(cVar.a)));
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return kjx.b(got.a(goo.a(cVar.a)));
        }
        return kjx.e();
    }
}
