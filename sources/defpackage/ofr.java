package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.music.features.partneraccountlinking.PartnerAccountLinkingError;

/* renamed from: ofr reason: default package */
public class ofr extends wib implements b {
    public ofy T;
    public a a;
    public jij b;

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean a(Intent intent, Integer num) {
        startActivityForResult(intent, num.intValue());
        return Boolean.TRUE;
    }

    private void a(int i, Intent intent) {
        ((kf) fbp.a(p())).setResult(i, intent);
        ((kf) fbp.a(p())).finish();
    }

    public static ofr c() {
        return new ofr();
    }

    public final void B() {
        this.a.b();
        this.T.a();
        super.B();
    }

    public final void a() {
        Logger.b("Account Linking OK", new Object[0]);
        a(-1, (Intent) null);
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (!this.T.b.onActivityResult(i, i2, intent)) {
            this.a.a(i, i2);
        }
    }

    public final void a(PartnerAccountLinkingError partnerAccountLinkingError) {
        Logger.b("Account Linking finished with error: %s, message: %s", partnerAccountLinkingError.a().mValue, partnerAccountLinkingError.b());
        Intent intent = new Intent();
        intent.putExtra(LogMessage.SEVERITY_ERROR, partnerAccountLinkingError.a().mValue);
        intent.putExtra("error_message", partnerAccountLinkingError.b());
        a(0, intent);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.a.a();
        this.T.a = new $$Lambda$ofr$K28CI_M4nNDmUGb_7mn5ILlda4(this);
    }

    public final void g_(int i) {
        startActivityForResult(jij.a((Context) fbp.a(p())), ContentType.SHORT_FORM_ON_DEMAND);
    }
}
