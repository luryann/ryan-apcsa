# String Methods

### `.length()`
*   **Returns:** An `int` representing the number of characters in the string.
*   **Note:** The length is always one more than the last index. For a string `a = "string"`, `a.length()` is `6`, even though the last index is `5`.

### `.equals(String otherString)`
*   **Returns:** A `boolean` (`true` or `false`).
*   **Purpose:** Tests if the sequence of characters in `otherString` is identical to the one in the calling string. This is the correct way to compare strings for equality, not `==`.

### `.indexOf(String str)`
*   **Returns:** An `int` representing the starting index of the *first* occurrence of `str`.
*   **Example:** For `String a = "string"`, `a.indexOf("r")` returns `2`.
*   **Note:** `indexOf` returns `-1` if the substring `str` is not found.

### `.substring(int firstOneYouWant, int firstOneYouDontWant)`
*   **Returns:** A new `String` that is a portion of the original.
*   **Purpose:** Extracts the substring starting at `firstOneYouWant` and ending just before `firstOneYouDontWant`.
*   **Example:** For `String a = "string"`, `a.substring(1, 4)` returns `"tri"`.
*   **Important:** To create a single character substring at a specific `index`, use `.substring(index, index + 1)`. Be careful not to go out of bounds!

### `.substring(int firstOneYouWant)`
*   **Returns:** A new `String`.
*   **Purpose:** Extracts the substring from the specified index all the way to the end of the string.
*   **Example:** For `String a = "string"`, `a.substring(3)` returns `"ing"`.

### `.toUpperCase()`
*   **Returns:** A new `String` with all characters converted to uppercase.
*   **Note:** Not tested on the AP exam, but very useful.

### `.toLowerCase()`
*   **Returns:** A new `String` with all characters converted to lowercase.
*   **Note:** Not tested on the AP exam, but very useful.

### `.compareTo(String otherString)`
*   **Returns:** An `int`.
*   **Purpose:** Compares two strings lexicographically (alphabetically).
    *   Returns `0` if the strings are identical.
    *   Returns a **negative** value if the calling string comes *before* `otherString` alphabetically.
    *   Returns a **positive** value if the calling string comes *after* `otherString` alphabetically.
