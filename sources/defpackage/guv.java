package defpackage;

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.SingleSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: guv reason: default package */
public final class guv implements gus {
    private final String a;
    private final vje b;

    public guv(jva jva, vje vje) {
        fbp.a(jva);
        fbp.a(LinkType.PROFILE_PLAYLIST == jva.b || LinkType.PLAYLIST_V2 == jva.b);
        this.a = jva.h();
        this.b = (vje) fbp.a(vje);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(vld vld) {
        vle[] vleArr = (vle[]) vld.getItems();
        ArrayList arrayList = new ArrayList(vleArr.length);
        for (vle vle : vleArr) {
            vlf b2 = vle.b();
            vkv a2 = vle.a();
            if (b2 != null) {
                if (gvb.c(b2)) {
                    arrayList.add(PlayerTrack.create(b2.getUri(), gvb.b(b2), gvb.a(b2), null, null));
                }
            } else if (a2 != null && gvb.a(a2)) {
                arrayList.add(PlayerTrack.create(a2.getUri(), a2.v()));
            }
        }
        PlayerTrack[] playerTrackArr = (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]);
        String str = this.a;
        HashMap hashMap = new HashMap();
        if (vld.a() != null) {
            hashMap.put("context_description", vld.a().getTitle());
            String b3 = vld.a().b();
            if (b3 != null) {
                hashMap.put(Metadata.CONTEXT_LONG_DESCRIPTION, b3);
            }
            hashMap.put("image_url", vld.a().getImageUri());
            hashMap.put("image_large_url", vld.a().getImageUri(Size.LARGE));
            vlg d = vld.a().d();
            if (d != null) {
                String c = d.c();
                if (!fbo.a(c)) {
                    hashMap.put(Metadata.CONTEXT_OWNER, c);
                }
            }
            String p = vld.a().p();
            if (!TextUtils.isEmpty(p)) {
                hashMap.put(Metadata.FORMAT_LIST_TYPE, p);
            }
        }
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) hashMap);
    }

    public final xii<PlayerContext> resolve() {
        return xim.a(wit.a((SingleSource<T>) this.b.a(this.a)).c(new $$Lambda$guv$sgTNsiQspDvvoK3S4L4v02NG4Rg(this)));
    }
}
