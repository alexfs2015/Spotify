package com.spotify.music.features.partneraccountlinking;

import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class PartnerAccountLinkingActivity extends lbm {
    public final rmf af() {
        return rmf.a(PageIdentifiers.SSO_PARTNERACCOUNTLINKING, null);
    }

    public void onBackPressed() {
        ofr ofr = (ofr) i().a("partner_account_linking");
        if (ofr != null) {
            ofr.a.c();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_account_linking);
        i().a().a(R.id.fragment, ofr.c(), "partner_account_linking").b();
    }
}
