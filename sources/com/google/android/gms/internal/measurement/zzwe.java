package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzwe extends IOException {
    public eoo zzcah = null;

    public zzwe(String str) {
        super(str);
    }

    public static zzwe a() {
        return new zzwe("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzwe b() {
        return new zzwe("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzwe c() {
        return new zzwe("CodedInputStream encountered a malformed varint.");
    }

    public static zzwe d() {
        return new zzwe("Protocol message end-group tag did not match expected tag.");
    }

    public static zzwf e() {
        return new zzwf("Protocol message tag had invalid wire type.");
    }

    public static zzwe f() {
        return new zzwe("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static zzwe g() {
        return new zzwe("Failed to parse the message.");
    }

    public static zzwe h() {
        return new zzwe("Protocol message had invalid UTF-8.");
    }
}
