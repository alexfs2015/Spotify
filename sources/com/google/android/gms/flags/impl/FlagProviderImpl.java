package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;

public class FlagProviderImpl extends cbr {
    private boolean a = false;
    private SharedPreferences b;

    public void init(car car) {
        Context context = (Context) cas.a(car);
        if (!this.a) {
            try {
                this.b = cbo.a(context.createPackageContext("com.google.android.gms", 0));
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

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        return cbg.a(this.b, str, Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        return cbi.a(this.b, str, Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        return cbk.a(this.b, str, Long.valueOf(j)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.a) {
            return str2;
        }
        return cbm.a(this.b, str, str2);
    }
}
