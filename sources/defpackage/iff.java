package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorship;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: iff reason: default package */
public final class iff implements a {
    SponsorshipAdData a;
    public String b;
    private final hvv c;
    private final jjf d;
    private final hvw e;
    private final ife f;
    private Sponsorship g;
    private boolean h;

    public iff(hvv hvv, jjf jjf, hvw hvw, ife ife) {
        this.c = hvv;
        this.d = jjf;
        this.e = hvw;
        this.f = ife;
    }

    public final void a(final ifl ifl) {
        final String str = this.b;
        if (str != null) {
            Sponsorship a2 = this.f.a(str);
            if (a2 != null) {
                this.g = a2;
                ife ife = this.f;
                ife.a.a(str, new a<SponsorshipAdData>() {
                    public final void a(wsj<SponsorshipAdData> wsj) {
                        Logger.b("Sponsorship request for %s loaded successfully", str);
                        iff.this.a = (SponsorshipAdData) wsj.b();
                        if (iff.this.a != null) {
                            ifl.b(iff.this.a.logoUrl());
                            ifl.a(iff.this.a.advertiserName());
                        }
                    }

                    public final void a(Throwable th) {
                        Logger.b("Failed to retrieve sponsorship data for %s", str);
                        ifl.a();
                    }
                });
                return;
            }
            ife ife2 = this.f;
            SponsorshipAdData sponsorshipAdData = ife2.c;
            ife2.c = null;
            this.a = sponsorshipAdData;
            this.g = Sponsorship.create(Long.MIN_VALUE, Long.MAX_VALUE, "spotify:ad:preview");
            if (this.a != null) {
                Logger.b("Ad sponsorship - preview", new Object[0]);
                this.a = this.a;
                ifl.b(this.a.logoUrl());
                ifl.a(this.a.advertiserName());
            }
        }
    }

    public final void a() {
        if (!this.h) {
            SponsorshipAdData sponsorshipAdData = this.a;
            if (sponsorshipAdData != null) {
                hvv hvv = this.c;
                this.d.a(hvv.a("", "sponsored-context", sponsorshipAdData.lineItemId(), this.a.creativeId(), "event_viewed", "", null, 0));
                this.e.a(this.a.impression());
                this.e.a(this.a.thirdPartyImpression());
                this.h = true;
                this.g.displayedDuringSession();
            }
        }
    }

    public final void a(String str) {
        if (!this.h) {
            SponsorshipAdData sponsorshipAdData = this.a;
            if (sponsorshipAdData != null) {
                this.d.a(this.c.a("", "sponsored-context", sponsorshipAdData.lineItemId(), this.a.creativeId(), str));
                this.h = true;
            }
        }
    }

    public final void a(Context context) {
        SponsorshipAdData sponsorshipAdData = this.a;
        if (sponsorshipAdData != null && !fax.a(sponsorshipAdData.clickThroughUrl())) {
            hvv hvv = this.c;
            this.d.a(hvv.a("", "sponsored-context", this.a.lineItemId(), this.a.creativeId(), "event_clicked", "", null, 0));
            this.e.a(this.a.clickTrackingUrl());
            Uri parse = Uri.parse(this.a.clickThroughUrl());
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", parse));
            } catch (ActivityNotFoundException unused) {
                StringBuilder sb = new StringBuilder("Could not open ad URI: ");
                sb.append(parse);
                Assertion.b(sb.toString());
            }
        }
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final boolean b() {
        return this.h;
    }
}
