package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    public final dp<bwa<?>, ConnectionResult> zaay;

    public AvailabilityException(dp<bwa<?>, ConnectionResult> dpVar) {
        this.zaay = dpVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (bwa bwa : this.zaay.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) this.zaay.get(bwa);
            if (connectionResult.b()) {
                z = false;
            }
            String str = bwa.a.b;
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
