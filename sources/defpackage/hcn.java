package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: hcn reason: default package */
public final class hcn {
    public static <M extends hcm> M a(Iterable<M> iterable, String str) {
        return (hcm) fdd.a(iterable, new $$Lambda$hcn$9U7iA46bhZjJoYvzieU5emzeorU(str), null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, hcm hcm) {
        return hcm != null && TextUtils.equals(hcm.group(), str);
    }

    public static <M extends hcm> List<M> b(Iterable<M> iterable, String str) {
        return ImmutableList.a(fcp.a((Iterable<E>) fcp.a(iterable).a((fbq<? super E>) new $$Lambda$hcn$H0YKw0Xru1HlJwlQIrXBPv2Wrhs<Object>(str))).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str, hcm hcm) {
        return hcm != null && TextUtils.equals(hcm.id(), str);
    }
}
