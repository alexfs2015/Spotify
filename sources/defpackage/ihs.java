package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorship;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: ihs reason: default package */
public final class ihs implements a {
    SponsorshipAdData a;
    public String b;
    private final hyh c;
    private final jlr d;
    private final hyi e;
    private final ihr f;
    private Sponsorship g;
    private boolean h;

    public ihs(hyh hyh, jlr jlr, hyi hyi, ihr ihr) {
        this.c = hyh;
        this.d = jlr;
        this.e = hyi;
        this.f = ihr;
    }

    public final void a() {
        if (!this.h) {
            SponsorshipAdData sponsorshipAdData = this.a;
            if (sponsorshipAdData != null) {
                hyh hyh = this.c;
                this.d.a(hyh.a("", "sponsored-context", sponsorshipAdData.lineItemId(), this.a.creativeId(), "event_viewed", "", null, 0));
                this.e.a(this.a.impression());
                this.e.a(this.a.thirdPartyImpression());
                this.h = true;
                this.g.displayedDuringSession();
            }
        }
    }

    public final void a(Context context) {
        SponsorshipAdData sponsorshipAdData = this.a;
        if (sponsorshipAdData != null && !fbo.a(sponsorshipAdData.clickThroughUrl())) {
            hyh hyh = this.c;
            this.d.a(hyh.a("", "sponsored-context", this.a.lineItemId(), this.a.creativeId(), "event_clicked", "", null, 0));
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

    public final void a(final ihy ihy) {
        final String str = this.b;
        if (str != null) {
            Sponsorship a2 = this.f.a(str);
            if (a2 != null) {
                this.g = a2;
                ihr ihr = this.f;
                ihr.a.a(str, new a<SponsorshipAdData>() {
                    public final void a(Throwable th) {
                        Logger.b("Failed to retrieve sponsorship data for %s", str);
                        ihy.a();
                    }

                    public final void a(xgo<SponsorshipAdData> xgo) {
                        Logger.b("Sponsorship request for %s loaded successfully", str);
                        ihs.this.a = (SponsorshipAdData) xgo.b();
                        if (ihs.this.a != null) {
                            ihy.b(ihs.this.a.logoUrl());
                            ihy.a(ihs.this.a.advertiserName());
                        }
                    }
                });
                return;
            }
            ihr ihr2 = this.f;
            SponsorshipAdData sponsorshipAdData = ihr2.c;
            ihr2.c = null;
            this.a = sponsorshipAdData;
            this.g = Sponsorship.create(Long.MIN_VALUE, Long.MAX_VALUE, "spotify:ad:preview");
            if (this.a != null) {
                Logger.b("Ad sponsorship - preview", new Object[0]);
                this.a = this.a;
                ihy.b(this.a.logoUrl());
                ihy.a(this.a.advertiserName());
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

    public final void a(boolean z) {
        this.h = z;
    }

    public final boolean b() {
        return this.h;
    }
}
