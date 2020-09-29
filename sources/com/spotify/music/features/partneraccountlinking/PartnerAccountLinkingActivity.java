package com.spotify.music.features.partneraccountlinking;

import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;

public class PartnerAccountLinkingActivity extends kyd {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_account_linking);
        i().a().a(R.id.fragment, nzh.c(), "partner_account_linking").b();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SSO_PARTNERACCOUNTLINKING, null);
    }

    public void onBackPressed() {
        nzh nzh = (nzh) i().a("partner_account_linking");
        if (nzh != null) {
            nzh.a.c();
        } else {
            super.onBackPressed();
        }
    }
}
