package defpackage;

import android.util.Pair;
import com.google.common.base.Function;
import com.google.protobuf.ByteString;
import com.spotify.eventsender.Fragment;
import com.spotify.eventsender.FragmentsContainer;
import java.util.Collection;
import java.util.List;

/* renamed from: ghc reason: default package */
public abstract class ghc {
    /* access modifiers changed from: private */
    public static /* synthetic */ Fragment a(Pair pair) {
        return (Fragment) Fragment.k().a((String) pair.first).a((ByteString) pair.second).g();
    }

    /* access modifiers changed from: protected */
    public abstract long a(ggv ggv);

    public abstract List<ggv> a(int i, boolean z);

    public void a(String str, byte[] bArr, ggx ggx, ggs ggs, ggj ggj, gfu gfu, boolean z) {
        ggv ggv = new ggv();
        ggv.c = str;
        ggv.b = Boolean.valueOf(z);
        ggv.d = ggs.a();
        ggv.f = ((FragmentsContainer) FragmentsContainer.k().a(Fragment.k().a("message").a(ByteString.a(bArr))).a((Iterable<? extends Fragment>) fcp.a((Iterable<E>) ggj.a()).a((Function<? super E, T>) $$Lambda$ghc$PEukOs5na8NQygpxBXhXuHnsFCE.INSTANCE).a((Function<? super E, T>) $$Lambda$ghc$LFoH0kek6j6bCjnQsQmJJhJLE3c.INSTANCE)).g()).b();
        long a = gga.a(ggx, str);
        ggv.e = a;
        long a2 = a(ggv);
        ggx.a(new ggw(ggv.c, 1 + a));
        String.format("Event persisted: %d, Name: %s, Sequence No: %d", new Object[]{Long.valueOf(a2), str, Long.valueOf(a)});
    }

    public abstract void a(Collection<Long> collection);
}
