package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: vcg reason: default package */
public final class vcg {
    private final ImmutableSet<vby> a;
    private final ImmutableMap<YourLibraryPageId, vbx> b = a(this.a);
    private final fqn c;
    private ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> d;

    public vcg(Set<vby> set, fqn fqn) {
        this.a = ImmutableSet.a((Collection<? extends E>) set);
        this.c = fqn;
    }

    private static ImmutableMap<YourLibraryPageId, vbx> a(ImmutableSet<vby> immutableSet) {
        a g = ImmutableMap.g();
        fdz R_ = immutableSet.iterator();
        while (R_.hasNext()) {
            fdz R_2 = ((vby) R_.next()).a().R_();
            while (R_2.hasNext()) {
                vbx vbx = (vbx) R_2.next();
                g.b(vbx.a(), vbx);
            }
        }
        return g.b();
    }

    private ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap) {
        ArrayList a2 = Lists.a();
        fdz R_ = this.a.iterator();
        while (R_.hasNext()) {
            a2.addAll(((vby) R_.next()).a());
        }
        fdz R_2 = immutableSortedMap.h().iterator();
        while (R_2.hasNext()) {
            fdz R_3 = ((ImmutableList) ((Entry) R_2.next()).getValue()).R_();
            while (R_3.hasNext()) {
                YourLibraryPageId yourLibraryPageId = (YourLibraryPageId) R_3.next();
                if (!fdd.a((Iterable<T>) a2, (fbq<? super T>) new $$Lambda$vcg$YD79uNG3M_VV0lXsY28eLMHH9nU<Object>(yourLibraryPageId))) {
                    StringBuilder sb = new StringBuilder("No provider for page id ");
                    sb.append(yourLibraryPageId.mId);
                    sb.append(" add it in YourLibraryPageSetup.getConfiguration()");
                    Assertion.a(sb.toString());
                }
            }
        }
        if (!a2.isEmpty()) {
            Logger.b("The following page provider IDs %s does not have a mapping.", fdd.a((Iterable<F>) a2, (Function<? super F, ? extends T>) $$Lambda$u0MekEzhFZc8sCQYdm4cNRgPm_U.INSTANCE));
        }
        return immutableSortedMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(YourLibraryPageId yourLibraryPageId, Entry entry) {
        Iterable iterable = (Iterable) ((Entry) fbp.a(entry)).getValue();
        return iterable instanceof Collection ? fcm.a((Collection) iterable, (Object) yourLibraryPageId) : Iterators.a(iterable.iterator(), (Object) yourLibraryPageId);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(YourLibraryPageId yourLibraryPageId, vbx vbx) {
        return vbx.a() == yourLibraryPageId;
    }

    private static ImmutableList<YourLibraryPageId> b() {
        ImmutableList.a g = ImmutableList.g();
        g.c(YourLibraryPageId.MUSIC_PLAYLISTS);
        g.c(YourLibraryPageId.MUSIC_ARTISTS);
        g.c(YourLibraryPageId.MUSIC_ALBUMS);
        DebugFlag debugFlag = DebugFlag.YOUR_LIBRARY_MUSIC_PAGES_ENABLE_DOWNLOADS;
        return g.a();
    }

    private static ImmutableList<YourLibraryPageId> c() {
        ImmutableList.a g = ImmutableList.g();
        g.c(YourLibraryPageId.PODCAST_EPISODES);
        g.c(YourLibraryPageId.PODCAST_DOWNLOADS);
        g.c(YourLibraryPageId.PODCAST_FOLLOWED);
        return g.a();
    }

    public final ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a() {
        if (this.d == null) {
            ImmutableSortedMap.a b2 = ImmutableSortedMap.b();
            b2.b(YourLibraryPageGroup.MUSIC, b());
            if (isu.a(this.c)) {
                b2.b(YourLibraryPageGroup.PODCAST, c());
            }
            this.d = a(b2.b());
        }
        return this.d;
    }

    public final YourLibraryPageGroup a(YourLibraryPageId yourLibraryPageId) {
        return (YourLibraryPageGroup) ((Entry) fdd.e(this.d.h(), new $$Lambda$vcg$p3_eeAVEFSUu4EYxqKCixheSPUw(yourLibraryPageId))).getKey();
    }

    public final vbx b(YourLibraryPageId yourLibraryPageId) {
        vbx vbx = (vbx) this.b.get(yourLibraryPageId);
        if (vbx == null) {
            StringBuilder sb = new StringBuilder("No page provider with page id ");
            sb.append(yourLibraryPageId.mId);
            Assertion.a(sb.toString());
        }
        return vbx;
    }
}
