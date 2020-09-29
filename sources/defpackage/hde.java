package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.playlist.model.policy.RadioPolicy;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.mobile.android.util.loader.BaseDataLoader;
import io.reactivex.Observable;
import java.util.Locale;

/* renamed from: hde reason: default package */
public final class hde extends BaseDataLoader<RecentlyPlayedItem, RecentlyPlayedItems, Policy> {
    private static Policy a;
    private final String l;
    private final ObjectMapper m;

    public final /* synthetic */ Observable a(JacksonModel jacksonModel) {
        return b(this.l, (Policy) jacksonModel);
    }

    public final /* bridge */ /* synthetic */ byte[] a(uyy uyy) {
        return jsf.a((RecentlyPlayedItems) uyy);
    }

    static {
        RadioPolicy radioPolicy = new RadioPolicy();
        radioPolicy.setImageStyle(RadioPolicy.IMAGE_STYLE_GRADIENT_OVERLAY);
        String str = "name";
        String str2 = "subtitle";
        String str3 = "imageUri";
        String str4 = "offline";
        String str5 = "syncProgress";
        String str6 = "available";
        radioPolicy.setAttributes(ImmutableMap.g().b("link", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b(MoatAdEvent.EVENT_TYPE, Boolean.TRUE).b(str4, Boolean.TRUE).b(str5, Boolean.TRUE).b(str6, Boolean.TRUE).b());
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setRadioPolicy(radioPolicy);
        a = new Policy(decorationPolicy);
    }

    public hde(RxResolver rxResolver, rnf rnf, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this(rxResolver, rnf, i, true, z2, z3, true, false, false, false, 750);
    }

    public hde(RxResolver rxResolver, rnf rnf, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this(rxResolver, rnf, i, z, true, true, z4, z5, z6, true, 750);
    }

    private hde(RxResolver rxResolver, rnf rnf, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        super(rxResolver);
        this.l = String.format(Locale.US, "sp://core-recently-played/unstable/items?updateThrottling=%d&limit=%d&include_shows=%b&include_radio=%b&include_daily_mix=%b&include_collection_songs=%b&exclude_shows_mixed=%b&exclude_shows_audio=%b&exclude_shows_video=%b", new Object[]{Integer.valueOf(750), Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7)});
        this.m = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    public final void a(juf<RecentlyPlayedItems> juf) {
        a(this.l, juf, a);
    }

    public final Observable<RecentlyPlayedItems> a() {
        return a(this.l, a);
    }

    public final Observable<RecentlyPlayedItems> b() {
        return b(this.l, a);
    }

    public final /* synthetic */ uyy a(byte[] bArr) {
        return (RecentlyPlayedItems) this.m.readValue(bArr, RecentlyPlayedItems.class);
    }
}
