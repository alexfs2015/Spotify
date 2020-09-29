package defpackage;

import com.spotify.music.artist.model.ArtistModel;
import io.reactivex.Single;
import io.reactivex.SingleSource;

/* renamed from: kqe reason: default package */
public final class kqe {
    private final kqg a;
    private final kqh b;
    private final hec c;

    public kqe(hec hec, ghm ghm) {
        this.c = hec;
        this.a = (kqg) ghm.a(kqg.class);
        this.b = (kqh) ghm.a(kqh.class);
    }

    public final wud<ArtistModel> a(String str) {
        return vun.a((wrf<T>) this.c.a(kqi.a)).e((wut<? super T, ? extends wuh<? extends R>>) new $$Lambda$kqe$qiS6MPXeHjiXsBj41kgWnXtUClU<Object,Object>(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wuh a(String str, Boolean bool) {
        Single single;
        if (bool.booleanValue()) {
            single = this.b.a(str);
        } else {
            single = this.a.a(str);
        }
        return vun.a((SingleSource<T>) single);
    }
}
