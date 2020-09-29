package defpackage;

import android.content.Context;

/* renamed from: vvx reason: default package */
public final class vvx {
    private final vvh<String> a = new vvh<String>() {
        public final /* synthetic */ Object a(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    };
    private final vvf<String> b = new vvf<>();

    public final String a(Context context) {
        try {
            String str = (String) this.b.a(context, this.a);
            if ("".equals(str)) {
                return null;
            }
            return str;
        } catch (Exception e) {
            vuu.a().c("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
