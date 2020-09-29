package defpackage;

import com.spotify.music.artist.model.ArtistModel;
import io.reactivex.SingleSource;
import rx.internal.operators.OnSubscribeFlatMapSingle;

/* renamed from: ktn reason: default package */
public final class ktn {
    private final ktp a;
    private final ktq b;
    private final hgy c;

    public ktn(hgy hgy, gix gix) {
        this.c = hgy;
        this.a = (ktp) gix.a(ktp.class);
        this.b = (ktq) gix.a(ktq.class);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xim a(String str, Boolean bool) {
        return wit.a((SingleSource<T>) bool.booleanValue() ? this.b.a(str) : this.a.a(str));
    }

    public final xii<ArtistModel> a(String str) {
        return xii.b((a<T>) new OnSubscribeFlatMapSingle<T>(wit.a((xfk<T>) this.c.a(ktr.a)), new $$Lambda$ktn$V64Qkgr1qDEZWlVdwg7z6mSaivo(this, str), false, Integer.MAX_VALUE));
    }
}
