package defpackage;

import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError.ErrorType;

/* renamed from: ofs reason: default package */
public final class ofs {
    public final jlr a;
    public final jtz b;
    private final String c;

    public ofs(jlr jlr, vos vos, jtz jtz) {
        this.a = jlr;
        this.c = vos.b();
        this.b = jtz;
    }

    public final void a(String str, ErrorType errorType, String str2) {
        a(str, false, errorType.mValue, str2);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, boolean z, String str2, String str3) {
        jlr jlr = this.a;
        an anVar = new an(str, z, this.c, str2, str3);
        jlr.a(anVar);
    }
}
