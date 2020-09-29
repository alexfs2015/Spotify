package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError;

/* renamed from: nzh reason: default package */
public class nzh extends vtv implements b {
    public a a;
    public jfu b;

    public static nzh c() {
        return new nzh();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.a.a();
    }

    public final void B() {
        this.a.b();
        super.B();
    }

    public final void a() {
        Logger.b("Account Linking OK", new Object[0]);
        b(-1, null);
    }

    public final void a(PartnerAccountLinkingError partnerAccountLinkingError) {
        Logger.b("Account Linking finished with error: %s, message: %s", partnerAccountLinkingError.a().mValue, partnerAccountLinkingError.b());
        Intent intent = new Intent();
        intent.putExtra(LogMessage.SEVERITY_ERROR, partnerAccountLinkingError.a().mValue);
        intent.putExtra("error_message", partnerAccountLinkingError.b());
        b(0, intent);
    }

    private void b(int i, Intent intent) {
        ((ka) fay.a(p())).setResult(i, intent);
        ((ka) fay.a(p())).finish();
    }

    public final void g_(int i) {
        startActivityForResult(jfu.a((Context) fay.a(p())), ContentType.SHORT_FORM_ON_DEMAND);
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        this.a.a(i, i2, intent);
    }

    public final void a(int i, Intent intent) {
        startActivityForResult(intent, i);
    }
}
