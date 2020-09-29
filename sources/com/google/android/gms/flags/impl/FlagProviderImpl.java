package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;

public class FlagProviderImpl extends cci {
    private boolean a = false;
    private SharedPreferences b;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        return !this.a ? z : cbx.a(this.b, str, Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        return !this.a ? i : cbz.a(this.b, str, Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        return !this.a ? j : ccb.a(this.b, str, Long.valueOf(j)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        return !this.a ? str2 : ccd.a(this.b, str, str2);
    }

    public void init(cbi cbi) {
        Context context = (Context) cbj.a(cbi);
        if (!this.a) {
            try {
                this.b = ccf.a(context.createPackageContext("com.google.android.gms", 0));
                this.a = true;
            } catch (NameNotFoundException unused) {
            } catch (Exception e) {
                String str = "Could not retrieve sdk flags, continuing with defaults: ";
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
            }
        }
    }
}
