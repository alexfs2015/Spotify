package defpackage;

import com.spotify.music.features.quicksilver.qa.QuicksilverAdminBannerMessage;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminCardMessage;
import com.spotify.music.features.quicksilver.qa.QuicksilverAdminNoteMessage;
import io.reactivex.Single;
import java.util.List;

/* renamed from: pzi reason: default package */
public interface pzi {
    @xhn(a = "{base}/v1/locales")
    Single<List<pzh>> a(@xia(a = "base") String str);

    @xhx(a = "{base}/v1/creatives/{message_id}/{accept_reject}")
    Single<String> a(@xia(a = "base") String str, @xia(a = "message_id") String str2, @xia(a = "accept_reject") String str3);

    @xhn(a = "{base}/v1/creatives")
    Single<List<QuicksilverAdminCardMessage>> a(@xia(a = "base") String str, @xib(a = "campaign_id") String str2, @xib(a = "status") String str3, @xib(a = "preview") boolean z, @xib(a = "type") String str4, @xib(a = "locale") String str5);

    @xhn(a = "{base}/v1/creatives")
    Single<List<QuicksilverAdminBannerMessage>> b(@xia(a = "base") String str, @xib(a = "campaign_id") String str2, @xib(a = "status") String str3, @xib(a = "preview") boolean z, @xib(a = "type") String str4, @xib(a = "locale") String str5);

    @xhn(a = "{base}/v1/creatives")
    Single<List<QuicksilverAdminNoteMessage>> c(@xia(a = "base") String str, @xib(a = "campaign_id") String str2, @xib(a = "status") String str3, @xib(a = "preview") boolean z, @xib(a = "type") String str4, @xib(a = "locale") String str5);
}
