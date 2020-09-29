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

/* renamed from: ioo reason: default package */
public final class ioo {
    public final iom a;
    public final iok b;
    public final iot c;
    public final iov d;
    public final SparseArray<inq> e = new SparseArray<>();
    private final Context f;
    private final Player g;
    private final StreamingCardEventLogger h;
    private final iog i;
    private final ioe j;
    private final ioc k;

    public ioo(Context context, iom iom, Player player, iot iot, StreamingCardEventLogger streamingCardEventLogger, iok iok, iog iog, ioe ioe, ioc ioc, iov iov) {
        this.f = context;
        this.a = iom;
        this.g = player;
        this.c = iot;
        iot iot2 = this.c;
        iot2.a = new $$Lambda$ioo$ORvVLxQaPHwHGX7M_739uDDbN0E(this);
        iot2.b = new $$Lambda$ioo$IEscZ2y9LD63W3aldNzqd6hn4g(this);
        this.h = streamingCardEventLogger;
        this.b = iok;
        this.i = iog;
        this.j = ioe;
        this.k = ioc;
        this.d = iov;
        this.e.put(BixbyHomeCardType.STREAMING.b(this.f), BixbyHomeCardType.STREAMING.a(this.f));
        this.e.put(BixbyHomeCardType.STREAMING_US.b(this.f), BixbyHomeCardType.STREAMING_US.a(this.f));
    }

    /* access modifiers changed from: private */
    public void a() {
        this.a.a((hk<StreamingCardData>) new $$Lambda$ioo$ZRZSm7PJqznqJdlvSDw0agD8jlE<StreamingCardData>(this));
    }

    /* access modifiers changed from: private */
    public void a(StreamingCardData streamingCardData) {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            inq inq = (inq) this.e.valueAt(i2);
            inq.c = streamingCardData;
            if (inq.b) {
                this.b.a(inq);
            }
        }
        if (streamingCardData != null) {
            ioe ioe = this.j;
            try {
                ioe.b.a().a(ioe.a, ioe.c.writeValueAsString(streamingCardData)).b();
            } catch (IOException e2) {
                Logger.e(e2, "Failed writing recommended playlists cached response to string", new Object[0]);
            }
        }
        Optional<String> optional = this.k.a;
        if (optional.b()) {
            a((String) optional.c(), this.k.b);
            ioc ioc = this.k;
            ioc.a = Optional.e();
            ioc.b = -1;
        }
    }

    private void a(inq inq) {
        this.h.a(inq);
        this.g.skipToPreviousTrack();
    }

    private void a(String str, inq inq) {
        this.k.a(str, inq.a);
        StreamingCardData a2 = this.i.a(str);
        inq.b = true;
        inq.c = a2;
        this.b.a(inq);
    }

    /* access modifiers changed from: private */
    public void b() {
        this.a.b();
        a((StreamingCardData) null);
    }

    private void b(inq inq) {
        this.h.d(inq);
        this.g.skipToNextTrack();
    }

    private void c(inq inq) {
        this.h.c(inq);
        this.g.pause();
    }

    private void d(inq inq) {
        StreamingCardData streamingCardData = (StreamingCardData) fbp.a(inq.c);
        if (streamingCardData.isPlaying()) {
            this.h.b(inq);
            this.g.resume();
            return;
        }
        String contentUri = streamingCardData.mainContentItem().contentUri();
        this.h.b(inq, Element.PLAY_PAUSE, contentUri);
        this.d.a(contentUri);
    }

    private void e(inq inq) {
        this.h.a(inq, Element.MAIN_VIEW, ((StreamingCardData) fbp.a(inq.c)).mainContentItem().contentUri());
    }

    private void f(inq inq) {
        ContentItem listItem1 = ((StreamingCardData) fbp.a(inq.c)).listItem1();
        String contentUri = listItem1.contentUri();
        this.h.b(inq, Element.LIST_ITEM_1, listItem1.contentUri());
        this.d.a(contentUri);
    }

    private void g(inq inq) {
        ContentItem listItem2 = ((StreamingCardData) fbp.a(inq.c)).listItem2();
        String contentUri = listItem2.contentUri();
        this.h.b(inq, Element.LIST_ITEM_2, listItem2.contentUri());
        this.d.a(contentUri);
    }

    private void h(inq inq) {
        this.h.e(inq);
    }

    public final void a(String str, int i2) {
        inq inq = (inq) this.e.get(i2);
        if (inq != null) {
            StreamingCardData streamingCardData = inq.c;
            if (streamingCardData == null || streamingCardData.isCachedData()) {
                a(str, inq);
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
                    a(inq);
                    return;
                case 1:
                    b(inq);
                    return;
                case 2:
                    c(inq);
                    return;
                case 3:
                    d(inq);
                    return;
                case 4:
                    e(inq);
                    return;
                case 5:
                    f(inq);
                    return;
                case 6:
                    g(inq);
                    return;
                case 7:
                    h(inq);
                    return;
                default:
                    Logger.e("invalid event: %s", str);
                    return;
            }
        }
    }
}
