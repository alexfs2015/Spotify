package defpackage;

import com.spotify.mobile.android.spotlets.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorships;
import io.reactivex.Single;

/* renamed from: ihx reason: default package */
public interface ihx {
    @xhn(a = "sponsoredplaylist/v1/sponsored")
    Single<xgo<Sponsorships>> a();

    @xhn(a = "sponsoredplaylist/v1/sponsored/{contextUri}")
    Single<xgo<SponsorshipAdData>> a(@xia(a = "contextUri") String str);
}
