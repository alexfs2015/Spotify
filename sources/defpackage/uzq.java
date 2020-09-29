package defpackage;

import android.util.LruCache;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import io.reactivex.SingleSource;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: uzq reason: default package */
public final class uzq {
    public final LruCache<String, StorylinesCardContent> a = new LruCache<>(10);
    private final uzb b;
    private final uzi c;

    public uzq(uzb uzb, uzi uzi) {
        this.b = uzb;
        this.c = uzi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, StorylinesCardContent storylinesCardContent) {
        this.a.put(str, storylinesCardContent);
        this.c.a(str2, storylinesCardContent.getStorylineGid(), "", "entity", "success", "network", "", str);
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

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2) {
        this.c.a(str, str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, Throwable th) {
        String str3 = str;
        this.c.a(str3, "", "", "entity", LogMessage.SEVERITY_ERROR, "network", th.getMessage(), str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, String str2) {
        this.c.a(str, str2);
    }

    public final xii<StorylinesCardContent> a(String str, String str2) {
        StorylinesCardContent storylinesCardContent = (StorylinesCardContent) this.a.get(str);
        return storylinesCardContent == null ? xim.a(wit.a((SingleSource<T>) this.b.a(str))).a((xir) new $$Lambda$uzq$dPGWM6_XcHALvvGSIGRT1bHBSBI(this, str2, str)).b((xis<? super T>) new $$Lambda$uzq$23r6oOy79DCqepFXviULDLdjp94<Object>(this, str, str2)).a((xis<? super Throwable>) new $$Lambda$uzq$tV_3M3WAUOe3RJqAqMIjiWl2nA<Object>(this, str2, str)) : ScalarSynchronousObservable.d(storylinesCardContent).a((xir) new $$Lambda$uzq$1st1ONmbTCw3Yu_clnU1P8J4U0(this, str2, str)).b((xis<? super T>) new $$Lambda$uzq$8IN_TKIttfwEPqYjnOKV3wSxLZY<Object>(this, str2, str, storylinesCardContent)).a((xis<? super Throwable>) new $$Lambda$uzq$79Q3V43rmSx6Ad_fCokY5Yw6YG0<Object>(this, str2, str));
    }
}
