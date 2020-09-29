package com.spotify.mobius.rx2;

public class UnknownEffectException extends RuntimeException {
    private final Object effect;

    public UnknownEffectException(Object obj) {
        super(koa.a(obj).toString());
        this.effect = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.effect.equals(((UnknownEffectException) obj).effect);
    }

    public int hashCode() {
        return this.effect.hashCode();
    }
}
