package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.R;
import com.spotify.paste.widgets.DialogLayout;

public class MarketingOptInActivity extends kyd {
    public hee g;
    public jvy h;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogLayout dialogLayout = new DialogLayout(this);
        setContentView((View) dialogLayout);
        setResult(-1);
        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_marketing_opt_in_body, null);
        TextView textView = (TextView) inflate.findViewById(R.id.contact_us_text);
        String stringExtra = getIntent().getStringExtra("contactUsUrl");
        if (fax.a(stringExtra)) {
            textView.setVisibility(8);
        } else {
            String string = getString(R.string.marketing_opt_in_dialog_contact_us);
            StringBuilder sb = new StringBuilder("<a href=\"");
            sb.append(stringExtra);
            sb.append("\">");
            sb.append(string);
            sb.append("</a>");
            String sb2 = sb.toString();
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(jrw.a(sb2));
        }
        dialogLayout.a(inflate);
        dialogLayout.b((int) R.string.marketing_opt_in_dialog_decline_button, (OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                MarketingOptInActivity.a(MarketingOptInActivity.this, false);
                MarketingOptInActivity.this.finish();
            }
        });
        dialogLayout.a((int) R.string.marketing_opt_in_dialog_accept_button, (OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                MarketingOptInActivity.a(MarketingOptInActivity.this, true);
                MarketingOptInActivity.this.finish();
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        k();
    }

    private void k() {
        this.h.b(this).a().a(qfl.a, false).b();
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, MarketingOptInActivity.class);
        intent.putExtra("contactUsUrl", str);
        return intent;
    }

    static /* synthetic */ void a(MarketingOptInActivity marketingOptInActivity, boolean z) {
        marketingOptInActivity.g.a("send-email", z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        marketingOptInActivity.k();
    }
}
