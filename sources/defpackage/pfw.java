package defpackage;

import io.reactivex.Single;

/* renamed from: pfw reason: default package */
public interface pfw {
    @wti(a = "{service}/v3/page")
    Single<String> a(@wtv(a = "service") String str, @wtw(a = "locale") String str2, @wtw(a = "device_id") String str3, @wtw(a = "partner_id") String str4, @wtw(a = "referrer_id") String str5, @wtw(a = "build_model") String str6, @wtw(a = "override_eligibility") String str7, @wtw(a = "override_time") String str8, @wtw(a = "override_country") String str9);
}
