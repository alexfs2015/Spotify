package com.spotify.mobius;

public class ConnectionException extends RuntimeException {
    private final Object effect;

    public ConnectionException(Object obj, Throwable th) {
        super(kkr.a(obj).toString(), th);
        this.effect = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.effect.equals(((ConnectionException) obj).effect);
    }

    public int hashCode() {
        return this.effect.hashCode();
    }
}
