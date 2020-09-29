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

/* renamed from: quc reason: default package */
public final class quc extends qvb {
    private static final Policy c;
    boolean a;
    private final ioc d;
    private final qxq e;
    private final jpb f;

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

    public quc(qsr qsr, ioc ioc, qxq qxq, jpb jpb) {
        super(qsr);
        this.d = ioc;
        this.e = qxq;
        this.f = jpb;
        this.d.a(vns.e().a("name").a());
    }

    /* access modifiers changed from: protected */
    public final Observable<qun> a(qum qum) {
        int a2 = qum.a();
        this.d.a(Integer.valueOf(a2), Integer.valueOf(this.b.c));
        this.d.b = qum.c().b();
        this.d.a(false, this.a || ((Boolean) fav.a(qum.c().d().get("available_offline_only"), Boolean.FALSE)).booleanValue(), false);
        vns c2 = qum.c().c();
        if (qum.g()) {
            this.d.a(vns.e().a("availableOffline").a(c2).a(true).a());
        } else if (c2 != null) {
            this.d.a(c2);
        }
        return this.d.a(c).c((Function<? super T, ? extends R>) new $$Lambda$quc$Qn8zLI5Li3dJTikPL53OFS1JgHw<Object,Object>(this, a2, qum));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ qun a(int i, qum qum, uyy uyy) {
        uyq[] uyqArr = (uyq[]) uyy.getItems();
        fpt b = this.f.b();
        a g = ImmutableList.g();
        for (int i2 = 0; i2 < uyqArr.length; i2++) {
            uyq uyq = uyqArr[i2];
            int i3 = i + i2;
            qxq qxq = this.e;
            String targetUri = uyq.getTargetUri();
            String collectionUri = uyq.getCollectionUri();
            g.c(MusicItem.a(qxq.c.a((CharSequence) uyq.getUri()).c(), uyq.getName(), qxq.a(uyq), uyq.getUri(), (!qxq.g || collectionUri == null) ? targetUri : collectionUri, uyq.getImageUri(Size.NORMAL), uyq.getAddTime(), i3, jsl.c(b), uyq.isSavedToCollection(), false, uyq.getOfflineState()));
        }
        return quo.a(uyy.isLoading(), uyy.getUnrangedLength(), i, g.a(), qum, MusicItem.p);
    }
}
