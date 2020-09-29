package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

@cey
/* renamed from: bgq reason: default package */
public final class bgq {
    public static boolean a(Context context, bgs bgs, bhi bhi) {
        int i = 0;
        if (bgs == null) {
            cow.a(5);
            return false;
        }
        dsp.a(context);
        if (bgs.f != null) {
            return a(context, bgs.f, bhi);
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(bgs.a)) {
            cow.a(5);
            return false;
        }
        if (!TextUtils.isEmpty(bgs.b)) {
            intent.setDataAndType(Uri.parse(bgs.a), bgs.b);
        } else {
            intent.setData(Uri.parse(bgs.a));
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(bgs.c)) {
            intent.setPackage(bgs.c);
        }
        if (!TextUtils.isEmpty(bgs.d)) {
            String[] split = bgs.d.split("/", 2);
            if (split.length < 2) {
                String str = "Could not parse component name from open GMSG: ";
                String valueOf = String.valueOf(bgs.d);
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                cow.a(5);
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        String str2 = bgs.e;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                cow.a(5);
            }
            intent.addFlags(i);
        }
        if (((Boolean) dpn.f().a(dsp.cL)).booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) dpn.f().a(dsp.cK)).booleanValue()) {
                bjl.e();
                cmd.b(context, intent);
            }
        }
        return a(context, intent, bhi);
    }

    private static boolean a(Context context, Intent intent, bhi bhi) {
        String str = "Launching an intent: ";
        try {
            String valueOf = String.valueOf(intent.toURI());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            clu.a();
            bjl.e();
            cmd.a(context, intent);
            if (bhi != null) {
                bhi.h();
            }
            return true;
        } catch (ActivityNotFoundException e) {
            e.getMessage();
            cow.a(5);
            return false;
        }
    }
}
