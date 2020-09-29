package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

@cfp
/* renamed from: bhh reason: default package */
public final class bhh {
    private static boolean a(Context context, Intent intent, bhz bhz) {
        String str = "Launching an intent: ";
        try {
            String valueOf = String.valueOf(intent.toURI());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            cml.a();
            bkc.e();
            cmu.a(context, intent);
            if (bhz != null) {
                bhz.h();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            e.getMessage();
            cpn.a(5);
            return false;
        }
    }

    public static boolean a(Context context, bhj bhj, bhz bhz) {
        int i = 0;
        if (bhj == null) {
            cpn.a(5);
            return false;
        }
        dtg.a(context);
        if (bhj.f != null) {
            return a(context, bhj.f, bhz);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(bhj.a)) {
            cpn.a(5);
            return false;
        }
        if (!TextUtils.isEmpty(bhj.b)) {
            intent.setDataAndType(Uri.parse(bhj.a), bhj.b);
        } else {
            intent.setData(Uri.parse(bhj.a));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(bhj.c)) {
            intent.setPackage(bhj.c);
        }
        if (!TextUtils.isEmpty(bhj.d)) {
            String[] split = bhj.d.split("/", 2);
            if (split.length < 2) {
                String str = "Could not parse component name from open GMSG: ";
                String valueOf = String.valueOf(bhj.d);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                cpn.a(5);
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str2 = bhj.e;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                cpn.a(5);
            }
            intent.addFlags(i);
        }
        if (((Boolean) dqe.f().a(dtg.cL)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) dqe.f().a(dtg.cK)).booleanValue()) {
                bkc.e();
                cmu.b(context, intent);
            }
        }
        return a(context, intent, bhz);
    }
}
