package com.comscore.android.vce;

import com.spotify.mobile.android.spotlets.ads.model.Ad;

class ac {
    q a;
    final b b;

    ac(b bVar, q qVar) {
        this.b = bVar;
        this.a = qVar;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) {
        Object[] objArr = new Object[15];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(this.b.a());
        objArr[2] = ad.b(this.b.b());
        boolean d = this.b.d();
        String str2 = "1";
        String str3 = Ad.DEFAULT_SKIPPABLE_AD_DELAY;
        objArr[3] = d ? str2 : str3;
        objArr[4] = this.b.e() ? str2 : str3;
        if (!this.b.f()) {
            str2 = str3;
        }
        objArr[5] = str2;
        objArr[6] = ad.b(this.a.K());
        objArr[7] = this.a.B();
        objArr[8] = ad.b(this.a.v());
        objArr[9] = ad.b(this.a.z());
        objArr[10] = ad.b(this.a.x());
        objArr[11] = this.a.y();
        objArr[12] = this.a.E();
        objArr[13] = ad.b(this.b.m());
        objArr[14] = ad.b(this.b.l());
        return String.format("%s?cp=%s&am=%s&ad=%s&mt=%s&nt=%s&ns_vc_sv=%s&ns_ak=%s&ns_ap_an=%s&ns_ap_bi=%s&ns_ap_ver=%s&ns_vc_sver=%s&ns_vc_vd=%s&ns_vc_pa=%s&ns_vc_pb=%s", objArr);
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, String str2, String str3) {
        return String.format("%s&ns_ad_wt=%s&ns_vc_sv=%s&ns_ak=%s&ns_ap_an=%s&ns_ap_bi=%s&ns_ap_ver=%s&ns_vc_sver=%s&ns_vc_vd=%s&ns_vc_pa=%s&ns_vc_pb=%s", new Object[]{String.format("%s&ns__t=%s", new Object[]{ad.a(str), str2}), str3, ad.b(this.a.K()), this.a.B(), ad.b(this.a.v()), ad.b(this.a.z()), ad.b(this.a.x()), this.a.y(), this.a.E(), ad.b(this.b.m()), ad.b(this.b.l())});
    }

    /* access modifiers changed from: 0000 */
    public String a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s&ns__t=%s&ns__p=%s&ns_ad_event=%s&ns_ad_vevent=%s&ns_ad_wt=%s&ns_vc_sv=%s&ns_ak=%s&ns_ap_an=%s&ns_ap_bi=%s&ns_ap_ver=%s&ns_vc_sver=%s&ns_vc_vd=%s&ns_vc_pa=%s&ns_vc_pb=%s", new Object[]{str.replace("&c3=", "&c3=_e0_"), str2, str3, str4, str5, str6, ad.b(this.a.K()), this.a.B(), ad.b(this.a.v()), ad.b(this.a.z()), ad.b(this.a.x()), this.a.y(), this.a.E(), ad.b(this.b.m()), ad.b(this.b.l())});
    }
}
