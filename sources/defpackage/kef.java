package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: kef reason: default package */
public abstract class kef {

    /* renamed from: kef$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(ImmutableList<kdo> immutableList);

        public abstract a a(ImmutableMap<kdo, StoryStatus> immutableMap);

        public abstract a a(boolean z);

        public abstract kef a();

        public abstract a b(boolean z);
    }

    public abstract ImmutableList<kdo> a();

    public abstract ImmutableMap<kdo, StoryStatus> b();

    public abstract int c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract a f();

    public final kdo g() {
        if (c() < 0 || c() >= a().size()) {
            return null;
        }
        return (kdo) a().get(c());
    }

    public final StoryStatus h() {
        kdo g = g();
        if (g == null) {
            return StoryStatus.LOADING;
        }
        StoryStatus storyStatus = (StoryStatus) b().get(g);
        if (storyStatus != null) {
            return storyStatus;
        }
        return StoryStatus.LOADING;
    }

    public final kef a(int i) {
        return f().a(i).a();
    }

    public final kef a(boolean z) {
        return f().a(z).a();
    }

    public final kef a(keq keq) {
        HashMap hashMap = new HashMap(b());
        hashMap.remove(keq.b());
        return f().a(ImmutableMap.g().a((Map<? extends K, ? extends V>) hashMap).b(keq.b(), keq.a()).b()).a();
    }

    public final List<kdo> i() {
        return ImmutableList.a(fbx.a((Iterable<E>) b().entrySet()).a((faz<? super E>) $$Lambda$kef$7kHsNNclTTjqKzYsf2SNV8pZY8.INSTANCE).a((Function<? super E, T>) $$Lambda$Fecp5Jnu5MlODJmhHyNFJdFI9RQ.INSTANCE).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Entry entry) {
        return entry != null && entry.getValue() == StoryStatus.ERROR;
    }
}
