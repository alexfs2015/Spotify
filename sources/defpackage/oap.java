package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;
import com.spotify.signup.api.services.model.IdentifierTokenSignupRequestBody;
import com.spotify.signup.api.services.model.IdentifierTokenSignupResponse;
import io.reactivex.Single;
import java.util.Calendar;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: oap reason: default package */
public final class oap {
    public a a;
    public String b;
    public Calendar c;
    public Gender d;
    private final jro e;
    private final vju f;
    private final ujc g;

    /* renamed from: oap$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[SignupErrorStatus.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.signup.api.services.SignupErrorStatus[] r0 = com.spotify.signup.api.services.SignupErrorStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.signup.api.services.SignupErrorStatus r1 = com.spotify.signup.api.services.SignupErrorStatus.STATUS_UNKNOWN_ERROR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.signup.api.services.SignupErrorStatus r1 = com.spotify.signup.api.services.SignupErrorStatus.STATUS_INVALID_FORM_DATA     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.signup.api.services.SignupErrorStatus r1 = com.spotify.signup.api.services.SignupErrorStatus.STATUS_INVALID_COUNTRY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.signup.api.services.SignupErrorStatus r1 = com.spotify.signup.api.services.SignupErrorStatus.STATUS_VALIDATE_TOO_YOUNG     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.signup.api.services.SignupErrorStatus r1 = com.spotify.signup.api.services.SignupErrorStatus.STATUS_NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.signup.api.services.SignupErrorStatus r1 = com.spotify.signup.api.services.SignupErrorStatus.STATUS_ALREADY_REGISTERED     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.spotify.signup.api.services.SignupErrorStatus r1 = com.spotify.signup.api.services.SignupErrorStatus.STATUS_EMAIL_ALREADY_EXISTS     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.spotify.signup.api.services.SignupErrorStatus r1 = com.spotify.signup.api.services.SignupErrorStatus.STATUS_INVALID_EMAIL     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.oap.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: oap$a */
    public interface a {
        void a();

        void a(String str);
    }

    public oap(jro jro, vju vju, ujc ujc) {
        this.e = (jro) fay.a(jro);
        this.f = (vju) fay.a(vju);
        this.g = ujc;
    }

    public final boolean a() {
        return (this.b == null || this.c == null || this.d == null) ? false : true;
    }

    public final void b() {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final Single<String> c() {
        fay.b(a());
        fay.b(a());
        fay.a(this.b);
        fay.a(this.c);
        IdentifierTokenSignupRequestBody build = IdentifierTokenSignupRequestBody.builder().identifierToken(this.b).gender(this.d).birthDay(this.c.get(5)).birthMonth(this.c.get(2) + 1).birthYear(this.c.get(1)).iAgree(true).appVersion(Integer.toString(852700957)).build();
        vju vju = this.f;
        if (!fax.a(vju.b)) {
            build = build.withCreationPoint(vju.b);
        }
        return vju.a.a(build).f(new $$Lambda$oap$XzN68M13V1cIMBz2avmWcc_4ZdY(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(IdentifierTokenSignupResponse identifierTokenSignupResponse) {
        if (identifierTokenSignupResponse.status().isOk()) {
            return (String) fay.a(identifierTokenSignupResponse.status().asOk().oneTimeToken());
        }
        if (identifierTokenSignupResponse.status().isError()) {
            a(identifierTokenSignupResponse.status().asError().status(), identifierTokenSignupResponse.status().asError().errors());
        } else if (identifierTokenSignupResponse.status().isUnknown()) {
            a(SignupErrorStatus.STATUS_UNKNOWN_ERROR, Collections.emptyMap());
        }
        throw new RuntimeException("Failed to create acccount");
    }

    private void a(SignupErrorStatus signupErrorStatus, Map<String, String> map) {
        Logger.e("Failed to create account: %s", signupErrorStatus);
        for (Entry entry : map.entrySet()) {
            Logger.e("- %s: %s", entry.getKey(), entry.getValue());
        }
        int i = AnonymousClass1.a[signupErrorStatus.ordinal()];
        if (i != 1) {
            if (i == 2) {
                String str = (String) map.get("birthdate");
                if (str != null) {
                    this.g.a(ScreenIdentifier.PHONE_NUMBER_SIGN_UP, ErrorTypeIdentifier.AGE_GENERIC, InputFieldIdentifier.AGE);
                    a aVar = this.a;
                    if (aVar != null) {
                        aVar.a(str);
                    }
                }
            } else if (i == 3) {
                this.g.a(ScreenIdentifier.PHONE_NUMBER_SIGN_UP, ErrorTypeIdentifier.INVALID_COUNTRY, (InputFieldIdentifier) null);
                return;
            } else if (i == 4) {
                this.g.a(ScreenIdentifier.PHONE_NUMBER_SIGN_UP, ErrorTypeIdentifier.TOO_YOUNG_AGE, InputFieldIdentifier.AGE);
                a aVar2 = this.a;
                if (aVar2 != null) {
                    aVar2.a();
                    return;
                }
            } else if (i == 5) {
                this.g.a(ScreenIdentifier.PHONE_NUMBER_AGE_GENDER, ErrorTypeIdentifier.NO_CONNECTION, (InputFieldIdentifier) null);
            }
            return;
        }
        this.g.a(ScreenIdentifier.PHONE_NUMBER_SIGN_UP, ErrorTypeIdentifier.GENERIC, (InputFieldIdentifier) null);
    }
}
