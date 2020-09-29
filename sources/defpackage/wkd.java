package defpackage;

import android.content.Context;

/* renamed from: wkd reason: default package */
public final class wkd {
    private final wjn<String> a = new wjn<String>() {
        public final /* synthetic */ Object a(Context context) {
            context.getPackageManager().getInstallerPackageName(context.getPackageName());
            String str = "com.android.vending";
            return str == null ? "" : str;
        }
    };
    private final wjl<String> b = new wjl<>();

    public final String a(Context context) {
        try {
            String str = (String) this.b.a(context, this.a);
            if ("".equals(str)) {
                return null;
            }
            return str;
        } catch (Exception e) {
            wja.a().c("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
