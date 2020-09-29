package defpackage;

import com.spotify.mobile.android.spotlets.ads.sponsorship.model.SponsorshipAdData;
import com.spotify.mobile.android.spotlets.ads.sponsorship.model.Sponsorships;
import io.reactivex.Single;

/* renamed from: ifk reason: default package */
public interface ifk {
    @wti(a = "sponsoredplaylist/v1/sponsored")
    Single<wsj<Sponsorships>> a();

    @wti(a = "sponsoredplaylist/v1/sponsored/{contextUri}")
    Single<wsj<SponsorshipAdData>> a(@wtv(a = "contextUri") String str);
}
