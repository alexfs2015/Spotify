package defpackage;

import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.search.history.SearchHistory;
import com.spotify.music.libs.search.offline.model.OfflineEpisode;
import com.spotify.music.libs.search.offline.model.OfflineResults;
import com.spotify.music.libs.search.offline.model.OfflineTrack;
import com.spotify.music.libs.search.online.autocomplete.QueryAutocompleteResult;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;

/* renamed from: qam reason: default package */
public final class qam {
    private final Function<rzz, gzz> a;
    private final qag b;
    private final ryy c;
    private final rzh d;
    private final sdi e;
    private final sgx f;

    public qam(Function<rzz, gzz> function, qag qag, ryy ryy, rzh rzh, sdi sdi, sgx sgx) {
        this.a = function;
        this.b = qag;
        this.c = ryy;
        this.d = rzh;
        this.e = sdi;
        this.f = sgx;
    }

    public final gzz a(sbu sbu) {
        return (gzz) sbu.b().a(new $$Lambda$qam$SEjckEYGXzci0F0VPw1rw5jZo(this, sbu), new $$Lambda$qam$qa6xvJ3gaL71NAztID_anCbTqq8(this, sbu), new $$Lambda$qam$mM2tI6eNCV7J4ZG2HTHomvirPtA(this, sbu), new $$Lambda$qam$GCHJlfxg6FLjTeYg_GTrsDlkay0(this, sbu), new $$Lambda$qam$XwY281nTFbuQf7PavCBEwQsBJOU(this, sbu));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(sbu sbu, c cVar) {
        Optional c2 = sbu.c();
        String a2 = sbu.a();
        boolean a3 = sbu.d().a();
        if (c2.b()) {
            return (gzz) ((sbr) c2.c()).a(new $$Lambda$qam$G2yRwrjj0P4GQpD0if9Ru7QgUjM(this, a2), new $$Lambda$qam$sctpH9uv0ePRGc7U_unSHdvEbo(this, a2), new $$Lambda$qam$cnz3DCpJAMCvt6cmcUGU6SLfe0o(this, a3), new $$Lambda$qam$Hq58kD91U_XzgGy9edR1JZPDJw(this, a2));
        }
        return hai.EMPTY;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(sbu sbu, e eVar) {
        return a(sbu.a(), eVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(String str, d dVar) {
        return this.d.b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(String str, c cVar) {
        return this.d.b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(boolean z, b bVar) {
        return this.d.a(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(String str, a aVar) {
        return this.d.b(str);
    }

    private gzz a(String str, sbv sbv) {
        try {
            return (gzz) this.f.apply((gzz) this.a.apply(rzz.a(sbv.a(), str, sbv.b())));
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Failed transforming search proto result to hubs for query: ");
            sb.append(str);
            Assertion.a(sb.toString(), (Throwable) e2);
            return hai.EMPTY;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(sbu sbu, a aVar) {
        QueryAutocompleteResult queryAutocompleteResult = aVar.a;
        return this.e.apply(sgg.a(sbu.a(), queryAutocompleteResult));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(sbu sbu, d dVar) {
        List list;
        OfflineResults offlineResults = dVar.a;
        String a2 = sbu.a();
        List<OfflineTrack> list2 = offlineResults.tracks.hits;
        List<OfflineEpisode> list3 = offlineResults.episodes.hits;
        if (list2.isEmpty() && list3.isEmpty()) {
            return this.d.a(a2, true);
        }
        a builder = hai.builder();
        qag qag = this.b;
        if (list2.isEmpty()) {
            list = Collections.emptyList();
        } else {
            List a3 = qag.a(list2, qag.a.a());
            for (int i = 0; i < list2.size(); i++) {
                OfflineTrack offlineTrack = (OfflineTrack) list2.get(i);
                String a4 = qag.a(i);
                StringBuilder sb = new StringBuilder();
                sb.append(offlineTrack.artists());
                if (offlineTrack.album != null) {
                    sb.append(" • ");
                    sb.append(offlineTrack.album.name);
                }
                a3.add(qag.a(a4, i, offlineTrack.getUri(), offlineTrack.getName(), qag.a(offlineTrack.album != null ? offlineTrack.album.getImageUri() : null, SpotifyIconV2.TRACK), sb.toString()));
            }
            list = a3;
        }
        return builder.b(list).b(this.b.a(list3)).b(rzj.a(a2)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(sbu sbu, b bVar) {
        SearchHistory searchHistory = bVar.a;
        boolean a2 = sbu.d().a();
        Optional a3 = this.c.a(searchHistory.getItems());
        if (a3.b()) {
            return (gzz) a3.c();
        }
        return this.d.a(a2);
    }
}
