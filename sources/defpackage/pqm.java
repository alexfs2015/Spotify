package defpackage;

import com.spotify.music.features.quicksilver.qa.QuicksilverAdminBannerMessage;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminCardMessage;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminNoteMessage;
import io.reactivex.Single;
import java.util.List;

/* renamed from: pqm reason: default package */
public interface pqm {
    @wti(a = "{base}/v1/locales")
    Single<List<pql>> a(@wtv(a = "base") String str);

    @wts(a = "{base}/v1/creatives/{message_id}/{accept_reject}")
    Single<String> a(@wtv(a = "base") String str, @wtv(a = "message_id") String str2, @wtv(a = "accept_reject") String str3);

    @wti(a = "{base}/v1/creatives")
    Single<List<QuicksilverAdminCardMessage>> a(@wtv(a = "base") String str, @wtw(a = "campaign_id") String str2, @wtw(a = "status") String str3, @wtw(a = "preview") boolean z, @wtw(a = "type") String str4, @wtw(a = "locale") String str5);

    @wti(a = "{base}/v1/creatives")
    Single<List<QuicksilverAdminBannerMessage>> b(@wtv(a = "base") String str, @wtw(a = "campaign_id") String str2, @wtw(a = "status") String str3, @wtw(a = "preview") boolean z, @wtw(a = "type") String str4, @wtw(a = "locale") String str5);

    @wti(a = "{base}/v1/creatives")
    Single<List<QuicksilverAdminNoteMessage>> c(@wtv(a = "base") String str, @wtw(a = "campaign_id") String str2, @wtw(a = "status") String str3, @wtw(a = "preview") boolean z, @wtw(a = "type") String str4, @wtw(a = "locale") String str5);
}
