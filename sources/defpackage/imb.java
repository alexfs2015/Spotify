package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.spotlets.bixbyhomecards.cards.BixbyHomeCardType;
import com.spotify.mobile.android.spotlets.bixbyhomecards.logging.StreamingCardEventLogger;
import com.spotify.mobile.android.spotlets.bixbyhomecards.logging.StreamingCardEventLogger.Element;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.StreamingCardData;
import java.io.IOException;

/* renamed from: imb reason: default package */
public final class imb {
    public final ilz a;
    public final ilx b;
    public final img c;
    public final imi d;
    public final SparseArray<ild> e = new SparseArray<>();
    private final Context f;
    private final Player g;
    private final StreamingCardEventLogger h;
    private final ilt i;
    private final ilr j;
    private final ilp k;

    public imb(Context context, ilz ilz, Player player, img img, StreamingCardEventLogger streamingCardEventLogger, ilx ilx, ilt ilt, ilr ilr, ilp ilp, imi imi) {
        this.f = context;
        this.a = ilz;
        this.g = player;
        this.c = img;
        img img2 = this.c;
        img2.a = new $$Lambda$imb$nbUxe4duFxEWziu0JffgdQl3eoU(this);
        img2.b = new $$Lambda$imb$9_O4ghhtyMj0X2x0I9CddqvCOQ(this);
        this.h = streamingCardEventLogger;
        this.b = ilx;
        this.i = ilt;
        this.j = ilr;
        this.k = ilp;
        this.d = imi;
        this.e.put(BixbyHomeCardType.STREAMING.b(this.f), BixbyHomeCardType.STREAMING.a(this.f));
        this.e.put(BixbyHomeCardType.STREAMING_US.b(this.f), BixbyHomeCardType.STREAMING_US.a(this.f));
    }

    /* access modifiers changed from: private */
    public void a() {
        this.a.a((hk<StreamingCardData>) new $$Lambda$imb$HfSgZxY9H87Vw1ZrgirLVqKEkwE<StreamingCardData>(this));
    }

    /* access modifiers changed from: private */
    public void a(StreamingCardData streamingCardData) {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ild ild = (ild) this.e.valueAt(i2);
            ild.c = streamingCardData;
            if (ild.b) {
                this.b.a(ild);
            }
        }
        if (streamingCardData != null) {
            ilr ilr = this.j;
            try {
                ilr.b.a().a(ilr.a, ilr.c.writeValueAsString(streamingCardData)).b();
            } catch (IOException e2) {
                Logger.e(e2, "Failed writing recommended playlists cached response to string", new Object[0]);
            }
        }
        Optional<String> optional = this.k.a;
        if (optional.b()) {
            a((String) optional.c(), this.k.b);
            ilp ilp = this.k;
            ilp.a = Optional.e();
            ilp.b = -1;
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        this.a.b();
        a((StreamingCardData) null);
    }

    public final void a(String str, int i2) {
        ild ild = (ild) this.e.get(i2);
        if (ild != null) {
            StreamingCardData streamingCardData = ild.c;
            if (streamingCardData == null || streamingCardData.isCachedData()) {
                a(str, ild);
                this.a.a();
                return;
            }
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1475681621:
                    if (str.equals("EVENT_CTA")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -1124795464:
                    if (str.equals("SPAGE_ON_MEDIA_PAUSE")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -717095340:
                    if (str.equals("EVENT_MAIN_ITEM")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -174886703:
                    if (str.equals("SPAGE_ON_MEDIA_NEXT")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -174821102:
                    if (str.equals("SPAGE_ON_MEDIA_PLAY")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -174815215:
                    if (str.equals("SPAGE_ON_MEDIA_PREV")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1502194229:
                    if (str.equals("EVENT_LIST_1")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1502194230:
                    if (str.equals("EVENT_LIST_2")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    a(ild);
                    return;
                case 1:
                    b(ild);
                    return;
                case 2:
                    c(ild);
                    return;
                case 3:
                    d(ild);
                    return;
                case 4:
                    e(ild);
                    return;
                case 5:
                    f(ild);
                    return;
                case 6:
                    g(ild);
                    return;
                case 7:
                    h(ild);
                    return;
                default:
                    Logger.e("invalid event: %s", str);
                    return;
            }
        }
    }

    private void a(String str, ild ild) {
        this.k.a(str, ild.a);
        StreamingCardData a2 = this.i.a(str);
        ild.b = true;
        ild.c = a2;
        this.b.a(ild);
    }

    private void a(ild ild) {
        this.h.a(ild);
        this.g.skipToPreviousTrack();
    }

    private void b(ild ild) {
        this.h.d(ild);
        this.g.skipToNextTrack();
    }

    private void c(ild ild) {
        this.h.c(ild);
        this.g.pause();
    }

    private void h(ild ild) {
        this.h.e(ild);
    }

    private void d(ild ild) {
        StreamingCardData streamingCardData = (StreamingCardData) fay.a(ild.c);
        if (streamingCardData.isPlaying()) {
            this.h.b(ild);
            this.g.resume();
            return;
        }
        String contentUri = streamingCardData.mainContentItem().contentUri();
        this.h.b(ild, Element.PLAY_PAUSE, contentUri);
        this.d.a(contentUri);
    }

    private void e(ild ild) {
        this.h.a(ild, Element.MAIN_VIEW, ((StreamingCardData) fay.a(ild.c)).mainContentItem().contentUri());
    }

    private void f(ild ild) {
        ContentItem listItem1 = ((StreamingCardData) fay.a(ild.c)).listItem1();
        String contentUri = listItem1.contentUri();
        this.h.b(ild, Element.LIST_ITEM_1, listItem1.contentUri());
        this.d.a(contentUri);
    }

    private void g(ild ild) {
        ContentItem listItem2 = ((StreamingCardData) fay.a(ild.c)).listItem2();
        String contentUri = listItem2.contentUri();
        this.h.b(ild, Element.LIST_ITEM_2, listItem2.contentUri());
        this.d.a(contentUri);
    }
}
