package defpackage;

import android.util.LruCache;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import io.reactivex.SingleSource;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: uom reason: default package */
public final class uom {
    public final LruCache<String, StorylinesCardContent> a = new LruCache<>(10);
    private final unx b;
    private final uoe c;

    public uom(unx unx, uoe uoe) {
        this.b = unx;
        this.c = uoe;
    }

    public final wud<StorylinesCardContent> a(String str, String str2) {
        StorylinesCardContent storylinesCardContent = (StorylinesCardContent) this.a.get(str);
        if (storylinesCardContent == null) {
            return wuh.a(vun.a((SingleSource<T>) this.b.a(str))).a((wum) new $$Lambda$uom$lQGuk4hqwwDOenuktKFl07kjcDI(this, str2, str)).b((wun<? super T>) new $$Lambda$uom$mJDrl4odiruyY1dMP1_e8ui_YRk<Object>(this, str, str2)).a((wun<? super Throwable>) new $$Lambda$uom$7L6_Pe2pl_yv3d5tN3tfvTwxPs<Object>(this, str2, str));
        }
        return ScalarSynchronousObservable.d(storylinesCardContent).a((wum) new $$Lambda$uom$VSngI_cMLRUd1fJdXE70yranjs(this, str2, str)).b((wun<? super T>) new $$Lambda$uom$Do5pVoSSCCkdnXXr6nMqeQ1QGb4<Object>(this, str2, str, storylinesCardContent)).a((wun<? super Throwable>) new $$Lambda$uom$sAhasjLfbkoMXO2KvBwgH3pAFg<Object>(this, str2, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, String str2) {
        this.c.a(str, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, StorylinesCardContent storylinesCardContent) {
        this.a.put(str, storylinesCardContent);
        this.c.a(str2, storylinesCardContent.getStorylineGid(), "", "entity", "success", "network", "", str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, Throwable th) {
        String str3 = str;
        this.c.a(str3, "", "", "entity", LogMessage.SEVERITY_ERROR, "network", th.getMessage(), str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2) {
        this.c.a(str, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, StorylinesCardContent storylinesCardContent, StorylinesCardContent storylinesCardContent2) {
        this.c.a(str, storylinesCardContent.getStorylineGid(), "", "entity", "success", "memory_cache", "", str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Throwable th) {
        String str3 = str;
        this.c.a(str3, "", "", "entity", LogMessage.SEVERITY_ERROR, "memory_cache", th.getMessage(), str2);
    }
}
