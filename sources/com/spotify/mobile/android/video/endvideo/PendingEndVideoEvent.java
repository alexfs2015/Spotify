package com.spotify.mobile.android.video.endvideo;

public final class PendingEndVideoEvent {
    public final Kind a;
    public final jzw b;
    public final String c;
    private final a d;

    public enum Kind {
        CREATE_IF_NOT_EXISTS,
        UPDATE,
        SEND
    }

    public PendingEndVideoEvent(Kind kind, jzw jzw, a aVar, String str) {
        this.a = kind;
        this.b = jzw;
        this.d = aVar;
        this.c = str;
    }

    public static PendingEndVideoEvent a() {
        return new PendingEndVideoEvent(Kind.CREATE_IF_NOT_EXISTS, null, null, "");
    }

    public static PendingEndVideoEvent a(jzw jzw, String str) {
        return new PendingEndVideoEvent(Kind.UPDATE, jzw, null, str);
    }

    private boolean c() {
        return this.d != null;
    }

    public final void b() {
        if (c()) {
            this.d.a();
        }
    }
}
