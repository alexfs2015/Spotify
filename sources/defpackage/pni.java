package defpackage;

import io.reactivex.Single;

/* renamed from: pni reason: default package */
public interface pni {
    @xhn(a = "{service}/v3/page")
    Single<String> a(@xia(a = "service") String str, @xib(a = "locale") String str2, @xib(a = "device_id") String str3, @xib(a = "partner_id") String str4, @xib(a = "referrer_id") String str5, @xib(a = "build_model") String str6, @xib(a = "override_eligibility") String str7, @xib(a = "override_time") String str8, @xib(a = "override_country") String str9);
}
