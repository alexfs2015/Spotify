package defpackage;

import com.spotify.rcs.model.GranularConfiguration;
import io.reactivex.Single;

/* renamed from: vuv reason: default package */
public interface vuv {

    /* renamed from: vuv$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static vuv a(a aVar) {
            return (vuv) aVar.a((a) xhc.a()).a((a) new xgy(null, false)).a().a(vuv.class);
        }
    }

    @xhn(a = "remote-config-resolver/v2/configs/platforms/{platform}/clients/{client-id}/property-sets/{property-set-key}")
    Single<xgo<GranularConfiguration>> a(@xia(a = "platform") String str, @xia(a = "client-id") String str2, @xia(a = "property-set-key") String str3, @xib(a = "installation-id") String str4, @xib(a = "version") String str5, @xib(a = "fetch-type") String str6);
}
