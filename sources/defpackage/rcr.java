package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.HashMap;

/* renamed from: rcr reason: default package */
public final class rcr extends rdq {
    private static final Policy c;
    boolean a;
    private final iqp d;
    private final rgf e;
    private final jrn f;

    static {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        String str = "name";
        String str2 = "link";
        String str3 = "covers";
        decorationPolicy.setListAttributes(ImmutableMap.g().b("addTime", Boolean.TRUE).b(str, Boolean.TRUE).b(str2, Boolean.TRUE).b(str3, Boolean.TRUE).b());
        HashMap hashMap = new HashMap();
        hashMap.put(str, Boolean.TRUE);
        decorationPolicy.setArtistAttributes(hashMap);
        c = new Policy(decorationPolicy);
    }

    public rcr(rbg rbg, iqp iqp, rgf rgf, jrn jrn) {
        super(rbg);
        this.d = iqp;
        this.e = rgf;
        this.f = jrn;
        this.d.a(way.e().a("name").a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ rdc a(int i, rdb rdb, vlb vlb) {
        vkt[] vktArr = (vkt[]) vlb.getItems();
        fqn d2 = this.f.d();
        a g = ImmutableList.g();
        for (int i2 = 0; i2 < vktArr.length; i2++) {
            vkt vkt = vktArr[i2];
            int i3 = i + i2;
            rgf rgf = this.e;
            String targetUri = vkt.getTargetUri();
            String collectionUri = vkt.getCollectionUri();
            g.c(MusicItem.a(rgf.c.a((CharSequence) vkt.getUri()).c(), vkt.getName(), rgf.a(vkt), vkt.getUri(), (!rgf.g || collectionUri == null) ? targetUri : collectionUri, vkt.getImageUri(Size.NORMAL), vkt.getAddTime(), i3, jus.c(d2), vkt.isSavedToCollection(), false, vkt.getOfflineState()));
        }
        return rdd.a(vlb.isLoading(), vlb.getUnrangedLength(), i, g.a(), rdb, MusicItem.p);
    }

    /* access modifiers changed from: protected */
    public final Observable<rdc> a(rdb rdb) {
        int a2 = rdb.a();
        this.d.a(Integer.valueOf(a2), Integer.valueOf(this.b.e));
        this.d.b = rdb.c().b();
        this.d.a(false, this.a || ((Boolean) fbm.a(rdb.c().d().get("available_offline_only"), Boolean.FALSE)).booleanValue(), false);
        way c2 = rdb.c().c();
        if (rdb.g()) {
            this.d.a(way.e().a("availableOffline").a(c2).a(true).a());
        } else if (c2 != null) {
            this.d.a(c2);
        }
        return this.d.a(c).c((Function<? super T, ? extends R>) new $$Lambda$rcr$L19g2Y0xLfE7YQhtUBHUj6ik4WI<Object,Object>(this, a2, rdb));
    }
}
