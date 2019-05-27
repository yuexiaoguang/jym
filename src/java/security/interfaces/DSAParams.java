package java.security.interfaces;

import java.math.BigInteger;

/**
 * Interface to a DSA-specific set of key parameters, which defines a
 * DSA <em>key family</em>. DSA (Digital Signature Algorithm) is defined
 * in NIST's FIPS-186.
 *
 * @see DSAKey
 * @see java.security.Key
 * @see java.security.Signature
 *
 * @author Benjamin Renaud
 * @author Josh Bloch
 */
public interface DSAParams {

    /**
     * Returns the prime, {@code p}.
     *
     * @return the prime, {@code p}.
     */
    public BigInteger getP();

    /**
     * Returns the subprime, {@code q}.
     *
     * @return the subprime, {@code q}.
     */
    public BigInteger getQ();

    /**
     * Returns the base, {@code g}.
     *
     * @return the base, {@code g}.
     */
    public BigInteger getG();
}
