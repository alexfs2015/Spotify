package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: pud reason: default package */
public final class pud {
    public final List<a> a;
    pvg b;
    public int c;
    boolean d;

    /* renamed from: pud$a */
    public static class a {
        final int a;
        final boolean b;
        public final Object c;

        private a(int i, boolean z, Object obj) {
            this.a = i;
            this.b = z;
            this.c = obj;
        }

        /* synthetic */ a(int i, boolean z, Object obj, byte b2) {
            this(i, z, obj);
        }
    }

    public pud(pvg pvg) {
        this.b = (pvg) fbp.a(pvg);
        this.a = Lists.a(pvg.b());
        b(pvg);
        c(pvg);
        d(pvg);
        c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(pvh pvh, pvh pvh2) {
        String str = "title";
        return jya.a(pvh.a, str).compareTo(jya.a(pvh2.a, str));
    }

    private void b(pvg pvg) {
        PlayerTrack e = pvg.e();
        if (e != null) {
            this.a.add(new a(4, true, new tms(R.string.queue_section_now_playing), 0));
            this.a.add(new a(1, true, pvh.a(e, false, false, false, false), 0));
        }
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

    private void c(pvg pvg) {
        if (pvg.c().length > 0) {
            this.a.add(new a(4, true, new tms(R.string.queue_section_next_in_queue), 0));
        }
        for (pvh aVar : pvg.c()) {
            this.a.add(new a(2, true, aVar, 0));
        }
    }

    private void d(pvg pvg) {
        List<pvh> list;
        pvh[] d2 = pvg.d();
        if (d2.length != 0) {
            if (pvg.a() && !this.d) {
                list = Lists.a((E[]) d2);
                Collections.sort(list, $$Lambda$pud$rKJy7ZZUVKAbgB6mFmHZGQwK5cA.INSTANCE);
                this.a.add(new a(4, true, new tms(R.string.queue_section_next_in_queue_from_shuffle), 0));
            } else {
                List a2 = ImmutableList.a((E[]) d2);
                this.a.add(new a(4, true, new tmq(R.string.queue_section_next_from_context, pvg.f()), 0));
                list = a2;
            }
            for (pvh aVar : list) {
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

    public final void a(pvg pvg) {
        this.b = pvg;
        this.a.clear();
        b(pvg);
        c(pvg);
        this.c = this.a.size();
        d(pvg);
        c();
    }

    public final PlayerTrack b() {
        return this.b.e();
    }
}
