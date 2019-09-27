package com.jwetherell.algorithms.mathematics.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.jwetherell.algorithms.mathematics.GreatestCommonDivisor;


public class GCDTest {

    @Test
    public void testRecursiveGCD() {
        assertEquals(3, GreatestCommonDivisor.gcdUsingRecursion(15, 138));
        assertEquals(79, GreatestCommonDivisor.gcdUsingRecursion(79, -79));
        assertEquals(750, GreatestCommonDivisor.gcdUsingRecursion(-750*1000000009L, -750*123));
    }

    @Test
    public void testEuclideanGCD() {
        long x = 1989;
        long y = 867;
        long gcd = GreatestCommonDivisor.gcdUsingEuclides(x, y);
        long check = 51;
        assertTrue("Euclids GCD error. expected="+check+" got="+gcd, (gcd==check));

        x = 567;
        y = 56;
        gcd = GreatestCommonDivisor.gcdUsingEuclides(x, y);
        check = 7;
        assertTrue("Euclids GCD error. expected="+check+" got="+gcd, (gcd==check));

        x = 10002345;
        y = 67885;
        gcd = GreatestCommonDivisor.gcdUsingEuclides(x, y);
        check = 5;
        assertTrue("Euclids GCD error. expected="+check+" got="+gcd, (gcd==check));
    }
    @Test
    public void  gcdUsingEuclides_test_one(long x, long y) {
        long a = 4;
        long b = 6;
        long gcd = GreatestCommonDivisor.gcdUsingEuclides(x, y);
        long check = 2;
        assertTrue("Euclids GCD error. expected=" + check + " got=" + gcd, (gcd == check));
    }
    @Test
    public void  gcdUsingEuclides_test_two(long x, long y) {
        long a = 4;
        long b = 4;
        long gcd = GreatestCommonDivisor.gcdUsingEuclides(x, y);
        long check = 4;
        assertTrue("Euclids GCD error. expected=" + check + " got=" + gcd, (gcd == check));
    }
    @Test
    public void  gcdUsingEuclides_test_three(long x, long y) {
        long a = 6;
        long b = 4;
        long gcd = GreatestCommonDivisor.gcdUsingEuclides(x, y);
        long check = 2;
        assertTrue("Euclids GCD error. expected=" + check + " got=" + gcd, (gcd == check));
    }
    @Test
    public void  gcdUsingEuclides_test_for(long x, long y) {
        long a = 3;
        long b = 5;
        long gcd = GreatestCommonDivisor.gcdUsingEuclides(x, y);
        long check = 1;
        assertTrue("Euclids GCD error. expected=" + check + " got=" + gcd, (gcd == check));
    }
}
