package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.Map;

/* renamed from: imo reason: default package */
public final class imo implements jtu<ior> {
    private static final sih a = ViewUris.bg;
    private final iqa b;
    private final imq c;

    public imo(imq imq, iqb iqb) {
        this.c = imq;
        this.b = new iqa((CollectionStateProvider) iqb.a(iqb.a.get(), 1), (iqf) iqb.a(iqb.b.get(), 2), (sih) iqb.a(a, 3));
    }

    public final wuh<Map<String, ior>> a(String str, String... strArr) {
        String str2 = strArr[0];
        return wud.a(wuh.a(this.c.a(str2, str2)), this.b.a(str2), (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$imo$AR7ial3ZiC4paahVKqG3LFOAGOk<Object,Object,Object>(str2)).a(1).a();
    }
}
