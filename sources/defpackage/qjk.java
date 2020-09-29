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

/* renamed from: qjk reason: default package */
public final class qjk {
    private final Function<sjh, hcs> a;
    private final qje b;
    private final sim c;
    private final siv d;
    private final snp e;
    private final sre f;

    public qjk(Function<sjh, hcs> function, qje qje, sim sim, siv siv, snp snp, sre sre) {
        this.a = function;
        this.b = qje;
        this.c = sim;
        this.d = siv;
        this.e = snp;
        this.f = sre;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(String str, a aVar) {
        return this.d.b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(String str, c cVar) {
        return this.d.b(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(String str, d dVar) {
        return this.d.b(str);
    }

    private hcs a(String str, smc smc) {
        try {
            return (hcs) this.f.apply((hcs) this.a.apply(sjh.a(smc.a(), str, smc.b())));
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Failed transforming search proto result to hubs for query: ");
            sb.append(str);
            Assertion.a(sb.toString(), (Throwable) e2);
            return hdb.EMPTY;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(smb smb, a aVar) {
        QueryAutocompleteResult queryAutocompleteResult = aVar.a;
        return this.e.apply(sqn.a(smb.a(), queryAutocompleteResult));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(smb smb, b bVar) {
        SearchHistory searchHistory = bVar.a;
        boolean a2 = smb.d().a();
        Optional a3 = this.c.a(searchHistory.getItems());
        return a3.b() ? (hcs) a3.c() : this.d.a(a2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(smb smb, c cVar) {
        Optional c2 = smb.c();
        String a2 = smb.a();
        return c2.b() ? (hcs) ((sly) c2.c()).a(new $$Lambda$qjk$pNtflEnS1V8puYlp8wReEE3cJGc(this, a2), new $$Lambda$qjk$eqOD4lmwyXOpK7Cm0VdGBq91oRo(this, a2), new $$Lambda$qjk$H_jIkfoUXfZZEOxu63gRN_cT4L8(this, smb.d().a()), new $$Lambda$qjk$rasPohoeJI9qAYGPajIF3yaL0NY(this, a2)) : hdb.EMPTY;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(smb smb, d dVar) {
        List list;
        OfflineResults offlineResults = dVar.a;
        String a2 = smb.a();
        List<OfflineTrack> list2 = offlineResults.tracks.hits;
        List<OfflineEpisode> list3 = offlineResults.episodes.hits;
        if (list2.isEmpty() && list3.isEmpty()) {
            return this.d.a(a2, true);
        }
        a builder = hdb.builder();
        qje qje = this.b;
        if (list2.isEmpty()) {
            list = Collections.emptyList();
        } else {
            List a3 = qje.a(list2, qje.a.a());
            for (int i = 0; i < list2.size(); i++) {
                OfflineTrack offlineTrack = (OfflineTrack) list2.get(i);
                String a4 = qje.a(i);
                StringBuilder sb = new StringBuilder();
                sb.append(offlineTrack.artists());
                if (offlineTrack.album != null) {
                    sb.append(" • ");
                    sb.append(offlineTrack.album.name);
                }
                a3.add(qje.a(a4, i, offlineTrack.getUri(), offlineTrack.getName(), qje.a(offlineTrack.album != null ? offlineTrack.album.getImageUri() : null, SpotifyIconV2.TRACK), sb.toString()));
            }
            list = a3;
        }
        return builder.b(list).b(this.b.a(list3)).b(six.a(a2)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(smb smb, e eVar) {
        return a(smb.a(), eVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(boolean z, b bVar) {
        return this.d.a(z);
    }

    public final hcs a(smb smb) {
        return (hcs) smb.b().a(new $$Lambda$qjk$pvUi36fkGjEaKWoxR0pxtXaD4w(this, smb), new $$Lambda$qjk$o466aCIfjiSuSfebAjwVERInz_g(this, smb), new $$Lambda$qjk$nPBiBcSm1dqvghGYA4wGTWIkcwk(this, smb), new $$Lambda$qjk$b_pj7lbVHfVsQdjGYUpLLxnL3g(this, smb), new $$Lambda$qjk$0hVMOuZbCKCuSW5UkH76Au8qNM(this, smb));
    }
}
