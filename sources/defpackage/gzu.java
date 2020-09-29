package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: gzu reason: default package */
public final class gzu {
    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str, gzt gzt) {
        return gzt != null && TextUtils.equals(gzt.id(), str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, gzt gzt) {
        return gzt != null && TextUtils.equals(gzt.group(), str);
    }

    public static <M extends gzt> M a(Iterable<M> iterable, String str) {
        return (gzt) fcl.a(iterable, new $$Lambda$gzu$CP8R8BD71maGhxdmZFHqr5G_I0(str), null);
    }

    public static <M extends gzt> List<M> b(Iterable<M> iterable, String str) {
        return ImmutableList.a(fbx.a((Iterable<E>) fbx.a(iterable).a((faz<? super E>) new $$Lambda$gzu$kLeEDGHb7618dSweIE0Q9Opfq0<Object>(str))).a());
    }
}
