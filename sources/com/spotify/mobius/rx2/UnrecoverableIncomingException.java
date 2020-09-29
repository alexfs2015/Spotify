package com.spotify.mobius.rx2;

public class UnrecoverableIncomingException extends RuntimeException {
    public UnrecoverableIncomingException(Throwable th) {
        super("PROGRAMMER ERROR: Mobius cannot recover from this exception; ensure your event sources don't invoke onError", th);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnrecoverableIncomingException)) {
            return false;
        }
        if (obj == this || getCause().equals(((UnrecoverableIncomingException) obj).getCause())) {
            return true;
        }
        return false;
    }
}
