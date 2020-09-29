package com.comscore.android.vce;

import android.webkit.CookieManager;

class d implements e {
    k a;

    d(k kVar) {
        this.a = kVar;
    }

    public void deleteCookie(String str, String str2) {
        CookieManager j = this.a.j();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("=; expires=Thu, 01 Jan 1970 00:00:01 GMT;");
        j.setCookie(str, sb.toString());
    }

    public String getCookie(String str) {
        return this.a.j().getCookie(str);
    }

    public void setCookie(String str, String str2, String str3) {
        CookieManager j = this.a.j();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("=");
        sb.append(str3);
        j.setCookie(str, sb.toString());
    }
}
