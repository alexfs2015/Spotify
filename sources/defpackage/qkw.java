package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;

/* renamed from: qkw reason: default package */
public final class qkw implements siv {
    private final Context a;
    private final fqn b;
    private final srn c;
    private final boolean d;
    private final boolean e;

    /* renamed from: qkw$a */
    static final class a {
        SpotifyIconV2 a;
        String b;
        String c;
        String d;
        hcm e;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: 0000 */
        public final hcs a() {
            hcj a2 = HubsImmutableComponentBundle.builder().a("tag", this.d).a();
            return hbb.b().c(hcx.builder().a((hck) HubsGlueComponent.EMPTY_VIEW).a(hcw.builder().a((Enum<?>) this.a)).a(hcy.builder().a(this.b).d(this.c)).a(this.e).e(a2).a()).a();
        }
    }

    public qkw(Context context, fqn fqn, srn srn, boolean z, boolean z2) {
        this.a = (Context) fbp.a(context);
        this.b = (fqn) fbp.a(fqn);
        this.c = srn;
        this.d = z;
        this.e = z2;
    }

    public static boolean a(hcs hcs) {
        if (hcs.overlays().isEmpty()) {
            return false;
        }
        return "search-error-empty-view".equals(((hcm) hcs.overlays().get(0)).custom().get("tag"));
    }

    public static boolean b(hcs hcs) {
        if (hcs.overlays().isEmpty()) {
            return false;
        }
        return "search-start-empty-view".equals(((hcm) hcs.overlays().get(0)).custom().get("tag"));
    }

    private boolean b(boolean z) {
        return this.e && !z;
    }

    private String c(String str) {
        return this.a.getString(R.string.search_title, new Object[]{str});
    }

    public static boolean c(hcs hcs) {
        return "search-spinner".equals(hcs.custom().get("tag"));
    }

    public final hcs a() {
        return hbb.b().c(hcx.builder().a((hck) HubsCommonComponent.LOADING_SPINNER).a()).a("tag", "search-spinner").a();
    }

    public final hcs a(String str) {
        a aVar = new a(0);
        aVar.a = SpotifyIconV2.FLAG;
        aVar.b = this.a.getString(R.string.error_no_connection_title);
        aVar.c = this.a.getString(R.string.cosmos_search_start_offline_subtitle);
        aVar.d = "search-offline-view";
        return aVar.a().toBuilder().b(c(str)).a();
    }

    public final hcs a(String str, boolean z) {
        int i = z ? R.string.cosmos_search_no_results_offline : R.string.cosmos_search_no_results;
        int i2 = z ? R.string.cosmos_search_start_offline_subtitle : R.string.cosmos_search_no_results_subtitle;
        a aVar = new a(0);
        aVar.a = SpotifyIconV2.FLAG;
        aVar.b = this.a.getString(i, new Object[]{fbp.a(str)});
        aVar.c = this.a.getString(i2);
        aVar.d = "search-no-results-empty-view";
        return aVar.a().toBuilder().b(six.a(str)).a();
    }

    public final hcs a(boolean z) {
        int i = (sra.a(this.b) || this.d) ? R.string.search_start_title_nft : b(z) ? R.string.search_start_title_free_user_offline : isu.a(this.b) ? R.string.cosmos_search_start_with_shows : R.string.cosmos_search_start;
        int i2 = this.d ? R.string.search_start_subtitle_assisted_curation : b(z) ? R.string.search_start_subtitle_free_user_offline : sra.a(this.b) ? R.string.search_start_subtitle_nft : isu.a(this.b) ? R.string.cosmos_search_start_subtitle_with_podcasts : R.string.cosmos_search_start_subtitle;
        a aVar = new a(0);
        aVar.a = SpotifyIconV2.SEARCH;
        aVar.b = this.a.getString(i);
        aVar.c = this.a.getString(i2);
        aVar.d = "search-start-empty-view";
        return aVar.a();
    }

    public final hcs b(String str) {
        a aVar = new a(0);
        aVar.a = SpotifyIconV2.WARNING;
        aVar.b = this.a.getString(R.string.cosmos_search_error);
        String string = this.a.getString(R.string.cosmos_search_error_retry);
        aVar.e = hcx.builder().a("search-retry").a(hcy.builder().a(string)).a("click", this.c.a()).a();
        aVar.d = "search-error-empty-view";
        return aVar.a().toBuilder().b(c(str)).a();
    }
}
