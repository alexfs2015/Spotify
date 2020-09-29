package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: mvy reason: default package */
public final class mvy {
    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(m mVar) {
        ArrayList a = Lists.a();
        for (mvm a2 : mVar.a) {
            a.add(a2.a());
        }
        return kng.a(kmt.a(new f(a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(mvz mvz, c cVar) {
        if (!cVar.a.b()) {
            return kng.e();
        }
        return kng.a(mvz, kmt.a(new g((String) cVar.a.c())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(mvz mvz, d dVar) {
        ArrayList a = Lists.a();
        fdz R_ = mvz.a().R_();
        while (R_.hasNext()) {
            mvr mvr = (mvr) R_.next();
            if (!mvr.a().equals(dVar.b) || !(mvr instanceof mvt)) {
                a.add(mvr);
            } else {
                Optional a2 = Optional.b(mvr).a((Function<? super T, V>) $$Lambda$mvy$uAedo2CAVTSP4V9kWuLRvBmc930.INSTANCE);
                if (a2.b()) {
                    a.add(((mvt) a2.c()).k().a(true).a());
                }
            }
        }
        return kng.a(mvz.e().a(ImmutableList.a((Collection<? extends E>) a)).a(), kmt.a(mvw.a(dVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(mvz mvz, i iVar) {
        ArrayList a = Lists.a();
        fdz R_ = mvz.a().R_();
        while (R_.hasNext()) {
            mvr mvr = (mvr) R_.next();
            if (mvr instanceof mvs) {
                mvs mvs = (mvs) mvr;
                String str = iVar.a;
                ArrayList a2 = Lists.a();
                fdz R_2 = mvs.c().R_();
                while (R_2.hasNext()) {
                    mvm mvm = (mvm) R_2.next();
                    if (!mvm.a().equals(str)) {
                        a2.add(mvm);
                    }
                }
                mvs a3 = mvs.d().a(ImmutableList.a((Collection<? extends E>) a2)).a();
                if (!a3.c().isEmpty()) {
                    a.add(a3);
                }
            } else {
                a.add(mvr);
            }
        }
        return kng.a(mvz.e().a(ImmutableList.a((Collection<? extends E>) a)).a(), kmt.a(new b(iVar.a)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(mvz mvz, j jVar) {
        ArrayList a = Lists.a();
        fdz R_ = mvz.a().R_();
        while (R_.hasNext()) {
            mvr mvr = (mvr) R_.next();
            if (mvr instanceof mvs) {
                mvs mvs = (mvs) mvr;
                mvm mvm = jVar.a;
                ArrayList arrayList = new ArrayList(mvs.c());
                arrayList.add(0, mvm);
                a.add(mvs.d().a(ImmutableList.a((Collection<? extends E>) arrayList)).a());
            } else {
                a.add(mvr);
            }
        }
        return kng.b(mvz.e().a(ImmutableList.a((Collection<? extends E>) a)).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(mvz mvz, n nVar) {
        boolean z;
        HashMap hashMap = new HashMap();
        if (!mvz.d().containsKey(nVar.a)) {
            hashMap.put(nVar.a, nVar.b);
            z = false;
        } else {
            z = true;
        }
        return kng.a(mvz.e().a((Map<String, String>) hashMap).a(), kmt.a(new d(z ? new a() : new b(nVar.b))));
    }

    public static kng<mvz, mvw> a(mvz mvz, mvx mvx) {
        mvz mvz2 = mvz;
        mvx mvx2 = mvx;
        $$Lambda$mvy$KNtkxr0zG6emEROi_K5LsMwDba0 r2 = $$Lambda$mvy$KNtkxr0zG6emEROi_K5LsMwDba0.INSTANCE;
        $$Lambda$mvy$zdqu_3VW19UFX1Q8YuAwdX0NDg r3 = r4;
        $$Lambda$mvy$zdqu_3VW19UFX1Q8YuAwdX0NDg r4 = new $$Lambda$mvy$zdqu_3VW19UFX1Q8YuAwdX0NDg(mvz2);
        $$Lambda$mvy$AQjw9L8vHu464WMwpQkUS_kNG5Q r42 = r5;
        $$Lambda$mvy$AQjw9L8vHu464WMwpQkUS_kNG5Q r5 = new $$Lambda$mvy$AQjw9L8vHu464WMwpQkUS_kNG5Q(mvz2);
        $$Lambda$mvy$dFA_7wVa8zOCaNbrz2CnJy5jgm8 r52 = r6;
        $$Lambda$mvy$dFA_7wVa8zOCaNbrz2CnJy5jgm8 r6 = new $$Lambda$mvy$dFA_7wVa8zOCaNbrz2CnJy5jgm8(mvz2);
        $$Lambda$mvy$JOMZ5TPIaNhb1_TAO7jWiV2nTlY r62 = r7;
        $$Lambda$mvy$JOMZ5TPIaNhb1_TAO7jWiV2nTlY r7 = new $$Lambda$mvy$JOMZ5TPIaNhb1_TAO7jWiV2nTlY(mvz2);
        $$Lambda$mvy$vm7Rcu8GC7QE3j5YZY158v80c r72 = $$Lambda$mvy$vm7Rcu8GC7QE3j5YZY158v80c.INSTANCE;
        $$Lambda$mvy$fzLuU3epALr_VOvEWxppXSAO14w r8 = $$Lambda$mvy$fzLuU3epALr_VOvEWxppXSAO14w.INSTANCE;
        $$Lambda$mvy$OsxGdhgxF9tgJgLpXZnLJr4304 r9 = $$Lambda$mvy$OsxGdhgxF9tgJgLpXZnLJr4304.INSTANCE;
        $$Lambda$mvy$9AKo0BYjsvDy5GrrrngWfMHjW0Q r10 = r11;
        $$Lambda$mvy$9AKo0BYjsvDy5GrrrngWfMHjW0Q r11 = new $$Lambda$mvy$9AKo0BYjsvDy5GrrrngWfMHjW0Q(mvz2);
        $$Lambda$mvy$a7cLH2II3lzfUinjj0hjtLGzKg8 r112 = r12;
        $$Lambda$mvy$a7cLH2II3lzfUinjj0hjtLGzKg8 r12 = new $$Lambda$mvy$a7cLH2II3lzfUinjj0hjtLGzKg8(mvz2);
        $$Lambda$mvy$sWeZX6JaN4oD5_HFKXi9XS5LrqY r122 = r13;
        $$Lambda$mvy$sWeZX6JaN4oD5_HFKXi9XS5LrqY r13 = new $$Lambda$mvy$sWeZX6JaN4oD5_HFKXi9XS5LrqY(mvz2);
        $$Lambda$mvy$g11SmmOORFOMwyPm8eh6mwvUB9c r132 = r14;
        $$Lambda$mvy$g11SmmOORFOMwyPm8eh6mwvUB9c r14 = new $$Lambda$mvy$g11SmmOORFOMwyPm8eh6mwvUB9c(mvz2);
        $$Lambda$mvy$BLGjk5ncLUDAX39DbDpurrqNQE r142 = $$Lambda$mvy$BLGjk5ncLUDAX39DbDpurrqNQE.INSTANCE;
        mvx mvx3 = mvx2;
        $$Lambda$mvy$35V7_eXa0ym6v5R5EgDdgxxtl8 r1 = new $$Lambda$mvy$35V7_eXa0ym6v5R5EgDdgxxtl8(mvz2);
        $$Lambda$mvy$FOnyqPtYbRVtpEF14zT03ezXYE r16 = $$Lambda$mvy$FOnyqPtYbRVtpEF14zT03ezXYE.INSTANCE;
        $$Lambda$mvy$myknxADTm83imZZ7IuRaxbSiNc r17 = r1;
        $$Lambda$mvy$myknxADTm83imZZ7IuRaxbSiNc r15 = new $$Lambda$mvy$myknxADTm83imZZ7IuRaxbSiNc(mvz2);
        return (kng) mvx3.a(r2, r3, r42, r52, r62, r72, r8, r9, r10, r112, r122, r132, r142, r1, r16, r17);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mvt a(mvr mvr) {
        return (mvt) mvr;
    }
}
