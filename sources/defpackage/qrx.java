package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Predicates.CompositionPredicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Maps.EntryFunction;
import com.google.common.collect.Maps.e;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import java.util.Map;

/* renamed from: qrx reason: default package */
public abstract class qrx {
    public static final qrx a = new a().a(ImmutableSortedMap.a()).a(Optional.e()).a(uqu.d).a(false).a(ImmutableMap.f()).a();

    /* renamed from: qrx$a */
    public static abstract class a {
        public abstract a a(Optional<YourLibraryPageId> optional);

        public abstract a a(ImmutableMap<YourLibraryPageId, LoadingState> immutableMap);

        public abstract a a(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap);

        public abstract a a(uqu uqu);

        public abstract a a(boolean z);

        public abstract qrx a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(YourLibraryPageId yourLibraryPageId, YourLibraryPageId yourLibraryPageId2) {
        return yourLibraryPageId2 != yourLibraryPageId;
    }

    public abstract ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a();

    public abstract Optional<YourLibraryPageId> b();

    public abstract uqu c();

    public abstract boolean d();

    public abstract ImmutableMap<YourLibraryPageId, LoadingState> e();

    public abstract a f();

    public final qrx a(YourLibraryPageId yourLibraryPageId) {
        return f().a(Optional.b(yourLibraryPageId)).a();
    }

    public final qrx a(uqu uqu) {
        return f().a(uqu).a();
    }

    public final qrx a(YourLibraryPageId yourLibraryPageId, LoadingState loadingState) {
        a f = f();
        com.google.common.collect.ImmutableMap.a b = ImmutableMap.g().b(yourLibraryPageId, loadingState);
        ImmutableMap e = e();
        $$Lambda$qrx$4uIvuLm3dKO7tVizlk785WVrHVQ r2 = new $$Lambda$qrx$4uIvuLm3dKO7tVizlk785WVrHVQ(yourLibraryPageId);
        fay.a(r2);
        return f.a(b.a((Map<? extends K, ? extends V>) new e<Object,Object>((Map) fay.a(e), r2, new CompositionPredicate(r2, EntryFunction.KEY, 0))).b()).a();
    }
}
