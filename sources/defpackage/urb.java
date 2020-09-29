package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableSortedMap.a;
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

/* renamed from: urb reason: default package */
public final class urb {
    private final ImmutableSet<uqt> a;
    private final ImmutableMap<YourLibraryPageId, uqs> b = a(this.a);
    private final fpt c;
    private final uqi d;
    private ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> e;

    public urb(Set<uqt> set, fpt fpt, uqi uqi) {
        this.a = ImmutableSet.a((Collection<? extends E>) set);
        this.c = fpt;
        this.d = uqi;
    }

    public final ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a() {
        if (this.e == null) {
            a b2 = ImmutableSortedMap.b();
            b2.b(YourLibraryPageGroup.MUSIC, b());
            if (iqh.a(this.c)) {
                b2.b(YourLibraryPageGroup.PODCAST, c());
            }
            this.e = a(b2.b());
        }
        return this.e;
    }

    public final YourLibraryPageGroup a(YourLibraryPageId yourLibraryPageId) {
        return (YourLibraryPageGroup) ((Entry) fcl.e(this.e.h(), new $$Lambda$urb$OXkXR_jg4GgJ9amxMbWJwKRflQ(yourLibraryPageId))).getKey();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(YourLibraryPageId yourLibraryPageId, Entry entry) {
        Iterable iterable = (Iterable) ((Entry) fay.a(entry)).getValue();
        if (iterable instanceof Collection) {
            return fbv.a((Collection) iterable, (Object) yourLibraryPageId);
        }
        return Iterators.a(iterable.iterator(), (Object) yourLibraryPageId);
    }

    public final uqs b(YourLibraryPageId yourLibraryPageId) {
        uqs uqs = (uqs) this.b.get(yourLibraryPageId);
        if (uqs == null) {
            StringBuilder sb = new StringBuilder("No page provider with page id ");
            sb.append(yourLibraryPageId.mId);
            Assertion.a(sb.toString());
        }
        return uqs;
    }

    private ImmutableList<YourLibraryPageId> b() {
        ImmutableList.a g = ImmutableList.g();
        g.c(YourLibraryPageId.MUSIC_PLAYLISTS);
        if (uqi.b(this.c)) {
            g.c(YourLibraryPageId.MUSIC_SONGS);
        }
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

    private ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> a(ImmutableSortedMap<YourLibraryPageGroup, ImmutableList<YourLibraryPageId>> immutableSortedMap) {
        ArrayList a2 = Lists.a();
        fdh R_ = this.a.iterator();
        while (R_.hasNext()) {
            a2.addAll(((uqt) R_.next()).a());
        }
        fdh R_2 = immutableSortedMap.h().iterator();
        while (R_2.hasNext()) {
            fdh R_3 = ((ImmutableList) ((Entry) R_2.next()).getValue()).R_();
            while (R_3.hasNext()) {
                YourLibraryPageId yourLibraryPageId = (YourLibraryPageId) R_3.next();
                if (!fcl.a((Iterable<T>) a2, (faz<? super T>) new $$Lambda$urb$6Uc3cv3C4aqNxDlvSw8zqCQWzaI<Object>(yourLibraryPageId))) {
                    StringBuilder sb = new StringBuilder("No provider for page id ");
                    sb.append(yourLibraryPageId.mId);
                    sb.append(" add it in YourLibraryPageSetup.getConfiguration()");
                    Assertion.a(sb.toString());
                }
            }
        }
        if (!a2.isEmpty()) {
            Logger.b("The following page provider IDs %s does not have a mapping.", fcl.a((Iterable<F>) a2, (Function<? super F, ? extends T>) $$Lambda$fgEnki6oMYkaeFnh8mIJfTQgfw.INSTANCE));
        }
        return immutableSortedMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(YourLibraryPageId yourLibraryPageId, uqs uqs) {
        return uqs.a() == yourLibraryPageId;
    }

    private static ImmutableMap<YourLibraryPageId, uqs> a(ImmutableSet<uqt> immutableSet) {
        ImmutableMap.a g = ImmutableMap.g();
        fdh R_ = immutableSet.iterator();
        while (R_.hasNext()) {
            fdh R_2 = ((uqt) R_.next()).a().R_();
            while (R_2.hasNext()) {
                uqs uqs = (uqs) R_2.next();
                g.b(uqs.a(), uqs);
            }
        }
        return g.b();
    }
}
