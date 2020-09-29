package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: vpo reason: default package */
public final class vpo implements vpn {
    private final jlr a;
    private final jtz b;

    public vpo(jlr jlr, jtz jtz) {
        this.a = jlr;
        this.b = jtz;
    }

    public final void a(String str, String str2, String str3) {
        Logger.a("sending AP log event for push received - messageId: %s, campaignId: %s, targetUri: %s", str, str2, str3);
        jlr jlr = this.a;
        av avVar = new av(str, str2, str3, this.b.a());
        jlr.a(avVar);
    }

    public final void a(String str, String str2, String str3, String str4) {
        jlr jlr = this.a;
        au auVar = new au(str, str2, str3, str4, this.b.a());
        jlr.a(auVar);
    }

    public final void a(String str, boolean z, boolean z2) {
        this.a.a(new ai(str, z, z2));
    }

    public final void b(String str, String str2, String str3) {
        Logger.a("sending AP log event for push opened - messageId: %s, campaignId: %s, targetUri: %s", str, str2, str3);
        jlr jlr = this.a;
        aw awVar = new aw(str, str2, str3, this.b.a());
        jlr.a(awVar);
    }
}
