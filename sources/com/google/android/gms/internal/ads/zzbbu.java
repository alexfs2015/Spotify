package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzbbu extends IOException {
    public deq zzdut = null;

    public zzbbu(String str) {
        super(str);
    }

    public static zzbbu a() {
        return new zzbbu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzbbu b() {
        return new zzbbu("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzbbu c() {
        return new zzbbu("CodedInputStream encountered a malformed varint.");
    }

    public static zzbbu d() {
        return new zzbbu("Protocol message contained an invalid tag (zero).");
    }

    public static zzbbu e() {
        return new zzbbu("Protocol message end-group tag did not match expected tag.");
    }

    public static zzbbv f() {
        return new zzbbv("Protocol message tag had invalid wire type.");
    }

    public static zzbbu g() {
        return new zzbbu("Failed to parse the message.");
    }

    public static zzbbu h() {
        return new zzbbu("Protocol message had invalid UTF-8.");
    }
}
