package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: plh reason: default package */
public final class plh {
    public final List<a> a;
    pmk b;
    public int c;
    boolean d;

    /* renamed from: plh$a */
    public static class a {
        final int a;
        final boolean b;
        public final Object c;

        /* synthetic */ a(int i, boolean z, Object obj, byte b2) {
            this(i, z, obj);
        }

        private a(int i, boolean z, Object obj) {
            this.a = i;
            this.b = z;
            this.c = obj;
        }
    }

    public plh(pmk pmk) {
        this.b = (pmk) fay.a(pmk);
        this.a = Lists.a(pmk.b());
        b(pmk);
        c(pmk);
        d(pmk);
        c();
    }

    private void b(pmk pmk) {
        PlayerTrack e = pmk.e();
        if (e != null) {
            this.a.add(new a(4, true, new tcl(R.string.queue_section_now_playing), 0));
            this.a.add(new a(1, true, pml.a(e, false, false, false, false), 0));
        }
    }

    private void c(pmk pmk) {
        if (pmk.c().length > 0) {
            this.a.add(new a(4, true, new tcl(R.string.queue_section_next_in_queue), 0));
        }
        for (pml aVar : pmk.c()) {
            this.a.add(new a(2, true, aVar, 0));
        }
    }

    private void d(pmk pmk) {
        List<pml> list;
        pml[] d2 = pmk.d();
        if (d2.length != 0) {
            if (pmk.a() && !this.d) {
                list = Lists.a((E[]) d2);
                Collections.sort(list, $$Lambda$plh$AfkKnLBF8RNBgwASPd3bCCUG2Zw.INSTANCE);
                this.a.add(new a(4, true, new tcl(R.string.queue_section_next_in_queue_from_shuffle), 0));
            } else {
                List a2 = ImmutableList.a((E[]) d2);
                this.a.add(new a(4, true, new tcj(R.string.queue_section_next_from_context, pmk.f()), 0));
                list = a2;
            }
            for (pml aVar : list) {
                this.a.add(new a(3, true, aVar, 0));
            }
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final int a(int i) {
        return ((a) this.a.get(i)).a;
    }

    public final PlayerTrack b() {
        return this.b.e();
    }

    public final void a(pmk pmk) {
        this.b = pmk;
        this.a.clear();
        b(pmk);
        c(pmk);
        this.c = this.a.size();
        d(pmk);
        c();
    }

    private void c() {
        HashMap hashMap = new HashMap(this.a.size());
        for (a aVar : this.a) {
            a aVar2 = (a) hashMap.put(Integer.valueOf(aVar.c.hashCode()), aVar);
            if (aVar2 != null) {
                StringBuilder sb = new StringBuilder("id collision for: ");
                sb.append(aVar2.c);
                sb.append(" and ");
                sb.append(aVar.c);
                Assertion.b(sb.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(pml pml, pml pml2) {
        String str = "title";
        return jvs.a(pml.a, str).compareTo(jvs.a(pml2.a, str));
    }
}
