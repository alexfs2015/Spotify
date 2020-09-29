package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: ilv reason: default package */
public final class ilv {
    private final ilo a;

    ilv(Context context) {
        String string = context.getString(R.string.bixby_home_card_cta_view_more);
        sih sih = ViewUris.af;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(sih.toString()));
        this.a = new a().a(string).a(intent).a();
    }

    public final foe a(ild ild) {
        StreamingCardData streamingCardData = ild.c;
        foe foe = new foe(ild.a);
        if (streamingCardData != null && ild.b) {
            ContentItem contentItem = (ContentItem) fay.a(streamingCardData.mainContentItem());
            ContentItem contentItem2 = (ContentItem) fay.a(streamingCardData.listItem1());
            ContentItem contentItem3 = (ContentItem) fay.a(streamingCardData.listItem2());
            foi b = new foi("MediaPlay").b(streamingCardData.isPaused() ^ true ? 1 : 0);
            if (streamingCardData.isPrevButtonDisabled()) {
                b.a(4);
            }
            if (streamingCardData.isNextButtonDisabled()) {
                b.a(1);
            }
            foe.a("tag_data_1", new foj().a(contentItem.imageUrl()));
            foe.a("tag_data_2", new fom().a(contentItem.title()).b("FIELD_2"));
            foe.a("tag_data_3", new fom().a(contentItem.metadata1()).b("FIELD_3"));
            foe.a("tag_data_4", new fom().a(contentItem.metadata2() != null ? contentItem.metadata2() : "").b("FIELD_4"));
            foe.a("tag_data_6", new foj().a(contentItem.imageUrl()));
            fok fok = (fok) new fok().b("EVENT_MAIN_ITEM");
            ContentItem mainContentItem = streamingCardData.mainContentItem();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(mainContentItem.intentDataUriString()));
            foe.a("tag_data_7", fok.a(intent));
            foe.a("tag_data_5", b);
            foe.a("tag_data_8", new foj().a(contentItem2.imageUrl()));
            foe.a("tag_data_9", new fom().a(contentItem2.title()));
            foe.a("tag_data_10", new fom().a(contentItem2.metadata1()));
            foe.a("tag_data_11", new fok().b("EVENT_LIST_1"));
            foe.a("tag_data_12", new foj().a(contentItem3.imageUrl()));
            foe.a("tag_data_13", new fom().a(contentItem3.title()));
            foe.a("tag_data_14", new fom().a(contentItem3.metadata1()));
            foe.a("tag_data_15", new fok().b("EVENT_LIST_2"));
            foe.a("tag_data_16", ((fom) new fom().a(this.a.a()).b("EVENT_CTA")).a(this.a.b()));
        }
        return foe;
    }
}
