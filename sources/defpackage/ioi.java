package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: ioi reason: default package */
public final class ioi {
    private final iob a;

    ioi(Context context) {
        String string = context.getString(R.string.bixby_home_card_cta_view_more);
        sso sso = ViewUris.ae;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(sso.toString()));
        this.a = new a().a(string).a(intent).a();
    }

    public final foy a(inq inq) {
        StreamingCardData streamingCardData = inq.c;
        foy foy = new foy(inq.a);
        if (streamingCardData != null && inq.b) {
            ContentItem contentItem = (ContentItem) fbp.a(streamingCardData.mainContentItem());
            ContentItem contentItem2 = (ContentItem) fbp.a(streamingCardData.listItem1());
            ContentItem contentItem3 = (ContentItem) fbp.a(streamingCardData.listItem2());
            fpc b = new fpc("MediaPlay").b(streamingCardData.isPaused() ^ true ? 1 : 0);
            if (streamingCardData.isPrevButtonDisabled()) {
                b.a(4);
            }
            if (streamingCardData.isNextButtonDisabled()) {
                b.a(1);
            }
            foy.a("tag_data_1", new fpd().a(contentItem.imageUrl()));
            foy.a("tag_data_2", new fpg().a(contentItem.title()).b("FIELD_2"));
            foy.a("tag_data_3", new fpg().a(contentItem.metadata1()).b("FIELD_3"));
            foy.a("tag_data_4", new fpg().a(contentItem.metadata2() != null ? contentItem.metadata2() : "").b("FIELD_4"));
            foy.a("tag_data_6", new fpd().a(contentItem.imageUrl()));
            fpe fpe = (fpe) new fpe().b("EVENT_MAIN_ITEM");
            ContentItem mainContentItem = streamingCardData.mainContentItem();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(mainContentItem.intentDataUriString()));
            foy.a("tag_data_7", fpe.a(intent));
            foy.a("tag_data_5", b);
            foy.a("tag_data_8", new fpd().a(contentItem2.imageUrl()));
            foy.a("tag_data_9", new fpg().a(contentItem2.title()));
            foy.a("tag_data_10", new fpg().a(contentItem2.metadata1()));
            foy.a("tag_data_11", new fpe().b("EVENT_LIST_1"));
            foy.a("tag_data_12", new fpd().a(contentItem3.imageUrl()));
            foy.a("tag_data_13", new fpg().a(contentItem3.title()));
            foy.a("tag_data_14", new fpg().a(contentItem3.metadata1()));
            foy.a("tag_data_15", new fpe().b("EVENT_LIST_2"));
            foy.a("tag_data_16", ((fpg) new fpg().a(this.a.a()).b("EVENT_CTA")).a(this.a.b()));
        }
        return foy;
    }
}
