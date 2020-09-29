package defpackage;

import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;

/* renamed from: -$$Lambda$vle$IYcaDE8x-HSzKttqioPgjo64pfY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vle$IYcaDE8xHSzKttqioPgjo64pfY implements gct {
    private final /* synthetic */ vlf f$0;

    public /* synthetic */ $$Lambda$vle$IYcaDE8xHSzKttqioPgjo64pfY(vlf vlf) {
        this.f$0 = vlf;
    }

    public final Object apply(Object obj) {
        return EmailSignupRequestBody.builder().email(this.f$0.b().f()).password(this.f$0.c().e()).passwordRepeat(this.f$0.c().e()).birthYear(this.f$0.d().c()).birthMonth(this.f$0.d().b() + 1).birthDay(this.f$0.d().a()).name(this.f$0.f().f()).gender((Gender) this.f$0.e().a().a((gct<c, R_>) $$Lambda$vle$5JeJbHaLppsUlvJWXrZUYZtSYM.INSTANCE, (gct<b, R_>) $$Lambda$vle$cVFhPuwHfpsjzLhwAGpYiUIcis.INSTANCE, (gct<a, R_>) $$Lambda$vle$tEkjQQAg2JUvD2raHffOXssdk2U.INSTANCE, (gct<d, R_>) $$Lambda$vle$LlXFSOdDWzSTjFznE4M0vycgvRg.INSTANCE)).iAgree(true).build();
    }
}
