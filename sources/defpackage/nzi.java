package defpackage;

import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError.ErrorType;

/* renamed from: nzi reason: default package */
public final class nzi {
    public final jjf a;
    public final jrp b;
    private final String c;

    public nzi(jjf jjf, jsi jsi, jrp jrp) {
        this.a = jjf;
        this.c = jsi.b();
        this.b = jrp;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, boolean z, String str2, String str3) {
        jjf jjf = this.a;
        ao aoVar = new ao(str, z, this.c, str2, str3);
        jjf.a(aoVar);
    }

    public final void a(String str, ErrorType errorType, String str2) {
        a(str, false, errorType.mValue, str2);
    }
}
