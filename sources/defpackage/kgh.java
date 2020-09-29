package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: kgh reason: default package */
public abstract class kgh {

    /* renamed from: kgh$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(ImmutableList<kfp> immutableList);

        public abstract a a(ImmutableMap<kfp, StoryStatus> immutableMap);

        public abstract a a(boolean z);

        public abstract kgh a();

        public abstract a b(boolean z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Entry entry) {
        return entry != null && entry.getValue() == StoryStatus.ERROR;
    }

    public abstract ImmutableList<kfp> a();

    public final kgh a(int i) {
        return f().a(i).a();
    }

    public final kgh a(kgs kgs) {
        HashMap hashMap = new HashMap(b());
        hashMap.remove(kgs.b());
        return f().a(ImmutableMap.g().a((Map<? extends K, ? extends V>) hashMap).b(kgs.b(), kgs.a()).b()).a();
    }

    public final kgh a(boolean z) {
        return f().a(z).a();
    }

    public abstract ImmutableMap<kfp, StoryStatus> b();

    public abstract int c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract a f();

    public final kfp g() {
        if (c() < 0 || c() >= a().size()) {
            return null;
        }
        return (kfp) a().get(c());
    }

    public final StoryStatus h() {
        kfp g = g();
        if (g == null) {
            return StoryStatus.LOADING;
        }
        StoryStatus storyStatus = (StoryStatus) b().get(g);
        return storyStatus != null ? storyStatus : StoryStatus.LOADING;
    }

    public final List<kfp> i() {
        return ImmutableList.a(fcp.a((Iterable<E>) b().entrySet()).a((fbq<? super E>) $$Lambda$kgh$PWvtUUUPc54bCF0jaiP2bEHJnOQ.INSTANCE).a((Function<? super E, T>) $$Lambda$Cgzma_N0TEzH3UfLaH9SMPYMDfc.INSTANCE).a());
    }
}
