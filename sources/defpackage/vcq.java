package defpackage;

import com.spotify.base.java.logging.Logger;

/* renamed from: vcq reason: default package */
public final class vcq implements vcu {
    private final jjf a;
    private final jrp b;

    public vcq(jjf jjf, jrp jrp) {
        this.a = jjf;
        this.b = jrp;
    }

    public final void a(String str, String str2, String str3) {
        Logger.a("sending AP log event for push received - messageId: %s, campaignId: %s, targetUri: %s", str, str2, str3);
        jjf jjf = this.a;
        aw awVar = new aw(str, str2, str3, this.b.a());
        jjf.a(awVar);
    }

    public final void b(String str, String str2, String str3) {
        Logger.a("sending AP log event for push opened - messageId: %s, campaignId: %s, targetUri: %s", str, str2, str3);
        jjf jjf = this.a;
        ax axVar = new ax(str, str2, str3, this.b.a());
        jjf.a(axVar);
    }

    public final void a(String str, boolean z, boolean z2) {
        this.a.a(new aj(str, z, z2));
    }

    public final void a(String str, String str2, String str3, String str4) {
        jjf jjf = this.a;
        av avVar = new av(str, str2, str3, str4, this.b.a());
        jjf.a(avVar);
    }
}
