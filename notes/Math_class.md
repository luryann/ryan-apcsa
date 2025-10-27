# Math Class

The `java.lang.Math` class contains methods for performing basic numeric operations. All methods in this class are static, which means you call them directly using the class name, like `Math.methodName(argument)`.

---

## Core Calculation Methods

These methods are used for standard mathematical operations.

### `Math.abs(value)`
*   **Purpose:** Returns the absolute value of the argument.
*   **Type:** Works with both `int` and `double`. Returns the same type as the input.
*   **Example:** `Math.abs(-5)` returns `5`.

### `Math.pow(base, exp)`
*   **Purpose:** Calculates the base raised to the power of the exponent.
*   **Type:** Both arguments and the return value are always `double`.
*   **Example:** `Math.pow(2.0, 3.0)` returns `8.0`.

### `Math.sqrt(a)`
*   **Purpose:** Returns the positive square root of the argument.
*   **Type:** The argument and the return value are always `double`.
*   **Example:** `Math.sqrt(16.0)` returns `4.0`.

---

## Random Number Generation

The `Math.random()` method is crucial for generating random numbers.

### `Math.random()`
*   **Purpose:** Returns a pseudo-random `double` value in the range `0.0` (inclusive) to `1.0` (exclusive).

#### A. Generating a Random Integer from 1 to Any Number

To generate a random integer from `1` to `anyNumber` (inclusive), you can use the following formula:

**Sample Code:**
```java
int randomNumber = (int) (Math.random() * anyNumber) + 1;
```

**Example (Generating a number from 1 to 100):**
```java
int randomNumber = (int) (Math.random() * 100) + 1;
```

#### B. Generating a Random Integer within a Range

To generate a random integer within a specific range from `min` to `max` (inclusive), you can use the following formula:

**Sample Code:**
```java
int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
```

**Example (Die Roll from 1 to 6):**
```java
int dieRoll = (int) (Math.random() * 6) + 1;
```

---

## Methods for Finding Extremes and Rounding

### `Math.max(a, b)`
*   **Purpose:** Returns the greater of the two arguments.
*   **Example:** `Math.max(10, 20)` returns `20`.

### `Math.min(a, b)`
*   **Purpose:** Returns the smaller of the two arguments.
*   **Example:** `Math.min(10, 20)` returns `10`.

### `Math.round(a)`
*   **Purpose:** Returns the closest integer or long to the argument, with halves rounded up.
*   **Type:** Returns a `long` for a `double` input or an `int` for a `float` input.
*   **Example:** `Math.round(4.4)` returns `4`; `Math.round(4.5)` returns `5`.
