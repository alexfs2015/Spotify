package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.partneraccountlinking.clientprovider.PartnerAccountLinkingRequest;
import java.util.ArrayList;

/* renamed from: nzp reason: default package */
public final class nzp implements nzo {
    private static final String[] a = {"api_server_url", "auth_server_url"};
    private final Context b;
    private a c;

    public final boolean a(int i) {
        return i == 1213 || i == 1212 || i == 1214;
    }

    public nzp(Context context) {
        this.b = context;
    }

    public final void a(a aVar) {
        this.c = aVar;
    }

    public final void a() {
        if (!c()) {
            String packageName = this.b.getPackageName();
            Intent intent = new Intent("com.osp.app.signin.action.ADD_SAMSUNG_ACCOUNT");
            intent.putExtra("client_id", "q3voa1im9e");
            intent.putExtra("client_secret", "foo");
            intent.putExtra("mypackage", packageName);
            intent.putExtra("osp_ver", "OSP_02");
            intent.putExtra("mode", "ADD_ACCOUNT");
            ((a) fay.a(this.c)).a(intent, 1212);
            return;
        }
        e();
    }

    public final void a(int i, Intent intent) {
        String str;
        switch (i) {
            case 1212:
                e();
                break;
            case 1213:
                Intent intent2 = new Intent("com.msc.action.samsungaccount.REQUEST_ACCESSTOKEN");
                intent2.putExtra("client_id", "q3voa1im9e");
                intent2.putExtra("client_secret", "foo");
                intent2.putExtra("additional", a);
                intent2.putExtra("progress_theme", "dark");
                ((a) fay.a(this.c)).a(intent2, 1214);
                return;
            case 1214:
                String str2 = "api_server_url";
                String str3 = "auth_server_url";
                String str4 = "access_token";
                if (intent == null) {
                    str = "Response intent is null";
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (!intent.hasExtra(str4)) {
                        arrayList.add(str4);
                    }
                    if (!intent.hasExtra(str3)) {
                        arrayList.add(str3);
                    }
                    if (!intent.hasExtra(str2)) {
                        arrayList.add(str2);
                    }
                    if (!arrayList.isEmpty()) {
                        str = String.format("Intent extra doesn't contain: %s", new Object[]{fau.a(", ").a((Iterable<?>) arrayList)});
                    } else {
                        str = null;
                    }
                }
                if (!fax.a(str)) {
                    ((a) fay.a(this.c)).a(str);
                    break;
                } else {
                    ((a) fay.a(this.c)).a(PartnerAccountLinkingRequest.create(intent.getStringExtra(str4), intent.getStringExtra(str3), intent.getStringExtra(str2), "hm://external-user-accounts/v1/link/samsung"));
                    return;
                }
            default:
                Logger.e("Not a valid request code: %d", Integer.valueOf(i));
                break;
        }
    }

    public final boolean b() {
        return new Intent("com.osp.app.signin.action.ADD_SAMSUNG_ACCOUNT").resolveActivity(this.b.getPackageManager()) != null;
    }

    public final boolean c() {
        return AccountManager.get(this.b).getAccountsByType("com.osp.app.signin").length > 0;
    }

    private void e() {
        Intent intent = new Intent("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT");
        intent.putExtra("client_id", "q3voa1im9e");
        intent.putExtra("client_secret", "foo");
        intent.putExtra("progress_theme", "dark");
        ((a) fay.a(this.c)).a(intent, 1213);
    }

    public final nzr d() {
        return new nzn("hm://external-user-accounts/v1/status", "samsung");
    }
}
