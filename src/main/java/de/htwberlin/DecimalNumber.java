package de.htwberlin;

import java.math.BigDecimal;

public interface DecimalNumber {

  /**
   * Returns the value of this decimal number as a double value.
   *
   * @return The value as double
   */
  double asDouble();

  /**
   * Returns the value of this decimal number as a rounded long.
   *
   * @return The value as rounded long
   */
  long asRoundedLong();

  /**
   * Returns the value of this decimal number as String.
   *
   * @return The value as String
   */
  String asString();

  /**
   * Returns the value of this decimal number as BigDecimal
   *
   * @return The value as BigDecimal
   */
  BigDecimal asBigDecimal();

  /**
   * Returns the number of configured decimal places.
   *
   * @return Number of decimal places
   */
  int getScale();

  /**
   * Adds this decimal number to the <code>number</code>
   * and returns the result as a new decimal number.
   *
   * @return The result of the addition
   */
  DecimalNumber add(DecimalNumber number);

  /**
   * Subtracts <code>number</code> from this decimal number
   * and returns the result as a new decimal number.
   *
   * @return The result of the subtraction
   */
  DecimalNumber subtract(DecimalNumber number);

  /**
   * Multiplies this decimal number to the <code>number</code>
   * and returns the result as a new decimal number.
   *
   * @return The result of the multiplication
   */
  DecimalNumber multiply(DecimalNumber number);

  /**
   * Divides <code>number</code> by this decimal number
   * and returns the result as a new decimal number.
   *
   * @return The result of the division
   */
  DecimalNumber divide(DecimalNumber number);

}
