package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;

/* renamed from: qbw reason: default package */
public final class qbw implements rzh {
    private final Context a;
    private final fpt b;
    private final shg c;
    private final boolean d;
    private final boolean e;

    /* renamed from: qbw$a */
    static final class a {
        SpotifyIconV2 a;
        String b;
        String c;
        String d;
        gzt e;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final gzz a() {
            gzq a2 = HubsImmutableComponentBundle.builder().a("tag", this.d).a();
            return gyi.b().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) this.a)).a(haf.builder().a(this.b).d(this.c)).a(this.e).e(a2).a()).a();
        }
    }

    public qbw(Context context, fpt fpt, shg shg, boolean z, boolean z2) {
        this.a = (Context) fay.a(context);
        this.b = (fpt) fay.a(fpt);
        this.c = shg;
        this.d = z;
        this.e = z2;
    }

    public final gzz a(boolean z) {
        int i = (sgt.a(this.b) || this.d) ? R.string.search_start_title_nft : b(z) ? R.string.search_start_title_free_user_offline : iqh.a(this.b) ? R.string.cosmos_search_start_with_shows : R.string.cosmos_search_start;
        int i2 = this.d ? R.string.search_start_subtitle_assisted_curation : b(z) ? R.string.search_start_subtitle_free_user_offline : sgt.a(this.b) ? R.string.search_start_subtitle_nft : iqh.a(this.b) ? R.string.cosmos_search_start_subtitle_with_podcasts : R.string.cosmos_search_start_subtitle;
        a aVar = new a(0);
        aVar.a = SpotifyIconV2.SEARCH;
        aVar.b = this.a.getString(i);
        aVar.c = this.a.getString(i2);
        aVar.d = "search-start-empty-view";
        return aVar.a();
    }

    private boolean b(boolean z) {
        return this.e && !z;
    }

    public final gzz a(String str, boolean z) {
        int i = z ? R.string.cosmos_search_no_results_offline : R.string.cosmos_search_no_results;
        int i2 = z ? R.string.cosmos_search_start_offline_subtitle : R.string.cosmos_search_no_results_subtitle;
        a aVar = new a(0);
        aVar.a = SpotifyIconV2.FLAG;
        aVar.b = this.a.getString(i, new Object[]{fay.a(str)});
        aVar.c = this.a.getString(i2);
        aVar.d = "search-no-results-empty-view";
        return aVar.a().toBuilder().b(rzj.a(str)).a();
    }

    public final gzz b(String str) {
        a aVar = new a(0);
        aVar.a = SpotifyIconV2.WARNING;
        aVar.b = this.a.getString(R.string.cosmos_search_error);
        String string = this.a.getString(R.string.cosmos_search_error_retry);
        aVar.e = hae.builder().a("search-retry").a(haf.builder().a(string)).a("click", this.c.a()).a();
        aVar.d = "search-error-empty-view";
        return aVar.a().toBuilder().b(c(str)).a();
    }

    public static boolean a(gzz gzz) {
        if (gzz.overlays().isEmpty()) {
            return false;
        }
        return "search-error-empty-view".equals(((gzt) gzz.overlays().get(0)).custom().get("tag"));
    }

    public static boolean b(gzz gzz) {
        if (gzz.overlays().isEmpty()) {
            return false;
        }
        return "search-start-empty-view".equals(((gzt) gzz.overlays().get(0)).custom().get("tag"));
    }

    public static boolean c(gzz gzz) {
        return "search-spinner".equals(gzz.custom().get("tag"));
    }

    private String c(String str) {
        return this.a.getString(R.string.search_title, new Object[]{str});
    }

    public final gzz a() {
        return gyi.b().c(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).a()).a("tag", "search-spinner").a();
    }

    public final gzz a(String str) {
        a aVar = new a(0);
        aVar.a = SpotifyIconV2.FLAG;
        aVar.b = this.a.getString(R.string.error_no_connection_title);
        aVar.c = this.a.getString(R.string.cosmos_search_start_offline_subtitle);
        aVar.d = "search-offline-view";
        return aVar.a().toBuilder().b(c(str)).a();
    }
}
