package com.spotify.mobile.android.sso;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.hash.Hashing;
import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.Locale;

public final class ClientIdentity implements Parcelable {
    public static final Creator<ClientIdentity> CREATOR = new Creator<ClientIdentity>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ClientIdentity[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ClientIdentity(parcel);
        }
    };
    public final String a;
    public final String b;

    public static class ValidationException extends Exception {
        private static final long serialVersionUID = 0;

        public ValidationException(String str) {
            super(str);
        }

        public ValidationException(Throwable th) {
            super(th);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public ClientIdentity(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static ClientIdentity a(Context context, int i) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            throw new ValidationException("Can't find packages for caller id");
        }
        String str = packagesForUid[0];
        return new ClientIdentity(str, a(b(context, str)));
    }

    public static boolean a(Activity activity) {
        return activity.getPackageName().equals(activity.getCallingPackage());
    }

    public static ClientIdentity a(Context context, ComponentName componentName) {
        String str = "Calling activity can't be null";
        if (componentName != null) {
            String packageName = componentName.getPackageName();
            if (componentName != null) {
                return a(context, packageName);
            }
            throw new ValidationException(str);
        }
        throw new ValidationException(str);
    }

    public static ClientIdentity a(Context context, String str) {
        String a2 = a(b(context, str));
        Logger.b("Fingerprint: %s", a2);
        return new ClientIdentity(str, a2);
    }

    private static Signature b(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo.signatures.length == 1) {
                return packageInfo.signatures[0];
            }
            throw new ValidationException("Multiple certificates found");
        } catch (NameNotFoundException e) {
            throw new ValidationException((Throwable) e);
        }
    }

    private static String a(Signature signature) {
        return Hashing.d().a(signature.toByteArray()).toString().toUpperCase(Locale.US);
    }

    protected ClientIdentity(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return faw.a(this.a, clientIdentity.a) && faw.a(this.b, clientIdentity.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
