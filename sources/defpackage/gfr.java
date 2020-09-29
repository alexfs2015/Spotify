package defpackage;

import android.util.Pair;
import com.google.common.base.Function;
import com.google.protobuf.ByteString;
import com.spotify.eventsender.Fragment;
import com.spotify.eventsender.FragmentsContainer;
import java.util.Collection;
import java.util.List;

/* renamed from: gfr reason: default package */
public abstract class gfr {
    /* access modifiers changed from: protected */
    public abstract long a(gfk gfk);

    public abstract List<gfk> a(int i, boolean z);

    public abstract void a(Collection<Long> collection);

    public void a(String str, byte[] bArr, gfm gfm, gfh gfh, gey gey, gej gej, boolean z) {
        gfk gfk = new gfk();
        gfk.c = str;
        gfk.b = Boolean.valueOf(z);
        gfk.d = gfh.a();
        gfk.f = ((FragmentsContainer) FragmentsContainer.k().a(Fragment.k().a("message").a(ByteString.a(bArr))).a((Iterable<? extends Fragment>) fbx.a((Iterable<E>) gey.a()).a((Function<? super E, T>) $$Lambda$gfr$KwZFfvIgpNPGOvXIhJyELJNDwX0.INSTANCE).a((Function<? super E, T>) $$Lambda$gfr$4ALLFhzcPVdYhi6H0KSy7HkuXM.INSTANCE)).g()).b();
        long a = gep.a(gfm, str);
        gfk.e = a;
        long a2 = a(gfk);
        gfm.a(new gfl(gfk.c, 1 + a));
        String.format("Event persisted: %d, Name: %s, Sequence No: %d", new Object[]{Long.valueOf(a2), str, Long.valueOf(a)});
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Fragment a(Pair pair) {
        return (Fragment) Fragment.k().a((String) pair.first).a((ByteString) pair.second).g();
    }
}
