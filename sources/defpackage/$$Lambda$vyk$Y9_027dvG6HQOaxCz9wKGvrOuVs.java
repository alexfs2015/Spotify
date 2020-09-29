package defpackage;

import com.spotify.signup.api.services.model.EmailSignupRequestBody;
import com.spotify.signup.api.services.model.EmailSignupRequestBody.Gender;

/* renamed from: -$$Lambda$vyk$Y9_027dvG6HQOaxCz9wKGvrOuVs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vyk$Y9_027dvG6HQOaxCz9wKGvrOuVs implements gee {
    private final /* synthetic */ vyl f$0;

    public /* synthetic */ $$Lambda$vyk$Y9_027dvG6HQOaxCz9wKGvrOuVs(vyl vyl) {
        this.f$0 = vyl;
    }

    public final Object apply(Object obj) {
        return EmailSignupRequestBody.builder().email(this.f$0.b().f()).password(this.f$0.c().e()).passwordRepeat(this.f$0.c().e()).birthYear(this.f$0.d().c()).birthMonth(this.f$0.d().b() + 1).birthDay(this.f$0.d().a()).name(this.f$0.f().f()).gender((Gender) this.f$0.e().a().a((gee<c, R_>) $$Lambda$vyk$OPmDAfRvxZjVzcBNtUkCoxJA5o.INSTANCE, (gee<b, R_>) $$Lambda$vyk$M6xhPTUQ31rMSGsKol8l6HQi3mE.INSTANCE, (gee<a, R_>) $$Lambda$vyk$I3he8z90FlUHOY9uQ0KFLdR1ifs.INSTANCE, (gee<d, R_>) $$Lambda$vyk$4ow5qOQ1g3bkcbLSUV9xlGNOCUs.INSTANCE)).iAgree(true).build();
    }
}
