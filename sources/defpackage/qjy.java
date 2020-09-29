package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import io.reactivex.Scheduler;

/* renamed from: qjy reason: default package */
public final class qjy implements wig<vvy<hcs>> {
    private final wzi<sqy> a;
    private final wzi<fqn> b;
    private final wzi<qkw> c;
    private final wzi<Scheduler> d;

    private qjy(wzi<sqy> wzi, wzi<fqn> wzi2, wzi<qkw> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static qjy a(wzi<sqy> wzi, wzi<fqn> wzi2, wzi<qkw> wzi3, wzi<Scheduler> wzi4) {
        return new qjy(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        vvy vvy;
        sqy sqy = (sqy) this.a.get();
        qkw qkw = (qkw) this.c.get();
        Scheduler scheduler = (Scheduler) this.d.get();
        if (((Boolean) ((fqn) fbp.a((fqn) this.b.get())).a(soz.g)).booleanValue()) {
            a aVar = new a(hbb.b().c(hcx.builder().a("search:shimmeringProgress", HubsComponentCategory.HEADER.mId).a()).a("tag", "search-spinner").a(), scheduler);
            aVar.a = 400;
            vvy = aVar.a();
        } else {
            vvy = new a(qkw.a(), scheduler).a();
        }
        return (vvy) wil.a(vvy, "Cannot return null from a non-@Nullable @Provides method");
    }
}
