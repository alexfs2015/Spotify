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

/* renamed from: gsw reason: default package */
public final class gsw implements gst {
    private final String a;
    private final uxc b;

    public gsw(jst jst, uxc uxc) {
        fay.a(jst);
        fay.a(LinkType.PROFILE_PLAYLIST == jst.b || LinkType.PLAYLIST_V2 == jst.b);
        this.a = jst.h();
        this.b = (uxc) fay.a(uxc);
    }

    public final wud<PlayerContext> resolve() {
        return wuh.a(vun.a((SingleSource<T>) this.b.a(this.a)).c(new $$Lambda$gsw$WQaHvPbZU4xAkEUuUfBpg_gejog(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(uza uza) {
        uzb[] uzbArr = (uzb[]) uza.getItems();
        ArrayList arrayList = new ArrayList(uzbArr.length);
        for (uzb uzb : uzbArr) {
            uzc b2 = uzb.b();
            uys a2 = uzb.a();
            if (b2 != null) {
                if (gtc.c(b2)) {
                    arrayList.add(PlayerTrack.create(b2.getUri(), gtc.b(b2), gtc.a(b2), null, null));
                }
            } else if (a2 != null && gtc.a(a2)) {
                arrayList.add(PlayerTrack.create(a2.getUri(), a2.v()));
            }
        }
        PlayerTrack[] playerTrackArr = (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]);
        String str = this.a;
        HashMap hashMap = new HashMap();
        if (uza.a() != null) {
            hashMap.put("context_description", uza.a().getTitle());
            String b3 = uza.a().b();
            if (b3 != null) {
                hashMap.put(Metadata.CONTEXT_LONG_DESCRIPTION, b3);
            }
            hashMap.put("image_url", uza.a().getImageUri());
            hashMap.put("image_large_url", uza.a().getImageUri(Size.LARGE));
            uzd d = uza.a().d();
            if (d != null) {
                String c = d.c();
                if (!fax.a(c)) {
                    hashMap.put(Metadata.CONTEXT_OWNER, c);
                }
            }
            String p = uza.a().p();
            if (!TextUtils.isEmpty(p)) {
                hashMap.put(Metadata.FORMAT_LIST_TYPE, p);
            }
        }
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) hashMap);
    }
}
